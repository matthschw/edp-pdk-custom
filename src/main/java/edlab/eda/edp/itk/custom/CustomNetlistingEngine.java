package edlab.eda.edp.itk.custom;

import edlab.eda.edp.itk.nl.Formatter;
import edlab.eda.edp.itk.nl.InstanceNetlistingHandle;
import edlab.eda.edp.itk.nl.NetlistingEngine;

public class CustomNetlistingEngine extends NetlistingEngine {

  public CustomNetlistingEngine(final Formatter formatter) {
    super(formatter);
  }

  @Override
  public boolean isDescribed(final InstanceNetlistingHandle handle) {
    // TODO
    return false;
  }

  @Override
  public void netlist(final InstanceNetlistingHandle handle) {
    // TODO
  }
}