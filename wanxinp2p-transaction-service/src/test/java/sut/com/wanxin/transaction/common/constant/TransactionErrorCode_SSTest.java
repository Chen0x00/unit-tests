/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.transaction.common.constant;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.transaction.common.constant.TransactionErrorCode;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class TransactionErrorCode_SSTest extends TransactionErrorCode_SSTest_scaffolding {
// allCoveredLines:[98, 99, 100, 103, 108, 113]

  @Test(timeout = 9000)
  public void test_getDesc_0()  throws Throwable  {
      //caseID:e02f2639ff2f716a878d73c94a90a23a
      //CoveredLines: [113]
      
      TransactionErrorCode transactionErrorCode0 = TransactionErrorCode.E_150115;
      
      //Call method: getDesc
      transactionErrorCode0.getDesc();
  }

  @Test(timeout = 9000)
  public void test_setErrorCode_1()  throws Throwable  {
      //caseID:8f1a9b560c55abdbc74e4322fc3e0e02
      //CoveredLines: [98, 99, 103, 108]
      //Input_0_int: 1
      
      
      //Call method: setErrorCode
      TransactionErrorCode.setErrorCode(1);
  }

  @Test(timeout = 9000)
  public void test_setErrorCode_2()  throws Throwable  {
      //caseID:a9889d0553852d69137df10eb0fdcc6c
      //CoveredLines: [98, 99, 100, 108]
      //Input_0_int: 3
      
      
      //Call method: setErrorCode
      TransactionErrorCode.setErrorCode(3);
  }
}