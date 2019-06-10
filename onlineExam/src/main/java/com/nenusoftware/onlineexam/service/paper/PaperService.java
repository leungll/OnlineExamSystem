package com.nenusoftware.onlineexam.service.paper;

import com.nenusoftware.onlineexam.entity.paper.Paper;

import java.util.List;

/**
 * @Author:Liangll
 * @Description: PaperService的接口层
 * @Date: 10:52 2019/5/3
 */
public interface PaperService {

    /**
     * 列出所有试卷
     * @return 返回List形式的试卷信息
     * @throws Exception
     */
    public List<Paper> listAllPaper() throws Exception;

    /**
     * 增加试卷
     * @param paper 试卷实体
     * @return 增加成功返回true，增加失败返回false
     * @throws Exception
     */
    public boolean addPaper(Paper paper) throws Exception;

    /**
     * 删除试卷
     * @param paperId 试卷编号
     * @return 删除成功返回true，删除失败返回false
     * @throws Exception
     */
    public boolean deletePaper(int paperId) throws Exception;

    /**
     * 修改试卷
     * @param paper 试卷实体
     * @return 修改成功返回true，修改失败返回false
     * @throws Exception
     */
    public boolean updatePaper(Paper paper) throws Exception;

    /**
     * 模糊查询（查询试卷名称）
     * @param keyWord 输入查询的关键字
     * @return 返回List形式的试卷信息
     * @throws Exception
     */
    public List<Paper> queryPaperName(String keyWord) throws Exception;

    /**
     * 根据Id查询试卷名称
     * @param paperId 试卷编号
     * @return 返回Paper形式的试卷信息
     * @throws Exception
     */
    public Paper queryPaperNameById(int paperId) throws Exception;

}
