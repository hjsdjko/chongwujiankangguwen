package com.entity.model;

import com.entity.JiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康知识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 顾问
     */
    private Integer guwenId;


    /**
     * 健康知识名称
     */
    private String jiankangName;


    /**
     * 健康知识编号
     */
    private String jiankangUuidNumber;


    /**
     * 健康知识照片
     */
    private String jiankangPhoto;


    /**
     * 健康知识类型
     */
    private Integer jiankangTypes;


    /**
     * 健康知识视频
     */
    private String jiankangVideo;


    /**
     * 健康知识文件
     */
    private String jiankangFile;


    /**
     * 健康知识介绍
     */
    private String jiankangContent;


    /**
     * 逻辑删除
     */
    private Integer jiankangDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
