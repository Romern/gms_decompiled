package p000;

/* renamed from: blat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blat extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blat f125793a;

    /* renamed from: e */
    private static volatile bxxk f125794e;

    /* renamed from: b */
    private int f125795b;

    /* renamed from: c */
    private blas f125796c;

    /* renamed from: d */
    private byte f125797d = 2;

    static {
        blat blat = new blat();
        f125793a = blat;
        GeneratedMessageLite.m124024a(blat.class, blat);
    }

    private blat() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125797d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125797d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125793a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blat();
        } else {
            if (i2 == 4) {
                return new bxvd(f125793a);
            }
            if (i2 == 5) {
                return f125793a;
            }
            bxxk bxxk = f125794e;
            if (bxxk == null) {
                synchronized (blat.class) {
                    bxxk = f125794e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125793a);
                        f125794e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
