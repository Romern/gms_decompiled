package p000;

/* renamed from: cbct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbct extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbct f176686b;

    /* renamed from: c */
    private static volatile bxxk f176687c;

    /* renamed from: a */
    public bxvt f176688a = bxvm.f164965b;

    static {
        cbct cbct = new cbct();
        f176686b = cbct;
        GeneratedMessageLite.m124024a(cbct.class, cbct);
    }

    private cbct() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f176686b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbct();
        } else {
            if (i2 == 4) {
                return new bxvd(f176686b);
            }
            if (i2 == 5) {
                return f176686b;
            }
            bxxk bxxk = f176687c;
            if (bxxk == null) {
                synchronized (cbct.class) {
                    bxxk = f176687c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176686b);
                        f176687c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
