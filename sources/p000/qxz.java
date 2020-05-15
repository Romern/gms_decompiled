package p000;

/* renamed from: qxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qxz {
    /* renamed from: a */
    public static void m33087a(qxy qxy, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3 && i % 4 != 0) {
            qxy.mo24397a(i, (byte) 0);
            i++;
        }
        while (i < i3 - 3) {
            qxy.mo24398a(i, 0);
            i += 4;
        }
        while (i < i3) {
            qxy.mo24397a(i, (byte) 0);
            i++;
        }
    }

    /* renamed from: b */
    public static void m33088b(qxy qxy, int i, int i2) {
        qxy.mo24398a(i, bqbr.m112521a(qxy.mo24400b(i), i2));
    }
}
