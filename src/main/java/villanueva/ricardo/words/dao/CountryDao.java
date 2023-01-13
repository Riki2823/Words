package villanueva.ricardo.words.dao;

import villanueva.ricardo.words.models.Country;

import java.util.List;

public interface CountryDao {
    List<Country> all();

    String byCode(String code);

    List<Country> getByLanguage(String lName);

    String getCodeByCountry(String country);

    List<String> codesByLanguage(String language);

    void deleteCountries(List<String> codes);
}
