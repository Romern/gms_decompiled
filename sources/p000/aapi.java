package p000;

/* renamed from: aapi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aapi f28771d;

    /* renamed from: e */
    private static volatile bxxk f28772e;

    /* renamed from: a */
    public int f28773a;

    /* renamed from: b */
    public long f28774b;

    /* renamed from: c */
    public long f28775c;

    static {
        aapi aapi = new aapi();
        f28771d = aapi;
        bxvk.m124024a(aapi.class, aapi);
    }

    private aapi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f28771d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aapi();
        } else {
            if (i2 == 4) {
                return new bxvd(f28771d);
            }
            if (i2 == 5) {
                return f28771d;
            }
            bxxk bxxk = f28772e;
            if (bxxk == null) {
                synchronized (aapi.class) {
                    bxxk = f28772e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28771d);
                        f28772e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
