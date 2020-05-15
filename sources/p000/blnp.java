package p000;

/* renamed from: blnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blnp f127015a;

    /* renamed from: e */
    private static volatile bxxk f127016e;

    /* renamed from: b */
    private int f127017b;

    /* renamed from: c */
    private blnv f127018c;

    /* renamed from: d */
    private byte f127019d = 2;

    static {
        blnp blnp = new blnp();
        f127015a = blnp;
        GeneratedMessageLite.m124024a(blnp.class, blnp);
    }

    private blnp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127019d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127019d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127015a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f127015a);
            }
            if (i2 == 5) {
                return f127015a;
            }
            bxxk bxxk = f127016e;
            if (bxxk == null) {
                synchronized (blnp.class) {
                    bxxk = f127016e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127015a);
                        f127016e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
