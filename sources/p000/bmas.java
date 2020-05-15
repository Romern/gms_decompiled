package p000;

/* renamed from: bmas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmas extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmas f128494c;

    /* renamed from: e */
    private static volatile bxxk f128495e;

    /* renamed from: a */
    public bmaf f128496a;

    /* renamed from: b */
    public String f128497b = "";

    /* renamed from: d */
    private int f128498d;

    static {
        bmas bmas = new bmas();
        f128494c = bmas;
        GeneratedMessageLite.m124024a(bmas.class, bmas);
    }

    private bmas() {
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
            return GeneratedMessageLite.m124022a(f128494c, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဈ\u0001\u0005ဉ\u0000", new Object[]{"d", "b", "a"});
        } else if (i2 == 3) {
            return new bmas();
        } else {
            if (i2 == 4) {
                return new bxvd(f128494c);
            }
            if (i2 == 5) {
                return f128494c;
            }
            bxxk bxxk = f128495e;
            if (bxxk == null) {
                synchronized (bmas.class) {
                    bxxk = f128495e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128494c);
                        f128495e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
