/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.common.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.common.domain.RestResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class RestResponse_SSTest extends RestResponse_SSTest_scaffolding {
// allCoveredLines:[28, 29, 31, 32, 33, 34, 37, 41, 42, 43, 47, 48, 49, 50, 54, 58, 59, 62, 66, 67, 70, 74, 75, 79, 84]

  @Test(timeout = 9000)
  public void test_getCode_0()  throws Throwable  {
      //caseID:0158743978d4d19e143c1b182461cb46
      //CoveredLines: [28, 29, 31, 32, 33, 34, 54]
      //Assert: assertEquals(0, method_result);
      
      RestResponse<String> restResponse0 = new RestResponse<String>();
      
      //Call method: getCode
      int int0 = restResponse0.getCode();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 9000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:5864ca9fcc5983603656409ffc168680
      //CoveredLines: [28, 29, 31, 32, 33, 34, 62]
      //Assert: assertEquals("", method_result);
      
      RestResponse<Object> restResponse0 = new RestResponse<Object>();
      
      //Call method: getMsg
      String string0 = restResponse0.getMsg();
      
      //Test Result Assert
      assertEquals("", string0);
  }

  @Test(timeout = 9000)
  public void test_getResult_2()  throws Throwable  {
      //caseID:50157de28b547b6651ea9d0669556115
      //CoveredLines: [28, 29, 31, 32, 33, 34, 70]
      //Assert: assertNull(method_result);
      
      RestResponse<Object> restResponse0 = new RestResponse<Object>();
      
      //Call method: getResult
      Object object0 = restResponse0.getResult();
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 9000)
  public void test_isSuccessful_3()  throws Throwable  {
      //caseID:f84767d18071fb359004de2de467de80
      //CoveredLines: [28, 29, 31, 32, 33, 34, 79]
      //Assert: assertTrue(method_result);
      
      RestResponse<String> restResponse0 = new RestResponse<String>();
      
      //Call method: isSuccessful
      Boolean boolean0 = restResponse0.isSuccessful();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_success_4()  throws Throwable  {
      //caseID:da7fa78e99ac3c0657ceda9ce60fd8ec
      //CoveredLines: [28, 29, 31, 32, 33, 34, 37]
      //Assert: assertEquals("", method_result.getMsg());
      
      RestResponse<Object> restResponse0 = new RestResponse<Object>();
      
      //Call method: success
      RestResponse<String> restResponse1 = RestResponse.success();
      
      //Test Result Assert
      assertEquals("", restResponse1.getMsg());
  }

  @Test(timeout = 9000)
  public void test_success_5()  throws Throwable  {
      //caseID:1fe0cb58cc21d08c90e0f63926ba3998
      //CoveredLines: [28, 29, 31, 32, 33, 34, 41, 42, 43, 74, 75]
      //Input_0_Integer: 0
      //Assert: assertTrue(method_result.isSuccessful());
      
      RestResponse<Object> restResponse0 = new RestResponse<Object>();
      Integer integer0 = new Integer(0);
      
      //Call method: success
      RestResponse<Integer> restResponse1 = RestResponse.success(integer0);
      
      //Test Result Assert
      assertTrue(restResponse1.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_toString_6()  throws Throwable  {
      //caseID:1f9d313c3e95fd1937b82d07da685416
      //CoveredLines: [28, 29, 31, 32, 33, 34, 84]
      //Assert: assertEquals("RestResponse [code=0, msg=, result=null]", method_result);
      
      RestResponse<String> restResponse0 = new RestResponse<String>();
      
      //Call method: toString
      String string0 = restResponse0.toString();
      
      //Test Result Assert
      assertEquals("RestResponse [code=0, msg=, result=null]", string0);
  }

  @Test(timeout = 9000)
  public void test_validfail_7()  throws Throwable  {
      //caseID:0ecfa56629c7eb9b05eed1c072920666
      //CoveredLines: [28, 29, 31, 32, 33, 34, 47, 48, 49, 50, 58, 59, 66, 67]
      //Input_0_String: -2
      //Assert: assertEquals((-2), method_result.getCode());
      
      RestResponse<String> restResponse0 = new RestResponse<String>();
      
      //Call method: validfail
      RestResponse<Object> restResponse1 = RestResponse.validfail("-2");
      
      //Test Result Assert
      assertEquals((-2), restResponse1.getCode());
  }
}
