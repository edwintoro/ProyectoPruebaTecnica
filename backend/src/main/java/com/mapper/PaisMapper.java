package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.modelo.Pais;


@Mapper
public interface PaisMapper {
    @Select("SELECT * FROM  pais;")
    Pais find();
}