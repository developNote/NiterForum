package cc.ikevin.community.mapper;

import cc.ikevin.community.dto.QuestionQueryDTO;
import cc.ikevin.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

    List<Question> selectTop();


    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}