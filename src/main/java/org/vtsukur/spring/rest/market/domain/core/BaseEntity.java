package org.vtsukur.spring.rest.market.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.hateoas.Identifiable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author volodymyr.tsukur
 */
@MappedSuperclass
@Getter
@ToString
@EqualsAndHashCode
public abstract class BaseEntity implements Identifiable<Long> {

    @Id
    @GeneratedValue
    private Long id;

}
