package slash.code.spring6webapp.services;

public class EnvironmentServiceUat implements EnvironmentService{
    @Override
    public String getEnv() {
        return "Uat";
    }
}
