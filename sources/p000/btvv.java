package p000;

/* renamed from: btvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvv f152644a;

    /* renamed from: b */
    private static volatile bxxk f152645b;

    static {
        btvv btvv = new btvv();
        f152644a = btvv;
        GeneratedMessageLite.m124024a(btvv.class, btvv);
    }

    private btvv() {
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
            return GeneratedMessageLite.m124022a(f152644a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvv();
        }
        if (i2 == 4) {
            return new bxvd(f152644a);
        }
        if (i2 == 5) {
            return f152644a;
        }
        bxxk bxxk = f152645b;
        if (bxxk == null) {
            synchronized (btvv.class) {
                bxxk = f152645b;
                if (bxxk == null) {
                    bxxk = new bxve(f152644a);
                    f152645b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
