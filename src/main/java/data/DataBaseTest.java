package data;



import crud.ClientService;
import crud.PlanetService;


import java.sql.SQLException;


public class DataBaseTest {
    public static void main(String[] args) throws SQLException {
        DatabaseInitServiceFlyway flyway = new DatabaseInitServiceFlyway();
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();


        flyway.initDb();

//        clientService.addClient("Test one");
//        clientService.getClient(5l);
//        clientService.getAll();
//        clientService.modifiedClietn(11l, "Vladimir Motyka");
//        clientService.getAll();
//        clientService.deleteClient(11l);
//        clientService.getAll();
//
//        planetService.addPlanet("SUN", "Sun");
//        planetService.getPlanet("VEN");
//        planetService.getAll();
//        planetService.modifiedPlanet("SUN","Soon");
//        planetService.getAll();
//        planetService.deletePlanet("SUN");
//        planetService.getAll();









    }
}

