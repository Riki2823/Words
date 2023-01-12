package villanueva.ricardo.words.dao;

import com.mysql.cj.result.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import villanueva.ricardo.words.models.Country;
import villanueva.ricardo.words.models.Language;

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
}
