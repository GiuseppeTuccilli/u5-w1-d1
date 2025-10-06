package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private ArrayList<Pizza> pizze;
    private ArrayList<Drink> drinks;

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                '}';
    }
}
