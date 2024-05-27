/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.transaction.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.api.transaction.model.ProjectDTO;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ProjectDTO_SSTest extends ProjectDTO_SSTest_scaffolding {
// allCoveredLines:[15, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67, 72, 77, 82, 92, 99, 104, 109, 114, 119, 124, 129, 135]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:7323885f41f3fc147e7dc1decfca839f
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Object: projectDTO0
      //Assert: assertTrue(method_result);
      //Assert: assertEquals("B", projectDTO0.getRisk());
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: equals
      boolean boolean0 = projectDTO0.equals(projectDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:d5d7a65774e8990ef2f97499a222e0a0
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Object: 0
      //Assert: assertEquals("B", projectDTO0.getRisk());
      //Assert: assertFalse(method_result);
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: equals
      boolean boolean0 = projectDTO0.equals("0");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:4bcbdb4dd16aa3ade44c5a2c8125fb5a
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 22, 124, 124]
      //Input_0_Object: projectDTO1
      //Assert: assertFalse(method_result);
      //Assert: assertEquals("B", projectDTO1.getRisk());
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Long long0 = new Long((-1));
      
      PrivateAccess.setVariable((Class<?>) ProjectDTO.class, projectDTO0, "id", (Object) long0);
      ProjectDTO projectDTO1 = new ProjectDTO();
      
      //Call method: equals
      boolean boolean0 = projectDTO0.equals(projectDTO1);
      
      //Test Result Assert
      assertFalse(boolean0);
      
      //Test Result Assert
      assertEquals("B", projectDTO1.getRisk());
  }

  @Test(timeout = 9000)
  public void test_hashCode_03()  throws Throwable  {
      //caseID:6ca191dd283e0d9e3177e3165c2662c0
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67, 72, 77, 82, 92, 99, 104, 109, 114, 119, 124, 124, 129, 135]
      //Assert: assertEquals("B", projectDTO0.getRisk());
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: hashCode
      projectDTO0.hashCode();
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setAmount_04()  throws Throwable  {
      //caseID:7d115af652ed75956ef27e8b5cf5c791
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_BigDecimal: BigDecimal.TEN
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      //Call method: setAmount
      projectDTO0.setAmount(bigDecimal0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setAnnualRate_05()  throws Throwable  {
      //caseID:a549d52339287c25ed212a5621c34f26
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setAnnualRate
      projectDTO0.setAnnualRate(bigDecimal0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setBorrowerAnnualRate_06()  throws Throwable  {
      //caseID:a7ae2d7017d75eb6dedc5cba0c0d4185
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_BigDecimal: BigDecimal.TEN
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      //Call method: setBorrowerAnnualRate
      projectDTO0.setBorrowerAnnualRate(bigDecimal0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setCommissionAnnualRate_07()  throws Throwable  {
      //caseID:b8bcaa7f5b1a9cd4c9005341b9c90f13
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setCommissionAnnualRate
      projectDTO0.setCommissionAnnualRate(bigDecimal0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setConsumerId_08()  throws Throwable  {
      //caseID:d73d2bec4bbb9291c0340c6e3ff10e54
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Long: 224L
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Long long0 = new Long(224L);
      
      //Call method: setConsumerId
      projectDTO0.setConsumerId(long0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setCreateDate_09()  throws Throwable  {
      //caseID:21588a86cc8a9588c28bb82827d0d591
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Date: {}
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setCreateDate
      projectDTO0.setCreateDate(date0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setDescription_10()  throws Throwable  {
      //caseID:baeb863c04d16c042718cceb2dca6d1d
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: , userNo=
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setDescription
      projectDTO0.setDescription(", userNo=");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setId_11()  throws Throwable  {
      //caseID:e108c4cbb0e567f8ec8495604dbb7c5c
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Long: 2236L
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Long long0 = new Long(2236L);
      
      //Call method: setId
      projectDTO0.setId(long0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setIsAssignment_12()  throws Throwable  {
      //caseID:4f218161215ee1108569a047c36fb6eb
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Integer: (-1)
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Integer integer0 = new Integer((-1));
      
      //Call method: setIsAssignment
      projectDTO0.setIsAssignment(integer0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setModifyDate_13()  throws Throwable  {
      //caseID:fc338231f6c0697561d782c079fb5d69
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Date: {}
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setModifyDate
      projectDTO0.setModifyDate(date0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setName_14()  throws Throwable  {
      //caseID:2d67c486bc515bec66f835adaa9b81c9
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: B
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setName
      projectDTO0.setName("B");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setPeriod_15()  throws Throwable  {
      //caseID:76b04ec6a23d5925117c3902f6508acf
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Integer: 1
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Integer integer0 = new Integer(1);
      
      //Call method: setPeriod
      projectDTO0.setPeriod(integer0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setProjectNo_16()  throws Throwable  {
      //caseID:ad6f1918e2fb28c4ab1df92f27e1c6ad
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: \t95 percentile resp time:
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setProjectNo
      projectDTO0.setProjectNo("\t95 percentile resp time:");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setProjectStatus_17()  throws Throwable  {
      //caseID:48b2821c32a2ad97183aa925c659ef4a
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: , createDate=
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setProjectStatus
      projectDTO0.setProjectStatus(", createDate=");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setRemainingAmount_18()  throws Throwable  {
      //caseID:c2cd91479fbba18778744eedace06c24
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_BigDecimal: bigInteger0
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      byte[] byteArray0 = new byte[7];
      //mock bigInteger0
      BigInteger bigInteger0 = mock(BigInteger.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(bigInteger0).toByteArray();
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      
      //Call method: setRemainingAmount
      projectDTO0.setRemainingAmount(bigDecimal0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setRepaymentWay_19()  throws Throwable  {
      //caseID:a4cc7b911187f201eccae56873c9ff0b
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: , status=
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setRepaymentWay
      projectDTO0.setRepaymentWay(", status=");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setRequestNo_20()  throws Throwable  {
      //caseID:965a6a27e40d91a348d7d83e961a6933
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: , commissionAnnualRate=
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setRequestNo
      projectDTO0.setRequestNo(", commissionAnnualRate=");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setRisk_21()  throws Throwable  {
      //caseID:dc880dc9eb6aa4c429f985615aa44661
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: H=QH;z~2ZvKnPqf/Z6}
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
      
      
      //Call method: setRisk
      projectDTO0.setRisk("H=QH;z~2ZvKnPqf/Z6}");
      
      //Test Result Assert
      assertNull(projectDTO0.getRequestNo());
  }

  @Test(timeout = 9000)
  public void test_setStatus_22()  throws Throwable  {
      //caseID:0545aa9df18adddecf33d6abd4dea21c
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Integer: 0
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Integer integer0 = new Integer(0);
      
      //Call method: setStatus
      projectDTO0.setStatus(integer0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setTenderCount_23()  throws Throwable  {
      //caseID:a724f4658d0d8a71af0db0ac8e362eb5
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_Integer: 60000
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      Integer integer0 = new Integer(60000);
      
      //Call method: setTenderCount
      projectDTO0.setTenderCount(integer0);
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setType_24()  throws Throwable  {
      //caseID:5f40ab728011b43a2a1ffc8e8fd7f92c
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: e%(==FxoV.+CKdpm!!
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setType
      projectDTO0.setType("e%(==FxoV.+CKdpm!!");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_setUserNo_25()  throws Throwable  {
      //caseID:707866a80e70dd5a3f109b364aa36d10
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 124, 124]
      //Input_0_String: , commissionAnnualRate=
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: setUserNo
      projectDTO0.setUserNo(", commissionAnnualRate=");
      
      //Test Result Assert
      assertEquals("B", projectDTO0.getRisk());
  }

  @Test(timeout = 9000)
  public void test_toString_26()  throws Throwable  {
      //caseID:d98ab7d542c197676442200b6a43ff05
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67, 72, 77, 82, 92, 99, 104, 109, 114, 119, 124, 124, 129, 135]
      //Assert: assertEquals("ProjectDTO(id=null, consumerId=null, userNo=null, projectNo=null, name=null, description=null, type=null, period=null, annualRate=null, borrowerAnnualRate=null, commissionAnnualRate=null, repaymentWay=null, amount=null, projectStatus=null, createDate=null, status=null, isAssignment=null, requestNo=null, remainingAmount=null, risk=B, tenderCount=null, modifyDate=null)", method_result);
      
      ProjectDTO projectDTO0 = new ProjectDTO();
      
      //Call method: toString
      String string0 = projectDTO0.toString();
      
      //Test Result Assert
      assertEquals("ProjectDTO(id=null, consumerId=null, userNo=null, projectNo=null, name=null, description=null, type=null, period=null, annualRate=null, borrowerAnnualRate=null, commissionAnnualRate=null, repaymentWay=null, amount=null, projectStatus=null, createDate=null, status=null, isAssignment=null, requestNo=null, remainingAmount=null, risk=B, tenderCount=null, modifyDate=null)", string0);
  }
}
