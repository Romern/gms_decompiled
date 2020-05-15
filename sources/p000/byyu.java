package p000;

/* renamed from: byyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyu extends bxvg implements bxvh {

    /* renamed from: f */
    public static final byyu f169014f;

    /* renamed from: h */
    private static volatile bxxk f169015h;

    /* renamed from: a */
    public int f169016a;

    /* renamed from: b */
    public String f169017b = "";

    /* renamed from: c */
    public String f169018c = "";

    /* renamed from: d */
    public long f169019d;

    /* renamed from: e */
    public String f169020e = "";

    /* renamed from: g */
    private byte f169021g = 2;

    static {
        byyu byyu = new byyu();
        f169014f = byyu;
        bxvk.m124024a(byyu.class, byyu);
    }

    private byyu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169021g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169021g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169014f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byyu();
        } else {
            if (i2 == 4) {
                return new bxvf(f169014f);
            }
            if (i2 == 5) {
                return f169014f;
            }
            bxxk bxxk = f169015h;
            if (bxxk == null) {
                synchronized (byyu.class) {
                    bxxk = f169015h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169014f);
                        f169015h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
