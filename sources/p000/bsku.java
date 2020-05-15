package p000;

import java.util.Comparator;

/* renamed from: bsku */
final /* synthetic */ class bsku implements Comparator {

    /* renamed from: a */
    static final Comparator f144894a = new bsku();

    private bsku() {
    }

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = bskz.f144899a;
        int i = ((byty) obj).f167733a;
        boolean z = true;
        int i2 = ((byty) obj2).f167733a & 1;
        boolean z2 = (i & 1) != 0;
        if (i2 == 0) {
            z = false;
        }
        return Boolean.compare(z2, z);
    }
}
