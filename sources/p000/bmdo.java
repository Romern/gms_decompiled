package p000;

/* renamed from: bmdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bmdo f128843a;

    /* renamed from: b */
    public static final bxvj f128844b = GeneratedMessageLite.m124006a(bmcm.f128714f, bmki.f129802w, bmki.f129802w, 4, bxzf.MESSAGE);

    /* renamed from: c */
    private static volatile bxxk f128845c;

    static {
        bmdo bmdo = new bmdo();
        f128843a = bmdo;
        GeneratedMessageLite.m124024a(bmdo.class, bmdo);
    }

    private bmdo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128843a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmdo();
        }
        if (i2 == 4) {
            return new bxvd(f128843a);
        }
        if (i2 == 5) {
            return f128843a;
        }
        bxxk bxxk = f128845c;
        if (bxxk == null) {
            synchronized (bmdo.class) {
                bxxk = f128845c;
                if (bxxk == null) {
                    bxxk = new bxve(f128843a);
                    f128845c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
