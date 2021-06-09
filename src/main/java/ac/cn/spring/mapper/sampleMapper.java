package ac.cn.spring.mapper;

import ac.cn.spring.entity.sample;

public interface sampleMapper {
    int insert(sample record);

    int insertSelective(sample record);

    sample selectByPrimaryKey(Integer sampleId);

    int updateByPrimaryKeySelective(sample record);

    int updateByPrimaryKey(sample record);
}