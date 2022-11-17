package org.ppke.itk.worldcupbets.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.worldcupbets.domain.User;
import org.ppke.itk.worldcupbets.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //todo get User data from database
//        User user = userRepository.findByUsername( username )
//                .orElseThrow(() -> new UsernameNotFoundException( String.format("AUTH_ERROR: user with name '%s' not found", username) ));
//      return org.springframework.security.core.userdetails.User.builder()
//                .username(username)
//                .password(user.getPassword())
//                .authorities(
//                        user.getRoles()
//                                .stream()
//                                .map( Role::name )
//                                .map( SimpleGrantedAuthority::new )
//                                .collect( Collectors.toSet() )
//                )
//                .build();
        return org.springframework.security.core.userdetails.User.builder()
                .username(username)
                .password("admin")
                .authorities("ADMIN", "USER")
                .build();
    }
}
