package ac.cn.spring.mapper;

import ac.cn.spring.entity.persons;

public interface personsMapper {
    int insert(persons record);

    int insertSelective(persons record);
}