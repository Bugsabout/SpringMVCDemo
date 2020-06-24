package wuxl.study.dao;

import java.util.List;
import wuxl.study.entity.Category;
import wuxl.study.entity.CategoryExample;

public interface CategoryMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Category record);


    int insertSelective(Category record);


    List<Category> selectByExample(CategoryExample example);


    Category selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Category record);


    int updateByPrimaryKey(Category record);
}