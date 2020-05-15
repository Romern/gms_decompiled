package p000;

/* renamed from: bvyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyr extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvyr f158210g;

    /* renamed from: h */
    private static volatile bxxk f158211h;

    /* renamed from: a */
    public int f158212a;

    /* renamed from: b */
    public int f158213b;

    /* renamed from: c */
    public int f158214c;

    /* renamed from: d */
    public int f158215d;

    /* renamed from: e */
    public int f158216e;

    /* renamed from: f */
    public int f158217f;

    static {
        bvyr bvyr = new bvyr();
        f158210g = bvyr;
        bxvk.m124024a(bvyr.class, bvyr);
    }

    private bvyr() {
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
            return bxvk.m124022a(f158210g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f158210g);
            }
            if (i2 == 5) {
                return f158210g;
            }
            bxxk bxxk = f158211h;
            if (bxxk == null) {
                synchronized (bvyr.class) {
                    bxxk = f158211h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158210g);
                        f158211h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
