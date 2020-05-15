package p000;

import java.util.Comparator;

/* renamed from: axup */
final /* synthetic */ class axup implements Comparator {

    /* renamed from: a */
    static final Comparator f96409a = new axup();

    private axup() {
    }

    public final int compare(Object obj, Object obj2) {
        ayac ayac = (ayac) obj;
        ayac ayac2 = (ayac) obj2;
        axuv axuv = axuv.f96418a;
        int i = ayac.f96885b;
        int i2 = ayac2.f96885b;
        return i != i2 ? Integer.compare(i, i2) : ayac.compareTo(ayac2);
    }
}
