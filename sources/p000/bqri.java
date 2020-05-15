package p000;

/* renamed from: bqri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqri extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqri f141435b;

    /* renamed from: c */
    private static volatile bxxk f141436c;

    /* renamed from: a */
    public bqrj f141437a;

    static {
        bqri bqri = new bqri();
        f141435b = bqri;
        GeneratedMessageLite.m124024a(bqri.class, bqri);
    }

    private bqri() {
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
            return GeneratedMessageLite.m124022a(f141435b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqri();
        } else {
            if (i2 == 4) {
                return new bxvd(f141435b);
            }
            if (i2 == 5) {
                return f141435b;
            }
            bxxk bxxk = f141436c;
            if (bxxk == null) {
                synchronized (bqri.class) {
                    bxxk = f141436c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141435b);
                        f141436c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
