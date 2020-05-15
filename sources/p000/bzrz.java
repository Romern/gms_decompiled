package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: bzrz */
final /* synthetic */ class bzrz implements Comparator {

    /* renamed from: a */
    static final Comparator f171218a = new bzrz();

    private bzrz() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
