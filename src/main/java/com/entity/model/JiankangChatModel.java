package com.entity.model;

import com.entity.JiankangChatEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户咨询
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangChatModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 提问人
     */
    private Integer yonghuId;


    /**
     * 回答人
     */
    private Integer guwenId;


    /**
     * 问题
     */
    private String jiankangChatIssueText;


    /**
     * 问题图片
     */
    private String jiankangChatIssuePhoto;


    /**
     * 问题时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date issueTime;


    /**
     * 回复
     */
    private String jiankangChatReplyText;


    /**
     * 回复图片
     */
    private String jiankangChatReplyPhoto;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date replyTime;


    /**
     * 状态
     */
    private Integer zhuangtaiTypes;


    /**
     * 数据类型
     */
    private Integer jiankangChatTypes;


    /**
     * 提问时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：提问人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：提问人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：回答人
	 */
    public Integer getGuwenId() {
        return guwenId;
    }


    /**
	 * 设置：回答人
	 */
    public void setGuwenId(Integer guwenId) {
        this.guwenId = guwenId;
    }
    /**
	 * 获取：问题
	 */
    public String getJiankangChatIssueText() {
        return jiankangChatIssueText;
    }


    /**
	 * 设置：问题
	 */
    public void setJiankangChatIssueText(String jiankangChatIssueText) {
        this.jiankangChatIssueText = jiankangChatIssueText;
    }
    /**
	 * 获取：问题图片
	 */
    public String getJiankangChatIssuePhoto() {
        return jiankangChatIssuePhoto;
    }


    /**
	 * 设置：问题图片
	 */
    public void setJiankangChatIssuePhoto(String jiankangChatIssuePhoto) {
        this.jiankangChatIssuePhoto = jiankangChatIssuePhoto;
    }
    /**
	 * 获取：问题时间
	 */
    public Date getIssueTime() {
        return issueTime;
    }


    /**
	 * 设置：问题时间
	 */
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
    /**
	 * 获取：回复
	 */
    public String getJiankangChatReplyText() {
        return jiankangChatReplyText;
    }


    /**
	 * 设置：回复
	 */
    public void setJiankangChatReplyText(String jiankangChatReplyText) {
        this.jiankangChatReplyText = jiankangChatReplyText;
    }
    /**
	 * 获取：回复图片
	 */
    public String getJiankangChatReplyPhoto() {
        return jiankangChatReplyPhoto;
    }


    /**
	 * 设置：回复图片
	 */
    public void setJiankangChatReplyPhoto(String jiankangChatReplyPhoto) {
        this.jiankangChatReplyPhoto = jiankangChatReplyPhoto;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getReplyTime() {
        return replyTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
    /**
	 * 获取：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：数据类型
	 */
    public Integer getJiankangChatTypes() {
        return jiankangChatTypes;
    }


    /**
	 * 设置：数据类型
	 */
    public void setJiankangChatTypes(Integer jiankangChatTypes) {
        this.jiankangChatTypes = jiankangChatTypes;
    }
    /**
	 * 获取：提问时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：提问时间
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

    }
