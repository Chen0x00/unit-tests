/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.transaction.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.api.transaction.model.ProjectDTO;
import com.wanxin.api.transaction.model.ProjectInvestDTO;
import com.wanxin.api.transaction.model.ProjectQueryDTO;
import com.wanxin.api.transaction.model.TenderDTO;
import com.wanxin.api.transaction.model.TenderOverviewDTO;
import com.wanxin.common.domain.PageVO;
import com.wanxin.common.domain.RestResponse;
import com.wanxin.transaction.controller.TransactionController;
import com.wanxin.transaction.service.ProjectService;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class TransactionController_SSTest extends TransactionController_SSTest_scaffolding {
// allCoveredLines:[24, 37, 45, 53, 61, 76, 77, 88, 89, 104, 112, 119]

  @Test(timeout = 9000)
  public void test_createProject_0()  throws Throwable  {
      //caseID:2e5a2fca3f5651939f646f4203192547
      //CoveredLines: [24, 112]
      //Input_0_ProjectDTO: {}
      //Assert: assertTrue(method_result.isSuccessful());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      //mock projectDTO0
      ProjectDTO projectDTO0 = mock(ProjectDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createProject
      RestResponse<ProjectDTO> restResponse0 = transactionController0.createProject(projectDTO0);
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_createTender_1()  throws Throwable  {
      //caseID:75e7ac552ee279013e435611f68234bd
      //CoveredLines: [24, 45]
      //Input_0_ProjectInvestDTO: {}
      //Assert: assertTrue(method_result.isSuccessful());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      //mock projectInvestDTO0
      ProjectInvestDTO projectInvestDTO0 = mock(ProjectInvestDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createTender
      RestResponse<TenderDTO> restResponse0 = transactionController0.createTender(projectInvestDTO0);
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_loansApprovalStatus_2()  throws Throwable  {
      //caseID:68d0c6f055a8fe293962749dd8d6e61f
      //CoveredLines: [24, 37]
      //Input_0_Long: 1L
      //Input_1_String: 1
      //Input_2_String: iiCU2xA-5ug-[#w{rZ
      //Assert: assertEquals("", method_result.getMsg());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      Long long0 = new Long(1L);
      
      //Call method: loansApprovalStatus
      RestResponse<String> restResponse0 = transactionController0.loansApprovalStatus(long0, "1", "iiCU2xA-5ug-[#w{rZ");
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_projectsApprovalStatus_3()  throws Throwable  {
      //caseID:5695e85666555f0278fff7904123951f
      //CoveredLines: [24, 88, 89]
      //Input_0_Long: 2489L
      //Input_1_String: org.springframework.core.SimpleAliasRegistry
      //Assert: assertTrue(method_result.isSuccessful());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      Long long0 = new Long(2489L);
      
      //Call method: projectsApprovalStatus
      RestResponse<String> restResponse0 = transactionController0.projectsApprovalStatus(long0, "org.springframework.core.SimpleAliasRegistry");
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_qualifications_4()  throws Throwable  {
      //caseID:82bed6573d3f16c56b7499d7e3789132
      //CoveredLines: [24, 119]
      //Assert: assertEquals(0, method_result.getCode());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      
      //Call method: qualifications
      RestResponse<Integer> restResponse0 = transactionController0.qualifications();
      
      //Test Result Assert
      assertEquals(0, restResponse0.getCode());
  }

  @Test(timeout = 9000)
  public void test_queryProjects_5()  throws Throwable  {
      //caseID:69cb7613b0758e6df3de643407931c17
      //CoveredLines: [24, 104]
      //Input_0_ProjectQueryDTO: {}
      //Input_1_Integer: 2033
      //Input_2_Integer: 2033
      //Assert: assertEquals("", method_result.getMsg());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      //mock projectQueryDTO0
      ProjectQueryDTO projectQueryDTO0 = mock(ProjectQueryDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Integer integer0 = new Integer(2033);
      
      //Call method: queryProjects
      RestResponse<PageVO<ProjectDTO>> restResponse0 = transactionController0.queryProjects(projectQueryDTO0, integer0, integer0);
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_queryProjects_6()  throws Throwable  {
      //caseID:179fc78f2ae761569c6a54ebeba6886f
      //CoveredLines: [24, 76, 77]
      //Input_0_ProjectQueryDTO: {}
      //Input_1_Integer: 0
      //Input_2_Integer: 0
      //Input_3_String: com.wanxin.transaction.controller.TransactionController
      //Input_4_String: com.wanxin.transaction.controller.TransactionController
      //Assert: assertEquals("", method_result.getMsg());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      //mock projectQueryDTO0
      ProjectQueryDTO projectQueryDTO0 = mock(ProjectQueryDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Integer integer0 = new Integer(0);
      
      //Call method: queryProjects
      RestResponse<PageVO<ProjectDTO>> restResponse0 = transactionController0.queryProjects(projectQueryDTO0, integer0, integer0, "com.wanxin.transaction.controller.TransactionController", "com.wanxin.transaction.controller.TransactionController");
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_queryProjectsIds_7()  throws Throwable  {
      //caseID:2eb010b27b91fa54ad38ec2a4822bbfc
      //CoveredLines: [24, 61]
      //Input_0_String: com.wanxin.transaction.controller.TransactionController
      //Assert: assertEquals("", method_result.getMsg());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      
      //Call method: queryProjectsIds
      RestResponse<List<ProjectDTO>> restResponse0 = transactionController0.queryProjectsIds("com.wanxin.transaction.controller.TransactionController");
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_queryTendersByProjectId_8()  throws Throwable  {
      //caseID:b743da179aadba542a00274a3898ec78
      //CoveredLines: [24, 53]
      //Input_0_Long: (-1L)
      //Assert: assertEquals("", method_result.getMsg());
      
      TransactionController transactionController0 = new TransactionController();
      //mock projectService0
      ProjectService projectService0 = mock(ProjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) TransactionController.class, transactionController0, "projectService", (Object) projectService0);
      Long long0 = new Long((-1L));
      
      //Call method: queryTendersByProjectId
      RestResponse<List<TenderOverviewDTO>> restResponse0 = transactionController0.queryTendersByProjectId(long0);
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }
}