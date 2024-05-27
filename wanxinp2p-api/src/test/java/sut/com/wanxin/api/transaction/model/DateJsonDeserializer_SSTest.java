/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.api.transaction.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.wanxin.api.transaction.model.DateJsonDeserializer;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class DateJsonDeserializer_SSTest extends DateJsonDeserializer_SSTest_scaffolding {
// allCoveredLines:[17, 21, 22, 23, 24, 26]

  @Test(timeout = 9000)
  public void test_deserialize_0()  throws Throwable  {
      //caseID:4e8d8a6bb31f81206f7c8df27363df80
      //CoveredLines: [17, 21, 22, 23, 24, 26]
      //Input_0_JsonParser: {}
      //Input_1_DeserializationContext: {}
      //Assert: assertNull(method_result);
      
      DateJsonDeserializer dateJsonDeserializer0 = new DateJsonDeserializer();
      //mock jsonParser0
      JsonParser jsonParser0 = mock(JsonParser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock deserializationContext0
      DeserializationContext deserializationContext0 = mock(DeserializationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: deserialize
      Date date0 = dateJsonDeserializer0.deserialize(jsonParser0, deserializationContext0);
      
      //Test Result Assert
      assertNull(date0);
  }
}