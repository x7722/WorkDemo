package com.xuxu.pojo;




import javax.persistence.*;
import java.io.Serializable;

/*****
 *  @author Monster Xu
 *  用户实体类
 *****/
@Entity // 该注解声明一个实体类，与数据库中的表对应
@Table(name = "tb_user")
public class User  implements Serializable {

    @Id   // 表明id
    @GeneratedValue(strategy = GenerationType.AUTO)   //  自动生成
    private Long id;

    private String username;

    private String password;


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
