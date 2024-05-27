/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.consumer.utils.GsonUtils;
import java.lang.reflect.Type;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class GsonUtils_SSTest extends GsonUtils_SSTest_scaffolding {
// allCoveredLines:[15, 19, 23, 27]

  @Test(timeout = 9000)
  public void test_fromJson_0()  throws Throwable  {
      //caseID:64ef228b3af71086c3461cb21554481c
      //CoveredLines: [23]
      //Input_0_String: 1.0
      //Input_1_Class<Object>: Object.class
      //Assert: assertEquals(1.0, method_result);
      
      Class<Object> class0 = Object.class;
      
      //Call method: fromJson
      Object object0 = GsonUtils.fromJson("1.0", class0);
      
      //Test Result Assert
      assertEquals(1.0, object0);
  }

  @Test(timeout = 9000)
  public void test_fromJson_1()  throws Throwable  {
      //caseID:3e87f8ab218f34cedfc8f7bc51216929
      //CoveredLines: [15, 27]
      //Input_0_String: 
      //Input_1_Type: {}
      //Assert: assertNull(method_result);
      
      GsonUtils gsonUtils0 = new GsonUtils();
      //mock type0
      Type type0 = mock(Type.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: fromJson
      Integer integer0 = GsonUtils.fromJson("", type0);
      
      //Test Result Assert
      assertNull(integer0);
  }

  @Test(timeout = 9000)
  public void test_toJson_2()  throws Throwable  {
      //caseID:2bd42642de5e1143835533f1ce0f7c1d
      //CoveredLines: [15, 19]
      //Input_0_Object: gsonUtils0
      //Assert: assertEquals("{}", method_result);
      
      GsonUtils gsonUtils0 = new GsonUtils();
      
      //Call method: toJson
      String string0 = GsonUtils.toJson(gsonUtils0);
      
      //Test Result Assert
      assertEquals("{}", string0);
  }
}