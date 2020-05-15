package p000;

/* renamed from: bzkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzkz f170489b;

    /* renamed from: d */
    private static volatile bxxk f170490d;

    /* renamed from: a */
    public long f170491a;

    /* renamed from: c */
    private int f170492c;

    static {
        bzkz bzkz = new bzkz();
        f170489b = bzkz;
        GeneratedMessageLite.m124024a(bzkz.class, bzkz);
    }

    private bzkz() {
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
            return GeneratedMessageLite.m124022a(f170489b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170489b);
            }
            if (i2 == 5) {
                return f170489b;
            }
            bxxk bxxk = f170490d;
            if (bxxk == null) {
                synchronized (bzkz.class) {
                    bxxk = f170490d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170489b);
                        f170490d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
