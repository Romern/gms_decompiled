package p000;

/* renamed from: bygq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bygq f166367f;

    /* renamed from: h */
    private static volatile bxxk f166368h;

    /* renamed from: a */
    public int f166369a = 0;

    /* renamed from: b */
    public Object f166370b;

    /* renamed from: c */
    public int f166371c;

    /* renamed from: d */
    public byjl f166372d;

    /* renamed from: e */
    public int f166373e = 30;

    /* renamed from: g */
    private int f166374g;

    static {
        bygq bygq = new bygq();
        f166367f = bygq;
        GeneratedMessageLite.m124024a(bygq.class, bygq);
    }

    private bygq() {
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
            return GeneratedMessageLite.m124022a(f166367f, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဌ\u0004\u0004ြ\u0000\u0005ြ\u0000\u0007ဉ\u0005\bဋ\u0006", new Object[]{"b", "a", "g", "c", bygp.m124791b(), byio.class, byio.class, "d", "e"});
        } else if (i2 == 3) {
            return new bygq();
        } else {
            if (i2 == 4) {
                return new bxvd(f166367f);
            }
            if (i2 == 5) {
                return f166367f;
            }
            bxxk bxxk = f166368h;
            if (bxxk == null) {
                synchronized (bygq.class) {
                    bxxk = f166368h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166367f);
                        f166368h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
