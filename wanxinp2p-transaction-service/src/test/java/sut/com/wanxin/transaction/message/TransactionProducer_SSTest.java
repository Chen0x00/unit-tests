/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.transaction.message;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.api.transaction.model.ProjectWithTendersDTO;
import com.wanxin.transaction.entity.Project;
import com.wanxin.transaction.message.TransactionProducer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class TransactionProducer_SSTest extends TransactionProducer_SSTest_scaffolding {
// allCoveredLines:[19, 25, 26, 27, 28, 30]

  @Test(timeout = 9000)
  public void test_updateProjectStatusAndStartRepayment_0()  throws Throwable  {
      //caseID:e31a99cb94145f2bf4bc95991b340b7f
      //CoveredLines: [19, 25, 26, 27, 28, 30]
      //Input_0_Project: {}
      //Input_1_ProjectWithTendersDTO: {}
      
      TransactionProducer transactionProducer0 = new TransactionProducer();
      RocketMQTemplate rocketMQTemplate0 = new RocketMQTemplate();
      
      PrivateAccess.setVariable((Class<?>) TransactionProducer.class, transactionProducer0, "template", (Object) rocketMQTemplate0);
      //mock project0
      Project project0 = mock(Project.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock projectWithTendersDTO0
      ProjectWithTendersDTO projectWithTendersDTO0 = mock(ProjectWithTendersDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateProjectStatusAndStartRepayment
      // Undeclared exception!
      try { 
        transactionProducer0.updateProjectStatusAndStartRepayment(project0, projectWithTendersDTO0);
      } catch(Throwable e) {
         verifyException("org.apache.rocketmq.spring.core.RocketMQTemplate", e);
         assertEquals("org.springframework.messaging.MessagingException", e.getClass().getName());
         assertEquals("Can not found MQProducer 'PID_START_REPAYMENT' in cache! please define @RocketMQLocalTransactionListener class or invoke createOrGetStartedTransactionMQProducer() to create it firstly", e.getMessage());
      }
  }
}
