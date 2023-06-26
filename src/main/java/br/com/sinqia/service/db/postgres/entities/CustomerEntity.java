package br.com.sinqia.service.db.postgres.entities;

import br.com.sinqia.service.db.models.CustomerDbModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Entity
@Audited
@Table(name = "customers")
@EntityListeners(AuditingEntityListener.class)
public class CustomerEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    @Column(name = "code", nullable = false)
    private String code;
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;
    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @NotBlank
    @Column(name = "document", nullable = false)
    private String document;
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @CreatedBy
    @Column(name = "created_by", nullable = false)
    private String createdBy = "system";
    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    @LastModifiedBy
    @Column(name = "updated_by", nullable = false)
    private String updatedBy = "system";

    public CustomerDbModel toModel() {
        CustomerDbModel model = new CustomerDbModel();
        model.setCode(code);
        model.setName(name);
        model.setLastName(lastName);
        model.setDocument(document);
        model.setCreatedAt(createdAt);
        model.setCreatedBy(createdBy);
        model.setUpdatedAt(updatedAt);
        model.setUpdatedBy(updatedBy);
        return model;
    }
}
