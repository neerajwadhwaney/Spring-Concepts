package DependencyInjection.SetterInjection;

public class Laptop implements Computer {

    @Override
    public void start() {
        System.out.println("Laptop Started");
    }
}
