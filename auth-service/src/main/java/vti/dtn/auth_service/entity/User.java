package vti.dtn.auth_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vti.dtn.auth_service.oauth2.provider.AuthProvider;

import java.util.Collection;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", length = 10, nullable = true)
    private String username;

    @Column(name = "firstname", length = 50, nullable = true)
    private String firstName;

    @Column(name = "lastname", length = 50, nullable = true)
    private String lastName;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "password", length = 150, nullable = true)
    private String password;

    @Column(name = "access_token", length = 150, nullable = true)
    private String accessToken;

    @Column(name = "refresh_token", length = 150, nullable = true)
    private String refreshToken;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "provider", columnDefinition = "ENUM('local', 'facebook', 'google', 'github') DEFAULT 'local'")
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    @Column(name = "provider_id", length = 100, nullable = true)
    private String providerId;

    @Column(name = "image_url", length = 200, nullable = true)
    private String imageUrl;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }
}
