package p000;

/* renamed from: bqmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqmx f141276c;

    /* renamed from: d */
    private static volatile bxxk f141277d;

    /* renamed from: a */
    public String f141278a = "";

    /* renamed from: b */
    public bxwc f141279b = bxxn.f165040b;

    static {
        bqmx bqmx = new bqmx();
        f141276c = bqmx;
        GeneratedMessageLite.m124024a(bqmx.class, bqmx);
    }

    private bqmx() {
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
            return GeneratedMessageLite.m124022a(f141276c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", bqmw.class});
        } else if (i2 == 3) {
            return new bqmx();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f141276c;
            }
            bxxk bxxk = f141277d;
            if (bxxk == null) {
                synchronized (bqmx.class) {
                    bxxk = f141277d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141276c);
                        f141277d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
