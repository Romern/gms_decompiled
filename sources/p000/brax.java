package p000;

/* renamed from: brax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brax extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final brax f142200f;

    /* renamed from: g */
    private static volatile bxxk f142201g;

    /* renamed from: a */
    public int f142202a;

    /* renamed from: b */
    public brak f142203b;

    /* renamed from: c */
    public String f142204c = "";

    /* renamed from: d */
    public int f142205d;

    /* renamed from: e */
    public boolean f142206e;

    static {
        brax brax = new brax();
        f142200f = brax;
        GeneratedMessageLite.m124024a(brax.class, brax);
    }

    private brax() {
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
            return GeneratedMessageLite.m124022a(f142200f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", brcm.m113876b(), "e"});
        } else if (i2 == 3) {
            return new brax();
        } else {
            if (i2 == 4) {
                return new bxvd(f142200f);
            }
            if (i2 == 5) {
                return f142200f;
            }
            bxxk bxxk = f142201g;
            if (bxxk == null) {
                synchronized (brax.class) {
                    bxxk = f142201g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142200f);
                        f142201g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
