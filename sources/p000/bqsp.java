package p000;

/* renamed from: bqsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqsp f141556c;

    /* renamed from: d */
    private static volatile bxxk f141557d;

    /* renamed from: a */
    public String f141558a = "";

    /* renamed from: b */
    public bqsf f141559b;

    static {
        bqsp bqsp = new bqsp();
        f141556c = bqsp;
        GeneratedMessageLite.m124024a(bqsp.class, bqsp);
    }

    private bqsp() {
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
            return GeneratedMessageLite.m124022a(f141556c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f141556c);
            }
            if (i2 == 5) {
                return f141556c;
            }
            bxxk bxxk = f141557d;
            if (bxxk == null) {
                synchronized (bqsp.class) {
                    bxxk = f141557d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141556c);
                        f141557d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
