//package com.infoxit.firstProject.model;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomUserDetail extends User implements UserDetails{
//		public CustomUserDetail(User user) {
//			super(user);
//		}
//	@Override
//	public Collection<? extends GrantedAuthority>getAuthorities(){
//		List<GrantedAuthority>authoritiesList=new ArrayList<>();
//		super.getRoles().forEach(role->{
//			authoritiesList.add(new SimpleGrantedAuthority(role.getName()));
//			
//		});
//		return authoritiesList;
//	}
//	@Override
//	public String getUsername() {
//		return super.getEmail();
//	}
//	@Override
//	public String getPassword() {
//		return super.getPassword();
//	}
//	@Override
//	public boolean isAccountNonExpired() {
//		return false;
//	}
//	@Override
//	public boolean isAccountNonLocked() {
//		return false;
//	}
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return false;
//	}
//	@Override
//	public boolean isEnabled() {
//		return false;
//	}
//}
