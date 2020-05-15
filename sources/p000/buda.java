package p000;

/* renamed from: buda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buda extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final buda f153440b;

    /* renamed from: d */
    private static volatile bxxk f153441d;

    /* renamed from: a */
    public budg f153442a;

    /* renamed from: c */
    private int f153443c;

    static {
        buda buda = new buda();
        f153440b = buda;
        GeneratedMessageLite.m124024a(buda.class, buda);
    }

    private buda() {
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
            return GeneratedMessageLite.m124022a(f153440b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new buda();
        } else {
            if (i2 == 4) {
                return new bxvd(f153440b);
            }
            if (i2 == 5) {
                return f153440b;
            }
            bxxk bxxk = f153441d;
            if (bxxk == null) {
                synchronized (buda.class) {
                    bxxk = f153441d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153440b);
                        f153441d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
