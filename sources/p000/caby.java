package p000;

/* renamed from: caby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caby extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final caby f172491d;

    /* renamed from: e */
    private static volatile bxxk f172492e;

    /* renamed from: a */
    public int f172493a;

    /* renamed from: b */
    public long f172494b;

    /* renamed from: c */
    public long f172495c;

    static {
        caby caby = new caby();
        f172491d = caby;
        GeneratedMessageLite.m124024a(caby.class, caby);
    }

    private caby() {
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
            return GeneratedMessageLite.m124022a(f172491d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new caby();
        } else {
            if (i2 == 4) {
                return new bxvd(f172491d);
            }
            if (i2 == 5) {
                return f172491d;
            }
            bxxk bxxk = f172492e;
            if (bxxk == null) {
                synchronized (caby.class) {
                    bxxk = f172492e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172491d);
                        f172492e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
