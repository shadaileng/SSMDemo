package com.qpf.orm;

import com.qpf.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
public interface UserMapper {
    @Insert("insert into user(name, age, gender) values(#{name}, #{age}, #{gender})")
    public int insertUser(User user);
    @Delete("delete from user where id = #{id}")
    public int deleteUser(User user);
    @Update("update user set name = #{name}, age = #{age}, gender = #{gender} where id = #{id}")
    public int updateUser(User user);
    @Select("select * from user where id = #{id}")
    public User selectUserById(int id);
    @Select("select * from user")
    public List<User> selectAllUser();
}
