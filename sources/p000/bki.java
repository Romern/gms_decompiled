package p000;

/* renamed from: bki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bki extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bki f4964g;

    /* renamed from: h */
    private static volatile bxxk f4965h;

    /* renamed from: a */
    public int f4966a;

    /* renamed from: b */
    public long f4967b;

    /* renamed from: c */
    public long f4968c;

    /* renamed from: d */
    public long f4969d;

    /* renamed from: e */
    public bkq f4970e;

    /* renamed from: f */
    public boolean f4971f = true;

    static {
        bki bki = new bki();
        f4964g = bki;
        GeneratedMessageLite.m124024a(bki.class, bki);
    }

    private bki() {
        bxwq bxwq = bxwq.f165002b;
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f4964g, "\u0001\u0005\u0000\u0001\u0001e\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002dဉ\u0005eဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bki();
        } else {
            if (i2 == 4) {
                return new bxvd(f4964g);
            }
            if (i2 == 5) {
                return f4964g;
            }
            bxxk bxxk = f4965h;
            if (bxxk == null) {
                synchronized (bki.class) {
                    bxxk = f4965h;
                    if (bxxk == null) {
                        bxxk = new bxve(f4964g);
                        f4965h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
