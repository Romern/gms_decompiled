package p000;

/* renamed from: blpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blpq f127273c;

    /* renamed from: e */
    private static volatile bxxk f127274e;

    /* renamed from: a */
    public int f127275a;

    /* renamed from: b */
    public blnu f127276b;

    /* renamed from: d */
    private byte f127277d = 2;

    static {
        blpq blpq = new blpq();
        f127273c = blpq;
        GeneratedMessageLite.m124024a(blpq.class, blpq);
    }

    private blpq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127277d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127277d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127273c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blpq();
        } else {
            if (i2 == 4) {
                return new bxvd(f127273c);
            }
            if (i2 == 5) {
                return f127273c;
            }
            bxxk bxxk = f127274e;
            if (bxxk == null) {
                synchronized (blpq.class) {
                    bxxk = f127274e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127273c);
                        f127274e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
