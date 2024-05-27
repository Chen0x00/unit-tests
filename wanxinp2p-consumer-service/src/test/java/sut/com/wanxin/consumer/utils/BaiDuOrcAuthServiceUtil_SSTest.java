/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.consumer.utils.BaiDuOrcAuthServiceUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class BaiDuOrcAuthServiceUtil_SSTest extends BaiDuOrcAuthServiceUtil_SSTest_scaffolding {
// allCoveredLines:[20, 32, 33, 38, 40, 41, 42, 44, 53, 54]

  @Test(timeout = 9000)
  public void test_getAuth_0()  throws Throwable  {
      //caseID:08ce25770843aa8d76954c8c9322d722
      //CoveredLines: [20, 32, 33, 38, 40, 41, 42, 44, 53, 54]
      
      BaiDuOrcAuthServiceUtil baiDuOrcAuthServiceUtil0 = new BaiDuOrcAuthServiceUtil();
      
      //Call method: getAuth
      // Undeclared exception!
      try { 
        BaiDuOrcAuthServiceUtil.getAuth();
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.utils.BaiDuOrcAuthServiceUtil", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }
}
