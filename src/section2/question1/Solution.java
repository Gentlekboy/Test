package section2.question1;

import java.util.List;

public class Solution {

    public static int getPopulation(List<Country> countries, String continent) {
        //Get a filtered list of countries based on the continent entered
        //Get the population for the filtered list of countries and return the sum
        return countries.stream().filter(country ->
                country.getContinent().equalsIgnoreCase(continent)
        ).mapToInt(Country::getPopulation).sum();
    }
}
