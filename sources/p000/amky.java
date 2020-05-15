package p000;

/* renamed from: amky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amky extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final amky f75132f;

    /* renamed from: g */
    private static volatile bxxk f75133g;

    /* renamed from: a */
    public int f75134a;

    /* renamed from: b */
    public int f75135b;

    /* renamed from: c */
    public int f75136c;

    /* renamed from: d */
    public int f75137d;

    /* renamed from: e */
    public int f75138e;

    static {
        amky amky = new amky();
        f75132f = amky;
        GeneratedMessageLite.m124024a(amky.class, amky);
    }

    private amky() {
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
            return GeneratedMessageLite.m124022a(f75132f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new amky();
        } else {
            if (i2 == 4) {
                return new bxvd(f75132f);
            }
            if (i2 == 5) {
                return f75132f;
            }
            bxxk bxxk = f75133g;
            if (bxxk == null) {
                synchronized (amky.class) {
                    bxxk = f75133g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75132f);
                        f75133g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
