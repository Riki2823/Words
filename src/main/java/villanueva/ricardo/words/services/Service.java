package villanueva.ricardo.words.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import villanueva.ricardo.words.dao.CityDao;
import villanueva.ricardo.words.dao.CountryDao;
import villanueva.ricardo.words.dao.LanguageDao;
import villanueva.ricardo.words.models.City;
import villanueva.ricardo.words.models.Country;
import villanueva.ricardo.words.models.Language;

import java.util.List;
@Component
public class Service {
    @Autowired
    CountryDao countryDao;

    @Autowired
    CityDao cityDao;

    @Autowired
    LanguageDao languageDao;
    public List<Country> allCountries(){
        return countryDao.all();
    }

    public List<City> citiesByCountry(String code) {
        return cityDao.byCode(code);
    }

    public String countryByCode(String code) {
        return countryDao.byCode(code);
    }

    public List<Language> getLanguageByCountry(String code) {
        return languageDao.byCountry(code);
    }

    public List<Country> getCountriesByLanguage(String lName) {
        return  countryDao.getByLanguage(lName);
    }
}
