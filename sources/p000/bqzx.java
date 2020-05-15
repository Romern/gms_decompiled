package p000;

/* renamed from: bqzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqzx f142104c;

    /* renamed from: e */
    private static volatile bxxk f142105e;

    /* renamed from: a */
    public boolean f142106a;

    /* renamed from: b */
    public bxwc f142107b = bxxn.f165040b;

    /* renamed from: d */
    private int f142108d;

    static {
        bqzx bqzx = new bqzx();
        f142104c = bqzx;
        bxvk.m124024a(bqzx.class, bqzx);
    }

    private bqzx() {
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
            return bxvk.m124022a(f142104c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bqzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f142104c);
            }
            if (i2 == 5) {
                return f142104c;
            }
            bxxk bxxk = f142105e;
            if (bxxk == null) {
                synchronized (bqzx.class) {
                    bxxk = f142105e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142104c);
                        f142105e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
