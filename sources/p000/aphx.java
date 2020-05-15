package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: aphx */
final /* synthetic */ class aphx implements Comparator {

    /* renamed from: a */
    private final Map f84410a;

    public aphx(Map map) {
        this.f84410a = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.f84410a;
        int i = apia.f84420a;
        return ((Integer) map.get((aapm) obj2)).intValue() - ((Integer) map.get((aapm) obj)).intValue();
    }
}
