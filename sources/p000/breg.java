package p000;

/* renamed from: breg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class breg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final breg f142604g;

    /* renamed from: h */
    private static volatile bxxk f142605h;

    /* renamed from: a */
    public int f142606a;

    /* renamed from: b */
    public bral f142607b;

    /* renamed from: c */
    public boolean f142608c;

    /* renamed from: d */
    public boolean f142609d;

    /* renamed from: e */
    public String f142610e = "";

    /* renamed from: f */
    public bree f142611f;

    static {
        breg breg = new breg();
        f142604g = breg;
        GeneratedMessageLite.m124024a(breg.class, breg);
    }

    private breg() {
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
            return GeneratedMessageLite.m124022a(f142604g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new breg();
        } else {
            if (i2 == 4) {
                return new bxvd(f142604g);
            }
            if (i2 == 5) {
                return f142604g;
            }
            bxxk bxxk = f142605h;
            if (bxxk == null) {
                synchronized (breg.class) {
                    bxxk = f142605h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142604g);
                        f142605h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
