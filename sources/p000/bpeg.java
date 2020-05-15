package p000;

/* renamed from: bpeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpeg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpeg f137266g;

    /* renamed from: h */
    private static volatile bxxk f137267h;

    /* renamed from: a */
    public int f137268a;

    /* renamed from: b */
    public boolean f137269b;

    /* renamed from: c */
    public int f137270c;

    /* renamed from: d */
    public int f137271d;

    /* renamed from: e */
    public int f137272e;

    /* renamed from: f */
    public int f137273f;

    static {
        bpeg bpeg = new bpeg();
        f137266g = bpeg;
        bxvk.m124024a(bpeg.class, bpeg);
    }

    private bpeg() {
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
            return bxvk.m124022a(f137266g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f137266g);
            }
            if (i2 == 5) {
                return f137266g;
            }
            bxxk bxxk = f137267h;
            if (bxxk == null) {
                synchronized (bpeg.class) {
                    bxxk = f137267h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137266g);
                        f137267h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
