package com.entity.vo;

import com.entity.YujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 预检
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 20:06:33
 */
public class YujianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 是否发热
	 */
	
	private String shifoufare;
		
	/**
	 * 是否新冠肺炎
	 */
	
	private String shifouxinguanfeiyan;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：是否发热
	 */
	 
	public void setShifoufare(String shifoufare) {
		this.shifoufare = shifoufare;
	}
	
	/**
	 * 获取：是否发热
	 */
	public String getShifoufare() {
		return shifoufare;
	}
				
	
	/**
	 * 设置：是否新冠肺炎
	 */
	 
	public void setShifouxinguanfeiyan(String shifouxinguanfeiyan) {
		this.shifouxinguanfeiyan = shifouxinguanfeiyan;
	}
	
	/**
	 * 获取：是否新冠肺炎
	 */
	public String getShifouxinguanfeiyan() {
		return shifouxinguanfeiyan;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
			
}