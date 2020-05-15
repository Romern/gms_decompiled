package p000;

/* renamed from: ciwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ciwx f191621d;

    /* renamed from: e */
    private static volatile bxxk f191622e;

    /* renamed from: a */
    public int f191623a;

    /* renamed from: b */
    public int f191624b;

    /* renamed from: c */
    public bxtx f191625c = bxtx.f164797b;

    static {
        ciwx ciwx = new ciwx();
        f191621d = ciwx;
        bxvk.m124024a(ciwx.class, ciwx);
    }

    private ciwx() {
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
            return bxvk.m124022a(f191621d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ciwx();
        } else {
            if (i2 == 4) {
                return new bxvd(f191621d);
            }
            if (i2 == 5) {
                return f191621d;
            }
            bxxk bxxk = f191622e;
            if (bxxk == null) {
                synchronized (ciwx.class) {
                    bxxk = f191622e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191621d);
                        f191622e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
