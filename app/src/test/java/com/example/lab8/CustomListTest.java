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

}
