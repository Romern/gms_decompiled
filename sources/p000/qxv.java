package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: qxv */
public final /* synthetic */ class qxv implements Comparator {

    /* renamed from: a */
    public static final Comparator f42404a = new qxv();

    private qxv() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj2).getValue()).compareTo(((Map.Entry) obj).getValue());
    }
}
