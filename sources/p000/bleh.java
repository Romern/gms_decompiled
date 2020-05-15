package p000;

/* renamed from: bleh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bleh extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bleh f126199o;

    /* renamed from: p */
    private static volatile bxxk f126200p;

    /* renamed from: a */
    public int f126201a;

    /* renamed from: b */
    public bleu f126202b;

    /* renamed from: c */
    public String f126203c = "";

    /* renamed from: d */
    public String f126204d = "";

    /* renamed from: e */
    public String f126205e = "";

    /* renamed from: f */
    public String f126206f = "";

    /* renamed from: g */
    public String f126207g = "";

    /* renamed from: h */
    public String f126208h = "";

    /* renamed from: i */
    public String f126209i = "";

    /* renamed from: j */
    public String f126210j = "";

    /* renamed from: k */
    public String f126211k = "";

    /* renamed from: l */
    public String f126212l = "";

    /* renamed from: m */
    public String f126213m = "";

    /* renamed from: n */
    public String f126214n = "";

    static {
        bleh bleh = new bleh();
        f126199o = bleh;
        bxvk.m124024a(bleh.class, bleh);
    }

    private bleh() {
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
            return bxvk.m124022a(f126199o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u000f\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\b\tဈ\n\nဈ\u000b\u000eဈ\t\u000fဈ\f\u0010ဈ\u0003", new Object[]{"a", "b", "c", "n", "e", "f", "g", "h", "i", "k", "l", "j", "m", "d"});
        } else if (i2 == 3) {
            return new bleh();
        } else {
            if (i2 == 4) {
                return new bxvd(f126199o);
            }
            if (i2 == 5) {
                return f126199o;
            }
            bxxk bxxk = f126200p;
            if (bxxk == null) {
                synchronized (bleh.class) {
                    bxxk = f126200p;
                    if (bxxk == null) {
                        bxxk = new bxve(f126199o);
                        f126200p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
