package com.ruoyi.ach.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ach.mapper.InstallmentMapper;
import com.ruoyi.ach.domain.Installment;
import com.ruoyi.ach.service.IInstallmentService;
import com.ruoyi.common.support.Convert;

/**
 * 分期 服务层实现
 * 
 * @author shanyue.gao
 * @date 2019-02-10
 */
@Service
public class InstallmentServiceImpl implements IInstallmentService 
{
	@Autowired
	private InstallmentMapper installmentMapper;

	/**
     * 查询分期信息
     * 
     * @param id 分期ID
     * @return 分期信息
     */
    @Override
	public Installment selectInstallmentById(Integer id)
	{
	    return installmentMapper.selectInstallmentById(id);
	}
	
	/**
     * 查询分期列表
     * 
     * @param installment 分期信息
     * @return 分期集合
     */
	@Override
	public List<Installment> selectInstallmentList(Installment installment)
	{
	    return installmentMapper.selectInstallmentList(installment);
	}
	
    /**
     * 新增分期
     * 
     * @param installment 分期信息
     * @return 结果
     */
	@Override
	public int insertInstallment(Installment installment)
	{
	    return installmentMapper.insertInstallment(installment);
	}
	
	/**
     * 修改分期
     * 
     * @param installment 分期信息
     * @return 结果
     */
	@Override
	public int updateInstallment(Installment installment)
	{
	    return installmentMapper.updateInstallment(installment);
	}

	/**
     * 删除分期对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteInstallmentByIds(String ids)
	{
		return installmentMapper.deleteInstallmentByIds(Convert.toStrArray(ids));
	}
	
}
