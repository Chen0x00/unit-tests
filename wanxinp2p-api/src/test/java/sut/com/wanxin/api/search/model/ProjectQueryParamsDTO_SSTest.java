/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.search.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.api.search.model.ProjectQueryParamsDTO;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ProjectQueryParamsDTO_SSTest extends ProjectQueryParamsDTO_SSTest_scaffolding {
// allCoveredLines:[14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:95d2547c59ec20ea11d2b1532a9b2410
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Object: object0
      //Assert: assertFalse(method_result);
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Object object0 = new Object();
      
      //Call method: equals
      boolean boolean0 = projectQueryParamsDTO0.equals(object0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:b2f5260c8cff57214a1f0d09c18ba584
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Object: projectQueryParamsDTO0
      //Assert: assertTrue(method_result);
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: equals
      boolean boolean0 = projectQueryParamsDTO0.equals(projectQueryParamsDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:a01e09a770ffe64808250ae2434599db
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49]
      //Input_0_Object: projectQueryParamsDTO1
      //Assert: assertTrue(method_result);
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      ProjectQueryParamsDTO projectQueryParamsDTO1 = new ProjectQueryParamsDTO();
      
      //Call method: equals
      boolean boolean0 = projectQueryParamsDTO0.equals(projectQueryParamsDTO1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:c76b9d461aaf0723de6296cf31fd8b39
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49]
      //Input_0_Object: projectQueryParamsDTO0
      //Assert: assertTrue(method_result);
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      ProjectQueryParamsDTO projectQueryParamsDTO1 = new ProjectQueryParamsDTO();
      
      //Call method: equals
      boolean boolean0 = projectQueryParamsDTO1.equals(projectQueryParamsDTO0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:16515bab8f6c80fcb332ddcd938449f2
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49]
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: hashCode
      projectQueryParamsDTO0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setDescription_05()  throws Throwable  {
      //caseID:e43e8c75c1b68ee34ac2e6c41f94eebf
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: 1
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: setDescription
      projectQueryParamsDTO0.setDescription("1");
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_setEndAnnualRate_06()  throws Throwable  {
      //caseID:5aed92f82741820dab8d65d3343c3e09
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_BigDecimal: (-548.579490123)
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      BigDecimal bigDecimal0 = new BigDecimal((-548.579490123));
      
      //Call method: setEndAnnualRate
      projectQueryParamsDTO0.setEndAnnualRate(bigDecimal0);
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getEndPeriod());
  }

  @Test(timeout = 9000)
  public void test_setEndPeriod_07()  throws Throwable  {
      //caseID:f833be7aa3846d51555b82cbf0c7f552
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 1468
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Integer integer0 = new Integer(1468);
      
      //Call method: setEndPeriod
      projectQueryParamsDTO0.setEndPeriod(integer0);
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getId());
  }

  @Test(timeout = 9000)
  public void test_setId_08()  throws Throwable  {
      //caseID:50af817de0258c4a70c12abd7ad399f1
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Long: 0L
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Long long0 = new Long(0L);
      
      //Call method: setId
      projectQueryParamsDTO0.setId(long0);
      
      //Test Result Assert
      assertEquals(0L, (long)projectQueryParamsDTO0.getId());
  }

  @Test(timeout = 9000)
  public void test_setIds_09()  throws Throwable  {
      //caseID:efe3b29aeea9c61747ff26af7ac7f59b
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Long[]: longArray0
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Long[] longArray0 = new Long[6];
      
      //Call method: setIds
      projectQueryParamsDTO0.setIds(longArray0);
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getDescription());
  }

  @Test(timeout = 9000)
  public void test_setIsAssignment_10()  throws Throwable  {
      //caseID:a97de55803278ea8534c26f4c23fe9de
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 3
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Integer integer0 = new Integer(3);
      
      //Call method: setIsAssignment
      projectQueryParamsDTO0.setIsAssignment(integer0);
      
      //Test Result Assert
      assertEquals(3, (int)projectQueryParamsDTO0.getIsAssignment());
  }

  @Test(timeout = 9000)
  public void test_setName_11()  throws Throwable  {
      //caseID:8b2b2773321241340dd632851e5acc5b
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: 
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: setName
      projectQueryParamsDTO0.setName("");
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_setProjectStatus_12()  throws Throwable  {
      //caseID:2afa0391b1d02ce771f175720622367f
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_String: , startPeriod=
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: setProjectStatus
      projectQueryParamsDTO0.setProjectStatus(", startPeriod=");
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getName());
  }

  @Test(timeout = 9000)
  public void test_setStartAnnualRate_13()  throws Throwable  {
      //caseID:62aa3bea74cd0203c1f65eee59796f1b
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_BigDecimal: BigDecimal.TEN
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      //Call method: setStartAnnualRate
      projectQueryParamsDTO0.setStartAnnualRate(bigDecimal0);
      
      //Test Result Assert
      assertNull(projectQueryParamsDTO0.getProjectStatus());
  }

  @Test(timeout = 9000)
  public void test_setStartPeriod_14()  throws Throwable  {
      //caseID:91cccbdaf7267eb9f71697199bd165d7
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 1
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Integer integer0 = new Integer(1);
      
      //Call method: setStartPeriod
      projectQueryParamsDTO0.setStartPeriod(integer0);
      
      //Test Result Assert
      assertEquals(1, (int)projectQueryParamsDTO0.getStartPeriod());
  }

  @Test(timeout = 9000)
  public void test_setStatus_15()  throws Throwable  {
      //caseID:fcd8da2ac7da9cafda45862e157434ba
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_Integer: 1
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      Integer integer0 = new Integer(1);
      
      //Call method: setStatus
      projectQueryParamsDTO0.setStatus(integer0);
      
      //Test Result Assert
      assertEquals(1, (int)projectQueryParamsDTO0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_toString_16()  throws Throwable  {
      //caseID:48879b2686130f2519226c1f5d5d1cd6
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49]
      //Assert: assertEquals("ProjectQueryParamsDTO(id=null, ids=null, name=null, description=null, startPeriod=null, endPeriod=null, startAnnualRate=null, endAnnualRate=null, projectStatus=null, status=null, isAssignment=null)", method_result);
      
      ProjectQueryParamsDTO projectQueryParamsDTO0 = new ProjectQueryParamsDTO();
      
      //Call method: toString
      String string0 = projectQueryParamsDTO0.toString();
      
      //Test Result Assert
      assertEquals("ProjectQueryParamsDTO(id=null, ids=null, name=null, description=null, startPeriod=null, endPeriod=null, startAnnualRate=null, endAnnualRate=null, projectStatus=null, status=null, isAssignment=null)", string0);
  }
}