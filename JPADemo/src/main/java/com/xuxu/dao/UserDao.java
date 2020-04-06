package com.xuxu.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xuxu.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

/*****
 *  @author Monster Xu
 *  用户dao层
 *****/
public interface UserDao extends JpaRepository<User, Integer> {

}
