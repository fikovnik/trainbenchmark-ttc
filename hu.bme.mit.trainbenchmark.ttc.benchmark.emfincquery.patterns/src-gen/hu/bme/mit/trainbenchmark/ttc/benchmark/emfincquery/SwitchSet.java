package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery;

import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.SwitchSetMatcher;
import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.util.SwitchSetQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in SwitchSet.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file SwitchSet.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery, the group contains the definition of the following patterns: <ul>
 * <li>switchSet</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class SwitchSet extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SwitchSet instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new SwitchSet();
    }
    return INSTANCE;
  }
  
  private static SwitchSet INSTANCE;
  
  private SwitchSet() throws IncQueryException {
    querySpecifications.add(SwitchSetQuerySpecification.instance());
  }
  
  public SwitchSetQuerySpecification getSwitchSet() throws IncQueryException {
    return SwitchSetQuerySpecification.instance();
  }
  
  public SwitchSetMatcher getSwitchSet(final IncQueryEngine engine) throws IncQueryException {
    return SwitchSetMatcher.on(engine);
  }
}
