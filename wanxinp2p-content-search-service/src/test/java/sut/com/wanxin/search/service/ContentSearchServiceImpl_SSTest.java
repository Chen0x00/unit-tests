/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.wanxin.search.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.wanxin.api.search.model.ProjectQueryParamsDTO;
import com.wanxin.api.transaction.model.ProjectDTO;
import com.wanxin.common.domain.PageVO;
import com.wanxin.search.service.ContentSearchServiceImpl;
import java.util.Map;
import org.apache.lucene.search.TotalHits;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.termvectors.TermVectorsRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ContentSearchServiceImpl_SSTest extends ContentSearchServiceImpl_SSTest_scaffolding {
// allCoveredLines:[32, 41, 44, 46, 47, 50, 51, 54, 55, 59, 62, 63, 66, 67, 69, 70, 71, 74, 75, 78, 82, 83, 85, 86, 87, 90, 92, 94, 95, 97, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 117, 118, 119, 120, 123, 124, 125, 126]

  @Test(timeout = 9000)
  public void test_queryProjectIndex_0()  throws Throwable  {
      //caseID:e3005291cac33fc16673e3e0f4e8aa76
      //CoveredLines: [32, 41, 44, 46, 47, 50, 51, 54, 55, 59, 62, 63, 66, 67, 69, 70, 71, 74, 82]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=termVectorsRequest_FilterSettings0.maxDocFreq termVectorsRequest_FilterSettings0.minTermFreq, getName=\"ASC\" \"ASC\", getStartPeriod=2147483645 termVectorsRequest_FilterSettings0.maxTermFreq, getProjectStatus=\"ASC\"}
      //Input_1_Integer: termVectorsRequest_FilterSettings0.minWordLength
      //Input_2_Integer: termVectorsRequest_FilterSettings0.minWordLength
      //Input_3_String: usem
      //Input_4_String: ASC
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "ASC");
      Integer integer0 = new Integer(2147483645);
      TermVectorsRequest.FilterSettings termVectorsRequest_FilterSettings0 = new TermVectorsRequest.FilterSettings(integer0, integer0, integer0, integer0, integer0, integer0, integer0);
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(termVectorsRequest_FilterSettings0.maxDocFreq, termVectorsRequest_FilterSettings0.minTermFreq).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn("ASC", "ASC").when(projectQueryParamsDTO0).getName();
      doReturn("ASC").when(projectQueryParamsDTO0).getProjectStatus();
      doReturn(integer0, termVectorsRequest_FilterSettings0.maxTermFreq).when(projectQueryParamsDTO0).getStartPeriod();
      
      //Call method: queryProjectIndex
      // Undeclared exception!
      try { 
        contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, termVectorsRequest_FilterSettings0.minWordLength, termVectorsRequest_FilterSettings0.minWordLength, "usem", "ASC");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_queryProjectIndex_1()  throws Throwable  {
      //caseID:3ebd2800a45c9d98a207db96936829d4
      //CoveredLines: [32, 41, 44, 46, 47, 50, 51, 54, 55, 59, 62, 63, 66, 67, 69, 70, 74, 75, 82]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=termVectorsRequest_FilterSettings0.maxDocFreq termVectorsRequest_FilterSettings0.maxNumTerms, getName=\"ASC\" \"ASC\", getStartPeriod=2147483645 termVectorsRequest_FilterSettings0.maxTermFreq, getProjectStatus=\"ASC\"}
      //Input_1_Integer: termVectorsRequest_FilterSettings0.maxWordLength
      //Input_2_Integer: termVectorsRequest_FilterSettings0.maxWordLength
      //Input_3_String: usem
      //Input_4_String: DESC
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "ASC");
      Integer integer0 = new Integer(2147483645);
      TermVectorsRequest.FilterSettings termVectorsRequest_FilterSettings0 = new TermVectorsRequest.FilterSettings(integer0, integer0, integer0, integer0, integer0, integer0, integer0);
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(termVectorsRequest_FilterSettings0.maxDocFreq, termVectorsRequest_FilterSettings0.maxNumTerms).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn("ASC", "ASC").when(projectQueryParamsDTO0).getName();
      doReturn("ASC").when(projectQueryParamsDTO0).getProjectStatus();
      doReturn(integer0, termVectorsRequest_FilterSettings0.maxTermFreq).when(projectQueryParamsDTO0).getStartPeriod();
      
      //Call method: queryProjectIndex
      // Undeclared exception!
      try { 
        contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, termVectorsRequest_FilterSettings0.maxWordLength, termVectorsRequest_FilterSettings0.maxWordLength, "usem", "DESC");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_queryProjectIndex_2()  throws Throwable  {
      //caseID:b9a5c6caa06d2975dead6e3d2d5142ba
      //CoveredLines: [32, 41, 44, 46, 50, 54, 59, 62, 66, 67, 69, 70, 74, 82, 83, 85, 86, 87, 90, 92, 94, 117, 118, 119]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=(Integer) null, getName=(String) null, getStartPeriod=(Integer) null, getProjectStatus=(String) null}
      //Input_1_Integer: 1
      //Input_2_Integer: 1
      //Input_3_String: usem
      //Input_4_String: 1.0
      //Assert: assertNull(method_result);
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      //mock searchResponse0
      SearchResponse searchResponse0 = mock(SearchResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock restHighLevelClient0
      RestHighLevelClient restHighLevelClient0 = mock(RestHighLevelClient.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchResponse0).when(restHighLevelClient0).search(any(org.elasticsearch.action.search.SearchRequest.class) , any(org.elasticsearch.client.RequestOptions.class));
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "restHighLevelClient", (Object) restHighLevelClient0);
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "cannot have minLon [");
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((Integer) null).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn((String) null).when(projectQueryParamsDTO0).getName();
      doReturn((String) null).when(projectQueryParamsDTO0).getProjectStatus();
      doReturn((Integer) null).when(projectQueryParamsDTO0).getStartPeriod();
      Integer integer0 = new Integer(1);
      
      //Call method: queryProjectIndex
      PageVO<ProjectDTO> pageVO0 = contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, integer0, integer0, "usem", "1.0");
      
      //Test Result Assert
      assertNull(pageVO0);
  }

  @Test(timeout = 9000)
  public void test_queryProjectIndex_3()  throws Throwable  {
      //caseID:1e1e02f5200755be0b698d7bcaef44c7
      //CoveredLines: [32, 41, 44, 46, 47, 50, 54, 59, 62, 63, 66, 67, 69, 70, 74, 82, 83, 85, 86, 87, 90, 92, 94, 95, 97, 100, 120, 123, 124, 125, 126]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=(Integer) null, getName=\"cannot have minLon [\" \"id\", getStartPeriod=(Integer) null, getProjectStatus=\"cannot have minLon [\"}
      //Input_1_Integer: 1
      //Input_2_Integer: 1
      //Input_3_String: usem
      //Input_4_String: 1.0
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals(0, method_result.getContentSize());
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      //mock totalHits0
      TotalHits totalHits0 = mock(TotalHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      SearchHit[] searchHitArray0 = new SearchHit[0];
      //mock searchHits0
      SearchHits searchHits0 = mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHitArray0).when(searchHits0).getHits();
      doReturn(totalHits0).when(searchHits0).getTotalHits();
      //mock searchResponse0
      SearchResponse searchResponse0 = mock(SearchResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(searchResponse0).getHits();
      //mock restHighLevelClient0
      RestHighLevelClient restHighLevelClient0 = mock(RestHighLevelClient.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchResponse0).when(restHighLevelClient0).search(any(org.elasticsearch.action.search.SearchRequest.class) , any(org.elasticsearch.client.RequestOptions.class));
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "restHighLevelClient", (Object) restHighLevelClient0);
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "cannot have minLon [");
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((Integer) null).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn("cannot have minLon [", "id").when(projectQueryParamsDTO0).getName();
      doReturn("cannot have minLon [").when(projectQueryParamsDTO0).getProjectStatus();
      doReturn((Integer) null).when(projectQueryParamsDTO0).getStartPeriod();
      Integer integer0 = new Integer(1);
      
      //Call method: queryProjectIndex
      PageVO<ProjectDTO> pageVO0 = contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, integer0, integer0, "usem", "1.0");
      
      //Test Result Assert
      assertNotNull(pageVO0);
      
      //Test Result Assert
      assertEquals(0, pageVO0.getContentSize());
  }

  @Test(timeout = 9000)
  public void test_queryProjectIndex_4()  throws Throwable  {
      //caseID:005148ce3d1693432a5da9f2d45d4a05
      //CoveredLines: [32, 41, 44, 46, 47, 50, 51, 54, 55, 59, 62, 63, 66, 67, 69, 78, 82, 83, 85, 86, 87, 90, 92, 94, 95, 97, 100, 101, 102, 103, 104, 105, 117, 118, 119]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=termVectorsRequest_FilterSettings1.maxNumTerms termVectorsRequest_FilterSettings0.minWordLength, getName=\"cannot have minLon [\" \"DSC\", getStartPeriod=0 termVectorsRequest_FilterSettings1.maxTermFreq, getProjectStatus=\"cannot have minLon [\"}
      //Input_1_Integer: termVectorsRequest_FilterSettings1.maxTermFreq
      //Input_2_Integer: termVectorsRequest_FilterSettings1.maxTermFreq
      //Input_3_String: usem
      //Input_4_String: 
      //Assert: assertNull(method_result);
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      //mock totalHits0
      TotalHits totalHits0 = mock(TotalHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      SearchHit[] searchHitArray0 = new SearchHit[9];
      Double double0 = new Double(2894.374619839768);
      TermVectorsRequest.FilterSettings termVectorsRequest_FilterSettings0 = new TermVectorsRequest.FilterSettings();
      //mock map0
      Map<String, Object> map0 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("DESC", double0, (Integer) null).when(map0).get(any());
      //mock searchHit0
      SearchHit searchHit0 = mock(SearchHit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(map0).when(searchHit0).getSourceAsMap();
      searchHitArray0[0] = searchHit0;
      //mock searchHits0
      SearchHits searchHits0 = mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHitArray0).when(searchHits0).getHits();
      doReturn(totalHits0).when(searchHits0).getTotalHits();
      //mock searchResponse0
      SearchResponse searchResponse0 = mock(SearchResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(searchResponse0).getHits();
      //mock restHighLevelClient0
      RestHighLevelClient restHighLevelClient0 = mock(RestHighLevelClient.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchResponse0).when(restHighLevelClient0).search(any(org.elasticsearch.action.search.SearchRequest.class) , any(org.elasticsearch.client.RequestOptions.class));
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "restHighLevelClient", (Object) restHighLevelClient0);
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "cannot have minLon [");
      Integer integer0 = new Integer(0);
      TermVectorsRequest.FilterSettings termVectorsRequest_FilterSettings1 = new TermVectorsRequest.FilterSettings(integer0, integer0, integer0, integer0, integer0, integer0, integer0);
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(termVectorsRequest_FilterSettings1.maxNumTerms, termVectorsRequest_FilterSettings0.minWordLength).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn("cannot have minLon [", "DSC").when(projectQueryParamsDTO0).getName();
      doReturn("cannot have minLon [").when(projectQueryParamsDTO0).getProjectStatus();
      doReturn(integer0, termVectorsRequest_FilterSettings1.maxTermFreq).when(projectQueryParamsDTO0).getStartPeriod();
      Integer integer1 = termVectorsRequest_FilterSettings1.maxTermFreq;
      
      //Call method: queryProjectIndex
      PageVO<ProjectDTO> pageVO0 = contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, integer1, integer1, "usem", "");
      
      //Test Result Assert
      assertNull(pageVO0);
  }

  @Test(timeout = 9000)
  public void test_queryProjectIndex_5()  throws Throwable  {
      //caseID:4f530c97e1d3160d536993f462989e39
      //CoveredLines: [32, 41, 44, 46, 47, 50, 54, 59, 62, 63, 66, 67, 69, 70, 74, 82, 83, 85, 86, 87, 90, 92, 94, 95, 97, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 117, 118, 119]
      //Input_0_ProjectQueryParamsDTO: {getEndPeriod=(Integer) null, getName=\"com.wanxin.search.service.ContentSearchServiceImpl\" \"DESC\", getStartPeriod=(Integer) null, getProjectStatus=\"j-2pAdLj\"}
      //Input_1_Integer: 100
      //Input_2_Integer: 100
      //Input_3_String: usem
      //Input_4_String: 1.0
      //Assert: assertNull(method_result);
      
      ContentSearchServiceImpl contentSearchServiceImpl0 = new ContentSearchServiceImpl();
      //mock totalHits0
      TotalHits totalHits0 = mock(TotalHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      SearchHit[] searchHitArray0 = new SearchHit[1];
      Double double0 = new Double(0.0);
      //mock map0
      Map<String, Object> map0 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("DESC", double0, "414").when(map0).get(any());
      //mock searchHit0
      SearchHit searchHit0 = mock(SearchHit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(map0).when(searchHit0).getSourceAsMap();
      searchHitArray0[0] = searchHit0;
      //mock searchHits0
      SearchHits searchHits0 = mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHitArray0).when(searchHits0).getHits();
      doReturn(totalHits0).when(searchHits0).getTotalHits();
      //mock searchResponse0
      SearchResponse searchResponse0 = mock(SearchResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(searchResponse0).getHits();
      //mock restHighLevelClient0
      RestHighLevelClient restHighLevelClient0 = mock(RestHighLevelClient.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchResponse0).when(restHighLevelClient0).search(any(org.elasticsearch.action.search.SearchRequest.class) , any(org.elasticsearch.client.RequestOptions.class));
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "restHighLevelClient", (Object) restHighLevelClient0);
      
      PrivateAccess.setVariable((Class<?>) ContentSearchServiceImpl.class, contentSearchServiceImpl0, "projectIndex", (Object) "cannot have minLon [");
      //mock projectQueryParamsDTO0
      ProjectQueryParamsDTO projectQueryParamsDTO0 = mock(ProjectQueryParamsDTO.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((Integer) null).when(projectQueryParamsDTO0).getEndPeriod();
      doReturn("com.wanxin.search.service.ContentSearchServiceImpl", "DESC").when(projectQueryParamsDTO0).getName();
      doReturn("j-2pAdLj").when(projectQueryParamsDTO0).getProjectStatus();
      doReturn((Integer) null).when(projectQueryParamsDTO0).getStartPeriod();
      Integer integer0 = new Integer(100);
      
      //Call method: queryProjectIndex
      PageVO<ProjectDTO> pageVO0 = contentSearchServiceImpl0.queryProjectIndex(projectQueryParamsDTO0, integer0, integer0, "usem", "1.0");
      
      //Test Result Assert
      assertNull(pageVO0);
  }
}