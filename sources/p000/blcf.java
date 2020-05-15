package p000;

/* renamed from: blcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blcf f125916d;

    /* renamed from: f */
    private static volatile bxxk f125917f;

    /* renamed from: a */
    public int f125918a;

    /* renamed from: b */
    public int f125919b;

    /* renamed from: c */
    public blcc f125920c;

    /* renamed from: e */
    private byte f125921e = 2;

    static {
        blcf blcf = new blcf();
        f125916d = blcf;
        GeneratedMessageLite.m124024a(blcf.class, blcf);
    }

    private blcf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125921e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125921e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125916d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blcf();
        } else {
            if (i2 == 4) {
                return new bxvd(f125916d);
            }
            if (i2 == 5) {
                return f125916d;
            }
            bxxk bxxk = f125917f;
            if (bxxk == null) {
                synchronized (blcf.class) {
                    bxxk = f125917f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125916d);
                        f125917f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
