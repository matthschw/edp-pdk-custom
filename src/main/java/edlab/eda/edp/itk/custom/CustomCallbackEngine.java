package edlab.eda.edp.itk.custom;

import edlab.eda.edp.itk.device.CallbackEngine;
import edlab.eda.edp.itk.device.Device;

public class CustomCallbackEngine implements CallbackEngine {

  @Override
  public boolean canHandleCallback(String triggeredParameter) {
    // TODO
    return false;
  }

  @Override
  public CallbackEngine handleCallback(Device device,
      String triggeredParameter) {
    // TODO
    return null;
  }
}