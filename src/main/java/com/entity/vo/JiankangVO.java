package com.entity.vo;

import com.entity.JiankangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康知识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiankang")
public class JiankangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 顾问
     */

    @TableField(value = "guwen_id")
    private Integer guwenId;


    /**
     * 健康知识名称
     */

    @TableField(value = "jiankang_name")
    private String jiankangName;


    /**
     * 健康知识编号
     */

    @TableField(value = "jiankang_uuid_number")
    private String jiankangUuidNumber;


    /**
     * 健康知识照片
     */

    @TableField(value = "jiankang_photo")
    private String jiankangPhoto;


    /**
     * 健康知识类型
     */

    @TableField(value = "jiankang_types")
    private Integer jiankangTypes;


    /**
     * 健康知识视频
     */

    @TableField(value = "jiankang_video")
    private String jiankangVideo;


    /**
     * 健康知识文件
     */

    @TableField(value = "jiankang_file")
    private String jiankangFile;


    /**
     * 健康知识介绍
     */

    @TableField(value = "jiankang_content")
    private String jiankangContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "jiankang_delete")
    private Integer jiankangDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：顾问
	 */
    public Integer getGuwenId() {
        return guwenId;
    }


    /**
	 * 获取：顾问
	 */

    public void setGuwenId(Integer guwenId) {
        this.guwenId = guwenId;
    }
    /**
	 * 设置：健康知识名称
	 */
    public String getJiankangName() {
        return jiankangName;
    }


    /**
	 * 获取：健康知识名称
	 */

    public void setJiankangName(String jiankangName) {
        this.jiankangName = jiankangName;
    }
    /**
	 * 设置：健康知识编号
	 */
    public String getJiankangUuidNumber() {
        return jiankangUuidNumber;
    }


    /**
	 * 获取：健康知识编号
	 */

    public void setJiankangUuidNumber(String jiankangUuidNumber) {
        this.jiankangUuidNumber = jiankangUuidNumber;
    }
    /**
	 * 设置：健康知识照片
	 */
    public String getJiankangPhoto() {
        return jiankangPhoto;
    }


    /**
	 * 获取：健康知识照片
	 */

    public void setJiankangPhoto(String jiankangPhoto) {
        this.jiankangPhoto = jiankangPhoto;
    }
    /**
	 * 设置：健康知识类型
	 */
    public Integer getJiankangTypes() {
        return jiankangTypes;
    }


    /**
	 * 获取：健康知识类型
	 */

    public void setJiankangTypes(Integer jiankangTypes) {
        this.jiankangTypes = jiankangTypes;
    }
    /**
	 * 设置：健康知识视频
	 */
    public String getJiankangVideo() {
        return jiankangVideo;
    }


    /**
	 * 获取：健康知识视频
	 */

    public void setJiankangVideo(String jiankangVideo) {
        this.jiankangVideo = jiankangVideo;
    }
    /**
	 * 设置：健康知识文件
	 */
    public String getJiankangFile() {
        return jiankangFile;
    }


    /**
	 * 获取：健康知识文件
	 */

    public void setJiankangFile(String jiankangFile) {
        this.jiankangFile = jiankangFile;
    }
    /**
	 * 设置：健康知识介绍
	 */
    public String getJiankangContent() {
        return jiankangContent;
    }


    /**
	 * 获取：健康知识介绍
	 */

    public void setJiankangContent(String jiankangContent) {
        this.jiankangContent = jiankangContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJiankangDelete() {
        return jiankangDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJiankangDelete(Integer jiankangDelete) {
        this.jiankangDelete = jiankangDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
