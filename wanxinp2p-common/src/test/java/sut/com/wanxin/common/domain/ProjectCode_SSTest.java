/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.common.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.wanxin.common.domain.ProjectCode;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ProjectCode_SSTest extends ProjectCode_SSTest_scaffolding {
// allCoveredLines:[48, 52, 53, 56, 60, 61]

  @Test(timeout = 9000)
  public void test_getCode_0()  throws Throwable  {
      //caseID:ec51ed9b421b0d836d8ca0c5585959f6
      //CoveredLines: [48]
      
      ProjectCode projectCode0 = ProjectCode.FULLY;
      
      //Call method: getCode
      projectCode0.getCode();
  }

  @Test(timeout = 9000)
  public void test_getDesc_1()  throws Throwable  {
      //caseID:b5e4e47defe119ea9aae585205b7a2f5
      //CoveredLines: [56]
      
      ProjectCode projectCode0 = ProjectCode.FINISH;
      
      //Call method: getDesc
      projectCode0.getDesc();
  }

  @Test(timeout = 9000)
  public void test_setCode_2()  throws Throwable  {
      //caseID:4a3916addca862888b51ee37f5f77328
      //CoveredLines: [52, 53]
      //Input_0_String: E@C'k8
      
      ProjectCode projectCode0 = ProjectCode.REPAYING;
      
      //Call method: setCode
      projectCode0.setCode("E@C'k8");
  }

  @Test(timeout = 9000)
  public void test_setDesc_3()  throws Throwable  {
      //caseID:e233600e7dcc96bc0801c2f93bfd9264
      //CoveredLines: [60, 61]
      //Input_0_String: 1
      
      ProjectCode projectCode0 = ProjectCode.FINISH;
      
      //Call method: setDesc
      projectCode0.setDesc("1");
  }
}