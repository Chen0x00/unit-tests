/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.gateway.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.gateway.config.RestOAuth2AuthExceptionEntryPoint;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class RestOAuth2AuthExceptionEntryPoint_SSTest extends RestOAuth2AuthExceptionEntryPoint_SSTest_scaffolding {
// allCoveredLines:[19, 22, 23, 24]

  @Test(timeout = 9000)
  public void test_commence_0()  throws Throwable  {
      //caseID:a3ae83560290ffcbc5d52f8c5cdc48cd
      //CoveredLines: [19, 22, 23, 24]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {getOutputStream=servletOutputStream0}
      //Input_2_AuthenticationException: \"FCEX<4oX\\\"F}M9bad9\"
      
      RestOAuth2AuthExceptionEntryPoint restOAuth2AuthExceptionEntryPoint0 = new RestOAuth2AuthExceptionEntryPoint();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock servletOutputStream0
      ServletOutputStream servletOutputStream0 = mock(ServletOutputStream.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(servletOutputStream0).when(httpServletResponse0).getOutputStream();
      UsernameNotFoundException usernameNotFoundException0 = new UsernameNotFoundException("FCEX<4oX\"F}M9bad9");
      
      //Call method: commence
      restOAuth2AuthExceptionEntryPoint0.commence(httpServletRequest0, httpServletResponse0, usernameNotFoundException0);
  }
}