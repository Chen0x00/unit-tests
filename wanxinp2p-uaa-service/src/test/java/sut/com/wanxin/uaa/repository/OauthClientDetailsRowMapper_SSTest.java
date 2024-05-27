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
import com.wanxin.uaa.repository.OauthClientDetailsRowMapper;
import java.sql.ResultSet;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class OauthClientDetailsRowMapper_SSTest extends OauthClientDetailsRowMapper_SSTest_scaffolding {
// allCoveredLines:[17, 18, 22, 24, 25, 26, 28, 29, 30, 32, 33, 48, 49, 50]

  @Test(timeout = 9000)
  public void test_mapRow_0()  throws Throwable  {
      //caseID:7da511d47e2a1096d0519093570ce1d6
      //CoveredLines: [17, 18, 22, 24, 25, 26, 28, 29, 30, 32, 33, 48, 49, 50]
      //Input_0_ResultSet: {getObject=resultSet0, getString=\"1.0\" \"1.0\" \"1.0\" \"1.0\" \"1.0\" \"1.0\" \"1.0\"}
      //Input_1_int: 1334
      
      OauthClientDetailsRowMapper oauthClientDetailsRowMapper0 = new OauthClientDetailsRowMapper();
      //mock resultSet0
      ResultSet resultSet0 = mock(ResultSet.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock resultSet1
      ResultSet resultSet1 = mock(ResultSet.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(resultSet0).when(resultSet1).getObject(anyString());
      doReturn("1.0", "1.0", "1.0", "1.0", "1.0", "1.0", "1.0").when(resultSet1).getString(anyString());
      
      //Call method: mapRow
      // Undeclared exception!
      try { 
        oauthClientDetailsRowMapper0.mapRow(resultSet1, 1334);
      } catch(Throwable e) {
         verifyException("com.wanxin.uaa.repository.OauthClientDetailsRowMapper", e);
         assertEquals("java.lang.ClassCastException", e.getClass().getName());
      }
  }
}
