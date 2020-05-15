package p000;

/* renamed from: bkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bkc f4945b;

    /* renamed from: d */
    private static volatile bxxk f4946d;

    /* renamed from: a */
    public long f4947a;

    /* renamed from: c */
    private int f4948c;

    static {
        bkc bkc = new bkc();
        f4945b = bkc;
        GeneratedMessageLite.m124024a(bkc.class, bkc);
    }

    private bkc() {
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
            return GeneratedMessageLite.m124022a(f4945b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bkc();
        } else {
            if (i2 == 4) {
                return new bxvd(f4945b);
            }
            if (i2 == 5) {
                return f4945b;
            }
            bxxk bxxk = f4946d;
            if (bxxk == null) {
                synchronized (bkc.class) {
                    bxxk = f4946d;
                    if (bxxk == null) {
                        bxxk = new bxve(f4945b);
                        f4946d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
