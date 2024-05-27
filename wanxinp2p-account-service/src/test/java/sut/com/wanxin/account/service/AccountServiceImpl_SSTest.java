/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.account.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.wanxin.account.entity.Account;
import com.wanxin.account.mapper.AccountMapper;
import com.wanxin.account.service.AccountServiceImpl;
import com.wanxin.account.service.SmsService;
import com.wanxin.api.account.model.AccountDTO;
import com.wanxin.api.account.model.AccountLoginDTO;
import com.wanxin.api.account.model.AccountRegisterDTO;
import com.wanxin.common.domain.RestResponse;
import javax.swing.JLayeredPane;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class AccountServiceImpl_SSTest extends AccountServiceImpl_SSTest_scaffolding {
// allCoveredLines:[29, 40, 41, 43, 46, 48, 50, 52, 54, 55, 59, 63, 73, 83, 96, 97, 98, 99, 100, 101, 103, 104, 105, 107, 112, 113, 118, 119, 120, 129, 133, 134, 135, 141, 142, 143, 148]

  @Test(timeout = 9000)
  public void test_cancelRegister_00()  throws Throwable  {
      //caseID:5bb5af70d967b35f6de2dcb2b67477d8
      //CoveredLines: [29, 118, 119, 120]
      //Input_0_AccountRegisterDTO: {}
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountRegisterDTO0
      AccountRegisterDTO accountRegisterDTO0 = mock(AccountRegisterDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: cancelRegister
      accountServiceImpl0.cancelRegister(accountRegisterDTO0);
  }

  @Test(timeout = 9000)
  public void test_checkMobile_01()  throws Throwable  {
      //caseID:11ed2d49fb9decb61a9d1a7a89f4281e
      //CoveredLines: [29, 141, 142, 143]
      //Input_0_String: 1.0
      //Input_1_String: com/wanxin/account/entity/Account
      //Input_2_String: getUsername
      //Assert: assertEquals(0, (int)method_result);
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(accountMapper0).selectCount(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      //mock smsService0
      SmsService smsService0 = mock(SmsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsService", (Object) smsService0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      
      //Call method: checkMobile
      Integer integer1 = accountServiceImpl0.checkMobile("1.0", "com/wanxin/account/entity/Account", "getUsername");
      
      //Test Result Assert
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 9000)
  public void test_checkMobile_02()  throws Throwable  {
      //caseID:a6bef380d03409a6206fe4bc553a1f76
      //CoveredLines: [29, 141, 142, 143]
      //Input_0_String: pk/Nl):
      //Input_1_String: pk/Nl):
      //Input_2_String: pk/Nl):
      //Assert: assertEquals(1, (int)method_result);
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(accountMapper0).selectCount(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      //mock smsService0
      SmsService smsService0 = mock(SmsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsService", (Object) smsService0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      
      //Call method: checkMobile
      Integer integer1 = accountServiceImpl0.checkMobile("pk/Nl):", "pk/Nl):", "pk/Nl):");
      
      //Test Result Assert
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 9000)
  public void test_confirmRegister_03()  throws Throwable  {
      //caseID:6d5cb5e2fc3f469965b26abebdcd42b4
      //CoveredLines: [29, 112, 113]
      //Input_0_AccountRegisterDTO: {}
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountRegisterDTO0
      AccountRegisterDTO accountRegisterDTO0 = mock(AccountRegisterDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: confirmRegister
      accountServiceImpl0.confirmRegister(accountRegisterDTO0);
  }

  @Test(timeout = 9000)
  public void test_getSMSCode_04()  throws Throwable  {
      //caseID:b90ca48a7ec597618619ba197323450f
      //CoveredLines: [29, 148]
      //Input_0_String: 
      //Assert: assertNull(method_result);
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock smsService0
      SmsService smsService0 = mock(SmsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsService", (Object) smsService0);
      
      //Call method: getSMSCode
      RestResponse restResponse0 = accountServiceImpl0.getSMSCode("");
      
      //Test Result Assert
      assertNull(restResponse0);
  }

  @Test(timeout = 9000)
  public void test_login_05()  throws Throwable  {
      //caseID:1275454a2bb5becec3f25552dc6642bc
      //CoveredLines: [29, 40, 41, 43, 48, 50, 73]
      //Input_0_AccountLoginDTO: {getDomain=\"c\", getMobile=\"c\"}
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((Account) null).when(accountMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountLoginDTO0
      AccountLoginDTO accountLoginDTO0 = mock(AccountLoginDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("c").when(accountLoginDTO0).getDomain();
      doReturn("c").when(accountLoginDTO0).getMobile();
      
      //Call method: login
      // Undeclared exception!
      try { 
        accountServiceImpl0.login(accountLoginDTO0);
      } catch(Throwable e) {
         verifyException("com.wanxin.account.service.AccountServiceImpl", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_login_06()  throws Throwable  {
      //caseID:ec95607c3658147413d471f9c0ec5ffe
      //CoveredLines: [29, 40, 41, 46, 48, 50, 83]
      //Input_0_AccountLoginDTO: {}
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountLoginDTO0
      AccountLoginDTO accountLoginDTO0 = mock(AccountLoginDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: login
      // Undeclared exception!
      try { 
        accountServiceImpl0.login(accountLoginDTO0);
      } catch(Throwable e) {
         verifyException("com.wanxin.account.service.AccountServiceImpl", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_login_07()  throws Throwable  {
      //caseID:5d788bd1d95ebe9c4d9ecb396b2a895a
      //CoveredLines: [29, 40, 41, 46, 48, 52, 54, 55, 83, 129, 133, 134, 135]
      //Input_0_AccountLoginDTO: {getDomain=\"t5c' Oq8|{\\\"+pM)<?\", getUsername=\"-2147483645\"}
      //Assert: assertNotNull(method_result);
      //Assert: assertNull(method_result.getMobile());
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock account0
      Account account0 = mock(Account.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(account0).when(accountMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      Boolean boolean0 = Boolean.TRUE;
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsEnable", (Object) boolean0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountLoginDTO0
      AccountLoginDTO accountLoginDTO0 = mock(AccountLoginDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("t5c' Oq8|{\"+pM)<?").when(accountLoginDTO0).getDomain();
      doReturn("-2147483645").when(accountLoginDTO0).getUsername();
      
      //Call method: login
      AccountDTO accountDTO0 = accountServiceImpl0.login(accountLoginDTO0);
      
      //Test Result Assert
      assertNotNull(accountDTO0);
      
      //Test Result Assert
      assertNull(accountDTO0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_login_08()  throws Throwable  {
      //caseID:f298396b7b1b37e3485e64cd43676071
      //CoveredLines: [29, 40, 41, 46, 48, 52, 54, 59, 63, 83, 129, 133, 134, 135]
      //Input_0_AccountLoginDTO: {getDomain=\"reactor.core.publisher.MonoDelay$MonoDelayRunnable\", getPassword=\"reactor.core.publisher.MonoDelay$MonoDelayRunnable\", getUsername=\"reactor.core.publisher.MonoDelay$MonoDelayRunnable\"}
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      Long long0 = new Long(627159960);
      //mock account0
      Account account0 = mock(Account.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(account0).getDomain();
      doReturn(long0).when(account0).getId();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(account0).getMobile();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(account0).getPassword();
      doReturn(integer0).when(account0).getStatus();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(account0).getUsername();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(account0).toString();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(account0).when(accountMapper0).selectOne(any(com.baomidou.mybatisplus.core.conditions.Wrapper.class));
      Boolean boolean0 = DefaultClientConfigImpl.DEFAULT_ENABLE_GZIP_CONTENT_ENCODING_FILTER;
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsEnable", (Object) boolean0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountLoginDTO0
      AccountLoginDTO accountLoginDTO0 = mock(AccountLoginDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(accountLoginDTO0).getDomain();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(accountLoginDTO0).getPassword();
      doReturn("reactor.core.publisher.MonoDelay$MonoDelayRunnable").when(accountLoginDTO0).getUsername();
      
      //Call method: login
      // Undeclared exception!
      try { 
        accountServiceImpl0.login(accountLoginDTO0);
      } catch(Throwable e) {
         verifyException("com.wanxin.account.service.AccountServiceImpl", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_registry_09()  throws Throwable  {
      //caseID:83042a913187e3c28344fefe25bd1f0d
      //CoveredLines: [29, 96, 97, 98, 99, 100, 103, 104, 105, 107, 129, 133, 134, 135]
      //Input_0_AccountRegisterDTO: {getPassword=\"5\", getMobile=\"KDI-NQJ1w@]{H\", getUsername=\"Lnc<@HH[*?'W&H\"}
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals("c", method_result.getDomain());
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1005).when(accountMapper0).insert(any(com.wanxin.account.entity.Account.class));
      Boolean boolean0 = Boolean.FALSE;
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsEnable", (Object) boolean0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountRegisterDTO0
      AccountRegisterDTO accountRegisterDTO0 = mock(AccountRegisterDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("KDI-NQJ1w@]{H").when(accountRegisterDTO0).getMobile();
      doReturn("5").when(accountRegisterDTO0).getPassword();
      doReturn("Lnc<@HH[*?'W&H").when(accountRegisterDTO0).getUsername();
      
      //Call method: registry
      AccountDTO accountDTO0 = accountServiceImpl0.registry(accountRegisterDTO0);
      
      //Test Result Assert
      assertNotNull(accountDTO0);
      
      //Test Result Assert
      assertEquals("c", accountDTO0.getDomain());
  }

  @Test(timeout = 9000)
  public void test_registry_10()  throws Throwable  {
      //caseID:5c955cba52c5c1656ab794cc92340cda
      //CoveredLines: [29, 96, 97, 98, 99, 100, 101, 103, 104, 105, 107, 129, 133, 134, 135]
      //Input_0_AccountRegisterDTO: {}
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals("c", method_result.getDomain());
      
      AccountServiceImpl accountServiceImpl0 = new AccountServiceImpl();
      //mock accountMapper0
      AccountMapper accountMapper0 = mock(AccountMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = Boolean.TRUE;
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "smsEnable", (Object) boolean0);
      
      PrivateAccess.setVariable((Class<?>) AccountServiceImpl.class, accountServiceImpl0, "accountMapper", (Object) accountMapper0);
      //mock accountRegisterDTO0
      AccountRegisterDTO accountRegisterDTO0 = mock(AccountRegisterDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: registry
      AccountDTO accountDTO0 = accountServiceImpl0.registry(accountRegisterDTO0);
      
      //Test Result Assert
      assertNotNull(accountDTO0);
      
      //Test Result Assert
      assertEquals("c", accountDTO0.getDomain());
  }
}
