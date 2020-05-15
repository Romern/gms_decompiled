package p000;

/* renamed from: bivh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bivh f121982d;

    /* renamed from: f */
    private static volatile bxxk f121983f;

    /* renamed from: a */
    public int f121984a;

    /* renamed from: b */
    public int f121985b;

    /* renamed from: c */
    public int f121986c;

    /* renamed from: e */
    private byte f121987e = 2;

    static {
        bivh bivh = new bivh();
        f121982d = bivh;
        bxvk.m124024a(bivh.class, bivh);
    }

    private bivh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121987e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121987e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121982d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bivh();
        } else {
            if (i2 == 4) {
                return new bxvd(f121982d);
            }
            if (i2 == 5) {
                return f121982d;
            }
            bxxk bxxk = f121983f;
            if (bxxk == null) {
                synchronized (bivh.class) {
                    bxxk = f121983f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121982d);
                        f121983f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
