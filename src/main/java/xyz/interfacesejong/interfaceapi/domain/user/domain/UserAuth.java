package xyz.interfacesejong.interfaceapi.domain.user.domain;

import javax.persistence.*;

@Entity
public class UserAuth {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}
