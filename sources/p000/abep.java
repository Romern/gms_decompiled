package p000;

/* renamed from: abep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abep extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abep f57271d;

    /* renamed from: e */
    private static volatile bxxk f57272e;

    /* renamed from: a */
    public int f57273a;

    /* renamed from: b */
    public String f57274b = "";

    /* renamed from: c */
    public String f57275c = "";

    static {
        abep abep = new abep();
        f57271d = abep;
        GeneratedMessageLite.m124024a(abep.class, abep);
    }

    private abep() {
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
            return GeneratedMessageLite.m124022a(f57271d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abep();
        } else {
            if (i2 == 4) {
                return new bxvd(f57271d);
            }
            if (i2 == 5) {
                return f57271d;
            }
            bxxk bxxk = f57272e;
            if (bxxk == null) {
                synchronized (abep.class) {
                    bxxk = f57272e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57271d);
                        f57272e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
