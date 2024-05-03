package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 健康知识
 *
 * @author 
 * @email
 */
@TableName("jiankang")
public class JiankangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangEntity() {

	}

	public JiankangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 顾问
     */
    @ColumnInfo(comment="顾问",type="int(11)")
    @TableField(value = "guwen_id")

    private Integer guwenId;


    /**
     * 健康知识名称
     */
    @ColumnInfo(comment="健康知识名称",type="varchar(200)")
    @TableField(value = "jiankang_name")

    private String jiankangName;


    /**
     * 健康知识编号
     */
    @ColumnInfo(comment="健康知识编号",type="varchar(200)")
    @TableField(value = "jiankang_uuid_number")

    private String jiankangUuidNumber;


    /**
     * 健康知识照片
     */
    @ColumnInfo(comment="健康知识照片",type="varchar(200)")
    @TableField(value = "jiankang_photo")

    private String jiankangPhoto;


    /**
     * 健康知识类型
     */
    @ColumnInfo(comment="健康知识类型",type="int(11)")
    @TableField(value = "jiankang_types")

    private Integer jiankangTypes;


    /**
     * 健康知识视频
     */
    @ColumnInfo(comment="健康知识视频",type="varchar(200)")
    @TableField(value = "jiankang_video")

    private String jiankangVideo;


    /**
     * 健康知识文件
     */
    @ColumnInfo(comment="健康知识文件",type="varchar(200)")
    @TableField(value = "jiankang_file")

    private String jiankangFile;


    /**
     * 健康知识介绍
     */
    @ColumnInfo(comment="健康知识介绍",type="longtext")
    @TableField(value = "jiankang_content")

    private String jiankangContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jiankang_delete")

    private Integer jiankangDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：顾问
	 */
    public Integer getGuwenId() {
        return guwenId;
    }
    /**
	 * 设置：顾问
	 */

    public void setGuwenId(Integer guwenId) {
        this.guwenId = guwenId;
    }
    /**
	 * 获取：健康知识名称
	 */
    public String getJiankangName() {
        return jiankangName;
    }
    /**
	 * 设置：健康知识名称
	 */

    public void setJiankangName(String jiankangName) {
        this.jiankangName = jiankangName;
    }
    /**
	 * 获取：健康知识编号
	 */
    public String getJiankangUuidNumber() {
        return jiankangUuidNumber;
    }
    /**
	 * 设置：健康知识编号
	 */

    public void setJiankangUuidNumber(String jiankangUuidNumber) {
        this.jiankangUuidNumber = jiankangUuidNumber;
    }
    /**
	 * 获取：健康知识照片
	 */
    public String getJiankangPhoto() {
        return jiankangPhoto;
    }
    /**
	 * 设置：健康知识照片
	 */

    public void setJiankangPhoto(String jiankangPhoto) {
        this.jiankangPhoto = jiankangPhoto;
    }
    /**
	 * 获取：健康知识类型
	 */
    public Integer getJiankangTypes() {
        return jiankangTypes;
    }
    /**
	 * 设置：健康知识类型
	 */

    public void setJiankangTypes(Integer jiankangTypes) {
        this.jiankangTypes = jiankangTypes;
    }
    /**
	 * 获取：健康知识视频
	 */
    public String getJiankangVideo() {
        return jiankangVideo;
    }
    /**
	 * 设置：健康知识视频
	 */

    public void setJiankangVideo(String jiankangVideo) {
        this.jiankangVideo = jiankangVideo;
    }
    /**
	 * 获取：健康知识文件
	 */
    public String getJiankangFile() {
        return jiankangFile;
    }
    /**
	 * 设置：健康知识文件
	 */

    public void setJiankangFile(String jiankangFile) {
        this.jiankangFile = jiankangFile;
    }
    /**
	 * 获取：健康知识介绍
	 */
    public String getJiankangContent() {
        return jiankangContent;
    }
    /**
	 * 设置：健康知识介绍
	 */

    public void setJiankangContent(String jiankangContent) {
        this.jiankangContent = jiankangContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiankangDelete() {
        return jiankangDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJiankangDelete(Integer jiankangDelete) {
        this.jiankangDelete = jiankangDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiankang{" +
            ", id=" + id +
            ", guwenId=" + guwenId +
            ", jiankangName=" + jiankangName +
            ", jiankangUuidNumber=" + jiankangUuidNumber +
            ", jiankangPhoto=" + jiankangPhoto +
            ", jiankangTypes=" + jiankangTypes +
            ", jiankangVideo=" + jiankangVideo +
            ", jiankangFile=" + jiankangFile +
            ", jiankangContent=" + jiankangContent +
            ", jiankangDelete=" + jiankangDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
