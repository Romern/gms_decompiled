package p000;

/* renamed from: cagx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cagx f174504d;

    /* renamed from: e */
    private static volatile bxxk f174505e;

    /* renamed from: a */
    public int f174506a;

    /* renamed from: b */
    public int f174507b = -1;

    /* renamed from: c */
    public int f174508c;

    static {
        cagx cagx = new cagx();
        f174504d = cagx;
        bxvk.m124024a(cagx.class, cagx);
    }

    private cagx() {
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
            return bxvk.m124022a(f174504d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", cagv.f174503a, "c", cagt.f174502a});
        } else if (i2 == 3) {
            return new cagx();
        } else {
            if (i2 == 4) {
                return new bxvd(f174504d);
            }
            if (i2 == 5) {
                return f174504d;
            }
            bxxk bxxk = f174505e;
            if (bxxk == null) {
                synchronized (cagx.class) {
                    bxxk = f174505e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174504d);
                        f174505e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
