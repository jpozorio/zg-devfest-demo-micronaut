package br.com.zgsolucoes.devfest.micronaut.domain;

import javax.persistence.*;

@Entity
@Table
public class Bacon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String propriedade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
