/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.api.consumer.model.BankCardDTO;
import com.wanxin.api.consumer.model.BorrowerDTO;
import com.wanxin.api.consumer.model.ConsumerDTO;
import com.wanxin.api.consumer.model.ConsumerDetailsDTO;
import com.wanxin.api.consumer.model.ConsumerRegisterDTO;
import com.wanxin.api.consumer.model.ConsumerRequest;
import com.wanxin.api.consumer.model.FileTokenDTO;
import com.wanxin.api.consumer.model.IdCardDTO;
import com.wanxin.api.depository.model.GatewayRequest;
import com.wanxin.common.domain.RestResponse;
import com.wanxin.consumer.controller.ConsumerController;
import com.wanxin.consumer.service.BankCardService;
import com.wanxin.consumer.service.ConsumerDetailsService;
import com.wanxin.consumer.service.ConsumerService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.web.multipart.MultipartFile;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ConsumerController_SSTest extends ConsumerController_SSTest_scaffolding {
// allCoveredLines:[39, 40, 57, 58, 73, 74, 92, 93, 94, 103, 110, 118, 126, 134, 135, 142, 143, 144, 145, 147, 155, 156, 157, 160, 163, 166, 185, 196, 211, 218, 226, 227, 235, 236]

  @Test(timeout = 9000)
  public void test_applyUploadCertificate_00()  throws Throwable  {
      //caseID:7f579503b97ec0af33d027edb2a6b3fb
      //CoveredLines: [39, 40, 142, 143, 144, 145, 147]
      //Assert: assertTrue(method_result.isSuccessful());
      
      ConsumerController consumerController0 = new ConsumerController();
      
      //Call method: applyUploadCertificate
      RestResponse<FileTokenDTO> restResponse0 = consumerController0.applyUploadCertificate();
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_createConsumer_01()  throws Throwable  {
      //caseID:6001c3cd11b3f2189b510e525627784f
      //CoveredLines: [39, 40, 226, 227]
      //Input_0_ConsumerRequest: {}
      //Assert: assertNull(method_result);
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      //mock consumerRequest0
      ConsumerRequest consumerRequest0 = mock(ConsumerRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createConsumer
      RestResponse<GatewayRequest> restResponse0 = consumerController0.createConsumer(consumerRequest0);
      
      //Test Result Assert
      assertNull(restResponse0);
  }

  @Test(timeout = 9000)
  public void test_createRechargeRecord_02()  throws Throwable  {
      //caseID:6313f77fb54291340762b6cdbd54289b
      //CoveredLines: [39, 40, 196]
      //Input_0_String: _-SO[^zL*GsVSt*L
      //Input_1_String: 1.0
      //Assert: assertNull(method_result);
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      
      //Call method: createRechargeRecord
      RestResponse<GatewayRequest> restResponse0 = consumerController0.createRechargeRecord("_-SO[^zL*GsVSt*L", "1.0");
      
      //Test Result Assert
      assertNull(restResponse0);
  }

  @Test(timeout = 9000)
  public void test_createWithdrawRecord_03()  throws Throwable  {
      //caseID:6e1a22226f08cb4a716cae0d57e60527
      //CoveredLines: [39, 40, 185]
      //Input_0_String: com.wanxin.consumer.controller.ConsumerController
      //Input_1_String: []
      //Assert: assertNull(method_result);
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      
      //Call method: createWithdrawRecord
      RestResponse<GatewayRequest> restResponse0 = consumerController0.createWithdrawRecord("com.wanxin.consumer.controller.ConsumerController", "[]");
      
      //Test Result Assert
      assertNull(restResponse0);
  }

  @Test(timeout = 9000)
  public void test_getBalance_04()  throws Throwable  {
      //caseID:b943bb7286cb53713974c793570b5e87
      //CoveredLines: [39, 40, 57, 58, 118]
      //Input_0_String: (jscV?eMvLegtx_&
      
      ConsumerController consumerController0 = new ConsumerController();
      
      //Call method: getBalance
      // Undeclared exception!
      try { 
        consumerController0.getBalance("(jscV?eMvLegtx_&");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_getBankCard_05()  throws Throwable  {
      //caseID:761c155f2beac6adef26b40f7cb4b67b
      //CoveredLines: [39, 40, 218]
      //Assert: assertEquals("", method_result.getMsg());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock bankCardService0
      BankCardService bankCardService0 = mock(BankCardService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "bankCardService", (Object) bankCardService0);
      
      //Call method: getBankCard
      RestResponse<BankCardDTO> restResponse0 = consumerController0.getBankCard();
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_getBankCardDetails_06()  throws Throwable  {
      //caseID:769e0db30bc9936cc137e4146e7fa45f
      //CoveredLines: [39, 40, 73, 74, 103]
      //Input_0_Long: 0L
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock bankCardDTO0
      BankCardDTO bankCardDTO0 = mock(BankCardDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u516C\u6C11\u8EAB\u4EFD\u53F7\u7801").when(bankCardDTO0).getCardNumber();
      //mock bankCardService0
      BankCardService bankCardService0 = mock(BankCardService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bankCardDTO0).when(bankCardService0).getByConsumerId(anyLong());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "bankCardService", (Object) bankCardService0);
      Long long0 = new Long(0L);
      
      //Call method: getBankCardDetails
      // Undeclared exception!
      try { 
        consumerController0.getBankCardDetails(long0);
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_getBorrower_07()  throws Throwable  {
      //caseID:583ca94d83c19839089c6d385c0a4b60
      //CoveredLines: [39, 40, 126]
      //Input_0_Long: 1L
      //Assert: assertTrue(method_result.isSuccessful());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      Long long0 = new Long(1L);
      
      //Call method: getBorrower
      RestResponse<BorrowerDTO> restResponse0 = consumerController0.getBorrower(long0);
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_getConsumer_08()  throws Throwable  {
      //caseID:257134f436b17a8c2bab2323943c54d7
      //CoveredLines: [39, 40, 211]
      //Assert: assertEquals("", method_result.getMsg());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      
      //Call method: getConsumer
      RestResponse<ConsumerDTO> restResponse0 = consumerController0.getConsumer();
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_getMyBalance_09()  throws Throwable  {
      //caseID:ccbc0f15425a499eb469141343050022
      //CoveredLines: [39, 40, 57, 58, 110]
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("{}").when(consumerDTO0).getUserNo();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(nullable(java.lang.String.class));
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      
      //Call method: getMyBalance
      // Undeclared exception!
      try { 
        consumerController0.getMyBalance();
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_getMyBankCardDetails_10()  throws Throwable  {
      //caseID:2fdaa518b1c8e066c4a101fb06295c9c
      //CoveredLines: [39, 40, 73, 74, 92, 93, 94]
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock bankCardDTO0
      BankCardDTO bankCardDTO0 = mock(BankCardDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("N\u7528\u5B58\u7BA1\u7CFB\u7EDF{}\u83B7\u53D6\u4F59\u989D\u5931 ").when(bankCardDTO0).getCardNumber();
      //mock bankCardService0
      BankCardService bankCardService0 = mock(BankCardService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bankCardDTO0).when(bankCardService0).getByConsumerId(nullable(java.lang.Long.class));
      Long long0 = new Long(0L);
      //mock consumerDTO0
      ConsumerDTO consumerDTO0 = mock(ConsumerDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(consumerDTO0).getId();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(consumerDTO0).when(consumerService0).getConsumerByMobile(nullable(java.lang.String.class));
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "bankCardService", (Object) bankCardService0);
      
      //Call method: getMyBankCardDetails
      // Undeclared exception!
      try { 
        consumerController0.getMyBankCardDetails();
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_imageRecognition_11()  throws Throwable  {
      //caseID:b6f1cdf9d0563a959ebb6d74e6cd5bc0
      //CoveredLines: [39, 40, 155, 156, 160, 166]
      //Input_0_MultipartFile: {}
      //Input_1_String: \u83B7\u53D6\u94F6\u884C\u5361\u660E\u7EC6\u5931\u8D25
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock multipartFile0
      MultipartFile multipartFile0 = mock(MultipartFile.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: imageRecognition
      // Undeclared exception!
      try { 
        consumerController0.imageRecognition(multipartFile0, "\u83B7\u53D6\u94F6\u884C\u5361\u660E\u7EC6\u5931\u8D25");
      } catch(Throwable e) {
         verifyException("org.json.JSONTokener", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_imageRecognition_12()  throws Throwable  {
      //caseID:88546bd38a7360d725efa675c64db253
      //CoveredLines: [39, 40, 155, 156, 157]
      //Input_0_MultipartFile: {}
      //Input_1_String: front
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock multipartFile0
      MultipartFile multipartFile0 = mock(MultipartFile.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: imageRecognition
      // Undeclared exception!
      try { 
        consumerController0.imageRecognition(multipartFile0, "front");
      } catch(Throwable e) {
         verifyException("com.wanxin.consumer.utils.BaiDuOrcIdCardUtil", e);
         assertEquals("com.wanxin.common.domain.BusinessException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_imageRecognition_13()  throws Throwable  {
      //caseID:3d2b6dc04c31bdfea413d9b4ced9c81d
      //CoveredLines: [39, 40, 155, 156, 160, 163]
      //Input_0_MultipartFile: {}
      //Input_1_String: back
      //Assert: assertTrue(method_result.isSuccessful());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock multipartFile0
      MultipartFile multipartFile0 = mock(MultipartFile.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: imageRecognition
      RestResponse<IdCardDTO> restResponse0 = consumerController0.imageRecognition(multipartFile0, "back");
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_register_14()  throws Throwable  {
      //caseID:3d3ccd9924cbd8e685e010920df29703
      //CoveredLines: [39, 40, 235, 236]
      //Input_0_ConsumerRegisterDTO: {}
      //Assert: assertTrue(method_result.isSuccessful());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerService0
      ConsumerService consumerService0 = mock(ConsumerService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerService", (Object) consumerService0);
      //mock consumerRegisterDTO0
      ConsumerRegisterDTO consumerRegisterDTO0 = mock(ConsumerRegisterDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: register
      RestResponse restResponse0 = consumerController0.register(consumerRegisterDTO0);
      
      //Test Result Assert
      assertTrue(restResponse0.isSuccessful());
  }

  @Test(timeout = 9000)
  public void test_saveConsumerDetails_15()  throws Throwable  {
      //caseID:d7aa9cc4edac7081eba8d06ca64b9418
      //CoveredLines: [39, 40, 134, 135]
      //Input_0_ConsumerDetailsDTO: {}
      //Assert: assertEquals("", method_result.getMsg());
      
      ConsumerController consumerController0 = new ConsumerController();
      //mock consumerDetailsService0
      ConsumerDetailsService consumerDetailsService0 = mock(ConsumerDetailsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) ConsumerController.class, consumerController0, "consumerDetailsService", (Object) consumerDetailsService0);
      //mock consumerDetailsDTO0
      ConsumerDetailsDTO consumerDetailsDTO0 = mock(ConsumerDetailsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: saveConsumerDetails
      RestResponse<String> restResponse0 = consumerController0.saveConsumerDetails(consumerDetailsDTO0);
      
      //Test Result Assert
      assertEquals("", restResponse0.getMsg());
  }
}
