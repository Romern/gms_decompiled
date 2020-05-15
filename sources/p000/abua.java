package p000;

/* renamed from: abua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abua extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abua f58332d;

    /* renamed from: e */
    private static volatile bxxk f58333e;

    /* renamed from: a */
    public int f58334a;

    /* renamed from: b */
    public String f58335b = "";

    /* renamed from: c */
    public int f58336c;

    static {
        abua abua = new abua();
        f58332d = abua;
        GeneratedMessageLite.m124024a(abua.class, abua);
    }

    private abua() {
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
            return GeneratedMessageLite.m124022a(f58332d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abua();
        } else {
            if (i2 == 4) {
                return new bxvd(f58332d);
            }
            if (i2 == 5) {
                return f58332d;
            }
            bxxk bxxk = f58333e;
            if (bxxk == null) {
                synchronized (abua.class) {
                    bxxk = f58333e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58332d);
                        f58333e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
