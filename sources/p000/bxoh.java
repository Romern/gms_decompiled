package p000;

/* renamed from: bxoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxoh f164149d;

    /* renamed from: e */
    private static volatile bxxk f164150e;

    /* renamed from: a */
    public int f164151a;

    /* renamed from: b */
    public int f164152b;

    /* renamed from: c */
    public int f164153c;

    static {
        bxoh bxoh = new bxoh();
        f164149d = bxoh;
        bxvk.m124024a(bxoh.class, bxoh);
    }

    private bxoh() {
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
            return bxvk.m124022a(f164149d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f164149d);
            }
            if (i2 == 5) {
                return f164149d;
            }
            bxxk bxxk = f164150e;
            if (bxxk == null) {
                synchronized (bxoh.class) {
                    bxxk = f164150e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164149d);
                        f164150e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
