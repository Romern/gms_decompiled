package p000;

/* renamed from: bocv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bocv f132637d;

    /* renamed from: e */
    private static volatile bxxk f132638e;

    /* renamed from: a */
    public int f132639a;

    /* renamed from: b */
    public int f132640b;

    /* renamed from: c */
    public long f132641c;

    static {
        bocv bocv = new bocv();
        f132637d = bocv;
        bxvk.m124024a(bocv.class, bocv);
    }

    private bocv() {
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
            return bxvk.m124022a(f132637d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bocu.f132636a, "c"});
        } else if (i2 == 3) {
            return new bocv();
        } else {
            if (i2 == 4) {
                return new bxvd(f132637d);
            }
            if (i2 == 5) {
                return f132637d;
            }
            bxxk bxxk = f132638e;
            if (bxxk == null) {
                synchronized (bocv.class) {
                    bxxk = f132638e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132637d);
                        f132638e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
