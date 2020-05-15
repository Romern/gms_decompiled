package p000;

/* renamed from: byhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byhz f166535c;

    /* renamed from: d */
    private static volatile bxxk f166536d;

    /* renamed from: a */
    public int f166537a;

    /* renamed from: b */
    public boolean f166538b;

    static {
        byhz byhz = new byhz();
        f166535c = byhz;
        GeneratedMessageLite.m124024a(byhz.class, byhz);
    }

    private byhz() {
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
            return GeneratedMessageLite.m124022a(f166535c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f166535c);
            }
            if (i2 == 5) {
                return f166535c;
            }
            bxxk bxxk = f166536d;
            if (bxxk == null) {
                synchronized (byhz.class) {
                    bxxk = f166536d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166535c);
                        f166536d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
