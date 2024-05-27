/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.common;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.account.model.LoginUser;
import com.wanxin.consumer.common.SecurityUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class SecurityUtil_SSTest extends SecurityUtil_SSTest_scaffolding {
// allCoveredLines:[17, 23, 24, 25, 38]

  @Test(timeout = 9000)
  public void test_getUser_0()  throws Throwable  {
      //caseID:60c84a63a6a9ddc74771caffb0434c29
      //CoveredLines: [17, 23, 24, 25, 38]
      //Assert: assertNull(method_result.getClientId());
      
      SecurityUtil securityUtil0 = new SecurityUtil();
      
      //Call method: getUser
      LoginUser loginUser0 = SecurityUtil.getUser();
      
      //Test Result Assert
      assertNull(loginUser0.getClientId());
  }
}