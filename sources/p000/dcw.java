package p000;

/* renamed from: dcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final dcw f12892g;

    /* renamed from: h */
    private static volatile bxxk f12893h;

    /* renamed from: a */
    public int f12894a;

    /* renamed from: b */
    public int f12895b;

    /* renamed from: c */
    public int f12896c;

    /* renamed from: d */
    public int f12897d;

    /* renamed from: e */
    public int f12898e;

    /* renamed from: f */
    public int f12899f;

    static {
        dcw dcw = new dcw();
        f12892g = dcw;
        GeneratedMessageLite.m124024a(dcw.class, dcw);
    }

    private dcw() {
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
            return GeneratedMessageLite.m124022a(f12892g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", ddb.f12911a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new dcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f12892g);
            }
            if (i2 == 5) {
                return f12892g;
            }
            bxxk bxxk = f12893h;
            if (bxxk == null) {
                synchronized (dcw.class) {
                    bxxk = f12893h;
                    if (bxxk == null) {
                        bxxk = new bxve(f12892g);
                        f12893h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
