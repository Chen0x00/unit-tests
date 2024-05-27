/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.api.consumer.model.BankCardDTO;
import com.wanxin.api.consumer.model.ConsumerDTO;
import com.wanxin.consumer.entity.BankCard;
import com.wanxin.consumer.mapper.BankCardMapper;
import com.wanxin.consumer.service.BankCardServiceImpl;
import com.wanxin.consumer.service.ConsumerService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class BankCardServiceImpl_SSTest extends BankCardServiceImpl_SSTest_scaffolding {
// allCoveredLines:[17, 25, 26, 27, 30, 31, 32, 33, 38, 39, 44, 45, 55, 56, 59, 60, 61]

  @Test(timeout = 9000)
  public void test_getByCardNumber_0()  throws Throwable  {
      //caseID:d56d704b589e2370df07fd9f703621a2
      //CoveredLines: [17, 44, 45, 55, 56]
      //Input_0_String: com/wanxin/consumer/entity/BankCard
      //Assert: assertNull(method_result);
      
      BankCardServiceImpl bankCardServiceImpl0 = new BankCardServiceImpl();
      //mock bankCardMapper0
      BankCardMapper bankCardMapper0 = mock(BankCardMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "bankCardMapper", (Object) bankCardMapper0);
      
      //Call method: getByCardNumber
      BankCardDTO bankCardDTO0 = bankCardServiceImpl0.getByCardNumber("com/wanxin/consumer/entity/BankCard");
      
      //Test Result Assert
      assertNull(bankCardDTO0);
  }

  @Test(timeout = 9000)
  public void test_getByCardNumber_1()  throws Throwable  {
      //caseID:1b7af2d8fc0c8a08f7cde3c483fe3c44
      //CoveredLines: [17, 44, 45, 55, 59, 60, 61]
      //Input_0_String: onError cannot be null
      //Assert: assertNull(method_result.getBankCode());
      
      BankCardServiceImpl bankCardServiceImpl0 = new BankCardServiceImpl();
      //mock bankCard0
      BankCard bankCard0 = mock(BankCard.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bankCardMapper0
      BankCardMapper bankCardMapper0 = mock(BankCardMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bankCard0).when(bankCardMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "bankCardMapper", (Object) bankCardMapper0);
      
      //Call method: getByCardNumber
      BankCardDTO bankCardDTO0 = bankCardServiceImpl0.getByCardNumber("onError cannot be null");
      
      //Test Result Assert
      assertNull(bankCardDTO0.getBankCode());
  }

  @Test(timeout = 9000)
  public void test_getByConsumerId_2()  throws Throwable  {
      //caseID:ef93060b18e881ffd2b54d32f8517bcf
      //CoveredLines: [17, 38, 39, 55, 59, 60, 61]
      //Input_0_Long: 1L
      //Assert: assertNull(method_result.getBankName());
      
      BankCardServiceImpl bankCardServiceImpl0 = new BankCardServiceImpl();
      //mock bankCard0
      BankCard bankCard0 = mock(BankCard.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bankCardMapper0
      BankCardMapper bankCardMapper0 = mock(BankCardMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bankCard0).when(bankCardMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "bankCardMapper", (Object) bankCardMapper0);
      Long long0 = new Long(1L);
      
      //Call method: getByConsumerId
      BankCardDTO bankCardDTO0 = bankCardServiceImpl0.getByConsumerId(long0);
      
      //Test Result Assert
      assertNull(bankCardDTO0.getBankName());
  }

  @Test(timeout = 9000)
  public void test_getByUserMobile_3()  throws Throwable  {
      //caseID:5cc70abdd38d5cd09ffae5a5fd151183
      //CoveredLines: [17, 25, 26, 27]
      //Input_0_String: 1
      //Assert: assertNull(method_result);
      
      BankCardServiceImpl bankCardServiceImpl0 = new BankCardServiceImpl();
      //mock bankCardMapper0
      BankCardMapper bankCardMapper0 = mock(BankCardMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "bankCardMapper", (Object) bankCardMapper0);
      
      //Call method: getByUserMobile
      BankCardDTO bankCardDTO0 = bankCardServiceImpl0.getByUserMobile("1");
      
      //Test Result Assert
      assertNull(bankCardDTO0);
  }

  @Test(timeout = 9000)
  public void test_getByUserMobile_4()  throws Throwable  {
      //caseID:676b16a5f4c653c76acafc3ce2035241
      //CoveredLines: [17, 25, 26, 30, 31, 32, 33, 55, 59, 60, 61]
      //Input_0_String: 1
      //Assert: assertNotNull(method_result);
      //Assert: assertNull(method_result.getConsumerId());
      
      BankCardServiceImpl bankCardServiceImpl0 = new BankCardServiceImpl();
      //mock bankCard0
      BankCard bankCard0 = mock(BankCard.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bankCardMapper0
      BankCardMapper bankCardMapper0 = mock(BankCardMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bankCard0).when(bankCardMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(anyString());
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "consumerService", (Object) consumerService0);
      
      PrivateAccess.setVariable((Class<?>) BankCardServiceImpl.class, bankCardServiceImpl0, "bankCardMapper", (Object) bankCardMapper0);
      
      //Call method: getByUserMobile
      BankCardDTO bankCardDTO0 = bankCardServiceImpl0.getByUserMobile("1");
      
      //Test Result Assert
      assertNotNull(bankCardDTO0);
      
      //Test Result Assert
      assertNull(bankCardDTO0.getConsumerId());
  }
}