package p000;

/* renamed from: byql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byql extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byql f167388c;

    /* renamed from: e */
    private static volatile bxxk f167389e;

    /* renamed from: a */
    public int f167390a;

    /* renamed from: b */
    public brzo f167391b;

    /* renamed from: d */
    private byte f167392d = 2;

    static {
        byql byql = new byql();
        f167388c = byql;
        bxvk.m124024a(byql.class, byql);
    }

    private byql() {
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167392d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167392d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f167388c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byql();
        } else {
            if (i2 == 4) {
                return new bxvd(f167388c);
            }
            if (i2 == 5) {
                return f167388c;
            }
            bxxk bxxk = f167389e;
            if (bxxk == null) {
                synchronized (byql.class) {
                    bxxk = f167389e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167388c);
                        f167389e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
