package p000;

/* renamed from: bsig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsig extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsig f144713b;

    /* renamed from: c */
    private static volatile bxxk f144714c;

    /* renamed from: a */
    public bsic f144715a;

    static {
        bsig bsig = new bsig();
        f144713b = bsig;
        GeneratedMessageLite.m124024a(bsig.class, bsig);
    }

    private bsig() {
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
            return GeneratedMessageLite.m124022a(f144713b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsig();
        } else {
            if (i2 == 4) {
                return new bxvd(f144713b);
            }
            if (i2 == 5) {
                return f144713b;
            }
            bxxk bxxk = f144714c;
            if (bxxk == null) {
                synchronized (bsig.class) {
                    bxxk = f144714c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144713b);
                        f144714c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
