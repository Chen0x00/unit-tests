/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.consumer.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.wanxin.consumer.config.MybatisPlusConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class MybatisPlusConfig_SSTest extends MybatisPlusConfig_SSTest_scaffolding {
// allCoveredLines:[17, 20, 21, 22, 27]

  @Test(timeout = 9000)
  public void test_paginationInterceptor_0()  throws Throwable  {
      //caseID:67b11963073126ce212a05c657629bea
      //CoveredLines: [17, 20, 21, 22]
      //Assert: assertNotNull(method_result);
      
      MybatisPlusConfig mybatisPlusConfig0 = new MybatisPlusConfig();
      
      //Call method: paginationInterceptor
      PaginationInterceptor paginationInterceptor0 = mybatisPlusConfig0.paginationInterceptor();
      
      //Test Result Assert
      assertNotNull(paginationInterceptor0);
  }

  @Test(timeout = 9000)
  public void test_performanceInterceptor_1()  throws Throwable  {
      //caseID:d75d69801af94af517912d3c983bdd11
      //CoveredLines: [17, 27]
      //Assert: assertEquals(0L, method_result.getMaxTime());
      
      MybatisPlusConfig mybatisPlusConfig0 = new MybatisPlusConfig();
      
      //Call method: performanceInterceptor
      PerformanceInterceptor performanceInterceptor0 = mybatisPlusConfig0.performanceInterceptor();
      
      //Test Result Assert
      assertEquals(0L, performanceInterceptor0.getMaxTime());
  }
}
