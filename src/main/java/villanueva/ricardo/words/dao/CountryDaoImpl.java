package villanueva.ricardo.words.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import villanueva.ricardo.words.models.Country;

import java.util.List;
@Repository
public class CountryDaoImpl implements CountryDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Country> countryRowMapper =  (rs, rn) ->{
        Country c = new Country();
        c.setCode(rs.getString("Code"));
        c.setName(rs.getString("Name"));
        return c;
    };
    @Override
    public List<Country> all() {
        return jdbcTemplate.query("select * from country", countryRowMapper);
    }
}
