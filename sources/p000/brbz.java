package p000;

/* renamed from: brbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brbz f142342b;

    /* renamed from: d */
    private static volatile bxxk f142343d;

    /* renamed from: a */
    public brbu f142344a;

    /* renamed from: c */
    private int f142345c;

    static {
        brbz brbz = new brbz();
        f142342b = brbz;
        GeneratedMessageLite.m124024a(brbz.class, brbz);
    }

    private brbz() {
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
            return GeneratedMessageLite.m124022a(f142342b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbz();
        } else {
            if (i2 == 4) {
                return new bxvd(f142342b);
            }
            if (i2 == 5) {
                return f142342b;
            }
            bxxk bxxk = f142343d;
            if (bxxk == null) {
                synchronized (brbz.class) {
                    bxxk = f142343d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142342b);
                        f142343d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
