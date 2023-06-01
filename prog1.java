/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке. Collections.frequency()
*/

import java.util.ArrayList;

public class prog1 {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        for(String planet : planets) {
            int count = 0;
            for(String p : planets) {
                if(planet.equals(p)) {
                    count++;
                }
            }
            System.out.printf("%s - %d%n", planet, count);
        }
 
    }
}    



        