/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.uaa.common.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.netflix.loadbalancer.Server;
import com.wanxin.uaa.common.utils.StringUtils;
import java.util.Set;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class StringUtils_SSTest extends StringUtils_SSTest_scaffolding {
// allCoveredLines:[48, 49, 51, 52, 53, 56, 63, 64, 66, 67, 68, 69, 72, 73, 74, 77, 78, 79, 82, 89, 90, 91, 93, 94, 97, 104, 105, 106, 107, 110, 117, 118, 119, 120, 121, 122, 123, 125, 127, 130, 137, 138, 139, 140, 141, 142, 144, 147, 158, 159, 160, 161, 162, 164, 165, 167, 168, 170, 171, 173, 174, 176, 177, 179, 181, 184, 195, 197, 198, 199, 200, 202, 203, 205, 207, 208, 211, 212, 213, 214, 230, 231, 233, 234, 235, 238, 266, 284, 285, 287, 288, 289, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 302, 303, 305, 306, 307, 309, 310, 312, 334, 335, 337, 338, 339, 341, 342, 343, 344, 345, 346, 348, 349, 350, 351, 352, 356, 357, 359, 360, 362, 363, 364, 366, 368, 369, 370, 371, 372, 373, 377, 378, 380, 381, 383, 384, 385, 387, 389, 390, 391, 392, 393, 397, 398, 400, 401, 403, 404, 405, 408, 409, 411, 439, 450, 451, 452, 455, 456, 457, 487, 488, 490]

  @Test(timeout = 9000)
  public void test_areNotEmpty_00()  throws Throwable  {
      //caseID:1fe9e64e594a7868786a1929db60062f
      //CoveredLines: [89, 90, 91, 97]
      //Input_0_String[]: stringArray0
      //Assert: assertFalse(method_result);
      
      String[] stringArray0 = new String[0];
      
      //Call method: areNotEmpty
      boolean boolean0 = StringUtils.areNotEmpty(stringArray0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_areNotEmpty_01()  throws Throwable  {
      //caseID:c112fd4f32f1ebd547da489de415d7d4
      //CoveredLines: [89, 90, 91, 97]
      //Input_0_String[]: null
      //Assert: assertFalse(method_result);
      
      
      //Call method: areNotEmpty
      boolean boolean0 = StringUtils.areNotEmpty((String[]) null);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_areNotEmpty_02()  throws Throwable  {
      //caseID:3571f05c4aa62207b55ae00796eb48f5
      //CoveredLines: [48, 49, 89, 90, 93, 94, 97]
      //Input_0_String[]: stringArray0
      //Assert: assertFalse(method_result);
      
      String[] stringArray0 = new String[3];
      
      //Call method: areNotEmpty
      boolean boolean0 = StringUtils.areNotEmpty(stringArray0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_areNotEmpty_03()  throws Throwable  {
      //caseID:4e2c9cade5783c4a9aaf9e23bc619df4
      //CoveredLines: [48, 49, 51, 52, 53, 89, 90, 93, 94, 97]
      //Input_0_String[]: stringArray0
      //Assert: assertFalse(method_result);
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "New Collection violated the Collection spec";
      stringArray0[4] = "";
      
      //Call method: areNotEmpty
      boolean boolean0 = StringUtils.areNotEmpty(stringArray0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_04()  throws Throwable  {
      //caseID:d0feef9eb458f9f0b34ef4401c36999c
      //CoveredLines: [158, 159, 160, 161, 162, 179, 181, 184]
      //Input_0_String: \u0000\u00AD\u0600\u061C\u06DD\u070F\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uD800\uFEFF\uFFF9
      //Assert: assertEquals("\u00AD\u0600\u061C\u06DD\u070F\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uFEFF\uFFF9", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml("\u0000\u00AD\u0600\u061C\u06DD\u070F\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uD800\uFEFF\uFFF9");
      
      //Test Result Assert
      assertEquals("\u00AD\u0600\u061C\u06DD\u070F\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uFEFF\uFFF9", string0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_05()  throws Throwable  {
      //caseID:7e7f3b1e5f7c0e101cc9c6e8104beff3
      //CoveredLines: [158, 159, 160, 161, 162, 164, 165, 179, 181, 184]
      //Input_0_String: #N<@tf5,
      //Assert: assertEquals("#N&lt;@tf5,", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml("#N<@tf5,");
      
      //Test Result Assert
      assertEquals("#N&lt;@tf5,", string0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_06()  throws Throwable  {
      //caseID:ebb0f6ac553b1546a86edece30618b54
      //CoveredLines: [158, 159, 160, 161, 162, 176, 177, 179, 181, 184]
      //Input_0_String: #!K$:xvI7J+LO\"@/9
      //Assert: assertEquals("#!K$:xvI7J+LO&quot;@/9", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml("#!K$:xvI7J+LO\"@/9");
      
      //Test Result Assert
      assertEquals("#!K$:xvI7J+LO&quot;@/9", string0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_07()  throws Throwable  {
      //caseID:8d19e141bda92aeb076939f51a745047
      //CoveredLines: [158, 159, 160, 161, 162, 167, 168, 179, 181, 184]
      //Input_0_String: .5o>#u=0b7lut
      //Assert: assertEquals(".5o&gt;#u=0b7lut", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml(".5o>#u=0b7lut");
      
      //Test Result Assert
      assertEquals(".5o&gt;#u=0b7lut", string0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_08()  throws Throwable  {
      //caseID:cf1ace0c7e4219582ece64c7f25c820c
      //CoveredLines: [158, 159, 160, 161, 162, 173, 174, 179, 181, 184]
      //Input_0_String: &lt;
      //Assert: assertEquals("&amp;lt;", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml("&lt;");
      
      //Test Result Assert
      assertEquals("&amp;lt;", string0);
  }

  @Test(timeout = 9000)
  public void test_escapeXml_09()  throws Throwable  {
      //caseID:6b95364446c03e05455dc889ac3a076d
      //CoveredLines: [158, 159, 160, 161, 162, 170, 171, 179, 181, 184]
      //Input_0_String: ]'
      //Assert: assertEquals("]&apos;", method_result);
      
      
      //Call method: escapeXml
      String string0 = StringUtils.escapeXml("]'");
      
      //Test Result Assert
      assertEquals("]&apos;", string0);
  }

  @Test(timeout = 9000)
  public void test_getClassProperties_10()  throws Throwable  {
      //caseID:8e4906775890d05992e88832baebb90e
      //CoveredLines: [195, 197, 211, 212]
      //Input_0_Class<?>: null
      //Input_1_boolean: true
      
      
      //Call method: getClassProperties
      // Undeclared exception!
      try { 
        StringUtils.getClassProperties((Class<?>) null, true);
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_getClassProperties_11()  throws Throwable  {
      //caseID:405d068e5df3b97b6f35d8ee233dc072
      //CoveredLines: [195, 197, 198, 199, 200, 202, 205, 207, 213, 214]
      //Input_0_Class<?>: Integer.class
      //Input_1_boolean: false
      //Assert: assertEquals(0, method_result.size());
      
      Class<Integer> class0 = Integer.class;
      
      //Call method: getClassProperties
      Set<String> set0 = StringUtils.getClassProperties(class0, false);
      
      //Test Result Assert
      assertEquals(0, set0.size());
  }

  @Test(timeout = 9000)
  public void test_getClassProperties_12()  throws Throwable  {
      //caseID:7a083d528438aa23473fd1c6e8f052aa
      //CoveredLines: [195, 197, 198, 199, 200, 202, 203, 207, 208, 213, 214]
      //Input_0_Class<?>: Server.class
      //Input_1_boolean: true
      //Assert: assertEquals(9, method_result.size());
      
      Class<Server> class0 = Server.class;
      
      //Call method: getClassProperties
      Set<String> set0 = StringUtils.getClassProperties(class0, true);
      
      //Test Result Assert
      assertEquals(9, set0.size());
  }

  @Test(timeout = 9000)
  public void test_getClassProperties_13()  throws Throwable  {
      //caseID:17870587ff97eb1547e5212a78f5b61c
      //CoveredLines: [195, 197, 198, 199, 200, 202, 203, 207, 208, 213, 214]
      //Input_0_Class<?>: String.class
      //Input_1_boolean: true
      //Assert: assertEquals(2, method_result.size());
      
      Class<String> class0 = String.class;
      
      //Call method: getClassProperties
      Set<String> set0 = StringUtils.getClassProperties(class0, true);
      
      //Test Result Assert
      assertEquals(2, set0.size());
  }

  @Test(timeout = 9000)
  public void test_isDigits_14()  throws Throwable  {
      //caseID:7165e93854595504c0ee62d50741ae46
      //CoveredLines: [48, 49, 230, 231]
      //Input_0_String: 
      //Assert: assertFalse(method_result);
      
      
      //Call method: isDigits
      boolean boolean0 = StringUtils.isDigits("");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isDigits_15()  throws Throwable  {
      //caseID:7210bfb595ccdd50bd5db59ee7da580b
      //CoveredLines: [48, 51, 52, 53, 230, 233, 234, 238]
      //Input_0_String: 85
      //Assert: assertTrue(method_result);
      
      
      //Call method: isDigits
      boolean boolean0 = StringUtils.isDigits("85");
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isDigits_16()  throws Throwable  {
      //caseID:cd94bdd5dccda6c254b40afdacb5839e
      //CoveredLines: [48, 51, 52, 53, 230, 233, 234, 235]
      //Input_0_String: 7YUt
      //Assert: assertFalse(method_result);
      
      
      //Call method: isDigits
      boolean boolean0 = StringUtils.isDigits("7YUt");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isDigits_17()  throws Throwable  {
      //caseID:0b8d2c573cfe61acfc4378998966a6f5
      //CoveredLines: [48, 51, 52, 53, 230, 233, 234, 235]
      //Input_0_String: reactor.schedulers.defaultPoolSize
      //Assert: assertFalse(method_result);
      
      
      //Call method: isDigits
      boolean boolean0 = StringUtils.isDigits("reactor.schedulers.defaultPoolSize");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isIpInRange_18()  throws Throwable  {
      //caseID:7b3040cde40cd6955c8d34a695f25583
      //CoveredLines: [450, 451, 452]
      //Input_0_String: 10
      //Input_1_String: 32
      
      
      //Call method: isIpInRange
      // Undeclared exception!
      try { 
        StringUtils.isIpInRange("10", "32");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_isIpInRange_19()  throws Throwable  {
      //caseID:4242b2b098c96b010a773e90cbd7b7f3
      //CoveredLines: [450, 451, 455, 456, 457]
      //Input_0_String: 0.0.0.0/0
      //Input_1_String: 0.0.0.0/0
      
      
      //Call method: isIpInRange
      // Undeclared exception!
      try { 
        StringUtils.isIpInRange("0.0.0.0/0", "0.0.0.0/0");
      } catch(Throwable e) {
         verifyException("java.util.regex.Matcher", e);
         assertEquals("java.lang.IllegalStateException", e.getClass().getName());
         assertEquals("No match found", e.getMessage());
      }
  }

  @Test(timeout = 9000)
  public void test_isNumeric_20()  throws Throwable  {
      //caseID:369cb9598d21b5d7388c0c8d92809997
      //CoveredLines: [63, 64]
      //Input_0_Object: null
      //Assert: assertFalse(method_result);
      
      
      //Call method: isNumeric
      boolean boolean0 = StringUtils.isNumeric(null);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isNumeric_21()  throws Throwable  {
      //caseID:3440fd80fbb6470a8b4e7ffce37b19d4
      //CoveredLines: [63, 66, 67, 68, 69]
      //Input_0_Object: 
      //Assert: assertFalse(method_result);
      
      
      //Call method: isNumeric
      boolean boolean0 = StringUtils.isNumeric("");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isNumeric_22()  throws Throwable  {
      //caseID:c06d8d31358a181cb39fce6ad396cea8
      //CoveredLines: [63, 66, 67, 68, 72, 73, 77, 78, 79]
      //Input_0_Object: object0
      //Assert: assertFalse(method_result);
      
      Object object0 = new Object();
      
      //Call method: isNumeric
      boolean boolean0 = StringUtils.isNumeric(object0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isNumeric_23()  throws Throwable  {
      //caseID:700462cee6a94f838477ccf8076a34a6
      //CoveredLines: [63, 66, 67, 68, 72, 73, 77, 78, 82]
      //Input_0_Object: 0
      //Assert: assertTrue(method_result);
      
      
      //Call method: isNumeric
      boolean boolean0 = StringUtils.isNumeric("0");
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_isNumeric_24()  throws Throwable  {
      //caseID:382a717f56f57a45052243a0906ec50f
      //CoveredLines: [63, 66, 67, 68, 72, 73, 74, 77, 78, 82]
      //Input_0_Object: -9
      //Assert: assertTrue(method_result);
      
      
      //Call method: isNumeric
      boolean boolean0 = StringUtils.isNumeric("-9");
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_split_25()  throws Throwable  {
      //caseID:a9ecb2e8154bb55ba77df40c1a4fcd05
      //CoveredLines: [266, 284, 285]
      //Input_0_String: null
      //Input_1_char: c
      //Assert: assertNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split((String) null, 'c');
      
      //Test Result Assert
      assertNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_26()  throws Throwable  {
      //caseID:805f91b3770ba75647903da57c893592
      //CoveredLines: [334, 335, 439]
      //Input_0_String: null
      //Input_1_String: 1
      //Assert: assertNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split((String) null, "1");
      
      //Test Result Assert
      assertNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_27()  throws Throwable  {
      //caseID:5a703a1ebe376d3437fed01230f6f33f
      //CoveredLines: [334, 337, 338, 339, 439]
      //Input_0_String: 
      //Input_1_String: 
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals(0, method_result.length);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("", "");
      
      //Test Result Assert
      assertNotNull(stringArray0);
      
      //Test Result Assert
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 9000)
  public void test_split_28()  throws Throwable  {
      //caseID:3e421ac823e53225263b02ff84d0c59b
      //CoveredLines: [266, 284, 287, 288, 289]
      //Input_0_String: 
      //Input_1_char: G
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals(0, method_result.length);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("", 'G');
      
      //Test Result Assert
      assertNotNull(stringArray0);
      
      //Test Result Assert
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 9000)
  public void test_split_29()  throws Throwable  {
      //caseID:0b4c53e4157d68e2cd394eb09c2f63c2
      //CoveredLines: [266, 284, 287, 288, 291, 292, 293, 294, 295, 296, 297, 302, 303, 309, 312]
      //Input_0_String: 8
      //Input_1_char: 8
      //Assert: assertEquals(0, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("8", '8');
      
      //Test Result Assert
      assertEquals(0, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_30()  throws Throwable  {
      //caseID:e0d78c3ba13489deed4fb36dfd1dac20
      //CoveredLines: [334, 337, 338, 341, 342, 343, 344, 345, 346, 366, 368, 369, 370, 371, 380, 381, 387, 408, 411, 439]
      //Input_0_String: _
      //Input_1_String: _
      //Assert: assertEquals(0, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("_", "_");
      
      //Test Result Assert
      assertEquals(0, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_31()  throws Throwable  {
      //caseID:f2414732ebc7601a1a487b5f8c1a1b95
      //CoveredLines: [334, 337, 338, 341, 342, 343, 344, 345, 346, 348, 349, 350, 359, 360, 362, 363, 364, 408, 409, 411, 439]
      //Input_0_String:  Wmn4s6<R/;`z3QR&Z
      //Input_1_String: null
      //Assert: assertEquals(1, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split(" Wmn4s6<R/;`z3QR&Z", (String) null);
      
      //Test Result Assert
      assertEquals(1, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_32()  throws Throwable  {
      //caseID:f7603f19371cff69c6eaabe5553982de
      //CoveredLines: [266, 284, 287, 288, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 302, 303, 305, 306, 307, 309, 310, 312]
      //Input_0_String: ]; does the class parameterize those types?
      //Input_1_char: t
      //Assert: assertEquals(5, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("]; does the class parameterize those types?", 't');
      
      //Test Result Assert
      assertEquals(5, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_33()  throws Throwable  {
      //caseID:3ebae15864e549551e82df695d3adc9a
      //CoveredLines: [334, 337, 338, 341, 342, 343, 344, 345, 346, 348, 349, 350, 351, 352, 356, 357, 359, 360, 362, 363, 364, 408, 409, 411, 439]
      //Input_0_String: Domain type must not be null!
      //Input_1_String: null
      //Assert: assertEquals(6, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("Domain type must not be null!", (String) null);
      
      //Test Result Assert
      assertEquals(6, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_split_34()  throws Throwable  {
      //caseID:1b9e7c21f0288cd189d3443bdc090fb1
      //CoveredLines: [334, 337, 338, 341, 342, 343, 344, 345, 346, 366, 389, 390, 391, 392, 393, 397, 398, 400, 401, 403, 404, 405, 408, 409, 411, 439]
      //Input_0_String: 65536
      //Input_1_String: 45
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals(2, method_result.length);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("65536", "45");
      
      //Test Result Assert
      assertNotNull(stringArray0);
      
      //Test Result Assert
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 9000)
  public void test_split_35()  throws Throwable  {
      //caseID:75837f62d3855a9daaa9ca20c6324933
      //CoveredLines: [334, 337, 338, 341, 342, 343, 344, 345, 346, 366, 368, 369, 370, 371, 372, 373, 377, 378, 380, 381, 383, 384, 385, 387, 408, 409, 411, 439]
      //Input_0_String: r[\"1]
      //Input_1_String: 1
      //Assert: assertEquals(2, method_result.length);
      //Assert: assertNotNull(method_result);
      
      
      //Call method: split
      String[] stringArray0 = StringUtils.split("r[\"1]", "1");
      
      //Test Result Assert
      assertEquals(2, stringArray0.length);
      
      //Test Result Assert
      assertNotNull(stringArray0);
  }

  @Test(timeout = 9000)
  public void test_toCamelStyle_36()  throws Throwable  {
      //caseID:61a7d516c40d25a4159924bea69b51ad
      //CoveredLines: [137, 138, 139, 140, 141, 142, 144, 147]
      //Input_0_String: 60
      //Assert: assertEquals("60", method_result);
      
      
      //Call method: toCamelStyle
      String string0 = StringUtils.toCamelStyle("60");
      
      //Test Result Assert
      assertEquals("60", string0);
  }

  @Test(timeout = 9000)
  public void test_toUnderlineStyle_37()  throws Throwable  {
      //caseID:49c74899ccbc1efdef367c3d7dfa5e82
      //CoveredLines: [117, 118, 119, 120, 121, 122, 125, 127, 130]
      //Input_0_String: Location must not be null
      //Assert: assertEquals("location must not be null", method_result);
      
      
      //Call method: toUnderlineStyle
      String string0 = StringUtils.toUnderlineStyle("Location must not be null");
      
      //Test Result Assert
      assertEquals("location must not be null", string0);
  }

  @Test(timeout = 9000)
  public void test_toUnderlineStyle_38()  throws Throwable  {
      //caseID:31d7592ffad0615e253a5d78dd196c7e
      //CoveredLines: [117, 118, 119, 120, 121, 122, 123, 125, 127, 130]
      //Input_0_String: 8#LD>SD;e{|
      //Assert: assertEquals("8#_l_d>_s_d;e{|", method_result);
      
      
      //Call method: toUnderlineStyle
      String string0 = StringUtils.toUnderlineStyle("8#LD>SD;e{|");
      
      //Test Result Assert
      assertEquals("8#_l_d>_s_d;e{|", string0);
  }

  @Test(timeout = 9000)
  public void test_unicodeToChinese_39()  throws Throwable  {
      //caseID:85992c6c48786692638ae01d0cd1d929
      //CoveredLines: [48, 51, 52, 56, 104, 105, 110]
      //Input_0_String:  
      //Assert: assertEquals("", method_result);
      
      
      //Call method: unicodeToChinese
      String string0 = StringUtils.unicodeToChinese(" ");
      
      //Test Result Assert
      assertEquals("", string0);
  }

  @Test(timeout = 9000)
  public void test_unicodeToChinese_40()  throws Throwable  {
      //caseID:87cb8ae6dc0a29ecf85e6d5ea8015d71
      //CoveredLines: [48, 51, 52, 53, 104, 105, 106, 107, 110]
      //Input_0_String:  H7{
      //Assert: assertEquals(" H7{", method_result);
      
      
      //Call method: unicodeToChinese
      String string0 = StringUtils.unicodeToChinese(" H7{");
      
      //Test Result Assert
      assertEquals(" H7{", string0);
  }

  @Test(timeout = 9000)
  public void test_unicodeToChinese_41()  throws Throwable  {
      //caseID:1af4a523000f419a3353283f213ad6f0
      //CoveredLines: [48, 51, 52, 53, 104, 105, 106, 107, 110]
      //Input_0_String: &amp;
      //Assert: assertEquals("&amp;", method_result);
      
      
      //Call method: unicodeToChinese
      String string0 = StringUtils.unicodeToChinese("&amp;");
      
      //Test Result Assert
      assertEquals("&amp;", string0);
  }

  @Test(timeout = 9000)
  public void test_varFormat_42()  throws Throwable  {
      //caseID:b35ffa0e20e4a01c8feaebaa69ee9822
      //CoveredLines: [487, 490]
      //Input_0_Object: Binding to core guice framework type is not allowed: %s.
      //Assert: assertEquals("Binding to core guice framework type is not allowed: %s.", method_result);
      
      
      //Call method: varFormat
      String string0 = StringUtils.varFormat("Binding to core guice framework type is not allowed: %s.");
      
      //Test Result Assert
      assertEquals("Binding to core guice framework type is not allowed: %s.", string0);
  }

  @Test(timeout = 9000)
  public void test_varFormat_43()  throws Throwable  {
      //caseID:29c18a63183054faa600221da2a3b27c
      //CoveredLines: [487, 488, 490]
      //Input_0_Object: null
      //Assert: assertEquals("", method_result);
      
      
      //Call method: varFormat
      String string0 = StringUtils.varFormat(null);
      
      //Test Result Assert
      assertEquals("", string0);
  }
}
