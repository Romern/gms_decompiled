package p000;

import java.util.Comparator;

/* renamed from: bskv */
final /* synthetic */ class bskv implements Comparator {

    /* renamed from: a */
    static final Comparator f144895a = new bskv();

    private bskv() {
    }

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = bskz.f144899a;
        int i = ((bytz) obj).f167738a;
        boolean z = true;
        int i2 = ((bytz) obj2).f167738a & 1;
        boolean z2 = (i & 1) != 0;
        if (i2 == 0) {
            z = false;
        }
        return Boolean.compare(z2, z);
    }
}
