/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thema.fracgis.estimation;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.TreeMap;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.jfree.data.xy.XYSeries;
import org.thema.fracgis.estimation.EstimationFactory.Type;
import org.thema.fracgis.method.MonoMethod;

/**
 *
 * @author gvuidel
 */
public interface Estimation {

    public Type getType();
    public double getEstimValue(double x);
    public TreeMap<Double, Double> getCurve();
    public double getDimension();
    public double getR2();
    public XYPlot getPlot();
    public void setRange(double xmin, double xmax);
    public Range getRange();
    public XYSeries getScalingBehaviour();
    public double[][] getSmoothedScalingBehaviour(double bandwidth);
    public List<Integer> getInflexPointIndices(double bandwidth, int minInd);
    public String getResultInfo();
    public String getParamInfo();
    public double[] getCoef();
    public double[] getBootStrapConfidenceInterval();
    
    public List getModels();
    public Object getModel();
    public void setModel(int indModel);
    public MonoMethod getMethod();
    
    public void saveToText(Writer w) throws IOException;
}
