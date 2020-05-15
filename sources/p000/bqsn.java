package p000;

/* renamed from: bqsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqsn f141549b;

    /* renamed from: c */
    private static volatile bxxk f141550c;

    /* renamed from: a */
    public String f141551a = "";

    static {
        bqsn bqsn = new bqsn();
        f141549b = bqsn;
        bxvk.m124024a(bqsn.class, bqsn);
    }

    private bqsn() {
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
            return bxvk.m124022a(f141549b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqsn();
        } else {
            if (i2 == 4) {
                return new bxvd(f141549b);
            }
            if (i2 == 5) {
                return f141549b;
            }
            bxxk bxxk = f141550c;
            if (bxxk == null) {
                synchronized (bqsn.class) {
                    bxxk = f141550c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141549b);
                        f141550c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
