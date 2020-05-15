package p000;

/* renamed from: sfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final sfo f44136d;

    /* renamed from: e */
    private static volatile bxxk f44137e;

    /* renamed from: a */
    public int f44138a;

    /* renamed from: b */
    public String f44139b = "";

    /* renamed from: c */
    public String f44140c = "";

    static {
        sfo sfo = new sfo();
        f44136d = sfo;
        GeneratedMessageLite.m124024a(sfo.class, sfo);
    }

    private sfo() {
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
            return GeneratedMessageLite.m124022a(f44136d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new sfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f44136d);
            }
            if (i2 == 5) {
                return f44136d;
            }
            bxxk bxxk = f44137e;
            if (bxxk == null) {
                synchronized (sfo.class) {
                    bxxk = f44137e;
                    if (bxxk == null) {
                        bxxk = new bxve(f44136d);
                        f44137e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
