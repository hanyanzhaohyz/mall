/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.search.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.search.dao.EsProductDao;
import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.repository.EsProductRepository;
import com.macro.mall.search.service.impl.EsProductServiceImpl;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JLayeredPane;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.Aggregations;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EsProductServiceImpl_SSTest extends EsProductServiceImpl_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_search_00()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for esProductRepository0
      Page<EsProduct> page0 = (Page<EsProduct>) mock(Page.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      EsProductRepository esProductRepository0 = mock(EsProductRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(page0).when(esProductRepository0).findByNameOrSubTitleOrKeywords(nullable(java.lang.String.class) , nullable(java.lang.String.class) , nullable(java.lang.String.class) , nullable(org.springframework.data.domain.Pageable.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productRepository", (Object) esProductRepository0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Page<EsProduct> page1 = esProductServiceImpl0.search("", integer0, integer0);
      assertEquals(0, page1.getNumberOfElements());
  }
  @Test(timeout = 4000)
  public void test_delete_01()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();
      EsProductRepository esProductRepository0 = mock(EsProductRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productRepository", (Object) esProductRepository0);
      Long long0 = new Long(400L);

      //invoke method for esProductServiceImpl0
      esProductServiceImpl0.delete(long0);
  }
  @Test(timeout = 4000)
  public void test_recommend_02()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for esProductDao0
      LinkedList<EsProduct> linkedList0 = new LinkedList<EsProduct>();
      EsProductDao esProductDao0 = mock(EsProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(esProductDao0).getAllEsProductList(nullable(java.lang.Long.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productDao", (Object) esProductDao0);
      Long long0 = new Long(640L);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.recommend(long0, integer0, integer0);
      
      } catch(Throwable e) {
         //
         // Exception Name: IllegalArgumentException
         // Content must not be null!
         //
      }
  }
  @Test(timeout = 4000)
  public void test_create_03()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for esProductDao0
      Vector<EsProduct> vector0 = new Vector<EsProduct>();
      EsProductDao esProductDao0 = mock(EsProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(esProductDao0).getAllEsProductList(nullable(java.lang.Long.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productDao", (Object) esProductDao0);
      Long long0 = new Long(0L);
      EsProduct esProduct0 = esProductServiceImpl0.create(long0);
      assertNull(esProduct0);
  }
  @Test(timeout = 4000)
  public void test_convertProductRelatedInfo_04()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for searchHits0
      Map<String, Aggregation> map0 = (Map<String, Aggregation>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Aggregations aggregations0 = mock(Aggregations.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(map0).when(aggregations0).getAsMap();
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(aggregations0).when(searchHits0).getAggregations();
      try { 

        //invoke method for esProductServiceImpl0
        PrivateAccess.callMethod((Class<EsProductServiceImpl>) EsProductServiceImpl.class, esProductServiceImpl0, "convertProductRelatedInfo", (Object) searchHits0, (Class<?>) SearchHits.class);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_create_05()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for esProductDao0
      Stack<EsProduct> stack0 = new Stack<EsProduct>();
      EsProduct esProduct0 = mock(EsProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      stack0.add(esProduct0);
      EsProductDao esProductDao0 = mock(EsProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(esProductDao0).getAllEsProductList(nullable(java.lang.Long.class));
      EsProductRepository esProductRepository0 = mock(EsProductRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productRepository", (Object) esProductRepository0);

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productDao", (Object) esProductDao0);
      Long long0 = new Long(0L);
      EsProduct esProduct1 = esProductServiceImpl0.create(long0);
      assertNull(esProduct1);
  }
  @Test(timeout = 4000)
  public void test_delete_06()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();
      EsProductRepository esProductRepository0 = mock(EsProductRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productRepository", (Object) esProductRepository0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(0L);
      linkedList0.add(long0);
      esProductServiceImpl0.delete((List<Long>) linkedList0);
      assertTrue(linkedList0.contains(long0));
  }
  @Test(timeout = 4000)
  public void test_searchRelatedInfo_07()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for elasticsearchRestTemplate0
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ElasticsearchRestTemplate elasticsearchRestTemplate0 = mock(ElasticsearchRestTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(elasticsearchRestTemplate0).search(nullable(org.springframework.data.elasticsearch.core.query.Query.class) , nullable(java.lang.Class.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "elasticsearchRestTemplate", (Object) elasticsearchRestTemplate0);
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.searchRelatedInfo("");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_searchRelatedInfo_08()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for elasticsearchRestTemplate0
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ElasticsearchRestTemplate elasticsearchRestTemplate0 = mock(ElasticsearchRestTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(elasticsearchRestTemplate0).search(nullable(org.springframework.data.elasticsearch.core.query.Query.class) , nullable(java.lang.Class.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "elasticsearchRestTemplate", (Object) elasticsearchRestTemplate0);
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.searchRelatedInfo("0");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_recommend_09()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for esProductDao0
      Stack<EsProduct> stack0 = new Stack<EsProduct>();
      Long long0 = new Long(776L);
      EsProduct esProduct0 = mock(EsProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(esProduct0).getBrandId();
      doReturn("SUM").when(esProduct0).getName();
      doReturn(long0).when(esProduct0).getProductCategoryId();
      stack0.add(esProduct0);
      EsProductDao esProductDao0 = mock(EsProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(esProductDao0).getAllEsProductList(nullable(java.lang.Long.class));

      //prepare data for elasticsearchRestTemplate0
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ElasticsearchRestTemplate elasticsearchRestTemplate0 = mock(ElasticsearchRestTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(elasticsearchRestTemplate0).search(nullable(org.springframework.data.elasticsearch.core.query.Query.class) , nullable(java.lang.Class.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "elasticsearchRestTemplate", (Object) elasticsearchRestTemplate0);

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "productDao", (Object) esProductDao0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.recommend(long0, integer0, integer0);
      
      } catch(Throwable e) {
         //
         // Exception Name: IllegalArgumentException
         // Content must not be null!
         //
      }
  }
  @Test(timeout = 4000)
  public void test_search_10()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for elasticsearchRestTemplate0
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1L).when(searchHits0).getTotalHits();
      ElasticsearchRestTemplate elasticsearchRestTemplate0 = mock(ElasticsearchRestTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(elasticsearchRestTemplate0).search(nullable(org.springframework.data.elasticsearch.core.query.Query.class) , nullable(java.lang.Class.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "elasticsearchRestTemplate", (Object) elasticsearchRestTemplate0);
      Long long0 = new Long(235L);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.search("attrIds", long0, long0, integer0, integer0, integer0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_search_11()  throws Throwable  {
      EsProductServiceImpl esProductServiceImpl0 = new EsProductServiceImpl();

      //prepare data for elasticsearchRestTemplate0
      SearchHits<EsProduct> searchHits0 = (SearchHits<EsProduct>) mock(SearchHits.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ElasticsearchRestTemplate elasticsearchRestTemplate0 = mock(ElasticsearchRestTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(searchHits0).when(elasticsearchRestTemplate0).search(nullable(org.springframework.data.elasticsearch.core.query.Query.class) , nullable(java.lang.Class.class));

      //invoke method for esProductServiceImpl0
      PrivateAccess.setVariable((Class<?>) EsProductServiceImpl.class, esProductServiceImpl0, "elasticsearchRestTemplate", (Object) elasticsearchRestTemplate0);
      Long long0 = Long.valueOf(235L);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 

        //invoke method for esProductServiceImpl0
        esProductServiceImpl0.search("attrIds", long0, long0, integer0, integer0, integer0);
      
      } catch(Throwable e) {
         //
         // Exception Name: IllegalArgumentException
         // Content must not be null!
         //
      }
  }}
