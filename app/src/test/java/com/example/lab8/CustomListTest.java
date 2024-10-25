package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    public CustomList MockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0.");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "City not added to list");
    }

    @Test
    public void hasCityTest(){
        CustomList list = MockCityList();
        City cityToAdd = new City("Nanton", "AB");
        Boolean hasCityBeforeAdd = false;
        assertEquals(hasCityBeforeAdd, list.hasCity(cityToAdd), "hasCity return true when city not in the list");
        list.addCity(cityToAdd);

        Boolean hasCityAfterAdd = true;
        assertEquals(hasCityAfterAdd, list.hasCity(cityToAdd), "hasCity return false when city in the list");
    }

    @Test
    public void deleteCityTest(){
        CustomList list = MockCityList();
        City cityToDelete = new City("Nanton", "AB");
        list.addCity(cityToDelete);
        Boolean hasCityBeforeDelete = true;
        assertEquals(hasCityBeforeDelete, list.hasCity(cityToDelete), "City should be in the list");

        list.deleteCity(cityToDelete);
        Boolean hasCityAfterDelete = false;
        assertEquals(hasCityAfterDelete, list.hasCity(cityToDelete), "City not deleted");
    }

    @Test
    public void countCityTest(){
        CustomList list = MockCityList();
        City city1 = new City("Nanton", "AB");
        City city2 = new City("Edmonton", "AB");
        list.addCity(city1);
        int cityCount1 = 1;
        assertEquals(cityCount1, list.countCity(), "City count should be 1");

        list.addCity(city2);
        int cityCount2 = 2;
        assertEquals(cityCount2, list.countCity(), "City count should be 2");
    }

}
