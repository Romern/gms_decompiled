package p000;

/* renamed from: bire */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bire extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bire f121389j;

    /* renamed from: l */
    private static volatile bxxk f121390l;

    /* renamed from: a */
    public int f121391a;

    /* renamed from: b */
    public int f121392b;

    /* renamed from: c */
    public int f121393c;

    /* renamed from: d */
    public boolean f121394d;

    /* renamed from: e */
    public int f121395e;

    /* renamed from: f */
    public int f121396f;

    /* renamed from: g */
    public boolean f121397g;

    /* renamed from: h */
    public boolean f121398h;

    /* renamed from: i */
    public int f121399i;

    /* renamed from: k */
    private byte f121400k = 2;

    static {
        bire bire = new bire();
        f121389j = bire;
        bxvk.m124024a(bire.class, bire);
    }

    private bire() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121400k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121400k = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121389j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bire();
        } else {
            if (i2 == 4) {
                return new bxvd(f121389j);
            }
            if (i2 == 5) {
                return f121389j;
            }
            bxxk bxxk = f121390l;
            if (bxxk == null) {
                synchronized (bire.class) {
                    bxxk = f121390l;
                    if (bxxk == null) {
                        bxxk = new bxve(f121389j);
                        f121390l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
