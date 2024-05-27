/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.common.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.common.util.MD5Util;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class MD5Util_SSTest extends MD5Util_SSTest_scaffolding {
// allCoveredLines:[11, 20, 21, 22, 26, 27, 28, 29, 30, 32, 33, 35, 41]

  @Test(timeout = 9000)
  public void test_getMd5_0()  throws Throwable  {
      //caseID:13f28eddbd0ef2b4390aeaca5aa54c09
      //CoveredLines: [11, 20, 21, 22, 26, 27, 28, 29, 30, 32, 33, 35, 41]
      //Input_0_String: Ex|[j
      //Assert: assertEquals("726a75795a147f5cbc1814047500ce5d", method_result);
      //Assert: assertNotNull(method_result);
      
      MD5Util mD5Util0 = new MD5Util();
      
      //Call method: getMd5
      String string0 = MD5Util.getMd5("Ex|[j");
      
      //Test Result Assert
      assertEquals("726a75795a147f5cbc1814047500ce5d", string0);
      
      //Test Result Assert
      assertNotNull(string0);
  }
}
