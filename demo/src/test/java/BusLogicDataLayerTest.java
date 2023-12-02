import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BusLogicDataLayerTest {
  @Mock
  private IDataService dataServiceMock;

  @InjectMocks
  private BusLogicDataLayer dataImpl;

  @Test
  void testLargestNumber() {
    when(dataServiceMock.fetchNumbers()).thenReturn(new int[]{50,25,5,0});
    assertEquals(50, dataImpl.largestNumber());
  }

  @Test
  void testEmptyInput() {
    when(dataServiceMock.fetchNumbers()).thenReturn(new int[]{});
    assertEquals(Integer.MIN_VALUE, dataImpl.largestNumber());
  }

  @Test
  void testNullInput() {
    when(dataServiceMock.fetchNumbers()).thenReturn(null);
    assertEquals(Integer.MIN_VALUE, dataImpl.largestNumber());
  }

}
