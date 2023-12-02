public class BusinessLogic {
  public int sumOfNumbers(int[] numbers) {
    int result = 0;
    if (numbers != null) {
      for (int i : numbers) {
        result = result + i;
      }
    }

    return result;
  }
}
