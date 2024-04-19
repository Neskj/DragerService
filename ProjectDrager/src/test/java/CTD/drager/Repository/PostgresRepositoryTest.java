package CTD.drager.Repository;

import CTD.drager.Model.Drager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PostgresRepositoryTest {

    @Mock
    private JdbcTemplate jdbc;
    @InjectMocks
    private PostgresRepository postgresRepository;

    @Test
    public void returnDragerTestHappyFlow() {

        ArrayList<Drager> expectDrager = new ArrayList<>();

        Drager drager1 = new Drager("Drager x-Am 1000", "ARXX-0001", "0123456", "Aleksandr Pushkin", "31.12.2054", "Calibration");
        Drager drager2 = new Drager("Drager x-Am 2000", "ARXX-0002", "6543210", "Mikhail Lermontov", "31.12.2036", "Working");
        Drager drager3 = new Drager("Drager x-Am 3000", "ARXX-0003", "9876543", "Nikolay Gogol", "31.12.2042", "Working");

        expectDrager.add(drager1);
        expectDrager.add(drager2);
        expectDrager.add(drager3);

        when(jdbc.query(anyString(), any(RowMapper.class))).thenReturn(expectDrager); //взял из Mockito библиотеки
        ArrayList<Drager> result = postgresRepository.returnDrager();
        assertEquals(expectDrager, result);
    }
}
