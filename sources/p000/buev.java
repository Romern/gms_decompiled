package p000;

/* renamed from: buev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buev extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buev f153658e;

    /* renamed from: f */
    private static volatile bxxk f153659f;

    /* renamed from: a */
    public int f153660a;

    /* renamed from: b */
    public int f153661b;

    /* renamed from: c */
    public int f153662c;

    /* renamed from: d */
    public bufe f153663d;

    static {
        buev buev = new buev();
        f153658e = buev;
        GeneratedMessageLite.m124024a(buev.class, buev);
    }

    private buev() {
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
            return GeneratedMessageLite.m124022a(f153658e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buev();
        } else {
            if (i2 == 4) {
                return new bxvd(f153658e);
            }
            if (i2 == 5) {
                return f153658e;
            }
            bxxk bxxk = f153659f;
            if (bxxk == null) {
                synchronized (buev.class) {
                    bxxk = f153659f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153658e);
                        f153659f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
