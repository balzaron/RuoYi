package com.ruoyi.ach.mapper;

import com.ruoyi.ach.domain.Installment;
import java.util.List;	

/**
 * 分期 数据层
 * 
 * @author shanyue.gao
 * @date 2019-02-10
 */
public interface InstallmentMapper 
{
	/**
     * 查询分期信息
     * 
     * @param id 分期ID
     * @return 分期信息
     */
	public Installment selectInstallmentById(Integer id);
	
	/**
     * 查询分期列表
     * 
     * @param installment 分期信息
     * @return 分期集合
     */
	public List<Installment> selectInstallmentList(Installment installment);
	
	/**
     * 新增分期
     * 
     * @param installment 分期信息
     * @return 结果
     */
	public int insertInstallment(Installment installment);
	
	/**
     * 修改分期
     * 
     * @param installment 分期信息
     * @return 结果
     */
	public int updateInstallment(Installment installment);
	
	/**
     * 删除分期
     * 
     * @param id 分期ID
     * @return 结果
     */
	public int deleteInstallmentById(Integer id);
	
	/**
     * 批量删除分期
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteInstallmentByIds(String[] ids);
	
}