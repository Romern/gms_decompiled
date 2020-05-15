package p000;

/* renamed from: btos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btos extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btos f149797a;

    /* renamed from: b */
    private static volatile bxxk f149798b;

    static {
        btos btos = new btos();
        f149797a = btos;
        GeneratedMessageLite.m124024a(btos.class, btos);
    }

    private btos() {
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
            return GeneratedMessageLite.m124022a(f149797a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btos();
        }
        if (i2 == 4) {
            return new bxvd(f149797a);
        }
        if (i2 == 5) {
            return f149797a;
        }
        bxxk bxxk = f149798b;
        if (bxxk == null) {
            synchronized (btos.class) {
                bxxk = f149798b;
                if (bxxk == null) {
                    bxxk = new bxve(f149797a);
                    f149798b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
