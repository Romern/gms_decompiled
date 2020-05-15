package p000;

import java.util.List;

/* renamed from: ayyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayyv {
    /* renamed from: a */
    static bptv m85089a(ayyd ayyd, boolean z) {
        int i;
        List a = ayyd.mo54525a();
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        while (i < a.size()) {
            aywu aywu = (aywu) a.get(i);
            bptu bptu = aywu.f98654c;
            if (bptu == null) {
                bptu = bptu.f139179e;
            }
            if ((bptu.f139181a & 2048) == 0) {
                i++;
            } else {
                bptu bptu2 = aywu.f98654c;
                if (bptu2 == null) {
                    bptu2 = bptu.f139179e;
                }
                bptv bptv = bptu2.f139184d;
                return bptv == null ? bptv.f139186d : bptv;
            }
        }
        return null;
    }
}
