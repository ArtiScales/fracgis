/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thema.fracgis.method.vector;

import com.vividsolutions.jts.geom.Envelope;
import org.thema.common.param.XMLParams;
import org.thema.drawshape.feature.Feature;
import org.thema.drawshape.feature.FeatureCoverage;
import org.thema.fracgis.method.Method;

/**
 *
 * @author gvuidel
 */
public abstract class VectorMethod extends Method {
    @XMLParams.NoParam
    protected FeatureCoverage<Feature> coverage;
    
    public VectorMethod() {
        super("");
    }
    
    public VectorMethod(String inputName, FeatureCoverage coverage) {
        super(inputName);
        this.coverage = coverage;
    }

    @Override
    public Envelope getDataEnvelope() {
        return coverage.getEnvelope();
    }
    
    public void setInputData(String inputName, FeatureCoverage coverage) {
        this.inputName = inputName;
        this.coverage = coverage;
        
        updateParams();
    }
    
    protected abstract void updateParams();
    
}