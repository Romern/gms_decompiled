package p000;

/* renamed from: bygl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bygl f166347d;

    /* renamed from: e */
    private static volatile bxxk f166348e;

    /* renamed from: a */
    public int f166349a;

    /* renamed from: b */
    public bygg f166350b;

    /* renamed from: c */
    public bygk f166351c;

    static {
        bygl bygl = new bygl();
        f166347d = bygl;
        GeneratedMessageLite.m124024a(bygl.class, bygl);
    }

    private bygl() {
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
            return GeneratedMessageLite.m124022a(f166347d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bygl();
        } else {
            if (i2 == 4) {
                return new bxvd(f166347d);
            }
            if (i2 == 5) {
                return f166347d;
            }
            bxxk bxxk = f166348e;
            if (bxxk == null) {
                synchronized (bygl.class) {
                    bxxk = f166348e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166347d);
                        f166348e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
