package Classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


@NoArgsConstructor
@Getter
@Setter
public class Pizza {
    private String nome;
    private int calorie;
    private double prezzo;
    private ArrayList<Topping> ingredienti;

    public Pizza(String nome, ArrayList<Topping> topList) {
        this.nome = nome;
        this.ingredienti = topList;
        double sum = 0;
        for (int i = 0; i < topList.size(); i++) {
            sum = sum + topList.get(i).getPrezzo();
        }
        this.prezzo = sum;
        int calSum = 0;
        for (int i = 0; i < topList.size(); i++) {
            calSum = calSum + topList.get(i).getCalorie();
        }
        this.calorie = calSum;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                ", ingredienti=" + ingredienti +
                '}';
    }
}
