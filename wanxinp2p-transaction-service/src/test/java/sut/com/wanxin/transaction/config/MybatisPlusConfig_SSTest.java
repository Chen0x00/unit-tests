/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.transaction.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.wanxin.transaction.config.MybatisPlusConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class MybatisPlusConfig_SSTest extends MybatisPlusConfig_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 32, 42]

  @Test(timeout = 9000)
  public void test_paginationInterceptor_0()  throws Throwable  {
      //caseID:886a954d4d2a5ebf84da8bbcb2bcc081
      //CoveredLines: [22, 30, 31, 32]
      //Assert: assertNotNull(method_result);
      
      MybatisPlusConfig mybatisPlusConfig0 = new MybatisPlusConfig();
      
      //Call method: paginationInterceptor
      PaginationInterceptor paginationInterceptor0 = mybatisPlusConfig0.paginationInterceptor();
      
      //Test Result Assert
      assertNotNull(paginationInterceptor0);
  }

  @Test(timeout = 9000)
  public void test_performanceInterceptor_1()  throws Throwable  {
      //caseID:69dabcb4f1310bdbb24a1f849594d37e
      //CoveredLines: [22, 42]
      //Assert: assertFalse(method_result.isWriteInLog());
      
      MybatisPlusConfig mybatisPlusConfig0 = new MybatisPlusConfig();
      
      //Call method: performanceInterceptor
      PerformanceInterceptor performanceInterceptor0 = mybatisPlusConfig0.performanceInterceptor();
      
      //Test Result Assert
      assertFalse(performanceInterceptor0.isWriteInLog());
  }
}