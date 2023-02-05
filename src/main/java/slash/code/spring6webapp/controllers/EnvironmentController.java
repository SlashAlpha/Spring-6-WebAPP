package slash.code.spring6webapp.controllers;


import org.springframework.stereotype.Controller;
import slash.code.spring6webapp.services.EnvironmentService;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }


    public String getEnvironment(){
       return "you are in environment "+environmentService.getEnv();
    }
}
