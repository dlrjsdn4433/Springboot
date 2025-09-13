package com.toiletissue.config;

import com.toiletissue.common.MemberRole;
//import com.toiletissue.config.handler.AuthFailHandler;
import com.sun.source.tree.ReturnTree;
import com.toiletissue.manager.model.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {


//    @Autowired
//    private AuthFailHandler authFailHandler;

    @Autowired
    private ManagerService managerService;

//    @Autowired
//    private PasswordEncoderConfig passwordEncoderConfig;

    public SecurityConfig( ManagerService managerService) {
        this.managerService = managerService;
    }


   /* *//* 정적리소스에 대한 요청을 제외하겠다는 설정 static 파일 하위 *//*
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {

        return web -> web.ignoring()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }*/

//    @Bean
//    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        /* 요청에 대한 권한 체크 */
//        http.authorizeHttpRequests( auth -> {
//            auth.requestMatchers( "/member/signup", "/auth/fail", "/", "/main","/manager/*","/*/manager","/notice/manager").permitAll();
//            auth.requestMatchers("/manager/*").hasAnyAuthority(MemberRole.manager.getRole());
//            auth.requestMatchers("/member/*").hasAnyAuthority(MemberRole.member.getRole());
//            auth.anyRequest().authenticated();
//
//        }).formLogin( login -> {
//            login.loginPage("/auth/login");
//            login.usernameParameter("memberId");
//            login.passwordParameter("memberPwd");
//            login.defaultSuccessUrl("/", true);
//            login.failureHandler(authFailHandler);
//
//        }).logout( logout -> {
//            logout.logoutUrl("/auth/logout");
//            logout.deleteCookies("JSESSIONID");
//            logout.invalidateHttpSession(true);
//            logout.logoutSuccessUrl("/");
//
//        }).sessionManagement( session -> {
//            session.maximumSessions(1);
//            session.invalidSessionUrl("/");
//
//        }).csrf( csrf -> csrf.disable());
//
//        return http.build();
//    }

//    @Bean
//    public DaoAuthenticationProvider daoAuthenticationProvider(){
//        DaoAuthenticationProvider managerProvider = new DaoAuthenticationProvider();
//        managerProvider.setUserDetailsService(managerService);
//        managerProvider.setPasswordEncoder(passwordEncoderConfig.passwordEncoder());
//        return managerProvider;
//    }
//
//    @Bean
//    public SecurityFilterChain manager(HttpSecurity http) throws Exception{
//
//
//        http
//                .authorizeHttpRequests(auth -> auth
//                    .requestMatchers("manager/login","/manager/register","/manager/main","/*/manager").permitAll()
//                    .requestMatchers("/*/manager","/manager/main").hasAnyAuthority("MANAGER")
//                    .anyRequest().authenticated()
//                )
//                .formLogin(login -> login
//                        .loginPage("/manager/login")
//                        .defaultSuccessUrl("/manager/main",true)
//
//                )
//                .logout( logout -> logout
//                        .logoutUrl("/manager/logout")
//                        .logoutSuccessUrl("/manager/login")
//                        .deleteCookies("JSESSIONID")
//                        .invalidateHttpSession(true)
//                )
//                .csrf( csrf -> csrf.disable());
//
//        return http.build();
//
//    }
}

