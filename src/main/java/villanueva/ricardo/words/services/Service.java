package villanueva.ricardo.words.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import villanueva.ricardo.words.dao.CountryDao;
import villanueva.ricardo.words.models.Country;

import java.util.ArrayList;
import java.util.List;
@Component
public class Service {
    @Autowired
    CountryDao countryDao;

    public List<Country> allCountries(){
        return countryDao.all();
    }

}
