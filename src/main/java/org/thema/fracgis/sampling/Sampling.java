/*
 * Copyright (C) 2016 Laboratoire ThéMA - UMR 6049 - CNRS / Université de Franche-Comté
 * http://thema.univ-fcomte.fr
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.thema.fracgis.sampling;

import java.util.SortedSet;
import org.thema.fracgis.estimation.EstimationFactory;

/**
 * Interface for implementing a scale sampling.
 * The scale sampling is used by all fractal method for setting the computed scales (ie. box size or distance).
 * 
 * @author Gilles Vuidel
 */
public interface Sampling {
    /**
     * Type of sequence : arithmetic (additive) or geometric (multiplicative)
     */
    enum Sequence { ARITH, GEOM }
    
    /**
     * @return the set of scales (sizes)
     */
    SortedSet<Double> getValues();
    /**
     * @return the default estimation type
     */
    EstimationFactory.Type getDefaultEstimType();
    
    /**
     * @return the type of sequence
     */
    Sequence getSeq();
}
