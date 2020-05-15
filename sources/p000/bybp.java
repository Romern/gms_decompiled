package p000;

/* renamed from: bybp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybp extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bybp f165546q;

    /* renamed from: r */
    private static volatile bxxk f165547r;

    /* renamed from: a */
    public int f165548a;

    /* renamed from: b */
    public String f165549b = "";

    /* renamed from: c */
    public String f165550c = "";

    /* renamed from: d */
    public String f165551d = "";

    /* renamed from: e */
    public String f165552e = "";

    /* renamed from: f */
    public int f165553f;

    /* renamed from: g */
    public int f165554g;

    /* renamed from: h */
    public long f165555h;

    /* renamed from: i */
    public long f165556i;

    /* renamed from: j */
    public long f165557j;

    /* renamed from: k */
    public long f165558k;

    /* renamed from: l */
    public String f165559l = "";

    /* renamed from: m */
    public long f165560m;

    /* renamed from: n */
    public int f165561n;

    /* renamed from: o */
    public boolean f165562o;

    /* renamed from: p */
    public String f165563p = "";

    static {
        bybp bybp = new bybp();
        f165546q = bybp;
        bxvk.m124024a(bybp.class, bybp);
    }

    private bybp() {
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
            return bxvk.m124022a(f165546q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဈ\n\fဂ\u000b\rင\f\u000eဇ\r\u000fဈ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bybp();
        } else {
            if (i2 == 4) {
                return new bxvd(f165546q);
            }
            if (i2 == 5) {
                return f165546q;
            }
            bxxk bxxk = f165547r;
            if (bxxk == null) {
                synchronized (bybp.class) {
                    bxxk = f165547r;
                    if (bxxk == null) {
                        bxxk = new bxve(f165546q);
                        f165547r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
