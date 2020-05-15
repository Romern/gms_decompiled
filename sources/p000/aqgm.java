package p000;

/* renamed from: aqgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aqgm f86063f;

    /* renamed from: h */
    private static volatile bxxk f86064h;

    /* renamed from: a */
    public int f86065a;

    /* renamed from: b */
    public String f86066b = "";

    /* renamed from: c */
    public aqgl f86067c;

    /* renamed from: d */
    public long f86068d;

    /* renamed from: e */
    public long f86069e;

    /* renamed from: g */
    private byte f86070g = 2;

    static {
        aqgm aqgm = new aqgm();
        f86063f = aqgm;
        bxvk.m124024a(aqgm.class, aqgm);
    }

    private aqgm() {
        bxxn bxxn = bxxn.f165040b;
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f86070g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f86070g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f86063f, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔉ\u0002\u0003ᔂ\u0003\rစ\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f86063f);
            }
            if (i2 == 5) {
                return f86063f;
            }
            bxxk bxxk = f86064h;
            if (bxxk == null) {
                synchronized (aqgm.class) {
                    bxxk = f86064h;
                    if (bxxk == null) {
                        bxxk = new bxve(f86063f);
                        f86064h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
