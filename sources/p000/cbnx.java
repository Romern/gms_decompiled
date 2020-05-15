package p000;

/* renamed from: cbnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbnx f177772d;

    /* renamed from: e */
    private static volatile bxxk f177773e;

    /* renamed from: a */
    public String f177774a = "";

    /* renamed from: b */
    public int f177775b;

    /* renamed from: c */
    public int f177776c;

    static {
        cbnx cbnx = new cbnx();
        f177772d = cbnx;
        bxvk.m124024a(cbnx.class, cbnx);
    }

    private cbnx() {
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
            return bxvk.m124022a(f177772d, "\u0000\u0003\u0000\u0000\u0003\u0006\u0003\u0000\u0000\u0000\u0003Ȉ\u0005\u0004\u0006\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177772d);
            }
            if (i2 == 5) {
                return f177772d;
            }
            bxxk bxxk = f177773e;
            if (bxxk == null) {
                synchronized (cbnx.class) {
                    bxxk = f177773e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177772d);
                        f177773e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
