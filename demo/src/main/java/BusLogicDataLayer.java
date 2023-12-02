public class BusLogicDataLayer {
  /**
   * InnerBusLogicDataLayer
   */

  private IDataService dataService;

  public BusLogicDataLayer(IDataService dataServiceInput) {
    this.dataService = dataServiceInput;
  }

  public int largestNumber() {
    int lNum = Integer.MIN_VALUE;
    int[] data = dataService.fetchNumbers();
    if (data != null && data.length > 0) {

      for (int i = 0; i < data.length; i++) {
        if (data[i] > lNum) {
          lNum = data[i];
        }
      }
    }
    return lNum;

  }
}
