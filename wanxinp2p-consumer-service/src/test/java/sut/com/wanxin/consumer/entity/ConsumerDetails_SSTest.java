/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.consumer.entity.ConsumerDetails;
import java.time.LocalDateTime;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.mock.java.time.MockLocalDateTime;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ConsumerDetails_SSTest extends ConsumerDetails_SSTest_scaffolding {
// allCoveredLines:[21, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:51834ad095c8f10f1993ca014c635a86
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_Object: consumerDetails0
      //Assert: assertTrue(method_result);
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: equals
      boolean boolean0 = consumerDetails0.equals(consumerDetails0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:0a979a510fe4f4a7a0dbb80798f36f12
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_Object: )
      //Assert: assertFalse(method_result);
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: equals
      boolean boolean0 = consumerDetails0.equals(")");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:179fcf503d06cf242471b4fc74a1c7ff
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85]
      //Input_0_Object: consumerDetails1
      //Assert: assertTrue(method_result);
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      ConsumerDetails consumerDetails1 = new ConsumerDetails();
      
      //Call method: equals
      boolean boolean0 = consumerDetails0.equals(consumerDetails1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:45b75e9354e240d739ec4fbca1470674
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 31, 85]
      //Input_0_Object: consumerDetails0
      //Assert: assertFalse(method_result);
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      Long long0 = new Long(1L);
      
      consumerDetails0.getUploadDate();
      
      PrivateAccess.setVariable((Class<?>) ConsumerDetails.class, consumerDetails0, "id", (Object) long0);
      ConsumerDetails consumerDetails1 = new ConsumerDetails();
      
      //Call method: equals
      boolean boolean0 = consumerDetails1.equals(consumerDetails0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:445eb89426b21e4f2717253ea85bd8da
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85]
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      consumerDetails0.getUploadDate();
      
      //Call method: hashCode
      consumerDetails0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_hashCode_05()  throws Throwable  {
      //caseID:2581d889ee7f2b8c0b073f0433727308
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85]
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: hashCode
      consumerDetails0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAddress_06()  throws Throwable  {
      //caseID:5b1c3bd1b3517a40fcbf3cbf6550c36a
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: , uploadDate=
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setAddress
      consumerDetails0.setAddress(", uploadDate=");
      
      //Test Result Assert
      assertEquals(", uploadDate=", consumerDetails0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setConsumerId_07()  throws Throwable  {
      //caseID:be1dd1109d0cf41763f511183487420a
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 85]
      //Input_0_Long: (-1L)
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      Long long0 = new Long((-1L));
      
      consumerDetails0.getUploadDate();
      
      //Call method: setConsumerId
      consumerDetails0.setConsumerId(long0);
      
      //Test Result Assert
      assertNull(consumerDetails0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setContactMobile_08()  throws Throwable  {
      //caseID:324757291ffb88e2ef0a2da3eedb5415
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: 1
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setContactMobile
      consumerDetails0.setContactMobile("1");
      
      //Test Result Assert
      assertNull(consumerDetails0.getIdCardEmblem());
  }

  @Test(timeout = 9000)
  public void test_setContactName_09()  throws Throwable  {
      //caseID:61b3331941c5badba287f164c628bf30
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 85]
      //Input_0_String: reactor.core.publisher.MonoAll
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      consumerDetails0.getUploadDate();
      
      //Call method: setContactName
      consumerDetails0.setContactName("reactor.core.publisher.MonoAll");
      
      //Test Result Assert
      assertNull(consumerDetails0.getContactMobile());
  }

  @Test(timeout = 9000)
  public void test_setContactRelation_10()  throws Throwable  {
      //caseID:e19ac218c51a5089d03202509b5748f3
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: 43
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setContactRelation
      consumerDetails0.setContactRelation("43");
      
      //Test Result Assert
      assertNull(consumerDetails0.getContactMobile());
  }

  @Test(timeout = 9000)
  public void test_setEnterpriseMail_11()  throws Throwable  {
      //caseID:7225e9f135d0a3e1ee7c7f51f3743679
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: 0
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setEnterpriseMail
      consumerDetails0.setEnterpriseMail("0");
      
      //Test Result Assert
      assertNull(consumerDetails0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setId_12()  throws Throwable  {
      //caseID:b6860fc8afb4ef7c0dce61d9410b01d3
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 85]
      //Input_0_Long: (-1L)
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      Long long0 = new Long((-1L));
      
      consumerDetails0.getUploadDate();
      
      //Call method: setId
      consumerDetails0.setId(long0);
      
      //Test Result Assert
      assertNull(consumerDetails0.getConsumerId());
  }

  @Test(timeout = 9000)
  public void test_setIdCardEmblem_13()  throws Throwable  {
      //caseID:76bdd3d777064b32620aaff84b56eb24
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: 1
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setIdCardEmblem
      consumerDetails0.setIdCardEmblem("1");
      
      //Test Result Assert
      assertEquals("1", consumerDetails0.getIdCardEmblem());
  }

  @Test(timeout = 9000)
  public void test_setIdCardPhoto_14()  throws Throwable  {
      //caseID:100ef55ad7635edd1cf5a236488f03fd
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_String: , contactMobile=
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: setIdCardPhoto
      consumerDetails0.setIdCardPhoto(", contactMobile=");
      
      //Test Result Assert
      assertNull(consumerDetails0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setUploadDate_15()  throws Throwable  {
      //caseID:41405a6ac73a6c047b86f48cf66ea353
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21]
      //Input_0_LocalDateTime: localDateTime0
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      
      //Call method: setUploadDate
      consumerDetails0.setUploadDate(localDateTime0);
      
      //Test Result Assert
      assertNull(consumerDetails0.getId());
  }

  @Test(timeout = 9000)
  public void test_toString_16()  throws Throwable  {
      //caseID:bd3a30355f1d504af6ca8bcb93e91836
      //CoveredLines: [21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85]
      //Assert: assertEquals("ConsumerDetails(id=null, consumerId=null, idCardPhoto=null, idCardEmblem=null, address=null, enterpriseMail=null, contactRelation=null, contactName=null, contactMobile=null, uploadDate=null)", method_result);
      
      ConsumerDetails consumerDetails0 = new ConsumerDetails();
      
      //Call method: toString
      String string0 = consumerDetails0.toString();
      
      //Test Result Assert
      assertEquals("ConsumerDetails(id=null, consumerId=null, idCardPhoto=null, idCardEmblem=null, address=null, enterpriseMail=null, contactRelation=null, contactName=null, contactMobile=null, uploadDate=null)", string0);
  }
}