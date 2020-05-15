package p000;

/* renamed from: bqkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqkx f141059c;

    /* renamed from: d */
    private static volatile bxxk f141060d;

    /* renamed from: a */
    public bqli f141061a;

    /* renamed from: b */
    public bxwc f141062b = bxxn.f165040b;

    static {
        bqkx bqkx = new bqkx();
        f141059c = bqkx;
        bxvk.m124024a(bqkx.class, bqkx);
    }

    private bqkx() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f141059c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\t\u0003Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqkx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f141059c;
            }
            bxxk bxxk = f141060d;
            if (bxxk == null) {
                synchronized (bqkx.class) {
                    bxxk = f141060d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141059c);
                        f141060d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
