/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.repayment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.api.transaction.model.ProjectWithTendersDTO;
import com.wanxin.common.domain.RestResponse;
import com.wanxin.repayment.controller.RepaymentController;
import com.wanxin.repayment.service.RepaymentService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class RepaymentController_SSTest extends RepaymentController_SSTest_scaffolding {
// allCoveredLines:[22, 31]

  @Test(timeout = 9000)
  public void test_startRepayment_0()  throws Throwable  {
      //caseID:ea26f85ee5eaef683e75cc295224d184
      //CoveredLines: [22, 31]
      //Input_0_ProjectWithTendersDTO: {}
      //Assert: assertEquals(0, method_result.getCode());
      
      RepaymentController repaymentController0 = new RepaymentController();
      //mock repaymentService0
      RepaymentService repaymentService0 = mock(RepaymentService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) RepaymentController.class, repaymentController0, "repaymentService", (Object) repaymentService0);
      //mock projectWithTendersDTO0
      ProjectWithTendersDTO projectWithTendersDTO0 = mock(ProjectWithTendersDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: startRepayment
      RestResponse<String> restResponse0 = repaymentController0.startRepayment(projectWithTendersDTO0);
      
      //Test Result Assert
      assertEquals(0, restResponse0.getCode());
  }
}