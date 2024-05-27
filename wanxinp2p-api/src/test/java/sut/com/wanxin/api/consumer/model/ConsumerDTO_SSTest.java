/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.consumer.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.consumer.model.ConsumerDTO;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ConsumerDTO_SSTest extends ConsumerDTO_SSTest_scaffolding {
// allCoveredLines:[14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:d582ce8eab160c79eb112ba6c2696298
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Object: 
      //Assert: assertFalse(method_result);
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: equals
      boolean boolean0 = consumerDTO0.equals("");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:da22acf5f07d4bf7097917c848f056cf
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Object: consumerDTO0
      //Assert: assertTrue(method_result);
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: equals
      boolean boolean0 = consumerDTO0.equals(consumerDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:0fa74a1b37b94dc8db54843524a55766
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55]
      //Input_0_Object: consumerDTO0
      //Assert: assertTrue(method_result);
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      ConsumerDTO consumerDTO1 = new ConsumerDTO();
      
      //Call method: equals
      boolean boolean0 = consumerDTO1.equals(consumerDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:71461c04da904f583378cc1cb861652f
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55]
      //Input_0_Object: consumerDTO1
      //Assert: assertTrue(method_result);
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      ConsumerDTO consumerDTO1 = new ConsumerDTO();
      
      //Call method: equals
      boolean boolean0 = consumerDTO0.equals(consumerDTO1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:ef3921e2379237a39d63cba0f0ee3b86
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55]
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: hashCode
      consumerDTO0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAuthList_05()  throws Throwable  {
      //caseID:a75df8abe4890b1420616cc42572b4e9
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: Yk]IZF]l$5?S!RNy&
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setAuthList
      consumerDTO0.setAuthList("Yk]IZF]l$5?S!RNy&");
      
      //Test Result Assert
      assertNull(consumerDTO0.getIsCardAuth());
  }

  @Test(timeout = 9000)
  public void test_setFullname_06()  throws Throwable  {
      //caseID:eee26cf4f91eca8b000472dac2c4cd0d
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: )S<;d
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setFullname
      consumerDTO0.setFullname(")S<;d");
      
      //Test Result Assert
      assertNull(consumerDTO0.getRole());
  }

  @Test(timeout = 9000)
  public void test_setId_07()  throws Throwable  {
      //caseID:79c8ead2edc7286e81b32becc24efd94
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Long: 1339L
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      Long long0 = new Long(1339L);
      
      //Call method: setId
      consumerDTO0.setId(long0);
      
      //Test Result Assert
      assertNull(consumerDTO0.getRole());
  }

  @Test(timeout = 9000)
  public void test_setIdNumber_08()  throws Throwable  {
      //caseID:53c0fe7b2c4e965aa49907e4f2d6afa1
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: , isCardAuth=
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setIdNumber
      consumerDTO0.setIdNumber(", isCardAuth=");
      
      //Test Result Assert
      assertNull(consumerDTO0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_setIsBindCard_09()  throws Throwable  {
      //caseID:3082ae0c8eb1fee9d02b8877b280b32c
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 0
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      Integer integer0 = new Integer(0);
      
      //Call method: setIsBindCard
      consumerDTO0.setIsBindCard(integer0);
      
      //Test Result Assert
      assertNull(consumerDTO0.getRole());
  }

  @Test(timeout = 9000)
  public void test_setIsCardAuth_10()  throws Throwable  {
      //caseID:ccce9f15a0a0e26e97edd866496ea53c
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 43
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      Integer integer0 = new Integer(43);
      
      //Call method: setIsCardAuth
      consumerDTO0.setIsCardAuth(integer0);
      
      //Test Result Assert
      assertEquals(43, (int)consumerDTO0.getIsCardAuth());
  }

  @Test(timeout = 9000)
  public void test_setLoanAmount_11()  throws Throwable  {
      //caseID:9d51daa02cf193c9167954f9969a15f2
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setLoanAmount
      consumerDTO0.setLoanAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(consumerDTO0.getIdNumber());
  }

  @Test(timeout = 9000)
  public void test_setMobile_12()  throws Throwable  {
      //caseID:beaaa230d9185710a413034f098ff034
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: 1
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setMobile
      consumerDTO0.setMobile("1");
      
      //Test Result Assert
      assertNull(consumerDTO0.getFullname());
  }

  @Test(timeout = 9000)
  public void test_setRole_13()  throws Throwable  {
      //caseID:205c3b6fea3e5dac7e68c4b27100bdf5
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: , fullname=
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setRole
      consumerDTO0.setRole(", fullname=");
      
      //Test Result Assert
      assertEquals(", fullname=", consumerDTO0.getRole());
  }

  @Test(timeout = 9000)
  public void test_setStatus_14()  throws Throwable  {
      //caseID:18f988258dc842774cb69e0e681ad634
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 652
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      Integer integer0 = new Integer(652);
      
      //Call method: setStatus
      consumerDTO0.setStatus(integer0);
      
      //Test Result Assert
      assertNull(consumerDTO0.getUsername());
  }

  @Test(timeout = 9000)
  public void test_setUserNo_15()  throws Throwable  {
      //caseID:28ed11a08e8d3f9e41b1ada3017c74ff
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: )xf][05J
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setUserNo
      consumerDTO0.setUserNo(")xf][05J");
      
      //Test Result Assert
      assertNull(consumerDTO0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_setUserType_16()  throws Throwable  {
      //caseID:24102e54799054800d6b0106de8a0582
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: , mobile=
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setUserType
      consumerDTO0.setUserType(", mobile=");
      
      //Test Result Assert
      assertNull(consumerDTO0.getId());
  }

  @Test(timeout = 9000)
  public void test_setUsername_17()  throws Throwable  {
      //caseID:a7c751416f6f5cd801cbdaaccaabb455
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: 1
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: setUsername
      consumerDTO0.setUsername("1");
      
      //Test Result Assert
      assertNull(consumerDTO0.getIsBindCard());
  }

  @Test(timeout = 9000)
  public void test_toString_18()  throws Throwable  {
      //caseID:f7cbc0669f54197bb71a3e5a6159e5a7
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55]
      //Assert: assertEquals("ConsumerDTO(id=null, username=null, fullname=null, idNumber=null, userNo=null, mobile=null, userType=null, role=null, authList=null, isBindCard=null, status=null, isCardAuth=null, loanAmount=null)", method_result);
      
      ConsumerDTO consumerDTO0 = new ConsumerDTO();
      
      //Call method: toString
      String string0 = consumerDTO0.toString();
      
      //Test Result Assert
      assertEquals("ConsumerDTO(id=null, username=null, fullname=null, idNumber=null, userNo=null, mobile=null, userType=null, role=null, authList=null, isBindCard=null, status=null, isCardAuth=null, loanAmount=null)", string0);
  }
}
