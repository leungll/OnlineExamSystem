package com.nenusoftware.onlineexam.mapper.score;

import com.nenusoftware.onlineexam.entity.score.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:Liangll
 * @Description: ScoreMapper的接口层
 * @Date: 22:08 2019/5/6
 */
@Mapper
@Repository
public interface ScoreMapper {

    /**
     * 增加成绩信息
     * @param score 成绩信息实体
     * @return 增加成功返回true，增加失败返回false
     * @throws Exception
     */
    public boolean addScore(@Param("score") Score score) throws Exception;

    /**
     * 删除成绩
     * @param scoreId 成绩编号
     * @return 删除成功返回true，删除失败返回false
     * @throws Exception
     */
    public boolean deleteScore(@Param("scoreId") int scoreId) throws Exception;

    /**
     * 根据用户编号列出该用户对应的成绩
     * @param userId 用户编号
     * @return 返回List形式的成绩信息
     * @throws Exception
     */
    public List<Score> queryScoreByUser(@Param("userId") int userId) throws Exception;

    /**
     * 根据试卷编号列出所有学生做该试卷的成绩
     * @param paperId 试卷编号
     * @return 返回List形式的成绩信息
     * @throws Exception
     */
    public List<Score> queryScoreByPaper(@Param("paperId") int paperId) throws Exception;

}
