package p000;

/* renamed from: ayjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ayjx f97801d;

    /* renamed from: f */
    private static volatile bxxk f97802f;

    /* renamed from: a */
    public int f97803a;

    /* renamed from: b */
    public String f97804b = "";

    /* renamed from: c */
    public ayjw f97805c;

    /* renamed from: e */
    private byte f97806e = 2;

    static {
        ayjx ayjx = new ayjx();
        f97801d = ayjx;
        GeneratedMessageLite.m124024a(ayjx.class, ayjx);
    }

    private ayjx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97806e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97806e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97801d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ayjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f97801d);
            }
            if (i2 == 5) {
                return f97801d;
            }
            bxxk bxxk = f97802f;
            if (bxxk == null) {
                synchronized (ayjx.class) {
                    bxxk = f97802f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97801d);
                        f97802f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
