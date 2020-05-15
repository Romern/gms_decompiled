package p000;

/* renamed from: bmbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmbq f128565c;

    /* renamed from: e */
    private static volatile bxxk f128566e;

    /* renamed from: a */
    public int f128567a;

    /* renamed from: b */
    public String f128568b = "";

    /* renamed from: d */
    private int f128569d;

    static {
        bmbq bmbq = new bmbq();
        f128565c = bmbq;
        bxvk.m124024a(bmbq.class, bmbq);
    }

    private bmbq() {
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
            return bxvk.m124022a(f128565c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", bmbm.m107870b(), "b"});
        } else if (i2 == 3) {
            return new bmbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f128565c);
            }
            if (i2 == 5) {
                return f128565c;
            }
            bxxk bxxk = f128566e;
            if (bxxk == null) {
                synchronized (bmbq.class) {
                    bxxk = f128566e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128565c);
                        f128566e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
