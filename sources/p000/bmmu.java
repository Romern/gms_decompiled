package p000;

/* renamed from: bmmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmmu f130049b;

    /* renamed from: d */
    private static volatile bxxk f130050d;

    /* renamed from: a */
    public bwip f130051a;

    /* renamed from: c */
    private int f130052c;

    static {
        bmmu bmmu = new bmmu();
        f130049b = bmmu;
        GeneratedMessageLite.m124024a(bmmu.class, bmmu);
    }

    private bmmu() {
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
            return GeneratedMessageLite.m124022a(f130049b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f130049b);
            }
            if (i2 == 5) {
                return f130049b;
            }
            bxxk bxxk = f130050d;
            if (bxxk == null) {
                synchronized (bmmu.class) {
                    bxxk = f130050d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130049b);
                        f130050d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
