package com.ruoyi.ach.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ach.domain.Installment;
import com.ruoyi.ach.service.IInstallmentService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 分期 信息操作处理
 * 
 * @author shanyue.gao
 * @date 2019-02-10
 */
@Controller
@RequestMapping("/ach/installment")
public class InstallmentController extends BaseController
{
    private String prefix = "ach/installment";
	
	@Autowired
	private IInstallmentService installmentService;
	
	@RequiresPermissions("ach:installment:view")
	@GetMapping()
	public String installment()
	{
	    return prefix + "/installment";
	}
	
	/**
	 * 查询分期列表
	 */
	@RequiresPermissions("ach:installment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Installment installment)
	{
		startPage();
        List<Installment> list = installmentService.selectInstallmentList(installment);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出分期列表
	 */
	@RequiresPermissions("ach:installment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Installment installment)
    {
    	List<Installment> list = installmentService.selectInstallmentList(installment);
        ExcelUtil<Installment> util = new ExcelUtil<Installment>(Installment.class);
        return util.exportExcel(list, "installment");
    }
	
	/**
	 * 新增分期
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存分期
	 */
	@RequiresPermissions("ach:installment:add")
	@Log(title = "分期", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Installment installment)
	{		
		return toAjax(installmentService.insertInstallment(installment));
	}

	/**
	 * 修改分期
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Installment installment = installmentService.selectInstallmentById(id);
		mmap.put("installment", installment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存分期
	 */
	@RequiresPermissions("ach:installment:edit")
	@Log(title = "分期", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Installment installment)
	{		
		return toAjax(installmentService.updateInstallment(installment));
	}
	
	/**
	 * 删除分期
	 */
	@RequiresPermissions("ach:installment:remove")
	@Log(title = "分期", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(installmentService.deleteInstallmentByIds(ids));
	}
	
}
