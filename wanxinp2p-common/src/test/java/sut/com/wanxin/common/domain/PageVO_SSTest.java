/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.common.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.wanxin.common.domain.PageVO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class PageVO_SSTest extends PageVO_SSTest_scaffolding {
// allCoveredLines:[16, 21, 22, 24, 25, 26, 27, 28, 29, 37, 46, 55, 64, 73, 77, 78, 86, 95, 99, 100, 108, 117, 126, 130, 131, 139, 146, 147, 150]

  @Test(timeout = 9000)
  public void test_getContentSize_00()  throws Throwable  {
      //caseID:2c01addeb2c1969c2bcaa775fc20a595
      //CoveredLines: [16, 16, 24, 25, 26, 27, 28, 29, 117]
      //Assert: assertEquals(0, method_result);
      
      Stack<Object> stack0 = new Stack<Object>();
      PageVO<Object> pageVO0 = new PageVO<Object>(stack0, 2736L, 1, 1);
      
      //Call method: getContentSize
      int int0 = pageVO0.getContentSize();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 9000)
  public void test_getTotal_01()  throws Throwable  {
      //caseID:3bbb0df6c6faf5033b0c2053484fc907
      //CoveredLines: [16, 16, 21, 22, 73, 95, 150]
      //Assert: assertEquals(0L, method_result);
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      pageVO0.forEach(consumer0);
      
      //Call method: getTotal
      long long0 = pageVO0.getTotal();
      
      //Test Result Assert
      assertEquals(0L, long0);
  }

  @Test(timeout = 9000)
  public void test_getTotalPage_02()  throws Throwable  {
      //caseID:1eab190e6f3f86a75a7824ffa7a72ff5
      //CoveredLines: [16, 16, 21, 22, 86, 126]
      //Assert: assertEquals(1, method_result);
      
      PageVO<String> pageVO0 = new PageVO<String>();
      
      //Call method: getTotalPage
      int int0 = pageVO0.getTotalPage();
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 9000)
  public void test_hasContent_03()  throws Throwable  {
      //caseID:0eef06a637efa5956fd941a3dbe59eef
      //CoveredLines: [16, 16, 21, 22, 108, 117]
      //Assert: assertFalse(method_result);
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      
      //Call method: hasContent
      boolean boolean0 = pageVO0.hasContent();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hasContent_04()  throws Throwable  {
      //caseID:0d0afb2516cccb11b534605069348392
      //CoveredLines: [16, 16, 21, 22, 95, 108, 117, 150]
      //Assert: assertFalse(method_result);
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      pageVO0.forEach(consumer0);
      
      //Call method: hasContent
      boolean boolean0 = pageVO0.hasContent();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hasNext_05()  throws Throwable  {
      //caseID:a4c3f89ca94fa5d79bbc07ba84baae91
      //CoveredLines: [16, 16, 24, 25, 26, 27, 28, 29, 46, 86, 126, 139]
      //Assert: assertTrue(method_result);
      
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      PageVO<Integer> pageVO0 = new PageVO<Integer>(arrayList0, 1080L, 1, 18);
      
      //Call method: hasNext
      boolean boolean0 = pageVO0.hasNext();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hasPrevious_06()  throws Throwable  {
      //caseID:993fbec4c28c766ddb4037c556c380d4
      //CoveredLines: [16, 16, 21, 22, 37, 95, 139, 150]
      //Assert: assertFalse(method_result);
      
      PageVO<String> pageVO0 = new PageVO<String>();
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      pageVO0.forEach(consumer0);
      
      //Call method: hasPrevious
      boolean boolean0 = pageVO0.hasPrevious();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isFirst_07()  throws Throwable  {
      //caseID:297132a8d89e21b89fd2f4fe842ebef3
      //CoveredLines: [16, 16, 21, 22, 37, 55, 139]
      //Assert: assertTrue(method_result);
      
      PageVO<Integer> pageVO0 = new PageVO<Integer>();
      
      //Call method: isFirst
      boolean boolean0 = pageVO0.isFirst();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isFirst_08()  throws Throwable  {
      //caseID:9681c45065fb9d6e12b9b9e9ba1a807d
      //CoveredLines: [16, 16, 24, 25, 26, 27, 28, 29, 37, 55, 139]
      //Assert: assertTrue(method_result);
      
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PageVO<Object> pageVO0 = new PageVO<Object>(linkedList0, 1L, 0, 0);
      
      //Call method: isFirst
      boolean boolean0 = pageVO0.isFirst();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isLast_09()  throws Throwable  {
      //caseID:3d22add51e4e0ffcbb0f53f0e58f71a7
      //CoveredLines: [16, 16, 21, 22, 46, 64, 86, 95, 126, 139, 150]
      //Assert: assertTrue(method_result);
      //Assert: assertEquals(1, pageVO0.getTotalPage());
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      pageVO0.forEach(consumer0);
      
      //Call method: isLast
      boolean boolean0 = (boolean)PrivateAccess.callMethod((Class<PageVO>) PageVO.class, (PageVO) pageVO0, "isLast");
      
      //Test Result Assert
      assertTrue(boolean0);
      
      //Test Result Assert
      assertEquals(1, pageVO0.getTotalPage());
  }

  @Test(timeout = 9000)
  public void test_isLast_10()  throws Throwable  {
      //caseID:709e2c190c27fcd393256d751013c17e
      //CoveredLines: [16, 16, 21, 22, 46, 64, 86, 95, 126, 139, 150]
      //Assert: assertTrue(method_result);
      //Assert: assertEquals(1, pageVO0.getTotalPage());
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      pageVO0.forEach(consumer0);
      
      //Call method: isLast
      boolean boolean0 = (boolean)PrivateAccess.callMethod((Class<PageVO>) PageVO.class, (PageVO) pageVO0, "isLast");
      
      //Test Result Assert
      assertTrue(boolean0);
      
      //Test Result Assert
      assertEquals(1, pageVO0.getTotalPage());
  }

  @Test(timeout = 9000)
  public void test_setContent_11()  throws Throwable  {
      //caseID:8349e6b2e19505fa15875f0ed00d2da0
      //CoveredLines: [16, 16, 24, 25, 26, 27, 28, 29, 99, 100]
      //Input_0_List<String>: arrayList0
      
      ArrayList<String> arrayList0 = new ArrayList<String>();
      PageVO<String> pageVO0 = new PageVO<String>(arrayList0, 0, 0, 0);
      
      //Call method: setContent
      pageVO0.setContent(arrayList0);
      
      //Test Result Assert
      assertEquals(0L, pageVO0.getTotal());
  }

  @Test(timeout = 9000)
  public void test_setPageNo_12()  throws Throwable  {
      //caseID:b246670ed6cc8f43e3913cc3e483daef
      //CoveredLines: [16, 16, 24, 25, 26, 27, 28, 29, 146, 147]
      //Input_0_int: 1
      
      Vector<String> vector0 = new Vector<String>();
      PageVO<String> pageVO0 = new PageVO<String>(vector0, (-9223372036854775808L), 255, 1717);
      
      //Call method: setPageNo
      pageVO0.setPageNo(1);
      
      //Test Result Assert
      assertEquals(0, pageVO0.getContentSize());
  }

  @Test(timeout = 9000)
  public void test_setPageSize_13()  throws Throwable  {
      //caseID:68adc87267a6b590266b85d52d8b518d
      //CoveredLines: [16, 16, 21, 22, 130, 131]
      //Input_0_int: -1
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      
      //Call method: setPageSize
      pageVO0.setPageSize((-1));
      
      //Test Result Assert
      assertFalse(pageVO0.hasNext());
  }

  @Test(timeout = 9000)
  public void test_setTotal_14()  throws Throwable  {
      //caseID:528d36b85b082cce801963b627c2dd11
      //CoveredLines: [16, 16, 21, 22, 77, 78]
      //Input_0_long: 20
      
      PageVO<Object> pageVO0 = new PageVO<Object>();
      
      //Call method: setTotal
      pageVO0.setTotal(20);
      
      //Test Result Assert
      assertFalse(pageVO0.hasPrevious());
  }
}