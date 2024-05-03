package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiankangLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 健康知识评论
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jiankang_liuyan")
public class JiankangLiuyanView extends JiankangLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 健康知识
					 
		/**
		* 健康知识 的 顾问
		*/
		@ColumnInfo(comment="顾问",type="int(11)")
		private Integer jiankangGuwenId;
		/**
		* 健康知识名称
		*/

		@ColumnInfo(comment="健康知识名称",type="varchar(200)")
		private String jiankangName;
		/**
		* 健康知识编号
		*/

		@ColumnInfo(comment="健康知识编号",type="varchar(200)")
		private String jiankangUuidNumber;
		/**
		* 健康知识照片
		*/

		@ColumnInfo(comment="健康知识照片",type="varchar(200)")
		private String jiankangPhoto;
		/**
		* 健康知识类型
		*/
		@ColumnInfo(comment="健康知识类型",type="int(11)")
		private Integer jiankangTypes;
			/**
			* 健康知识类型的值
			*/
			@ColumnInfo(comment="健康知识类型的字典表值",type="varchar(200)")
			private String jiankangValue;
		/**
		* 健康知识视频
		*/

		@ColumnInfo(comment="健康知识视频",type="varchar(200)")
		private String jiankangVideo;
		/**
		* 健康知识文件
		*/

		@ColumnInfo(comment="健康知识文件",type="varchar(200)")
		private String jiankangFile;
		/**
		* 健康知识介绍
		*/

		@ColumnInfo(comment="健康知识介绍",type="longtext")
		private String jiankangContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiankangDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public JiankangLiuyanView() {

	}

	public JiankangLiuyanView(JiankangLiuyanEntity jiankangLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 健康知识
		/**
		* 获取：健康知识 的 顾问
		*/
		public Integer getJiankangGuwenId() {
			return jiankangGuwenId;
		}
		/**
		* 设置：健康知识 的 顾问
		*/
		public void setJiankangGuwenId(Integer jiankangGuwenId) {
			this.jiankangGuwenId = jiankangGuwenId;
		}

		/**
		* 获取： 健康知识名称
		*/
		public String getJiankangName() {
			return jiankangName;
		}
		/**
		* 设置： 健康知识名称
		*/
		public void setJiankangName(String jiankangName) {
			this.jiankangName = jiankangName;
		}

		/**
		* 获取： 健康知识编号
		*/
		public String getJiankangUuidNumber() {
			return jiankangUuidNumber;
		}
		/**
		* 设置： 健康知识编号
		*/
		public void setJiankangUuidNumber(String jiankangUuidNumber) {
			this.jiankangUuidNumber = jiankangUuidNumber;
		}

		/**
		* 获取： 健康知识照片
		*/
		public String getJiankangPhoto() {
			return jiankangPhoto;
		}
		/**
		* 设置： 健康知识照片
		*/
		public void setJiankangPhoto(String jiankangPhoto) {
			this.jiankangPhoto = jiankangPhoto;
		}
		/**
		* 获取： 健康知识类型
		*/
		public Integer getJiankangTypes() {
			return jiankangTypes;
		}
		/**
		* 设置： 健康知识类型
		*/
		public void setJiankangTypes(Integer jiankangTypes) {
			this.jiankangTypes = jiankangTypes;
		}


			/**
			* 获取： 健康知识类型的值
			*/
			public String getJiankangValue() {
				return jiankangValue;
			}
			/**
			* 设置： 健康知识类型的值
			*/
			public void setJiankangValue(String jiankangValue) {
				this.jiankangValue = jiankangValue;
			}

		/**
		* 获取： 健康知识视频
		*/
		public String getJiankangVideo() {
			return jiankangVideo;
		}
		/**
		* 设置： 健康知识视频
		*/
		public void setJiankangVideo(String jiankangVideo) {
			this.jiankangVideo = jiankangVideo;
		}

		/**
		* 获取： 健康知识文件
		*/
		public String getJiankangFile() {
			return jiankangFile;
		}
		/**
		* 设置： 健康知识文件
		*/
		public void setJiankangFile(String jiankangFile) {
			this.jiankangFile = jiankangFile;
		}

		/**
		* 获取： 健康知识介绍
		*/
		public String getJiankangContent() {
			return jiankangContent;
		}
		/**
		* 设置： 健康知识介绍
		*/
		public void setJiankangContent(String jiankangContent) {
			this.jiankangContent = jiankangContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiankangDelete() {
			return jiankangDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiankangDelete(Integer jiankangDelete) {
			this.jiankangDelete = jiankangDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "JiankangLiuyanView{" +
			", jiankangName=" + jiankangName +
			", jiankangUuidNumber=" + jiankangUuidNumber +
			", jiankangPhoto=" + jiankangPhoto +
			", jiankangVideo=" + jiankangVideo +
			", jiankangFile=" + jiankangFile +
			", jiankangContent=" + jiankangContent +
			", jiankangDelete=" + jiankangDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
