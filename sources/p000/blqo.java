package p000;

/* renamed from: blqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blqo f127381a;

    /* renamed from: e */
    private static volatile bxxk f127382e;

    /* renamed from: b */
    private int f127383b;

    /* renamed from: c */
    private blot f127384c;

    /* renamed from: d */
    private byte f127385d = 2;

    static {
        blqo blqo = new blqo();
        f127381a = blqo;
        GeneratedMessageLite.m124024a(blqo.class, blqo);
    }

    private blqo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127385d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127385d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127381a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f127381a);
            }
            if (i2 == 5) {
                return f127381a;
            }
            bxxk bxxk = f127382e;
            if (bxxk == null) {
                synchronized (blqo.class) {
                    bxxk = f127382e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127381a);
                        f127382e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
