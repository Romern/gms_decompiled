package p000;

/* renamed from: bqsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqsi f141525e;

    /* renamed from: f */
    private static volatile bxxk f141526f;

    /* renamed from: a */
    public bqsd f141527a;

    /* renamed from: b */
    public int f141528b;

    /* renamed from: c */
    public int f141529c;

    /* renamed from: d */
    public int f141530d;

    static {
        bqsi bqsi = new bqsi();
        f141525e = bqsi;
        GeneratedMessageLite.m124024a(bqsi.class, bqsi);
    }

    private bqsi() {
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
            return GeneratedMessageLite.m124022a(f141525e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f141525e);
            }
            if (i2 == 5) {
                return f141525e;
            }
            bxxk bxxk = f141526f;
            if (bxxk == null) {
                synchronized (bqsi.class) {
                    bxxk = f141526f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141525e);
                        f141526f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
