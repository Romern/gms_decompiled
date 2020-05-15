package p000;

/* renamed from: bsmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsmc f144996b;

    /* renamed from: d */
    private static volatile bxxk f144997d;

    /* renamed from: a */
    public bslz f144998a;

    /* renamed from: c */
    private int f144999c;

    static {
        bsmc bsmc = new bsmc();
        f144996b = bsmc;
        GeneratedMessageLite.m124024a(bsmc.class, bsmc);
    }

    private bsmc() {
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
            return GeneratedMessageLite.m124022a(f144996b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsmc();
        } else {
            if (i2 == 4) {
                return new bxvd(f144996b);
            }
            if (i2 == 5) {
                return f144996b;
            }
            bxxk bxxk = f144997d;
            if (bxxk == null) {
                synchronized (bsmc.class) {
                    bxxk = f144997d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144996b);
                        f144997d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
