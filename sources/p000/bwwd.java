package p000;

/* renamed from: bwwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwwd f161220d;

    /* renamed from: e */
    public static final bxvj f161221e;

    /* renamed from: f */
    private static volatile bxxk f161222f;

    /* renamed from: a */
    public int f161223a;

    /* renamed from: b */
    public String f161224b = "";

    /* renamed from: c */
    public bxvt f161225c = bxvm.f164965b;

    static {
        bwwd bwwd = new bwwd();
        f161220d = bwwd;
        GeneratedMessageLite.m124024a(bwwd.class, bwwd);
        bwog bwog = bwog.f160437f;
        bwwd bwwd2 = f161220d;
        f161221e = GeneratedMessageLite.m124006a(bwog, bwwd2, bwwd2, 235650857, bxzf.MESSAGE);
    }

    private bwwd() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f161220d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwwd();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161220d;
            }
            bxxk bxxk = f161222f;
            if (bxxk == null) {
                synchronized (bwwd.class) {
                    bxxk = f161222f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161220d);
                        f161222f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
