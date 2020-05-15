package p000;

/* renamed from: byvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byvn f168463e;

    /* renamed from: f */
    private static volatile bxxk f168464f;

    /* renamed from: a */
    public int f168465a;

    /* renamed from: b */
    public int f168466b;

    /* renamed from: c */
    public byvo f168467c;

    /* renamed from: d */
    public String f168468d = "";

    static {
        byvn byvn = new byvn();
        f168463e = byvn;
        GeneratedMessageLite.m124024a(byvn.class, byvn);
    }

    private byvn() {
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
            return GeneratedMessageLite.m124022a(f168463e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bzag.f169215a, "c", "d"});
        } else if (i2 == 3) {
            return new byvn();
        } else {
            if (i2 == 4) {
                return new bxvd(f168463e);
            }
            if (i2 == 5) {
                return f168463e;
            }
            bxxk bxxk = f168464f;
            if (bxxk == null) {
                synchronized (byvn.class) {
                    bxxk = f168464f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168463e);
                        f168464f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
