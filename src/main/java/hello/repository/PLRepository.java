package hello.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PLRepository {

    private final JdbcTemplate jdbcTemplate;

    public String sayHello(String text) {
        final String sql = "SELECT PKG_SAY.SAY_HELLO('" + text + "') FROM dual";
        return jdbcTemplate.queryForObject(sql, String.class);
    }

}
