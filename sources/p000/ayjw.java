package p000;

/* renamed from: ayjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ayjw f97795d;

    /* renamed from: f */
    private static volatile bxxk f97796f;

    /* renamed from: a */
    public int f97797a;

    /* renamed from: b */
    public int f97798b = 1;

    /* renamed from: c */
    public ayjv f97799c;

    /* renamed from: e */
    private byte f97800e = 2;

    static {
        ayjw ayjw = new ayjw();
        f97795d = ayjw;
        bxvk.m124024a(ayjw.class, ayjw);
    }

    private ayjw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97800e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97800e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97795d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", ayjt.f97776a, "c"});
        } else if (i2 == 3) {
            return new ayjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f97795d);
            }
            if (i2 == 5) {
                return f97795d;
            }
            bxxk bxxk = f97796f;
            if (bxxk == null) {
                synchronized (ayjw.class) {
                    bxxk = f97796f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97795d);
                        f97796f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
