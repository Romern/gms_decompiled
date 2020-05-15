package p000;

import java.util.Collection;

/* renamed from: acxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxn {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static int m49955a(Collection r4) {
        int size = r4.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((abqo) r4.get(i2)).f57981e);
        }
        return i;
    }

    /* renamed from: a */
    public static abuc m49956a(absr absr, int i, abqo abqo, int i2, boolean z) {
        double d = (double) abqo.f57981e;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (!z && d3 == 1.0d) {
            return null;
        }
        bxvd da = abuc.f58343e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abuc abuc = (abuc) da.f164949b;
        int i3 = abuc.f58345a | 2;
        abuc.f58345a = i3;
        abuc.f58347c = i;
        int i4 = absr.f58137b;
        int i5 = i3 | 1;
        abuc.f58345a = i5;
        abuc.f58346b = i4;
        abuc.f58345a = i5 | 4;
        abuc.f58348d = d3;
        return (abuc) da.mo74062i();
    }
}
