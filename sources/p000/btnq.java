package p000;

/* renamed from: btnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btnq f149676a;

    /* renamed from: b */
    private static volatile bxxk f149677b;

    static {
        btnq btnq = new btnq();
        f149676a = btnq;
        bxvk.m124024a(btnq.class, btnq);
    }

    private btnq() {
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
            return bxvk.m124022a(f149676a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btnq();
        }
        if (i2 == 4) {
            return new bxvd(f149676a);
        }
        if (i2 == 5) {
            return f149676a;
        }
        bxxk bxxk = f149677b;
        if (bxxk == null) {
            synchronized (btnq.class) {
                bxxk = f149677b;
                if (bxxk == null) {
                    bxxk = new bxve(f149676a);
                    f149677b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
