/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.consumer.entity.BankCard;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class BankCard_SSTest extends BankCard_SSTest_scaffolding {
// allCoveredLines:[20, 30, 36, 42, 48, 54, 60, 66]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:5afb5801603e1f483398263245accf4b
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_Object: 1
      //Assert: assertFalse(method_result);
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: equals
      boolean boolean0 = bankCard0.equals("1");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:4137d1fa831f2831212f62fc681c9670
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_Object: bankCard0
      //Assert: assertTrue(method_result);
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: equals
      boolean boolean0 = bankCard0.equals(bankCard0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:6668ab17aa579838df7bb3b6e6097c33
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 36, 42, 48, 54, 60, 66]
      //Input_0_Object: bankCard1
      //Assert: assertTrue(method_result);
      
      BankCard bankCard0 = new BankCard();
      BankCard bankCard1 = new BankCard();
      
      //Call method: equals
      boolean boolean0 = bankCard0.equals(bankCard1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:ce92d3a791d4420f31aeb5edee111021
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 36, 42, 48, 54, 60, 66]
      //Input_0_Object: bankCard0
      //Assert: assertTrue(method_result);
      
      BankCard bankCard0 = new BankCard();
      BankCard bankCard1 = new BankCard();
      
      //Call method: equals
      boolean boolean0 = bankCard1.equals(bankCard0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:217cde5956d5e053880d81d7f87f7ecc
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 36, 42, 48, 54, 60, 66]
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: hashCode
      bankCard0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setBankCode_05()  throws Throwable  {
      //caseID:29fe5a1f83a0afd16c6e9edb062c5016
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_String: 1.0
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: setBankCode
      bankCard0.setBankCode("1.0");
      
      //Test Result Assert
      assertNull(bankCard0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_setBankName_06()  throws Throwable  {
      //caseID:ec5793c6caac351625ef598543b8fa11
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_String: NCLOB
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: setBankName
      bankCard0.setBankName("NCLOB");
      
      //Test Result Assert
      assertNull(bankCard0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_setCardNumber_07()  throws Throwable  {
      //caseID:caefd35cab886abb9c068564231f5a82
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_String: 
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: setCardNumber
      bankCard0.setCardNumber("");
      
      //Test Result Assert
      assertNull(bankCard0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_setConsumerId_08()  throws Throwable  {
      //caseID:bb44e7dbb865be70891671056f5c0614
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_Long: 0L
      
      BankCard bankCard0 = new BankCard();
      Long long0 = new Long(0L);
      
      //Call method: setConsumerId
      bankCard0.setConsumerId(long0);
      
      //Test Result Assert
      assertEquals(0L, (long)bankCard0.getConsumerId());
  }

  @Test(timeout = 9000)
  public void test_setId_09()  throws Throwable  {
      //caseID:24f06b5ce51c93f6e3542057a13ec9ea
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_Long: 2321L
      
      BankCard bankCard0 = new BankCard();
      Long long0 = new Long(2321L);
      
      //Call method: setId
      bankCard0.setId(long0);
      
      //Test Result Assert
      assertNull(bankCard0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_setMobile_10()  throws Throwable  {
      //caseID:9fe68d047a67aaed9b301669387c3339
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_String: , mobile=
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: setMobile
      bankCard0.setMobile(", mobile=");
      
      //Test Result Assert
      assertNull(bankCard0.getCardNumber());
  }

  @Test(timeout = 9000)
  public void test_setStatus_11()  throws Throwable  {
      //caseID:cf8601f6f2b981471fab79f132acf858
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]
      //Input_0_Integer: 0
      
      BankCard bankCard0 = new BankCard();
      Integer integer0 = new Integer(0);
      
      //Call method: setStatus
      bankCard0.setStatus(integer0);
      
      //Test Result Assert
      assertNull(bankCard0.getId());
  }

  @Test(timeout = 9000)
  public void test_toString_12()  throws Throwable  {
      //caseID:08705c4356bd389313ef943dc2b4d8a6
      //CoveredLines: [20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 36, 42, 48, 54, 60, 66]
      //Assert: assertEquals("BankCard(id=null, consumerId=null, bankCode=null, bankName=null, cardNumber=null, mobile=null, status=null)", method_result);
      
      BankCard bankCard0 = new BankCard();
      
      //Call method: toString
      String string0 = bankCard0.toString();
      
      //Test Result Assert
      assertEquals("BankCard(id=null, consumerId=null, bankCode=null, bankName=null, cardNumber=null, mobile=null, status=null)", string0);
  }
}
