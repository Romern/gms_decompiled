package p000;

/* renamed from: cbls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbls extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbls f177558b;

    /* renamed from: c */
    private static volatile bxxk f177559c;

    /* renamed from: a */
    public cbmo f177560a;

    static {
        cbls cbls = new cbls();
        f177558b = cbls;
        bxvk.m124024a(cbls.class, cbls);
    }

    private cbls() {
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
            return bxvk.m124022a(f177558b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbls();
        } else {
            if (i2 == 4) {
                return new bxvd(f177558b);
            }
            if (i2 == 5) {
                return f177558b;
            }
            bxxk bxxk = f177559c;
            if (bxxk == null) {
                synchronized (cbls.class) {
                    bxxk = f177559c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177558b);
                        f177559c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
