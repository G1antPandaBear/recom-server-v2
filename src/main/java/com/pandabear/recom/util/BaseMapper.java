package com.pandabear.recom.util;

/**
 * BaseMapper 인터페이스는 모든 Mapper들의 최상위 인터페이스입니다.
 * Mapper 클래스는 Model에서 Entity로, Entity에서 Model로 변환하는
 * 클래스입니다.
 * @param <M> Model 클래스 타입
 * @param <E> Entity 클레스 타입
 */
public interface BaseMapper<M, E> {

    M toModel(E entity);

    E toEntity(M model);

}
