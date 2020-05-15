package p000;

/* renamed from: ytr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ytr f54614b;

    /* renamed from: c */
    private static volatile bxxk f54615c;

    /* renamed from: a */
    public bxwc f54616a = bxxn.f165040b;

    static {
        ytr ytr = new ytr();
        f54614b = ytr;
        GeneratedMessageLite.m124024a(ytr.class, ytr);
    }

    private ytr() {
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
            return GeneratedMessageLite.m124022a(f54614b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpgr.class});
        } else if (i2 == 3) {
            return new ytr();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f54614b;
            }
            bxxk bxxk = f54615c;
            if (bxxk == null) {
                synchronized (ytr.class) {
                    bxxk = f54615c;
                    if (bxxk == null) {
                        bxxk = new bxve(f54614b);
                        f54615c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
