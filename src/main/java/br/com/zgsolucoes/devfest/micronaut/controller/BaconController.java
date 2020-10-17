package br.com.zgsolucoes.devfest.micronaut.controller;

import br.com.zgsolucoes.devfest.micronaut.domain.Bacon;
import br.com.zgsolucoes.devfest.micronaut.repository.BaconRepository;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import java.util.List;

@Controller("/bacon")
public class BaconController {

	@Inject
	private BaconRepository baconRepository;

	@Get("/list")
	@Produces(MediaType.APPLICATION_JSON)
	List<Bacon> list() {
		return baconRepository.findAll();
	}
}
