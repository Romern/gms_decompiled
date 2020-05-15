package p000;

/* renamed from: blnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blnn f127004c;

    /* renamed from: e */
    private static volatile bxxk f127005e;

    /* renamed from: a */
    public int f127006a;

    /* renamed from: b */
    public bsak f127007b;

    /* renamed from: d */
    private byte f127008d = 2;

    static {
        blnn blnn = new blnn();
        f127004c = blnn;
        bxvk.m124024a(blnn.class, blnn);
    }

    private blnn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127008d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127008d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127004c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blnn();
        } else {
            if (i2 == 4) {
                return new bxvd(f127004c);
            }
            if (i2 == 5) {
                return f127004c;
            }
            bxxk bxxk = f127005e;
            if (bxxk == null) {
                synchronized (blnn.class) {
                    bxxk = f127005e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127004c);
                        f127005e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
