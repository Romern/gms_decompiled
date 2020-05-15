package p000;

/* renamed from: blpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blpm f127244g;

    /* renamed from: i */
    private static volatile bxxk f127245i;

    /* renamed from: a */
    public int f127246a;

    /* renamed from: b */
    public blrk f127247b;

    /* renamed from: c */
    public blrn f127248c;

    /* renamed from: d */
    public blou f127249d;

    /* renamed from: e */
    public blrj f127250e;

    /* renamed from: f */
    public blot f127251f;

    /* renamed from: h */
    private byte f127252h = 2;

    static {
        blpm blpm = new blpm();
        f127244g = blpm;
        bxvk.m124024a(blpm.class, blpm);
    }

    private blpm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127252h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127252h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127244g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blpm();
        } else {
            if (i2 == 4) {
                return new bxvd(f127244g);
            }
            if (i2 == 5) {
                return f127244g;
            }
            bxxk bxxk = f127245i;
            if (bxxk == null) {
                synchronized (blpm.class) {
                    bxxk = f127245i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127244g);
                        f127245i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
