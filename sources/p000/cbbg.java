package p000;

/* renamed from: cbbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbbg f176556d;

    /* renamed from: e */
    private static volatile bxxk f176557e;

    /* renamed from: a */
    public cbbi f176558a;

    /* renamed from: b */
    public cbbh f176559b;

    /* renamed from: c */
    public cbbd f176560c;

    static {
        cbbg cbbg = new cbbg();
        f176556d = cbbg;
        GeneratedMessageLite.m124024a(cbbg.class, cbbg);
    }

    private cbbg() {
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
            return GeneratedMessageLite.m124022a(f176556d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f176556d);
            }
            if (i2 == 5) {
                return f176556d;
            }
            bxxk bxxk = f176557e;
            if (bxxk == null) {
                synchronized (cbbg.class) {
                    bxxk = f176557e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176556d);
                        f176557e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
