package com.inti.model;

import java.time.LocalDate;
import java.util.List;

public class Vol {
	private LocalDate dateDepart;
	private int heureDepart;
	private LocalDate dateArrivee;
	private int heureArrivee;
	private CompagnieAerienne compagnie;
	private Aeoroport aeoroportDepart;
	private Aeoroport aeoroportArrivee;
	private List<InfosEscale> listEscales;
}
