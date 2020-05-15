package p000;

/* renamed from: bwvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwvr f161165d;

    /* renamed from: e */
    public static final bxvj f161166e;

    /* renamed from: f */
    private static volatile bxxk f161167f;

    /* renamed from: a */
    public int f161168a;

    /* renamed from: b */
    public String f161169b = "";

    /* renamed from: c */
    public long f161170c;

    static {
        bwvr bwvr = new bwvr();
        f161165d = bwvr;
        GeneratedMessageLite.m124024a(bwvr.class, bwvr);
        bwog bwog = bwog.f160437f;
        bwvr bwvr2 = f161165d;
        f161166e = GeneratedMessageLite.m124006a(bwog, bwvr2, bwvr2, 254223144, bxzf.MESSAGE);
    }

    private bwvr() {
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
            return GeneratedMessageLite.m124022a(f161165d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwvr();
        } else {
            if (i2 == 4) {
                return new bxvd(f161165d);
            }
            if (i2 == 5) {
                return f161165d;
            }
            bxxk bxxk = f161167f;
            if (bxxk == null) {
                synchronized (bwvr.class) {
                    bxxk = f161167f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161165d);
                        f161167f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
