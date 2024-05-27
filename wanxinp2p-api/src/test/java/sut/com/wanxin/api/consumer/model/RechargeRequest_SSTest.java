/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.consumer.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.consumer.model.RechargeRequest;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class RechargeRequest_SSTest extends RechargeRequest_SSTest_scaffolding {
// allCoveredLines:[19, 25, 28, 31, 34, 37]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:f29b957531257cb82eb653937f6c17d9
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_Object: rechargeRequest0
      //Assert: assertTrue(method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: equals
      boolean boolean0 = rechargeRequest0.equals(rechargeRequest0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:188661a1afd31849f87716d568f0447a
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_Object: BigDecimal.ZERO
      //Assert: assertFalse(method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: equals
      boolean boolean0 = rechargeRequest0.equals(bigDecimal0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:553481a5ef2777d227ae54d391874f7e
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 25, 28, 31, 34, 37]
      //Input_0_Object: rechargeRequest0
      //Assert: assertTrue(method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      RechargeRequest rechargeRequest1 = new RechargeRequest();
      
      //Call method: equals
      boolean boolean0 = rechargeRequest1.equals(rechargeRequest0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:f4b286cfdaa6ad78711adf5c66f1276b
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 25, 28, 31, 34, 37]
      //Input_0_Object: rechargeRequest1
      //Assert: assertTrue(method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      RechargeRequest rechargeRequest1 = new RechargeRequest();
      
      //Call method: equals
      boolean boolean0 = rechargeRequest0.equals(rechargeRequest1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:c1d0d86886ae0996c4f4acd1f655a370
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 25, 28, 31, 34, 37]
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: hashCode
      rechargeRequest0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAmount_05()  throws Throwable  {
      //caseID:53da0e64381f5bb8b438408f86295697
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_BigDecimal: BigDecimal.ZERO
      //Assert: assertNull(method_result.getUserNo());
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setAmount
      RechargeRequest rechargeRequest1 = rechargeRequest0.setAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(rechargeRequest1.getUserNo());
  }

  @Test(timeout = 9000)
  public void test_setCallbackUrl_06()  throws Throwable  {
      //caseID:850de887484ef499f1088790dbbfec64
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_String: , callbackUrl=
      //Assert: assertSame(rechargeRequest0, method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: setCallbackUrl
      RechargeRequest rechargeRequest1 = rechargeRequest0.setCallbackUrl(", callbackUrl=");
      
      //Test Result Assert
      assertSame(rechargeRequest0, rechargeRequest1);
  }

  @Test(timeout = 9000)
  public void test_setId_07()  throws Throwable  {
      //caseID:7448c45a0b0a08d205d1d27a55cbe224
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_Long: 0L
      //Assert: assertSame(method_result, rechargeRequest0);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      Long long0 = new Long(0L);
      
      //Call method: setId
      RechargeRequest rechargeRequest1 = rechargeRequest0.setId(long0);
      
      //Test Result Assert
      assertSame(rechargeRequest1, rechargeRequest0);
  }

  @Test(timeout = 9000)
  public void test_setRequestNo_08()  throws Throwable  {
      //caseID:e262f36ca6ecc884633ed785facd868f
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_String: 1
      //Assert: assertNull(method_result.getUserNo());
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: setRequestNo
      RechargeRequest rechargeRequest1 = rechargeRequest0.setRequestNo("1");
      
      //Test Result Assert
      assertNull(rechargeRequest1.getUserNo());
  }

  @Test(timeout = 9000)
  public void test_setUserNo_09()  throws Throwable  {
      //caseID:bddffed0daf81af0df2b234a53a4ff39
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19]
      //Input_0_String: , callbackUrl=
      //Assert: assertSame(method_result, rechargeRequest0);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: setUserNo
      RechargeRequest rechargeRequest1 = rechargeRequest0.setUserNo(", callbackUrl=");
      
      //Test Result Assert
      assertSame(rechargeRequest1, rechargeRequest0);
  }

  @Test(timeout = 9000)
  public void test_toString_10()  throws Throwable  {
      //caseID:c1c8565c71bb9b4c6d806fc42c414258
      //CoveredLines: [19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 25, 28, 31, 34, 37]
      //Assert: assertEquals("RechargeRequest(id=null, userNo=null, requestNo=null, amount=null, callbackUrl=null)", method_result);
      
      RechargeRequest rechargeRequest0 = new RechargeRequest();
      
      //Call method: toString
      String string0 = rechargeRequest0.toString();
      
      //Test Result Assert
      assertEquals("RechargeRequest(id=null, userNo=null, requestNo=null, amount=null, callbackUrl=null)", string0);
  }
}