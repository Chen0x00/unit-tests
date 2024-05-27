/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.repayment.message;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.api.repayment.model.RepaymentRequest;
import com.wanxin.repayment.entity.RepaymentPlan;
import com.wanxin.repayment.message.RepaymentProducer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class RepaymentProducer_SSTest extends RepaymentProducer_SSTest_scaffolding {
// allCoveredLines:[19, 25, 26, 27, 28, 30]

  @Test(timeout = 9000)
  public void test_confirmRepayment_0()  throws Throwable  {
      //caseID:b3ce74e9358f8fa49b92f4dc6ccadf4a
      //CoveredLines: [19, 25, 26, 27, 28, 30]
      //Input_0_RepaymentPlan: {}
      //Input_1_RepaymentRequest: {}
      
      RepaymentProducer repaymentProducer0 = new RepaymentProducer();
      RocketMQTemplate rocketMQTemplate0 = new RocketMQTemplate();
      
      PrivateAccess.setVariable((Class<?>) RepaymentProducer.class, repaymentProducer0, "rocketMQTemplate", (Object) rocketMQTemplate0);
      //mock repaymentPlan0
      RepaymentPlan repaymentPlan0 = mock(RepaymentPlan.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock repaymentRequest0
      RepaymentRequest repaymentRequest0 = mock(RepaymentRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: confirmRepayment
      // Undeclared exception!
      try { 
        repaymentProducer0.confirmRepayment(repaymentPlan0, repaymentRequest0);
      } catch(Throwable e) {
         verifyException("org.apache.rocketmq.spring.core.RocketMQTemplate", e);
         assertEquals("org.springframework.messaging.MessagingException", e.getClass().getName());
         assertEquals("Can not found MQProducer 'PID_CONFIRM_REPAYMENT' in cache! please define @RocketMQLocalTransactionListener class or invoke createOrGetStartedTransactionMQProducer() to create it firstly", e.getMessage());
      }
  }
}
