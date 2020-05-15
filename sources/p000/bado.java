package p000;

import java.util.Comparator;

/* renamed from: bado */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bado implements Comparator {

    /* renamed from: a */
    public static final bado f100535a = new bado();

    private bado() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        badp badp = (badp) obj;
        badp badp2 = (badp) obj2;
        byte[] a = badp.mo55630a();
        byte[] a2 = badp2.mo55630a();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = a.length;
            if (i2 < length && i3 < a2.length) {
                byte b = a[i2] & 255;
                byte b2 = a2[i3] & 255;
                if (b != b2) {
                    i = b - b2;
                    break;
                }
                i2++;
                i3++;
            } else {
                i = length - a2.length;
            }
        }
        if (i != 0) {
            return i;
        }
        if (badp.mo55631b() != badp2.mo55631b()) {
            return badp.mo55631b() == 2 ? -1 : 1;
        }
        return 0;
    }
}
