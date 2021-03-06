package com.shanxiut.scs.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shanxiut.scs.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author LiHaitao
 * @description Role:
 * @date 2019/3/7 16:50
 **/
@Data
@Entity
@Table(name = "scs_auth_role")
@AllArgsConstructor
@JsonIgnoreProperties( value={"hibernateLazyInitializer","handler"})//jackson把懒加载也作为pojo进行序列化了
public class Role extends SuperEntity<Role> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String role;

    private String description;


    @ManyToMany(targetEntity = Resource.class, fetch = FetchType.EAGER)
    @JoinTable(name = "scs_auth_role_resource",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "resource_id", referencedColumnName = "id")})
    private Set<Resource> resources;


    private Boolean available;
    public Role(){

    }
}
