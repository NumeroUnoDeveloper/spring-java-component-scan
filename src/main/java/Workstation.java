import com.config.ConfigClass;
import com.devices.Computer;
import com.devices.Laptop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan

public class Workstation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ConfigClass.class);

        Computer computer = (Computer) context.getBean(Computer.class);
        computer.switchOn();

        Laptop laptop = (Laptop) context.getBean(Laptop.class);
        laptop.switchOn();
    }
}