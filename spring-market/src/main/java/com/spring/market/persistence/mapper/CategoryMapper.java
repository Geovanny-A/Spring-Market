package com.spring.market.persistence.mapper;

import com.spring.market.domain.Category;
import com.spring.market.persistence.entity.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(Categoria categoria);
}
