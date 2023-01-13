package villanueva.ricardo.words.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import villanueva.ricardo.words.models.City;

import java.util.List;

@Repository
public class CityDaoImpl implements  CityDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<City> cityRowMapper = (rs, rn) ->{
        City c = new City();
        c.setName(rs.getString("Name"));
        c.setCountryCode( rs.getString("CountryCode"));
        return c;
    };

    @Override
    public List<City> byCode(String code) {
        return jdbcTemplate.query("select * from city where CountryCode = \"" + code  + "\"", cityRowMapper);
    }

    @Override
    public void insertCity(String country, String countryCode) {
        jdbcTemplate.update("insert into city (Name, CountryCode) values (?, ?)", country, countryCode);
    }
}
