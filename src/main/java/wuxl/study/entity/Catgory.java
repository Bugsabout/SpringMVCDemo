package wuxl.study.entity;

import org.springframework.stereotype.Component;

/**
 * @program: SpringMVCDemo
 * @author: 吴小龙
 * @create: 2020-06-12 16:03
 * @description:
 */
// 想要在spring配置文件加载的时候自动注入这个类，就需要@Component
@Component
public class Catgory {
    private int id;
    private String name="category1";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
