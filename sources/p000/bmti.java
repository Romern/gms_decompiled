package p000;

/* renamed from: bmti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmti extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmti f130844c;

    /* renamed from: d */
    private static volatile bxxk f130845d;

    /* renamed from: a */
    public bmtg f130846a;

    /* renamed from: b */
    public bmto f130847b;

    static {
        bmti bmti = new bmti();
        f130844c = bmti;
        GeneratedMessageLite.m124024a(bmti.class, bmti);
    }

    private bmti() {
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
            return GeneratedMessageLite.m124022a(f130844c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmti();
        } else {
            if (i2 == 4) {
                return new bxvd(f130844c);
            }
            if (i2 == 5) {
                return f130844c;
            }
            bxxk bxxk = f130845d;
            if (bxxk == null) {
                synchronized (bmti.class) {
                    bxxk = f130845d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130844c);
                        f130845d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
