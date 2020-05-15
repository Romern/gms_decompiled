package p000;

/* renamed from: bupl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bupl f154649a;

    /* renamed from: b */
    private static volatile bxxk f154650b;

    static {
        bupl bupl = new bupl();
        f154649a = bupl;
        bxvk.m124024a(bupl.class, bupl);
    }

    private bupl() {
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
            return bxvk.m124022a(f154649a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bupl();
        }
        if (i2 == 4) {
            return new bxvd(f154649a);
        }
        if (i2 == 5) {
            return f154649a;
        }
        bxxk bxxk = f154650b;
        if (bxxk == null) {
            synchronized (bupl.class) {
                bxxk = f154650b;
                if (bxxk == null) {
                    bxxk = new bxve(f154649a);
                    f154650b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
