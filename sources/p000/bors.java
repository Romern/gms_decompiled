package p000;

/* renamed from: bors */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bors extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bors f134496f;

    /* renamed from: g */
    private static volatile bxxk f134497g;

    /* renamed from: a */
    public int f134498a;

    /* renamed from: b */
    public String f134499b = "";

    /* renamed from: c */
    public String f134500c = "";

    /* renamed from: d */
    public int f134501d;

    /* renamed from: e */
    public int f134502e;

    static {
        bors bors = new bors();
        f134496f = bors;
        GeneratedMessageLite.m124024a(bors.class, bors);
    }

    private bors() {
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
            return GeneratedMessageLite.m124022a(f134496f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bors();
        } else {
            if (i2 == 4) {
                return new bxvd(f134496f);
            }
            if (i2 == 5) {
                return f134496f;
            }
            bxxk bxxk = f134497g;
            if (bxxk == null) {
                synchronized (bors.class) {
                    bxxk = f134497g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134496f);
                        f134497g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
