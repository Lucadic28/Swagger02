package co.develhope.swagger2.controllers;


import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping

    public String welcomeMathMsg(){
        return "math session";
    }

    @GetMapping("/divison-info")
    @ApiOperation(value="Division",notes= "Sto facendo la divisione")
    public ArithmeticOperation getDivisionInfo(){
        return new ArithmeticOperation("Division", 2,"divisione",new String[]{"Distributiva","Invariantiva"});
    }

    @GetMapping("/multiplication-info")
    public ArithmeticOperation getMultiplicationInfo(){
        return new ArithmeticOperation("Multiplication", 2,"moltiplicazione",new String[]{"Commutativa","Distributiva","Invariantiva"});
    }

    @GetMapping("/square-info/{n}")
    public ArithmeticOperation getSquareInfo(){
        return new ArithmeticOperation("Square", 1,"quadrato",new String[]{"Distributiva","Invariantiva","Commutativa"});
    }
}