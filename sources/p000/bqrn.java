package p000;

/* renamed from: bqrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqrn f141454b;

    /* renamed from: c */
    private static volatile bxxk f141455c;

    /* renamed from: a */
    public bqsf f141456a;

    static {
        bqrn bqrn = new bqrn();
        f141454b = bqrn;
        bxvk.m124024a(bqrn.class, bqrn);
    }

    private bqrn() {
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
            return bxvk.m124022a(f141454b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqrn();
        } else {
            if (i2 == 4) {
                return new bxvd(f141454b);
            }
            if (i2 == 5) {
                return f141454b;
            }
            bxxk bxxk = f141455c;
            if (bxxk == null) {
                synchronized (bqrn.class) {
                    bxxk = f141455c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141454b);
                        f141455c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
