package p000;

/* renamed from: bwip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwip extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwip f159664e;

    /* renamed from: f */
    private static volatile bxxk f159665f;

    /* renamed from: a */
    public int f159666a;

    /* renamed from: b */
    public boolean f159667b;

    /* renamed from: c */
    public String f159668c = "";

    /* renamed from: d */
    public int f159669d;

    static {
        bwip bwip = new bwip();
        f159664e = bwip;
        GeneratedMessageLite.m124024a(bwip.class, bwip);
    }

    private bwip() {
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
            return GeneratedMessageLite.m124022a(f159664e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwip();
        } else {
            if (i2 == 4) {
                return new bxvd(f159664e);
            }
            if (i2 == 5) {
                return f159664e;
            }
            bxxk bxxk = f159665f;
            if (bxxk == null) {
                synchronized (bwip.class) {
                    bxxk = f159665f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159664e);
                        f159665f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
