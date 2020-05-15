package p000;

/* renamed from: bqro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqro extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqro f141457b;

    /* renamed from: c */
    private static volatile bxxk f141458c;

    /* renamed from: a */
    public bqrp f141459a;

    static {
        bqro bqro = new bqro();
        f141457b = bqro;
        GeneratedMessageLite.m124024a(bqro.class, bqro);
    }

    private bqro() {
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
            return GeneratedMessageLite.m124022a(f141457b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqro();
        } else {
            if (i2 == 4) {
                return new bxvd(f141457b);
            }
            if (i2 == 5) {
                return f141457b;
            }
            bxxk bxxk = f141458c;
            if (bxxk == null) {
                synchronized (bqro.class) {
                    bxxk = f141458c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141457b);
                        f141458c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
