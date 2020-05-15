package p000;

/* renamed from: bzyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzyf f171858d;

    /* renamed from: e */
    private static volatile bxxk f171859e;

    /* renamed from: a */
    public long f171860a;

    /* renamed from: b */
    public String f171861b = "";

    /* renamed from: c */
    public bxwc f171862c = bxxn.f165040b;

    static {
        bzyf bzyf = new bzyf();
        f171858d = bzyf;
        GeneratedMessageLite.m124024a(bzyf.class, bzyf);
    }

    private bzyf() {
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
            return GeneratedMessageLite.m124022a(f171858d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", "c", bzym.class});
        } else if (i2 == 3) {
            return new bzyf();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f171858d;
            }
            bxxk bxxk = f171859e;
            if (bxxk == null) {
                synchronized (bzyf.class) {
                    bxxk = f171859e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171858d);
                        f171859e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
