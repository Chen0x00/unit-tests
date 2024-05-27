/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.uaa.repository;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.uaa.domain.OauthClientDetails;
import com.wanxin.uaa.repository.OauthRepositoryJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.jdbc.core.JdbcTemplate;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class OauthRepositoryJdbc_SSTest extends OauthRepositoryJdbc_SSTest_scaffolding {
// allCoveredLines:[16, 25, 26, 27, 32, 33, 38, 39, 40, 44, 47, 48, 49, 51, 52, 54, 55, 57, 58, 60, 61, 63, 64, 66, 67]

  @Test(timeout = 9000)
  public void test_findAllOauthClientDetails_0()  throws Throwable  {
      //caseID:360bc92a09f683bae7fb38a91a723706
      //CoveredLines: [16, 32, 33]
      
      OauthRepositoryJdbc oauthRepositoryJdbc0 = new OauthRepositoryJdbc();
      JdbcTemplate jdbcTemplate0 = new JdbcTemplate();
      
      PrivateAccess.setVariable((Class<?>) OauthRepositoryJdbc.class, oauthRepositoryJdbc0, "jdbcTemplate", (Object) jdbcTemplate0);
      
      //Call method: findAllOauthClientDetails
      // Undeclared exception!
      try { 
        oauthRepositoryJdbc0.findAllOauthClientDetails();
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_findOauthClientDetails_1()  throws Throwable  {
      //caseID:99c8a609887230ff6f218ffe8527d003
      //CoveredLines: [16, 25, 26, 27]
      //Input_0_String:  select * from oauth_client_details order by create_time desc 
      //Assert: assertNull(method_result);
      
      OauthRepositoryJdbc oauthRepositoryJdbc0 = new OauthRepositoryJdbc();
      //mock resultSet0
      ResultSet resultSet0 = mock(ResultSet.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(resultSet0).next();
      //mock preparedStatement0
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      //mock connection0
      Connection connection0 = mock(Connection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      //mock dataSource0
      DataSource dataSource0 = mock(DataSource.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(connection0).when(dataSource0).getConnection();
      JdbcTemplate jdbcTemplate0 = new JdbcTemplate(dataSource0);
      
      PrivateAccess.setVariable((Class<?>) OauthRepositoryJdbc.class, oauthRepositoryJdbc0, "jdbcTemplate", (Object) jdbcTemplate0);
      
      //Call method: findOauthClientDetails
      OauthClientDetails oauthClientDetails0 = oauthRepositoryJdbc0.findOauthClientDetails(" select * from oauth_client_details order by create_time desc ");
      
      //Test Result Assert
      assertNull(oauthClientDetails0);
  }

  @Test(timeout = 9000)
  public void test_saveOauthClientDetails_2()  throws Throwable  {
      //caseID:a1dd1c4a80523acbde7d362a71eff5d3
      //CoveredLines: [16, 44, 47, 48, 49, 51, 52, 54, 55, 57, 58, 60, 61, 63, 64, 66, 67]
      //Input_0_OauthClientDetails: {}
      
      OauthRepositoryJdbc oauthRepositoryJdbc0 = new OauthRepositoryJdbc();
      //mock preparedStatement0
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock connection0
      Connection connection0 = mock(Connection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      //mock dataSource0
      DataSource dataSource0 = mock(DataSource.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(connection0).when(dataSource0).getConnection();
      JdbcTemplate jdbcTemplate0 = new JdbcTemplate(dataSource0);
      
      PrivateAccess.setVariable((Class<?>) OauthRepositoryJdbc.class, oauthRepositoryJdbc0, "jdbcTemplate", (Object) jdbcTemplate0);
      //mock oauthClientDetails0
      OauthClientDetails oauthClientDetails0 = mock(OauthClientDetails.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: saveOauthClientDetails
      oauthRepositoryJdbc0.saveOauthClientDetails(oauthClientDetails0);
  }

  @Test(timeout = 9000)
  public void test_updateOauthClientDetailsArchive_3()  throws Throwable  {
      //caseID:09a0e326423fa698bf2a1729656ad9f5
      //CoveredLines: [16, 38, 39, 40]
      //Input_0_String: (;mAi+~
      //Input_1_boolean: true
      
      OauthRepositoryJdbc oauthRepositoryJdbc0 = new OauthRepositoryJdbc();
      //mock preparedStatement0
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock connection0
      Connection connection0 = mock(Connection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      //mock dataSource0
      DataSource dataSource0 = mock(DataSource.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(connection0).when(dataSource0).getConnection();
      JdbcTemplate jdbcTemplate0 = new JdbcTemplate(dataSource0);
      
      PrivateAccess.setVariable((Class<?>) OauthRepositoryJdbc.class, oauthRepositoryJdbc0, "jdbcTemplate", (Object) jdbcTemplate0);
      
      //Call method: updateOauthClientDetailsArchive
      oauthRepositoryJdbc0.updateOauthClientDetailsArchive("(;mAi+~", true);
  }
}