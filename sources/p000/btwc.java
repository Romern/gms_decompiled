package p000;

/* renamed from: btwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btwc f152687b;

    /* renamed from: c */
    private static volatile bxxk f152688c;

    /* renamed from: a */
    public btwf f152689a;

    static {
        btwc btwc = new btwc();
        f152687b = btwc;
        GeneratedMessageLite.m124024a(btwc.class, btwc);
    }

    private btwc() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f152687b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f152687b);
            }
            if (i2 == 5) {
                return f152687b;
            }
            bxxk bxxk = f152688c;
            if (bxxk == null) {
                synchronized (btwc.class) {
                    bxxk = f152688c;
                    if (bxxk == null) {
                        bxxk = new bxve(f152687b);
                        f152688c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
