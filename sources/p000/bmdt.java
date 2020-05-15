package p000;

/* renamed from: bmdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmdt f128861d;

    /* renamed from: e */
    private static volatile bxxk f128862e;

    /* renamed from: a */
    public int f128863a;

    /* renamed from: b */
    public bmqk f128864b;

    /* renamed from: c */
    public boolean f128865c;

    static {
        bmdt bmdt = new bmdt();
        f128861d = bmdt;
        GeneratedMessageLite.m124024a(bmdt.class, bmdt);
    }

    private bmdt() {
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
            return GeneratedMessageLite.m124022a(f128861d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmdt();
        } else {
            if (i2 == 4) {
                return new bxvd(f128861d);
            }
            if (i2 == 5) {
                return f128861d;
            }
            bxxk bxxk = f128862e;
            if (bxxk == null) {
                synchronized (bmdt.class) {
                    bxxk = f128862e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128861d);
                        f128862e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
