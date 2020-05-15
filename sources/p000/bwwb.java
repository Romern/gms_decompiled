package p000;

/* renamed from: bwwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwwb f161205e;

    /* renamed from: f */
    private static volatile bxxk f161206f;

    /* renamed from: a */
    public int f161207a;

    /* renamed from: b */
    public String f161208b = "";

    /* renamed from: c */
    public String f161209c = "";

    /* renamed from: d */
    public int f161210d;

    static {
        bwwb bwwb = new bwwb();
        f161205e = bwwb;
        GeneratedMessageLite.m124024a(bwwb.class, bwwb);
    }

    private bwwb() {
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
            return GeneratedMessageLite.m124022a(f161205e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bwvz.f161204a});
        } else if (i2 == 3) {
            return new bwwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f161205e);
            }
            if (i2 == 5) {
                return f161205e;
            }
            bxxk bxxk = f161206f;
            if (bxxk == null) {
                synchronized (bwwb.class) {
                    bxxk = f161206f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161205e);
                        f161206f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
