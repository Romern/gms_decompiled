package p000;

/* renamed from: bolb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bolb f133489f;

    /* renamed from: g */
    private static volatile bxxk f133490g;

    /* renamed from: a */
    public int f133491a;

    /* renamed from: b */
    public String f133492b = "";

    /* renamed from: c */
    public boolean f133493c;

    /* renamed from: d */
    public int f133494d;

    /* renamed from: e */
    public long f133495e;

    static {
        bolb bolb = new bolb();
        f133489f = bolb;
        GeneratedMessageLite.m124024a(bolb.class, bolb);
    }

    private bolb() {
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
            return GeneratedMessageLite.m124022a(f133489f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", bola.f133488a, "e"});
        } else if (i2 == 3) {
            return new bolb();
        } else {
            if (i2 == 4) {
                return new bxvd(f133489f);
            }
            if (i2 == 5) {
                return f133489f;
            }
            bxxk bxxk = f133490g;
            if (bxxk == null) {
                synchronized (bolb.class) {
                    bxxk = f133490g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133489f);
                        f133490g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
