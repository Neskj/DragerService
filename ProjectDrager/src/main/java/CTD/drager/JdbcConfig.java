package CTD.drager;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
    
    @Value("${spring.datasource.url}")
    private String sourceUrl;
    @Value("${spring.datasource.username}")
    private String sourceName;
    @Value("${spring.datasource.password}")
    private String sourcePass;

    @Bean
    public DataSource dataSource(){

        HikariDataSource dataSource=new HikariDataSource();
        dataSource.setJdbcUrl(sourceUrl);
        dataSource.setUsername(sourceName);
        dataSource.setPassword(sourcePass);
        return dataSource;
    }
}
