package p000;

/* renamed from: bsso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsso extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsso f146891a;

    /* renamed from: b */
    private static volatile bxxk f146892b;

    static {
        bsso bsso = new bsso();
        f146891a = bsso;
        GeneratedMessageLite.m124024a(bsso.class, bsso);
    }

    private bsso() {
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
            return GeneratedMessageLite.m124022a(f146891a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsso();
        }
        if (i2 == 4) {
            return new bxvd(f146891a);
        }
        if (i2 == 5) {
            return f146891a;
        }
        bxxk bxxk = f146892b;
        if (bxxk == null) {
            synchronized (bsso.class) {
                bxxk = f146892b;
                if (bxxk == null) {
                    bxxk = new bxve(f146891a);
                    f146892b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
