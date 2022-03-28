/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.controller.UmsRoleController;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import com.macro.mall.service.UmsRoleService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UmsRoleController_SSTest extends UmsRoleController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_allocMenu_00()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(umsRoleService0).allocMenu(nullable(java.lang.Long.class) , ArgumentMatchers.<java.lang.Long>anyList());

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Stack<Long> stack0 = new Stack<Long>();
      CommonResult commonResult0 = umsRoleController0.allocMenu((Long) null, stack0);
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }
  @Test(timeout = 4000)
  public void test_listMenu_01()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      LinkedList<UmsMenu> linkedList0 = new LinkedList<UmsMenu>();
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(umsRoleService0).listMenu(nullable(java.lang.Long.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Long long0 = new Long(869L);
      CommonResult<List<UmsMenu>> commonResult0 = umsRoleController0.listMenu(long0);
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_listResource_02()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      ArrayList<UmsResource> arrayList0 = new ArrayList<UmsResource>();
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(umsRoleService0).listResource(nullable(java.lang.Long.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Long long0 = new Long(0L);
      CommonResult<List<UmsResource>> commonResult0 = umsRoleController0.listResource(long0);
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_allocResource_03()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(umsRoleService0).allocResource(nullable(java.lang.Long.class) , ArgumentMatchers.<java.lang.Long>anyList());

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Stack<Long> stack0 = new Stack<Long>();
      CommonResult commonResult0 = umsRoleController0.allocResource((Long) null, stack0);
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_listAll_04()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      ArrayList<UmsRole> arrayList0 = new ArrayList<UmsRole>();
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(umsRoleService0).list();

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      CommonResult<List<UmsRole>> commonResult0 = umsRoleController0.listAll();
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_05()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      ArrayList<UmsRole> arrayList0 = new ArrayList<UmsRole>();
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(umsRoleService0).list(nullable(java.lang.String.class) , nullable(java.lang.Integer.class) , nullable(java.lang.Integer.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Integer integer0 = new Integer(1);
      CommonResult<CommonPage<UmsRole>> commonResult0 = umsRoleController0.list("1", integer0, integer0);
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }
  @Test(timeout = 4000)
  public void test_delete_06()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(umsRoleService0).delete(ArgumentMatchers.<java.lang.Long>anyList());

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Stack<Long> stack0 = new Stack<Long>();
      CommonResult commonResult0 = umsRoleController0.delete(stack0);
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_delete_07()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(umsRoleService0).delete(ArgumentMatchers.<java.lang.Long>anyList());

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Stack<Long> stack0 = new Stack<Long>();
      CommonResult commonResult0 = umsRoleController0.delete(stack0);
      assertEquals(500L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_update_08()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(umsRoleService0).update(nullable(java.lang.Long.class) , nullable(com.macro.mall.model.UmsRole.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Long long0 = new Long(243L);
      UmsRole umsRole0 = mock(UmsRole.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      CommonResult commonResult0 = umsRoleController0.update(long0, umsRole0);
      assertEquals(500L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_update_09()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(86).when(umsRoleService0).update(nullable(java.lang.Long.class) , nullable(com.macro.mall.model.UmsRole.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      UmsRole umsRole0 = new UmsRole();
      CommonResult commonResult0 = umsRoleController0.update((Long) null, umsRole0);
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }
  @Test(timeout = 4000)
  public void test_create_10()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(umsRoleService0).create(nullable(com.macro.mall.model.UmsRole.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      UmsRole umsRole0 = mock(UmsRole.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      CommonResult commonResult0 = umsRoleController0.create(umsRole0);
      assertEquals(200L, commonResult0.getCode());
  }
  @Test(timeout = 4000)
  public void test_updateStatus_11()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(102).when(umsRoleService0).update(nullable(java.lang.Long.class) , nullable(com.macro.mall.model.UmsRole.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Integer integer0 = new Integer((-1));
      CommonResult commonResult0 = umsRoleController0.updateStatus((Long) null, integer0);
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }
  @Test(timeout = 4000)
  public void test_updateStatus_12()  throws Throwable  {
      UmsRoleController umsRoleController0 = new UmsRoleController();

      //prepare data for umsRoleService0
      UmsRoleService umsRoleService0 = mock(UmsRoleService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(umsRoleService0).update(nullable(java.lang.Long.class) , nullable(com.macro.mall.model.UmsRole.class));

      //invoke method for umsRoleController0
      PrivateAccess.setVariable((Class<?>) UmsRoleController.class, umsRoleController0, "roleService", (Object) umsRoleService0);
      Integer integer0 = Integer.getInteger("1.0", 0);
      CommonResult commonResult0 = umsRoleController0.updateStatus((Long) null, integer0);
      assertEquals(500L, commonResult0.getCode());
  }}
