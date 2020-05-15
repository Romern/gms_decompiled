package p000;

/* renamed from: bvox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvox extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvox f157234d;

    /* renamed from: e */
    private static volatile bxxk f157235e;

    /* renamed from: a */
    public int f157236a;

    /* renamed from: b */
    public bxvw f157237b = bxwq.f165002b;

    /* renamed from: c */
    public bvny f157238c;

    static {
        bvox bvox = new bvox();
        f157234d = bvox;
        GeneratedMessageLite.m124024a(bvox.class, bvox);
    }

    private bvox() {
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
            return GeneratedMessageLite.m124022a(f157234d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0017\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvox();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f157234d;
            }
            bxxk bxxk = f157235e;
            if (bxxk == null) {
                synchronized (bvox.class) {
                    bxxk = f157235e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157234d);
                        f157235e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
