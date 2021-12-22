package section2.question1;

/*
1. There is a class Country that has
methods getContinent() and getPopulation().
Using Lamda Expressions Write a function
int getPopulation(List<Country> countries, String continent)
that computes the total population of a given continent,
given a list of all countries and the name of a continent.
 */
public class Country {
    private String continent;
    private int population;

    public Country(String continent, int population) {
        this.continent = continent;
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
