/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.common.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.common.util.HttpUtil;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownServiceException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class HttpUtil_SSTest extends HttpUtil_SSTest_scaffolding {
// allCoveredLines:[16, 20, 21, 28, 30, 31, 32, 40, 57, 58, 63, 64, 65, 67, 72, 73, 78, 80, 81, 83, 84, 85, 86, 87, 88, 89, 92]

  @Test(timeout = 9000)
  public void test_getAccessToken_0()  throws Throwable  {
      //caseID:b4a1996be1c87cbdd3531c3d24a5561e
      //CoveredLines: [16, 20, 21, 28, 30, 31, 32, 40]
      //Input_0_String: <:6&h
      //Input_1_String: <:6&h
      
      HttpUtil httpUtil0 = new HttpUtil();
      
      //Call method: getAccessToken
      try { 
        HttpUtil.getAccessToken("<:6&h", "<:6&h");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_post_1()  throws Throwable  {
      //caseID:fc7f8afdd5fff3fffad6d3209fa1a5c1
      //CoveredLines: [16, 57, 58, 63, 64, 65, 67, 72, 73, 78]
      //Input_0_String: nlp
      //Input_1_String: 
      //Input_2_String: 20000
      
      HttpUtil httpUtil0 = new HttpUtil();
      
      //Call method: post
      try { 
        HttpUtil.post("nlp", "", "20000");
      } catch(Throwable e) {
         verifyException("java.net.URL", e);
         assertEquals("java.net.MalformedURLException", e.getClass().getName());
         assertEquals("no protocol: nlp?access_token=", e.getMessage());
      }
  }

  @Test(timeout = 9000)
  public void test_post_2()  throws Throwable  {
      //caseID:43c6a88ff294b636eae15e49bd7b4db4
      //CoveredLines: [57, 58, 63, 64, 67, 72, 73, 78, 80, 81, 83, 84, 85, 86, 87, 88, 89, 92]
      //Input_0_String: https://aip.baidubce.com/oauth/2.0/token?
      //Input_1_String: https://aip.baidubce.com/oauth/2.0/token?
      //Input_2_String: https://aip.baidubce.com/oauth/2.0/token?
      
      
      //Call method: post
      try { 
        HttpUtil.post("https://aip.baidubce.com/oauth/2.0/token?", "https://aip.baidubce.com/oauth/2.0/token?", "https://aip.baidubce.com/oauth/2.0/token?");
      } catch(Throwable e) {
      }
  }
}