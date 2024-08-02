package com.itheima.reggie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 地址管理 Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2022-05-30
 */

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
