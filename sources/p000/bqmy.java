package p000;

/* renamed from: bqmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqmy f141280c;

    /* renamed from: d */
    private static volatile bxxk f141281d;

    /* renamed from: a */
    public int f141282a;

    /* renamed from: b */
    public bxtx f141283b = bxtx.f164797b;

    static {
        bqmy bqmy = new bqmy();
        f141280c = bqmy;
        bxvk.m124024a(bqmy.class, bqmy);
    }

    private bqmy() {
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
            return bxvk.m124022a(f141280c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f141280c);
            }
            if (i2 == 5) {
                return f141280c;
            }
            bxxk bxxk = f141281d;
            if (bxxk == null) {
                synchronized (bqmy.class) {
                    bxxk = f141281d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141280c);
                        f141281d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
