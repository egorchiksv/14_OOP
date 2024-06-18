package Task1;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.studentGroups.size(), o2.studentGroups.size());
    }
}
