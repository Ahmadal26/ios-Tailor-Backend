package tailorApp1.tailorApp1.service.auth;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import tailorApp1.tailorApp1.bo.CustomUserDetails;

public class UserDetailUtil {
    public static CustomUserDetails userDetails(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (CustomUserDetails) authentication.getPrincipal();
    }
}