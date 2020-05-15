package p000;

/* renamed from: bweb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bweb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bweb f158956f;

    /* renamed from: g */
    private static volatile bxxk f158957g;

    /* renamed from: a */
    public int f158958a;

    /* renamed from: b */
    public String f158959b = "";

    /* renamed from: c */
    public String f158960c = "";

    /* renamed from: d */
    public String f158961d = "";

    /* renamed from: e */
    public int f158962e;

    static {
        bweb bweb = new bweb();
        f158956f = bweb;
        GeneratedMessageLite.m124024a(bweb.class, bweb);
    }

    private bweb() {
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
            return GeneratedMessageLite.m124022a(f158956f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bwdz.f158955a});
        } else if (i2 == 3) {
            return new bweb();
        } else {
            if (i2 == 4) {
                return new bxvd(f158956f);
            }
            if (i2 == 5) {
                return f158956f;
            }
            bxxk bxxk = f158957g;
            if (bxxk == null) {
                synchronized (bweb.class) {
                    bxxk = f158957g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158956f);
                        f158957g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
