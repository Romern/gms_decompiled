package p000;

/* renamed from: bvon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvon extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvon f157057d;

    /* renamed from: e */
    private static volatile bxxk f157058e;

    /* renamed from: a */
    public int f157059a;

    /* renamed from: b */
    public int f157060b;

    /* renamed from: c */
    public int f157061c;

    static {
        bvon bvon = new bvon();
        f157057d = bvon;
        GeneratedMessageLite.m124024a(bvon.class, bvon);
    }

    private bvon() {
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
            return GeneratedMessageLite.m124022a(f157057d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvon();
        } else {
            if (i2 == 4) {
                return new bxvd(f157057d);
            }
            if (i2 == 5) {
                return f157057d;
            }
            bxxk bxxk = f157058e;
            if (bxxk == null) {
                synchronized (bvon.class) {
                    bxxk = f157058e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157057d);
                        f157058e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
