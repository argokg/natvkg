package kg.finalproject.natvkg.mappers;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseMapper<E, D> {
    E toDTO(D d);
    D toEntity(E e);
    List<E> toDTO(List<D> d);
    List<D> toEntity(List<E>e);
}
