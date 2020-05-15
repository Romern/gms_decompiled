package p000;

/* renamed from: ghk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ghk f18253f;

    /* renamed from: g */
    private static volatile bxxk f18254g;

    /* renamed from: a */
    public int f18255a;

    /* renamed from: b */
    public bssn f18256b;

    /* renamed from: c */
    public long f18257c;

    /* renamed from: d */
    public String f18258d = "";

    /* renamed from: e */
    public int f18259e;

    static {
        ghk ghk = new ghk();
        f18253f = ghk;
        GeneratedMessageLite.m124024a(ghk.class, ghk);
    }

    private ghk() {
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
            return GeneratedMessageLite.m124022a(f18253f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ghk();
        } else {
            if (i2 == 4) {
                return new bxvd(f18253f);
            }
            if (i2 == 5) {
                return f18253f;
            }
            bxxk bxxk = f18254g;
            if (bxxk == null) {
                synchronized (ghk.class) {
                    bxxk = f18254g;
                    if (bxxk == null) {
                        bxxk = new bxve(f18253f);
                        f18254g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
