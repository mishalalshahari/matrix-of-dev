package org.example.matrixofdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class starter {
    @GetMapping("/start")
    public String gettingStarted(){
        return
                "<body style=\"background-color:#222222; color:white;\"> <b><i>Hello Developers! Welcome to</i> MatrixOfDev.</b></body>";
    }
}
