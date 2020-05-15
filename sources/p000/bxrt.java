package p000;

/* renamed from: bxrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrt extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxrt f164599j;

    /* renamed from: k */
    private static volatile bxxk f164600k;

    /* renamed from: a */
    public int f164601a;

    /* renamed from: b */
    public bxre f164602b;

    /* renamed from: c */
    public String f164603c = "";

    /* renamed from: d */
    public bxvt f164604d = bxvm.f164965b;

    /* renamed from: e */
    public int f164605e;

    /* renamed from: f */
    public int f164606f;

    /* renamed from: g */
    public bxss f164607g;

    /* renamed from: h */
    public bxwc f164608h = bxxn.f165040b;

    /* renamed from: i */
    public String f164609i = "";

    static {
        bxrt bxrt = new bxrt();
        f164599j = bxrt;
        GeneratedMessageLite.m124024a(bxrt.class, bxrt);
    }

    private bxrt() {
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
            return GeneratedMessageLite.m124022a(f164599j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u0016\u0002ဌ\u0002\u0003ဌ\u0003\u0004ဉ\u0004\u0005ဉ\u0000\u0006ဈ\u0001\u0007\u001b\bဈ\u0005", new Object[]{"a", "d", "e", bxsm.f164713a, "f", bxrs.m123046b(), "g", "b", "c", "h", bxrq.class, "i"});
        } else if (i2 == 3) {
            return new bxrt();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164599j;
            }
            bxxk bxxk = f164600k;
            if (bxxk == null) {
                synchronized (bxrt.class) {
                    bxxk = f164600k;
                    if (bxxk == null) {
                        bxxk = new bxve(f164599j);
                        f164600k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
