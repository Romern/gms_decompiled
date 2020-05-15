package p000;

/* renamed from: byeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byeb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byeb f165885d;

    /* renamed from: e */
    private static volatile bxxk f165886e;

    /* renamed from: a */
    public cbmo f165887a;

    /* renamed from: b */
    public cbds f165888b;

    /* renamed from: c */
    public cbff f165889c;

    static {
        byeb byeb = new byeb();
        f165885d = byeb;
        GeneratedMessageLite.m124024a(byeb.class, byeb);
    }

    private byeb() {
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
            return GeneratedMessageLite.m124022a(f165885d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byeb();
        } else {
            if (i2 == 4) {
                return new bxvd(f165885d);
            }
            if (i2 == 5) {
                return f165885d;
            }
            bxxk bxxk = f165886e;
            if (bxxk == null) {
                synchronized (byeb.class) {
                    bxxk = f165886e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165885d);
                        f165886e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
