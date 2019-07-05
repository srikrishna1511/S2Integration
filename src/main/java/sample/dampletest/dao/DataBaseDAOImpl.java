package sample.dampletest.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import sample.dampletest.dto.S2Data;

public class DataBaseDAOImpl implements DataBaseDAO{

	private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
  
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
	public List<S2Data> getS2Data() {
		// TODO Auto-generated method stub
		
		
		String sql = "Select count(*) from s2_policyDetails";
		System.out.println("Querying for string " + sql);
	        jdbcTemplate = new JdbcTemplate(dataSource);
	  
	        int count = jdbcTemplate.queryForInt(sql);
	        System.out.println("***************************** " + count);
		return null;
	}

}
