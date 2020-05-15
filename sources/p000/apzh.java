package p000;

/* renamed from: apzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzh extends bxvk implements bxxd {

    /* renamed from: g */
    public static final apzh f85246g;

    /* renamed from: h */
    private static volatile bxxk f85247h;

    /* renamed from: a */
    public int f85248a;

    /* renamed from: b */
    public int f85249b;

    /* renamed from: c */
    public int f85250c;

    /* renamed from: d */
    public int f85251d;

    /* renamed from: e */
    public int f85252e;

    /* renamed from: f */
    public int f85253f;

    static {
        apzh apzh = new apzh();
        f85246g = apzh;
        bxvk.m124024a(apzh.class, apzh);
    }

    private apzh() {
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
            return bxvk.m124022a(f85246g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new apzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f85246g);
            }
            if (i2 == 5) {
                return f85246g;
            }
            bxxk bxxk = f85247h;
            if (bxxk == null) {
                synchronized (apzh.class) {
                    bxxk = f85247h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85246g);
                        f85247h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
