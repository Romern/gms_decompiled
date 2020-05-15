package p000;

import java.util.Comparator;

/* renamed from: ahsp */
public final /* synthetic */ class ahsp implements Comparator {

    /* renamed from: a */
    public static final Comparator f67951a = new ahsp();

    private ahsp() {
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        ahsu ahsu = (ahsu) obj;
        ahsu ahsu2 = (ahsu) obj2;
        int i2 = 0;
        if (ahsu.mo37061H() != 0) {
            int H = ahsu.mo37061H();
            i = H - 1;
            if (H == 0) {
                throw null;
            }
        } else {
            i = 0;
        }
        if (ahsu2.mo37061H() != 0) {
            int H2 = ahsu2.mo37061H();
            i2 = H2 - 1;
            if (H2 == 0) {
                throw null;
            }
        }
        return i - i2;
    }
}
