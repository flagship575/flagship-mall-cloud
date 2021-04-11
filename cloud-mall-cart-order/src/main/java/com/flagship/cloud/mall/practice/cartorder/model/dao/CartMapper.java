package com.flagship.cloud.mall.practice.cartorder.model.dao;

import com.flagship.cloud.mall.practice.cartorder.model.pojo.Cart;
import com.flagship.cloud.mall.practice.cartorder.model.vo.CartVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdAndProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    List<CartVO> selectList(@Param("userId") Integer userId);

    int selectedAllCartByUserId(@Param("userId") Integer userId, @Param("selected") Integer selected);
}