package p000;

/* renamed from: bsak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsak extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsak f143860d;

    /* renamed from: f */
    private static volatile bxxk f143861f;

    /* renamed from: a */
    public int f143862a;

    /* renamed from: b */
    public long f143863b;

    /* renamed from: c */
    public long f143864c;

    /* renamed from: e */
    private byte f143865e = 2;

    static {
        bsak bsak = new bsak();
        f143860d = bsak;
        bxvk.m124024a(bsak.class, bsak);
    }

    private bsak() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143865e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143865e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f143860d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔅ\u0000\u0002ᔅ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsak();
        } else {
            if (i2 == 4) {
                return new bxvd(f143860d);
            }
            if (i2 == 5) {
                return f143860d;
            }
            bxxk bxxk = f143861f;
            if (bxxk == null) {
                synchronized (bsak.class) {
                    bxxk = f143861f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143860d);
                        f143861f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
