/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.consumer.utils.HttpUtil;
import java.net.MalformedURLException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class HttpUtil_SSTest extends HttpUtil_SSTest_scaffolding {
// allCoveredLines:[15, 19, 20, 25, 26, 27, 29, 34, 35, 40]

  @Test(timeout = 9000)
  public void test_post_0()  throws Throwable  {
      //caseID:222d109427d83cc5ad744ad6f9fec7ef
      //CoveredLines: [15, 19, 20, 25, 26, 29, 34, 35, 40]
      //Input_0_String: 
      //Input_1_String: 
      //Input_2_String: 
      
      HttpUtil httpUtil0 = new HttpUtil();
      
      //Call method: post
      try { 
        HttpUtil.post("", "", "");
      } catch(Throwable e) {
         verifyException("java.net.URL", e);
         assertEquals("java.net.MalformedURLException", e.getClass().getName());
         assertEquals("no protocol: ?access_token=", e.getMessage());
      }
  }

  @Test(timeout = 9000)
  public void test_post_1()  throws Throwable  {
      //caseID:bfdfadf7e6d280ba3bda49da00b4e84a
      //CoveredLines: [19, 20, 25, 26, 27, 29, 34, 35, 40]
      //Input_0_String: nlp
      //Input_1_String: nlp
      //Input_2_String: nlp
      
      
      //Call method: post
      try { 
        HttpUtil.post("nlp", "nlp", "nlp");
      } catch(Throwable e) {
         verifyException("java.net.URL", e);
         assertEquals("java.net.MalformedURLException", e.getClass().getName());
         assertEquals("no protocol: nlp?access_token=nlp", e.getMessage());
      }
  }
}