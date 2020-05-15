package p000;

/* renamed from: bvgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvgw f156053d;

    /* renamed from: e */
    private static volatile bxxk f156054e;

    /* renamed from: a */
    public int f156055a;

    /* renamed from: b */
    public String f156056b = "";

    /* renamed from: c */
    public int f156057c;

    static {
        bvgw bvgw = new bvgw();
        f156053d = bvgw;
        GeneratedMessageLite.m124024a(bvgw.class, bvgw);
    }

    private bvgw() {
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
            return GeneratedMessageLite.m124022a(f156053d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvgw();
        } else {
            if (i2 == 4) {
                return new bxvd(f156053d);
            }
            if (i2 == 5) {
                return f156053d;
            }
            bxxk bxxk = f156054e;
            if (bxxk == null) {
                synchronized (bvgw.class) {
                    bxxk = f156054e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156053d);
                        f156054e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
