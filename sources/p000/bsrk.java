package p000;

/* renamed from: bsrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsrk f146772a;

    /* renamed from: b */
    private static volatile bxxk f146773b;

    static {
        bsrk bsrk = new bsrk();
        f146772a = bsrk;
        GeneratedMessageLite.m124024a(bsrk.class, bsrk);
    }

    private bsrk() {
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
            return GeneratedMessageLite.m124022a(f146772a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrk();
        }
        if (i2 == 4) {
            return new bxvd(f146772a);
        }
        if (i2 == 5) {
            return f146772a;
        }
        bxxk bxxk = f146773b;
        if (bxxk == null) {
            synchronized (bsrk.class) {
                bxxk = f146773b;
                if (bxxk == null) {
                    bxxk = new bxve(f146772a);
                    f146773b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
