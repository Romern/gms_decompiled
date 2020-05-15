package p000;

/* renamed from: tiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tiw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final tiw f46154e;

    /* renamed from: f */
    private static volatile bxxk f46155f;

    /* renamed from: a */
    public int f46156a;

    /* renamed from: b */
    public bxwc f46157b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f46158c = bxxn.f165040b;

    /* renamed from: d */
    public tiz f46159d;

    static {
        tiw tiw = new tiw();
        f46154e = tiw;
        GeneratedMessageLite.m124024a(tiw.class, tiw);
    }

    private tiw() {
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
            return GeneratedMessageLite.m124022a(f46154e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001a\u0003ဉ\u0000", new Object[]{"a", "b", tiv.class, "c", "d"});
        } else if (i2 == 3) {
            return new tiw();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f46154e;
            }
            bxxk bxxk = f46155f;
            if (bxxk == null) {
                synchronized (tiw.class) {
                    bxxk = f46155f;
                    if (bxxk == null) {
                        bxxk = new bxve(f46154e);
                        f46155f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
