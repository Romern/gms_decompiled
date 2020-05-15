package p000;

/* renamed from: bxhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxhx f163479f;

    /* renamed from: g */
    private static volatile bxxk f163480g;

    /* renamed from: a */
    public int f163481a;

    /* renamed from: b */
    public int f163482b;

    /* renamed from: c */
    public bxeu f163483c;

    /* renamed from: d */
    public bxtx f163484d = bxtx.f164797b;

    /* renamed from: e */
    public bxdj f163485e;

    static {
        bxhx bxhx = new bxhx();
        f163479f = bxhx;
        bxvk.m124024a(bxhx.class, bxhx);
    }

    private bxhx() {
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
            return bxvk.m124022a(f163479f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f163479f);
            }
            if (i2 == 5) {
                return f163479f;
            }
            bxxk bxxk = f163480g;
            if (bxxk == null) {
                synchronized (bxhx.class) {
                    bxxk = f163480g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163479f);
                        f163480g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
