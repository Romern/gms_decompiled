package p000;

/* renamed from: bref */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bref extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bref f142597f;

    /* renamed from: g */
    private static volatile bxxk f142598g;

    /* renamed from: a */
    public int f142599a;

    /* renamed from: b */
    public brak f142600b;

    /* renamed from: c */
    public int f142601c;

    /* renamed from: d */
    public int f142602d;

    /* renamed from: e */
    public int f142603e;

    static {
        bref bref = new bref();
        f142597f = bref;
        bxvk.m124024a(bref.class, bref);
    }

    private bref() {
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
            return bxvk.m124022a(f142597f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bref();
        } else {
            if (i2 == 4) {
                return new bxvd(f142597f);
            }
            if (i2 == 5) {
                return f142597f;
            }
            bxxk bxxk = f142598g;
            if (bxxk == null) {
                synchronized (bref.class) {
                    bxxk = f142598g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142597f);
                        f142598g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
