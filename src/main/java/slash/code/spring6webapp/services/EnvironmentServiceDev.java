package slash.code.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}
