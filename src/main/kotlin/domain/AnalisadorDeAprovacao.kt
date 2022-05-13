package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

	private lateinit var criterioDeAprovacao: CriterioDeAprovacao

	fun defineCriterio(criterio: CriterioDeAprovacao){
		criterioDeAprovacao = criterio
	}

	fun fechaBoletim(boletim: Boletim): BoletimFechado{

		return BoletimFechado(boletim.mediaEPs,
			boletim.mediaMiniEPs,
			criterioDeAprovacao.mediaFinal(boletim),
			criterioDeAprovacao.estaAprovado(boletim))
	}
}
