package villanueva.ricardo.words.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import villanueva.ricardo.words.models.Language;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageDaoImpl implements LanguageDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Language> languageRowMapper = (rs, rn) ->{
        Language l = new Language();
        l.setCode(rs.getString("CountryCode"));
        l.setlName(rs.getString("Language"));
        l.setIsOfficial(rs.getString("IsOfficial"));
        return l;
    };
    @Override
    public List<Language> byCountry(String code) {
        return jdbcTemplate.query("select * from countrylanguage where countryCode=\"" + code + "\"", languageRowMapper);
    }

    @Override
    public List<Language> getAll() {
        return jdbcTemplate.query("select * from countrylanguage", languageRowMapper);
    }

    @Override
    public void deleteLanguages(List<String> codes) {
        for (String code : codes){
            jdbcTemplate.update("delete from countrylanguage where countrycode=\"" + code + "\"");
        }
    }


}
