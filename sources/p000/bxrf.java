package p000;

/* renamed from: bxrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxrf f164550c;

    /* renamed from: d */
    private static volatile bxxk f164551d;

    /* renamed from: a */
    public int f164552a;

    /* renamed from: b */
    public blbt f164553b;

    static {
        bxrf bxrf = new bxrf();
        f164550c = bxrf;
        GeneratedMessageLite.m124024a(bxrf.class, bxrf);
    }

    private bxrf() {
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
            return GeneratedMessageLite.m124022a(f164550c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxrf();
        } else {
            if (i2 == 4) {
                return new bxvd(f164550c);
            }
            if (i2 == 5) {
                return f164550c;
            }
            bxxk bxxk = f164551d;
            if (bxxk == null) {
                synchronized (bxrf.class) {
                    bxxk = f164551d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164550c);
                        f164551d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
