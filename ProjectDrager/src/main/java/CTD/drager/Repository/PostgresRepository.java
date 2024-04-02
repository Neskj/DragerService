package CTD.drager.Repository;

import CTD.drager.Model.Drager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class PostgresRepository implements DragerRepository{
    
    @Autowired
    private final JdbcTemplate jdbc;

    public PostgresRepository(JdbcTemplate jdbc){

        this.jdbc=jdbc;
    }

    @Override
    public ArrayList<Drager> returnDrager() {

        String sql="select * from drager";

        RowMapper<Drager> mapper=(r,i)->{
            Drager rowDrager=new Drager();
            rowDrager.setModel(r.getString("model"));
            rowDrager.setSerial(r.getString("serial"));
            rowDrager.setInventoryNumber(r.getString("inventorynumber"));
            rowDrager.setOwner(r.getString("owner"));
            rowDrager.setVerification(r.getString("verification"));
            rowDrager.setStatus(r.getString("status"));
            rowDrager.setFlag(r.getString("flag"));
            return rowDrager;
        };

        return (ArrayList<Drager>) jdbc.query(sql,mapper);
    }
}
