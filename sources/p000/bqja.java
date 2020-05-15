package p000;

/* renamed from: bqja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqja extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqja f140921d;

    /* renamed from: e */
    private static volatile bxxk f140922e;

    /* renamed from: a */
    public int f140923a;

    /* renamed from: b */
    public boolean f140924b;

    /* renamed from: c */
    public boolean f140925c;

    static {
        bqja bqja = new bqja();
        f140921d = bqja;
        GeneratedMessageLite.m124024a(bqja.class, bqja);
    }

    private bqja() {
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
            return GeneratedMessageLite.m124022a(f140921d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqja();
        } else {
            if (i2 == 4) {
                return new bxvd(f140921d);
            }
            if (i2 == 5) {
                return f140921d;
            }
            bxxk bxxk = f140922e;
            if (bxxk == null) {
                synchronized (bqja.class) {
                    bxxk = f140922e;
                    if (bxxk == null) {
                        bxxk = new bxve(f140921d);
                        f140922e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
