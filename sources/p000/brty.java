package p000;

/* renamed from: brty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brty extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final brty f143367a;

    /* renamed from: b */
    public static final bxvj f143368b;

    /* renamed from: c */
    private static volatile bxxk f143369c;

    static {
        brty brty = new brty();
        f143367a = brty;
        GeneratedMessageLite.m124024a(brty.class, brty);
        bygn bygn = bygn.f166357a;
        brty brty2 = f143367a;
        f143368b = GeneratedMessageLite.m124006a(bygn, brty2, brty2, 203522521, bxzf.MESSAGE);
    }

    private brty() {
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
            return GeneratedMessageLite.m124022a(f143367a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new brty();
        }
        if (i2 == 4) {
            return new bxvd(f143367a);
        }
        if (i2 == 5) {
            return f143367a;
        }
        bxxk bxxk = f143369c;
        if (bxxk == null) {
            synchronized (brty.class) {
                bxxk = f143369c;
                if (bxxk == null) {
                    bxxk = new bxve(f143367a);
                    f143369c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
