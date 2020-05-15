package p000;

/* renamed from: bywi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bywi f168578a;

    /* renamed from: b */
    private static volatile bxxk f168579b;

    static {
        bywi bywi = new bywi();
        f168578a = bywi;
        GeneratedMessageLite.m124024a(bywi.class, bywi);
    }

    private bywi() {
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
            return GeneratedMessageLite.m124022a(f168578a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bywi();
        }
        if (i2 == 4) {
            return new bxvd(f168578a);
        }
        if (i2 == 5) {
            return f168578a;
        }
        bxxk bxxk = f168579b;
        if (bxxk == null) {
            synchronized (bywi.class) {
                bxxk = f168579b;
                if (bxxk == null) {
                    bxxk = new bxve(f168578a);
                    f168579b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
