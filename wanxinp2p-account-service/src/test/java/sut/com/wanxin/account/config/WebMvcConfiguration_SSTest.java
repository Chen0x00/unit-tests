/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.account.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.account.config.WebMvcConfiguration;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class WebMvcConfiguration_SSTest extends WebMvcConfiguration_SSTest_scaffolding {
// allCoveredLines:[23, 62]

  @Test(timeout = 9000)
  public void test_addResourceHandlers_0()  throws Throwable  {
      //caseID:750d4804efe319390914787d13e12d71
      //CoveredLines: [23, 62]
      //Input_0_ResourceHandlerRegistry: {addResourceHandler=resourceHandlerRegistration0}
      
      WebMvcConfiguration webMvcConfiguration0 = new WebMvcConfiguration();
      //mock resourceHandlerRegistration0
      ResourceHandlerRegistration resourceHandlerRegistration0 = mock(ResourceHandlerRegistration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock resourceHandlerRegistry0
      ResourceHandlerRegistry resourceHandlerRegistry0 = mock(ResourceHandlerRegistry.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(resourceHandlerRegistration0).when(resourceHandlerRegistry0).addResourceHandler(any(java.lang.String[].class));
      
      //Call method: addResourceHandlers
      // Undeclared exception!
      try { 
        webMvcConfiguration0.addResourceHandlers(resourceHandlerRegistry0);
      } catch(Throwable e) {
         verifyException("com.wanxin.account.config.WebMvcConfiguration", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }
}
