package p000;

/* renamed from: amla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amla extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amla f75146d;

    /* renamed from: e */
    private static volatile bxxk f75147e;

    /* renamed from: a */
    public int f75148a;

    /* renamed from: b */
    public int f75149b;

    /* renamed from: c */
    public int f75150c;

    static {
        amla amla = new amla();
        f75146d = amla;
        GeneratedMessageLite.m124024a(amla.class, amla);
    }

    private amla() {
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
            return GeneratedMessageLite.m124022a(f75146d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", amjy.f75043a, "c"});
        } else if (i2 == 3) {
            return new amla();
        } else {
            if (i2 == 4) {
                return new bxvd(f75146d);
            }
            if (i2 == 5) {
                return f75146d;
            }
            bxxk bxxk = f75147e;
            if (bxxk == null) {
                synchronized (amla.class) {
                    bxxk = f75147e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75146d);
                        f75147e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
