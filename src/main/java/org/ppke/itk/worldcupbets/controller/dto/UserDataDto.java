package org.ppke.itk.worldcupbets.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ppke.itk.worldcupbets.repository.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class UserDataDto {

    private String username;

    private Set<Role> roles;

    public UserDataDto(UserDetails userDetails) {
        this.username = userDetails.getUsername();
        this.roles = userDetails.getAuthorities().stream()
                .map( GrantedAuthority::getAuthority )
                .map( Role::valueOf )
                .collect( Collectors.toSet() );
    }
}
