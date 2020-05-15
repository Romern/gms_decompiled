package p000;

/* renamed from: blmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blmr f126891d;

    /* renamed from: f */
    private static volatile bxxk f126892f;

    /* renamed from: a */
    public int f126893a;

    /* renamed from: b */
    public int f126894b;

    /* renamed from: c */
    public String f126895c = "";

    /* renamed from: e */
    private byte f126896e = 2;

    static {
        blmr blmr = new blmr();
        f126891d = blmr;
        bxvk.m124024a(blmr.class, blmr);
    }

    private blmr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126896e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126896e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126891d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f126891d);
            }
            if (i2 == 5) {
                return f126891d;
            }
            bxxk bxxk = f126892f;
            if (bxxk == null) {
                synchronized (blmr.class) {
                    bxxk = f126892f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126891d);
                        f126892f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
