package wuxl.study.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wuxl.study.dao.CategoryMapper;
import wuxl.study.entity.Category;
import wuxl.study.entity.CategoryExample;
import wuxl.study.service.CategoryService;

import java.util.List;

/**
 * @author 吴小龙
 * @version V1.0
 * @Package wuxl.study.serviceImpl
 * @date 2020/6/13 12:34
 * @Description //TODO
 * @Copyright © 2020 上海安科瑞电气股份有限公司
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void getCategory() {
        List<Category> categories = categoryMapper.selectByExample(new CategoryExample());
        for (Category category:categories){
            System.out.println(category.getName());
        }
    }
}
