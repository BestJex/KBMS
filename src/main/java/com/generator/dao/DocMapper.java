package com.generator.dao;

import com.generator.pojo.Doc;

public interface DocMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int insert(Doc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int insertSelective(Doc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    Doc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Doc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Doc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Doc record);
}