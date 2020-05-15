package p000;

/* renamed from: bufz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bufz f153761a;

    /* renamed from: b */
    private static volatile bxxk f153762b;

    static {
        bufz bufz = new bufz();
        f153761a = bufz;
        GeneratedMessageLite.m124024a(bufz.class, bufz);
    }

    private bufz() {
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
            return GeneratedMessageLite.m124022a(f153761a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bufz();
        }
        if (i2 == 4) {
            return new bxvd(f153761a);
        }
        if (i2 == 5) {
            return f153761a;
        }
        bxxk bxxk = f153762b;
        if (bxxk == null) {
            synchronized (bufz.class) {
                bxxk = f153762b;
                if (bxxk == null) {
                    bxxk = new bxve(f153761a);
                    f153762b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
