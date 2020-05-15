package p000;

/* renamed from: blph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blph extends bxvk implements bxxd {

    /* renamed from: h */
    public static final blph f127219h;

    /* renamed from: j */
    private static volatile bxxk f127220j;

    /* renamed from: a */
    public int f127221a;

    /* renamed from: b */
    public blrk f127222b;

    /* renamed from: c */
    public blou f127223c;

    /* renamed from: d */
    public blou f127224d;

    /* renamed from: e */
    public blot f127225e;

    /* renamed from: f */
    public blrj f127226f;

    /* renamed from: g */
    public blrb f127227g;

    /* renamed from: i */
    private byte f127228i = 2;

    static {
        blph blph = new blph();
        f127219h = blph;
        bxvk.m124024a(blph.class, blph);
    }

    private blph() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127228i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127228i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127219h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ဉ\u0002\u0007ဉ\u0005", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
        } else if (i2 == 3) {
            return new blph();
        } else {
            if (i2 == 4) {
                return new bxvd(f127219h);
            }
            if (i2 == 5) {
                return f127219h;
            }
            bxxk bxxk = f127220j;
            if (bxxk == null) {
                synchronized (blph.class) {
                    bxxk = f127220j;
                    if (bxxk == null) {
                        bxxk = new bxve(f127219h);
                        f127220j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
