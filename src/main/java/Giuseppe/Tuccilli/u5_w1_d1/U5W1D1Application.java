package Giuseppe.Tuccilli.u5_w1_d1;

import Classes.Menu;
import Classes.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Pizza margherita = ctx.getBean("margherita", Pizza.class);
        Pizza hawaiian = ctx.getBean("hawaiian", Pizza.class);
        Pizza salami = ctx.getBean("salami", Pizza.class);

        Menu menu = ctx.getBean("menu", Menu.class);

        System.out.println(menu);


    }

}
