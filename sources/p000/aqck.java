package p000;

/* renamed from: aqck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqck extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqck f85667d;

    /* renamed from: e */
    private static volatile bxxk f85668e;

    /* renamed from: a */
    public int f85669a;

    /* renamed from: b */
    public aqcd f85670b;

    /* renamed from: c */
    public bxwc f85671c = bxxn.f165040b;

    static {
        aqck aqck = new aqck();
        f85667d = aqck;
        GeneratedMessageLite.m124024a(aqck.class, aqck);
    }

    private aqck() {
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
            return GeneratedMessageLite.m124022a(f85667d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003\u001b", new Object[]{"a", "b", "c", aqcj.class});
        } else if (i2 == 3) {
            return new aqck();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f85667d;
            }
            bxxk bxxk = f85668e;
            if (bxxk == null) {
                synchronized (aqck.class) {
                    bxxk = f85668e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85667d);
                        f85668e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
