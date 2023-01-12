package villanueva.ricardo.words.dao;

import villanueva.ricardo.words.models.City;

import java.util.List;

public interface CityDao {
    List<City> byCode(String code);
}
