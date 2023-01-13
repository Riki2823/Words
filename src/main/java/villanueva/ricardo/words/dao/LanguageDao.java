package villanueva.ricardo.words.dao;

import villanueva.ricardo.words.models.Language;

import java.util.List;

public interface LanguageDao {

    List<Language> byCountry(String code);

    List<Language> getAll();

    void deleteLanguages(List<String> codes);
}
