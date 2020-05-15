package p000;

import java.util.Comparator;

/* renamed from: axuq */
final /* synthetic */ class axuq implements Comparator {

    /* renamed from: a */
    static final Comparator f96410a = new axuq();

    private axuq() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        axuv axuv = axuv.f96418a;
        int compareToIgnoreCase = str.compareToIgnoreCase(str2);
        return compareToIgnoreCase == 0 ? str.compareTo(str2) : compareToIgnoreCase;
    }
}
