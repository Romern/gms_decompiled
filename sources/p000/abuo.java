package p000;

/* renamed from: abuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final abuo f58437f;

    /* renamed from: g */
    private static volatile bxxk f58438g;

    /* renamed from: a */
    public int f58439a;

    /* renamed from: b */
    public String f58440b = "";

    /* renamed from: c */
    public int f58441c;

    /* renamed from: d */
    public boolean f58442d;

    /* renamed from: e */
    public int f58443e;

    static {
        abuo abuo = new abuo();
        f58437f = abuo;
        GeneratedMessageLite.m124024a(abuo.class, abuo);
    }

    private abuo() {
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
            return GeneratedMessageLite.m124022a(f58437f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဇ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new abuo();
        } else {
            if (i2 == 4) {
                return new bxvd(f58437f);
            }
            if (i2 == 5) {
                return f58437f;
            }
            bxxk bxxk = f58438g;
            if (bxxk == null) {
                synchronized (abuo.class) {
                    bxxk = f58438g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58437f);
                        f58438g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
