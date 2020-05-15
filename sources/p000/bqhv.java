package p000;

/* renamed from: bqhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqhv f140728b;

    /* renamed from: c */
    private static volatile bxxk f140729c;

    /* renamed from: a */
    public bxwc f140730a = bxxn.f165040b;

    static {
        bqhv bqhv = new bqhv();
        f140728b = bqhv;
        GeneratedMessageLite.m124024a(bqhv.class, bqhv);
    }

    private bqhv() {
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
            return GeneratedMessageLite.m124022a(f140728b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqhv();
        } else {
            if (i2 == 4) {
                return new bxvd(f140728b);
            }
            if (i2 == 5) {
                return f140728b;
            }
            bxxk bxxk = f140729c;
            if (bxxk == null) {
                synchronized (bqhv.class) {
                    bxxk = f140729c;
                    if (bxxk == null) {
                        bxxk = new bxve(f140728b);
                        f140729c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
