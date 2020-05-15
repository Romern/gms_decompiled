package p000;

/* renamed from: bkxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkxq f125402g;

    /* renamed from: i */
    private static volatile bxxk f125403i;

    /* renamed from: a */
    public int f125404a;

    /* renamed from: b */
    public int f125405b = 1004;

    /* renamed from: c */
    public long f125406c;

    /* renamed from: d */
    public bkzq f125407d;

    /* renamed from: e */
    public long f125408e;

    /* renamed from: f */
    public bkxp f125409f;

    /* renamed from: h */
    private byte f125410h = 2;

    static {
        bkxq bkxq = new bkxq();
        f125402g = bkxq;
        GeneratedMessageLite.m124024a(bkxq.class, bkxq);
    }

    private bkxq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125410h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125410h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125402g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0001\u0002ဌ\u0001\u0003ဂ\u0004\u0005ᐉ\b\u0006ဂ\t\bဉ\u000b", new Object[]{"a", "b", bkxs.f125419a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bkxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f125402g);
            }
            if (i2 == 5) {
                return f125402g;
            }
            bxxk bxxk = f125403i;
            if (bxxk == null) {
                synchronized (bkxq.class) {
                    bxxk = f125403i;
                    if (bxxk == null) {
                        bxxk = new bxve(f125402g);
                        f125403i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
