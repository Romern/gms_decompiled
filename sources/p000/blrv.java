package p000;

/* renamed from: blrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blrv f127536b;

    /* renamed from: e */
    private static volatile bxxk f127537e;

    /* renamed from: a */
    public blrj f127538a;

    /* renamed from: c */
    private int f127539c;

    /* renamed from: d */
    private byte f127540d = 2;

    static {
        blrv blrv = new blrv();
        f127536b = blrv;
        GeneratedMessageLite.m124024a(blrv.class, blrv);
    }

    private blrv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127540d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127540d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127536b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f127536b);
            }
            if (i2 == 5) {
                return f127536b;
            }
            bxxk bxxk = f127537e;
            if (bxxk == null) {
                synchronized (blrv.class) {
                    bxxk = f127537e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127536b);
                        f127537e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
