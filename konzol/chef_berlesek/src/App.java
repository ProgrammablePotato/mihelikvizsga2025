import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Berles> rents = ReadFile.readFile();
        Queries queries = new Queries(rents);
        queries.forMonth();
        queries.forYear();
        queries.mostExpensiveRent();
        queries.getNumberOfUniqueChefs();
        queries.mostRentedChef();
        queries.rentsPerCuisine();
        queries.averageRentPeriod();
    }
}
