package p000;

/* renamed from: bwds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwds extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwds f158924f;

    /* renamed from: g */
    private static volatile bxxk f158925g;

    /* renamed from: a */
    public int f158926a;

    /* renamed from: b */
    public String f158927b = "";

    /* renamed from: c */
    public String f158928c = "";

    /* renamed from: d */
    public String f158929d = "";

    /* renamed from: e */
    public bwdm f158930e;

    static {
        bwds bwds = new bwds();
        f158924f = bwds;
        GeneratedMessageLite.m124024a(bwds.class, bwds);
    }

    private bwds() {
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
            return GeneratedMessageLite.m124022a(f158924f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u000bဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwds();
        } else {
            if (i2 == 4) {
                return new bxvd(f158924f);
            }
            if (i2 == 5) {
                return f158924f;
            }
            bxxk bxxk = f158925g;
            if (bxxk == null) {
                synchronized (bwds.class) {
                    bxxk = f158925g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158924f);
                        f158925g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
