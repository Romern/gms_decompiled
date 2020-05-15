package p000;

/* renamed from: bwsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwsp f160899c;

    /* renamed from: d */
    public static final bxvj f160900d;

    /* renamed from: e */
    private static volatile bxxk f160901e;

    /* renamed from: a */
    public int f160902a;

    /* renamed from: b */
    public String f160903b = "";

    static {
        bwsp bwsp = new bwsp();
        f160899c = bwsp;
        GeneratedMessageLite.m124024a(bwsp.class, bwsp);
        bwog bwog = bwog.f160437f;
        bwsp bwsp2 = f160899c;
        f160900d = GeneratedMessageLite.m124006a(bwog, bwsp2, bwsp2, 209031767, bxzf.MESSAGE);
    }

    private bwsp() {
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
            return GeneratedMessageLite.m124022a(f160899c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f160899c);
            }
            if (i2 == 5) {
                return f160899c;
            }
            bxxk bxxk = f160901e;
            if (bxxk == null) {
                synchronized (bwsp.class) {
                    bxxk = f160901e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160899c);
                        f160901e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
