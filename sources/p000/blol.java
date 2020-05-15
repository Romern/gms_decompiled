package p000;

/* renamed from: blol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blol extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blol f127107c;

    /* renamed from: e */
    private static volatile bxxk f127108e;

    /* renamed from: a */
    public int f127109a;

    /* renamed from: b */
    public blnv f127110b;

    /* renamed from: d */
    private byte f127111d = 2;

    static {
        blol blol = new blol();
        f127107c = blol;
        GeneratedMessageLite.m124024a(blol.class, blol);
    }

    private blol() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127111d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127111d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127107c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blol();
        } else {
            if (i2 == 4) {
                return new bxvd(f127107c);
            }
            if (i2 == 5) {
                return f127107c;
            }
            bxxk bxxk = f127108e;
            if (bxxk == null) {
                synchronized (blol.class) {
                    bxxk = f127108e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127107c);
                        f127108e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
