package com.jobmarket.jobmarketapp.entities.jobpost;

import com.swiftselect.domain.entities.base.Base;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "qualification")
public class Qualification extends Base {
    private String qualificationDetails;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "jobPost_id")
    private JobPost jobPost;
}
