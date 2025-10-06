package Giuseppe.Tuccilli.u5_w1_d1;

import Classes.Drink;
import Classes.Pizza;
import Classes.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ConfigClass {

    /*
    @Bean
    public Topping getTomato() {
        return new Topping("nome", 1012, 4.3);
    }

    @Bean
    public Topping getCheese() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean
    public Topping getHam() {
        return new Topping("ham", 95, 0.99);
    }

    @Bean
    public Topping getOnions() {
        return new Topping("onions", 22, 0.69);
    }

    @Bean
    public Topping getPinneaple() {
        return new Topping("pinneaple", 24, 0.79);
    }

    @Bean
    public Topping getSalami() {
        return new Topping("salami", 86, 0.99);
    } */

    @Bean
    public ArrayList<Topping> getMargTop() {
        ArrayList<Topping> margTop = new ArrayList<>();
        Topping tomato = new Topping("tomato", 1012, 4.3);
        Topping cheese = new Topping("cheese", 92, 0.69);
        margTop.add(tomato);
        margTop.add(cheese);
        return margTop;

    }

    @Bean
    public ArrayList<Topping> getHawaiianTop() {
        ArrayList<Topping> hawTop = new ArrayList<>();
        Topping tomato = new Topping("tomato", 1012, 4.3);
        Topping cheese = new Topping("cheese", 92, 0.69);
        Topping ham = new Topping("ham", 95, 0.99);
        Topping pinneaple = new Topping("pinneaple", 24, 0.79);

        hawTop.add(tomato);
        hawTop.add(cheese);
        hawTop.add(ham);
        hawTop.add(pinneaple);

        return hawTop;

    }

    @Bean
    public ArrayList<Topping> getSalamiTop() {
        ArrayList<Topping> salTop = new ArrayList<>();
        Topping tomato = new Topping("tomato", 1012, 4.3);
        Topping cheese = new Topping("cheese", 92, 0.69);
        Topping salami = new Topping("salami", 86, 0.99);

        salTop.add(tomato);
        salTop.add(cheese);
        salTop.add(salami);

        return salTop;

    }

    @Bean(name = "margherita")
    public Pizza getMargherita() {
        return new Pizza("Margherita", getMargTop());
    }

    @Bean(name = "hawaiian")
    public Pizza getHawaiian() {
        return new Pizza("Hawaiian", getHawaiianTop());
    }

    @Bean(name = "salami")
    public Pizza getSalami() {
        return new Pizza("Salami", getSalamiTop());
    }

    @Bean(name = "lemonade")
    public Drink getLemonade() {
        return new Drink("lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink getWater() {
        return new Drink("water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink getWine() {
        return new Drink("wine", 607, 7.49);
    }


}
