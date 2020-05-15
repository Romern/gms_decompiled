package p000;

/* renamed from: brbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brbn f142290d;

    /* renamed from: e */
    private static volatile bxxk f142291e;

    /* renamed from: a */
    public int f142292a;

    /* renamed from: b */
    public bral f142293b;

    /* renamed from: c */
    public bree f142294c;

    static {
        brbn brbn = new brbn();
        f142290d = brbn;
        GeneratedMessageLite.m124024a(brbn.class, brbn);
    }

    private brbn() {
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
            return GeneratedMessageLite.m124022a(f142290d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brbn();
        } else {
            if (i2 == 4) {
                return new bxvd(f142290d);
            }
            if (i2 == 5) {
                return f142290d;
            }
            bxxk bxxk = f142291e;
            if (bxxk == null) {
                synchronized (brbn.class) {
                    bxxk = f142291e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142290d);
                        f142291e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
