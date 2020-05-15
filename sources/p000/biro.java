package p000;

/* renamed from: biro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biro extends bxvk implements bxxd {

    /* renamed from: f */
    public static final biro f121433f;

    /* renamed from: h */
    private static volatile bxxk f121434h;

    /* renamed from: a */
    public int f121435a;

    /* renamed from: b */
    public int f121436b;

    /* renamed from: c */
    public boolean f121437c;

    /* renamed from: d */
    public int f121438d;

    /* renamed from: e */
    public boolean f121439e;

    /* renamed from: g */
    private byte f121440g = 2;

    static {
        biro biro = new biro();
        f121433f = biro;
        bxvk.m124024a(biro.class, biro);
    }

    private biro() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121440g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121440g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121433f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔇ\u0001\u0003ᔋ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new biro();
        } else {
            if (i2 == 4) {
                return new bxvd(f121433f);
            }
            if (i2 == 5) {
                return f121433f;
            }
            bxxk bxxk = f121434h;
            if (bxxk == null) {
                synchronized (biro.class) {
                    bxxk = f121434h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121433f);
                        f121434h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
