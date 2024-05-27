/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.depository.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.depository.model.DepositoryResponseDTO;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class DepositoryResponseDTO_SSTest extends DepositoryResponseDTO_SSTest_scaffolding {
// allCoveredLines:[16, 22, 28]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:132264a53a847a6e2c3155d024fc9a86
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16]
      //Input_0_Object: depositoryResponseDTO0
      //Assert: assertTrue(method_result);
      
      DepositoryResponseDTO<Object> depositoryResponseDTO0 = new DepositoryResponseDTO<Object>();
      
      //Call method: equals
      boolean boolean0 = depositoryResponseDTO0.equals(depositoryResponseDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:0fed9558a90ecb521acb04ead9c1b742
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16, 22, 28]
      //Input_0_Object: depositoryResponseDTO1
      //Assert: assertTrue(method_result);
      
      DepositoryResponseDTO<Integer> depositoryResponseDTO0 = new DepositoryResponseDTO<Integer>();
      DepositoryResponseDTO<String> depositoryResponseDTO1 = new DepositoryResponseDTO<String>();
      
      //Call method: equals
      boolean boolean0 = depositoryResponseDTO0.equals(depositoryResponseDTO1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:b8c33ca980464762b30193d7b4f5095d
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16, 22, 28]
      //Input_0_Object: depositoryResponseDTO0
      //Assert: assertTrue(method_result);
      
      DepositoryResponseDTO<String> depositoryResponseDTO0 = new DepositoryResponseDTO<String>();
      DepositoryResponseDTO<Object> depositoryResponseDTO1 = new DepositoryResponseDTO<Object>();
      
      //Call method: equals
      boolean boolean0 = depositoryResponseDTO1.equals(depositoryResponseDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_3()  throws Throwable  {
      //caseID:1619fd4bafbf76187f4d45e81fc6073a
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16, 22, 28]
      
      DepositoryResponseDTO<Object> depositoryResponseDTO0 = new DepositoryResponseDTO<Object>();
      
      //Call method: hashCode
      depositoryResponseDTO0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setRespData_4()  throws Throwable  {
      //caseID:48857c969717170e4c916ee477a937c7
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16]
      //Input_0_Integer: (-1)
      
      DepositoryResponseDTO<Integer> depositoryResponseDTO0 = new DepositoryResponseDTO<Integer>();
      Integer integer0 = new Integer((-1));
      
      //Call method: setRespData
      depositoryResponseDTO0.setRespData(integer0);
      
      //Test Result Assert
      assertNull(depositoryResponseDTO0.getSignature());
  }

  @Test(timeout = 9000)
  public void test_setSignature_5()  throws Throwable  {
      //caseID:b01a390c80ea3e22b2e23f5b13130088
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16]
      //Input_0_String: 43
      
      DepositoryResponseDTO<Integer> depositoryResponseDTO0 = new DepositoryResponseDTO<Integer>();
      
      //Call method: setSignature
      depositoryResponseDTO0.setSignature("43");
      
      //Test Result Assert
      assertEquals("43", depositoryResponseDTO0.getSignature());
  }

  @Test(timeout = 9000)
  public void test_toString_6()  throws Throwable  {
      //caseID:93a6fba3bb927ab34df70b7fb53739f3
      //CoveredLines: [16, 16, 16, 16, 16, 16, 16, 22, 28]
      //Assert: assertEquals("DepositoryResponseDTO(respData=null, signature=null)", method_result);
      
      DepositoryResponseDTO<DepositoryResponseDTO<Integer>> depositoryResponseDTO0 = new DepositoryResponseDTO<DepositoryResponseDTO<Integer>>();
      
      //Call method: toString
      String string0 = depositoryResponseDTO0.toString();
      
      //Test Result Assert
      assertEquals("DepositoryResponseDTO(respData=null, signature=null)", string0);
  }
}