package p000;

/* renamed from: cbby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbby extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbby f176628a;

    /* renamed from: b */
    private static volatile bxxk f176629b;

    static {
        cbby cbby = new cbby();
        f176628a = cbby;
        bxvk.m124024a(cbby.class, cbby);
    }

    private cbby() {
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
            return bxvk.m124022a(f176628a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbby();
        }
        if (i2 == 4) {
            return new bxvd(f176628a);
        }
        if (i2 == 5) {
            return f176628a;
        }
        bxxk bxxk = f176629b;
        if (bxxk == null) {
            synchronized (cbby.class) {
                bxxk = f176629b;
                if (bxxk == null) {
                    bxxk = new bxve(f176628a);
                    f176629b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
