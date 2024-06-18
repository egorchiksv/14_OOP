package Task1;

import java.util.Collections;
import java.util.List;

public class FlytService {
    public void sortStream(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }

}
