package p000;

/* renamed from: djc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final djc f13307f;

    /* renamed from: g */
    private static volatile bxxk f13308g;

    /* renamed from: a */
    public int f13309a;

    /* renamed from: b */
    public String f13310b = "";

    /* renamed from: c */
    public long f13311c;

    /* renamed from: d */
    public boolean f13312d;

    /* renamed from: e */
    public boolean f13313e;

    static {
        djc djc = new djc();
        f13307f = djc;
        bxvk.m124024a(djc.class, djc);
    }

    private djc() {
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
            return bxvk.m124022a(f13307f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new djc();
        } else {
            if (i2 == 4) {
                return new bxvd(f13307f);
            }
            if (i2 == 5) {
                return f13307f;
            }
            bxxk bxxk = f13308g;
            if (bxxk == null) {
                synchronized (djc.class) {
                    bxxk = f13308g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13307f);
                        f13308g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
