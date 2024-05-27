/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.uaa.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.uaa.domain.IntegrationWebAuthenticationDetails;
import com.wanxin.uaa.domain.IntegrationWebAuthenticationDetailsSource;
import javax.servlet.http.HttpServletRequest;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class IntegrationWebAuthenticationDetailsSource_SSTest extends IntegrationWebAuthenticationDetailsSource_SSTest_scaffolding {
// allCoveredLines:[15, 19]

  @Test(timeout = 9000)
  public void test_buildDetails_0()  throws Throwable  {
      //caseID:f38a02d530d02733718553a0c67b6f9c
      //CoveredLines: [15, 19]
      //Input_0_HttpServletRequest: {}
      //Assert: assertNull(method_result.getDomain());
      
      IntegrationWebAuthenticationDetailsSource integrationWebAuthenticationDetailsSource0 = new IntegrationWebAuthenticationDetailsSource();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: buildDetails
      IntegrationWebAuthenticationDetails integrationWebAuthenticationDetails0 = (IntegrationWebAuthenticationDetails)integrationWebAuthenticationDetailsSource0.buildDetails(httpServletRequest0);
      
      //Test Result Assert
      assertNull(integrationWebAuthenticationDetails0.getDomain());
  }
}