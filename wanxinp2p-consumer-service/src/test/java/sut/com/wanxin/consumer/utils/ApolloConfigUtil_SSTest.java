/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.consumer.utils.ApolloConfigUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ApolloConfigUtil_SSTest extends ApolloConfigUtil_SSTest_scaffolding {
// allCoveredLines:[16, 26]

  @Test(timeout = 9000)
  public void test_getDepositoryUrl_0()  throws Throwable  {
      //caseID:6fda6ce1d66a38b87e7d72a1b6201361
      //CoveredLines: [16, 26]
      
      ApolloConfigUtil apolloConfigUtil0 = new ApolloConfigUtil();
      
      //Call method: getDepositoryUrl
      // Undeclared exception!
      try { 
        ApolloConfigUtil.getDepositoryUrl();
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.utils.ApolloConfigUtil", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }
}