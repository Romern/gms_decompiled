package p000;

/* renamed from: bsqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqh extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsqh f146634g;

    /* renamed from: h */
    private static volatile bxxk f146635h;

    /* renamed from: a */
    public int f146636a;

    /* renamed from: b */
    public boolean f146637b;

    /* renamed from: c */
    public bsqq f146638c;

    /* renamed from: d */
    public bsqq f146639d;

    /* renamed from: e */
    public bsqq f146640e;

    /* renamed from: f */
    public bsqq f146641f;

    static {
        bsqh bsqh = new bsqh();
        f146634g = bsqh;
        bxvk.m124024a(bsqh.class, bsqh);
    }

    private bsqh() {
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
            return bxvk.m124022a(f146634g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsqh();
        } else {
            if (i2 == 4) {
                return new bxvd(f146634g);
            }
            if (i2 == 5) {
                return f146634g;
            }
            bxxk bxxk = f146635h;
            if (bxxk == null) {
                synchronized (bsqh.class) {
                    bxxk = f146635h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146634g);
                        f146635h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
