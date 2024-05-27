/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.depository.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.depository.model.UserAutoPreTransactionRequest;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class UserAutoPreTransactionRequest_SSTest extends UserAutoPreTransactionRequest_SSTest_scaffolding {
// allCoveredLines:[17, 22, 25, 28, 31, 34, 37, 40, 43, 46]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:94519679c1806bd95425b0d46846f157
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_Object: userAutoPreTransactionRequest0
      //Assert: assertTrue(method_result);
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: equals
      boolean boolean0 = userAutoPreTransactionRequest0.equals(userAutoPreTransactionRequest0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:7e0342ad75508bee14c6280097ab1a68
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_Object: 0L
      //Assert: assertFalse(method_result);
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      Long long0 = new Long(0L);
      
      //Call method: equals
      boolean boolean0 = userAutoPreTransactionRequest0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:810d2c0497683382468d083f216a94d8
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 22, 25, 28, 31, 34, 37, 40, 43, 46]
      //Input_0_Object: userAutoPreTransactionRequest0
      //Assert: assertTrue(method_result);
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      UserAutoPreTransactionRequest userAutoPreTransactionRequest1 = new UserAutoPreTransactionRequest();
      
      //Call method: equals
      boolean boolean0 = userAutoPreTransactionRequest1.equals(userAutoPreTransactionRequest0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:a5eb537122dff3ce9a3c3250e9070d88
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 22, 25, 28, 31, 34, 37, 40, 43, 46]
      //Input_0_Object: userAutoPreTransactionRequest1
      //Assert: assertTrue(method_result);
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      UserAutoPreTransactionRequest userAutoPreTransactionRequest1 = new UserAutoPreTransactionRequest();
      
      //Call method: equals
      boolean boolean0 = userAutoPreTransactionRequest0.equals(userAutoPreTransactionRequest1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:b3ec4c3f9082f36d2b44be657f05e1df
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 22, 25, 28, 31, 34, 37, 40, 43, 46]
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: hashCode
      userAutoPreTransactionRequest0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAmount_05()  throws Throwable  {
      //caseID:0e52fd5fefdf63eebef241728e197cfc
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_BigDecimal: 597L
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      BigDecimal bigDecimal0 = new BigDecimal(597L);
      
      //Call method: setAmount
      userAutoPreTransactionRequest0.setAmount(bigDecimal0);
      
      //Test Result Assert
      assertEquals((short)597, bigDecimal0.shortValue());
  }

  @Test(timeout = 9000)
  public void test_setBizType_06()  throws Throwable  {
      //caseID:7cfdfbf9311d3af499ccb94ecca26141
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: , requestNo=
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setBizType
      userAutoPreTransactionRequest0.setBizType(", requestNo=");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getCreditsaleRequestNo());
  }

  @Test(timeout = 9000)
  public void test_setCreditsaleRequestNo_07()  throws Throwable  {
      //caseID:f725a494e432d2c122075e01f8833508
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: 1.0
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setCreditsaleRequestNo
      userAutoPreTransactionRequest0.setCreditsaleRequestNo("1.0");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getId());
  }

  @Test(timeout = 9000)
  public void test_setId_08()  throws Throwable  {
      //caseID:9e2606a13d4155f21f2f177219ee4d9b
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_Long: 1643L
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      Long long0 = new Long(1643L);
      
      //Call method: setId
      userAutoPreTransactionRequest0.setId(long0);
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getCreditsaleRequestNo());
  }

  @Test(timeout = 9000)
  public void test_setPreMarketingAmount_09()  throws Throwable  {
      //caseID:1a02daa494a44b30d9fdd5945e2f0a5a
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_BigDecimal: 0
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      
      //Call method: setPreMarketingAmount
      userAutoPreTransactionRequest0.setPreMarketingAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getCreditsaleRequestNo());
  }

  @Test(timeout = 9000)
  public void test_setProjectNo_10()  throws Throwable  {
      //caseID:7ac35b8611100b3924acb1bb049151df
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: , preMarketingAmount=
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setProjectNo
      userAutoPreTransactionRequest0.setProjectNo(", preMarketingAmount=");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getId());
  }

  @Test(timeout = 9000)
  public void test_setRemark_11()  throws Throwable  {
      //caseID:25364ad7826b5562995d64cd5525b209
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: VU2U
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setRemark
      userAutoPreTransactionRequest0.setRemark("VU2U");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getCreditsaleRequestNo());
  }

  @Test(timeout = 9000)
  public void test_setRequestNo_12()  throws Throwable  {
      //caseID:26578a51cd0dcab0fc2bb79ab47f9109
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: 1.0
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setRequestNo
      userAutoPreTransactionRequest0.setRequestNo("1.0");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getRemark());
  }

  @Test(timeout = 9000)
  public void test_setUserNo_13()  throws Throwable  {
      //caseID:c4c9cf968d03b29f5f0cc25e723389d5
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
      //Input_0_String: , creditsaleRequestNo=
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: setUserNo
      userAutoPreTransactionRequest0.setUserNo(", creditsaleRequestNo=");
      
      //Test Result Assert
      assertNull(userAutoPreTransactionRequest0.getProjectNo());
  }

  @Test(timeout = 9000)
  public void test_toString_14()  throws Throwable  {
      //caseID:318d6cd10d98ed548968d6539cc4cdf5
      //CoveredLines: [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 22, 25, 28, 31, 34, 37, 40, 43, 46]
      //Assert: assertEquals("UserAutoPreTransactionRequest(amount=null, requestNo=null, userNo=null, bizType=null, preMarketingAmount=null, remark=null, projectNo=null, creditsaleRequestNo=null, id=null)", method_result);
      
      UserAutoPreTransactionRequest userAutoPreTransactionRequest0 = new UserAutoPreTransactionRequest();
      
      //Call method: toString
      String string0 = userAutoPreTransactionRequest0.toString();
      
      //Test Result Assert
      assertEquals("UserAutoPreTransactionRequest(amount=null, requestNo=null, userNo=null, bizType=null, preMarketingAmount=null, remark=null, projectNo=null, creditsaleRequestNo=null, id=null)", string0);
  }
}
