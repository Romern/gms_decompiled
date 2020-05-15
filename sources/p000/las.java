package p000;

/* renamed from: las */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class las extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final las f25605g;

    /* renamed from: h */
    private static volatile bxxk f25606h;

    /* renamed from: a */
    public kzz f25607a;

    /* renamed from: b */
    public int f25608b;

    /* renamed from: c */
    public boolean f25609c;

    /* renamed from: d */
    public boolean f25610d;

    /* renamed from: e */
    public boolean f25611e;

    /* renamed from: f */
    public int f25612f;

    static {
        las las = new las();
        f25605g = las;
        GeneratedMessageLite.m124024a(las.class, las);
    }

    private las() {
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
            return GeneratedMessageLite.m124022a(f25605g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new las();
        } else {
            if (i2 == 4) {
                return new bxvd(f25605g);
            }
            if (i2 == 5) {
                return f25605g;
            }
            bxxk bxxk = f25606h;
            if (bxxk == null) {
                synchronized (las.class) {
                    bxxk = f25606h;
                    if (bxxk == null) {
                        bxxk = new bxve(f25605g);
                        f25606h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
