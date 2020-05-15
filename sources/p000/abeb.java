package p000;

/* renamed from: abeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abeb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abeb f57166c;

    /* renamed from: e */
    private static volatile bxxk f57167e;

    /* renamed from: a */
    public String f57168a = "";

    /* renamed from: b */
    public String f57169b = "";

    /* renamed from: d */
    private int f57170d;

    static {
        abeb abeb = new abeb();
        f57166c = abeb;
        GeneratedMessageLite.m124024a(abeb.class, abeb);
    }

    private abeb() {
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
            return GeneratedMessageLite.m124022a(f57166c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new abeb();
        } else {
            if (i2 == 4) {
                return new bxvd(f57166c);
            }
            if (i2 == 5) {
                return f57166c;
            }
            bxxk bxxk = f57167e;
            if (bxxk == null) {
                synchronized (abeb.class) {
                    bxxk = f57167e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57166c);
                        f57167e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
