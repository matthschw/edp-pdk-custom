package edlab.eda.edp.itk.custom;

import edlab.eda.edp.itk.device.CallbackEngine;
import edlab.eda.edp.itk.nl.Formatter;
import edlab.eda.edp.itk.nl.NetlistingEngine;
import edlab.eda.edp.itk.technology.TechnologyIntegration;

public class CustomTechnologyIntegration extends TechnologyIntegration {

  @Override
  public boolean hasNetlistingEngine(final String simulator) {
    // TODO
    return false;
  }

  public NetlistingEngine getNetlistingEngine(final String simulator,
      final Formatter formatter) {
    // TODO
    return null;
  }

  @Override
  public boolean hasCallbackEngine(final String libName,
      final String cellName) {
    // TODO
    return false;
  }

  @Override
  public CallbackEngine getCallbackEngine(final String libName,
      final String cellName) {
    // TODO
    return null;
  }
}