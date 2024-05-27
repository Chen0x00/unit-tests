/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.depository.common.constant;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.depository.common.constant.DepositoryErrorCode;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class DepositoryErrorCode_SSTest extends DepositoryErrorCode_SSTest_scaffolding {
// allCoveredLines:[29, 30, 31, 34, 39, 44]

  @Test(timeout = 9000)
  public void test_getDesc_0()  throws Throwable  {
      //caseID:92f24542a2ca05770f38018c2c1f42fe
      //CoveredLines: [44]
      
      DepositoryErrorCode depositoryErrorCode0 = DepositoryErrorCode.E_160101;
      
      //Call method: getDesc
      depositoryErrorCode0.getDesc();
  }

  @Test(timeout = 9000)
  public void test_setErrorCode_1()  throws Throwable  {
      //caseID:6c3404042341a35fde48d2f5ca1cc426
      //CoveredLines: [29, 30, 31, 34, 39]
      //Input_0_int: 0
      
      DepositoryErrorCode depositoryErrorCode0 = DepositoryErrorCode.E_160101;
      
      PrivateAccess.setVariable((Class<?>) DepositoryErrorCode.class, depositoryErrorCode0, "desc", (Object) "2SN1$*R]\"N(KNw,W");
      
      PrivateAccess.setVariable((Class<?>) DepositoryErrorCode.class, depositoryErrorCode0, "code", (Object) 2);
      
      //Call method: setErrorCode
      DepositoryErrorCode.setErrorCode(0);
  }

  @Test(timeout = 9000)
  public void test_setErrorCode_2()  throws Throwable  {
      //caseID:a7dc6907d9be0422880da64f8a3ce7d7
      //CoveredLines: [29, 30, 31, 39]
      //Input_0_int: 160101
      
      
      //Call method: setErrorCode
      DepositoryErrorCode.setErrorCode(160101);
  }
}
