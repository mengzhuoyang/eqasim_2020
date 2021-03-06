package org.eqasim.sao_paulo.mode_choice.utilities.predictors;

import java.util.List;

import org.eqasim.core.simulation.mode_choice.utilities.predictors.CachedVariablePredictor;
import org.eqasim.sao_paulo.mode_choice.utilities.variables.SaoPauloPersonVariables;
import org.matsim.api.core.v01.population.Person;
import org.matsim.api.core.v01.population.PlanElement;

import ch.ethz.matsim.discrete_mode_choice.model.DiscreteModeChoiceTrip;

public class SaoPauloPersonPredictor extends CachedVariablePredictor<SaoPauloPersonVariables> {
	@Override
	protected SaoPauloPersonVariables predict(Person person, DiscreteModeChoiceTrip trip,
			List<? extends PlanElement> elements) {
		boolean hasSubscription = SaoPauloPredictorUtils.hasSubscription(person);
		return new SaoPauloPersonVariables(hasSubscription);
	}
}
