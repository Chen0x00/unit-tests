/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.api.consumer.model.ConsumerDTO;
import com.wanxin.api.consumer.model.ConsumerDetailsDTO;
import com.wanxin.consumer.mapper.ConsumerDetailsMapper;
import com.wanxin.consumer.mapper.ConsumerMapper;
import com.wanxin.consumer.service.ConsumerDetailsServiceImpl;
import com.wanxin.consumer.service.ConsumerService;
import javax.swing.JLayeredPane;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ConsumerDetailsServiceImpl_SSTest extends ConsumerDetailsServiceImpl_SSTest_scaffolding {
// allCoveredLines:[24, 34, 35, 36, 37, 40, 41, 42, 43, 45, 46, 47, 48, 49, 52, 53, 56, 57, 58]

  @Test(timeout = 9000)
  public void test_createConsumerDetails_0()  throws Throwable  {
      //caseID:02dc6a86b3fb64bb04b706236a280837
      //CoveredLines: [24, 34, 35, 36, 40, 41, 52, 53]
      //Input_0_ConsumerDetailsDTO: null
      //Input_1_String: 1.0
      
      ConsumerDetailsServiceImpl consumerDetailsServiceImpl0 = new ConsumerDetailsServiceImpl();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      //mock consumerDetailsMapper0
      ConsumerDetailsMapper consumerDetailsMapper0 = mock(ConsumerDetailsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(consumerDetailsMapper0).selectCount(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      Long long0 = new Long(1);
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(consumerDTO0).getId();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(anyString());
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerService", (Object) consumerService0);
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerDetailsMapper", (Object) consumerDetailsMapper0);
      
      //Call method: createConsumerDetails
      // Undeclared exception!
      try { 
        consumerDetailsServiceImpl0.createConsumerDetails((ConsumerDetailsDTO) null, "1.0");
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.service.ConsumerDetailsServiceImpl", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_createConsumerDetails_1()  throws Throwable  {
      //caseID:a80c9a40b720db7ed9bc124b1cfc19fd
      //CoveredLines: [24, 34, 35, 36, 37]
      //Input_0_ConsumerDetailsDTO: {}
      //Input_1_String: 1
      
      ConsumerDetailsServiceImpl consumerDetailsServiceImpl0 = new ConsumerDetailsServiceImpl();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      //mock consumerDetailsMapper0
      ConsumerDetailsMapper consumerDetailsMapper0 = mock(ConsumerDetailsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(consumerDetailsMapper0).selectCount(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      Long long0 = new Long(909L);
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(consumerDTO0).getId();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(anyString());
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerService", (Object) consumerService0);
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerDetailsMapper", (Object) consumerDetailsMapper0);
      //mock consumerDetailsDTO0
      ConsumerDetailsDTO consumerDetailsDTO0 = mock(ConsumerDetailsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createConsumerDetails
      // Undeclared exception!
      try { 
        consumerDetailsServiceImpl0.createConsumerDetails(consumerDetailsDTO0, "1");
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.service.ConsumerDetailsServiceImpl", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_createConsumerDetails_2()  throws Throwable  {
      //caseID:8a427f8a185131f8ac68587da9fd5da1
      //CoveredLines: [24, 34, 35, 36, 40, 41, 42, 43, 45, 46, 47, 48, 49, 52, 56, 57, 58]
      //Input_0_ConsumerDetailsDTO: {}
      //Input_1_String: getConsumerId
      
      ConsumerDetailsServiceImpl consumerDetailsServiceImpl0 = new ConsumerDetailsServiceImpl();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      //mock consumerDetailsMapper0
      ConsumerDetailsMapper consumerDetailsMapper0 = mock(ConsumerDetailsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(consumerDetailsMapper0).selectCount(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      //mock consumerMapper0
      ConsumerMapper consumerMapper0 = mock(ConsumerMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long(1L);
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(consumerDTO0).getId();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(anyString());
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerService", (Object) consumerService0);
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerMapper", (Object) consumerMapper0);
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetailsServiceImpl.class, consumerDetailsServiceImpl0, "consumerDetailsMapper", (Object) consumerDetailsMapper0);
      //mock consumerDetailsDTO0
      ConsumerDetailsDTO consumerDetailsDTO0 = mock(ConsumerDetailsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createConsumerDetails
      consumerDetailsServiceImpl0.createConsumerDetails(consumerDetailsDTO0, "getConsumerId");
  }
}