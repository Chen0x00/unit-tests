/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.consumer.utils.BaiDuOrcIdCardUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class BaiDuOrcIdCardUtil_SSTest extends BaiDuOrcIdCardUtil_SSTest_scaffolding {
// allCoveredLines:[13, 18, 19, 21, 22, 25, 26, 32, 33, 35, 36, 39, 40]

  @Test(timeout = 9000)
  public void test_idCardBack_0()  throws Throwable  {
      //caseID:3205a7c43ae79440ae78c41af9a1c29d
      //CoveredLines: [13, 18, 19, 21, 22, 25, 26]
      //Input_0_byte[]: byteArray0
      
      BaiDuOrcIdCardUtil baiDuOrcIdCardUtil0 = new BaiDuOrcIdCardUtil();
      byte[] byteArray0 = new byte[0];
      
      //Call method: idCardBack
      // Undeclared exception!
      try { 
        BaiDuOrcIdCardUtil.idCardBack(byteArray0);
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.utils.BaiDuOrcIdCardUtil", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_idCardFront_1()  throws Throwable  {
      //caseID:1fe0884a0947148ef0d0050391011e78
      //CoveredLines: [32, 33, 35, 36, 39, 40]
      //Input_0_byte[]: byteArray0
      
      byte[] byteArray0 = new byte[0];
      
      //Call method: idCardFront
      // Undeclared exception!
      try { 
        BaiDuOrcIdCardUtil.idCardFront(byteArray0);
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.utils.BaiDuOrcIdCardUtil", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }
}
