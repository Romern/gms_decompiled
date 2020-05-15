package p000;

/* renamed from: bttm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bttm f150361c;

    /* renamed from: e */
    private static volatile bxxk f150362e;

    /* renamed from: a */
    public String f150363a = "";

    /* renamed from: b */
    public String f150364b = "";

    /* renamed from: d */
    private int f150365d;

    static {
        bttm bttm = new bttm();
        f150361c = bttm;
        GeneratedMessageLite.m124024a(bttm.class, bttm);
    }

    private bttm() {
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
            return GeneratedMessageLite.m124022a(f150361c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bttm();
        } else {
            if (i2 == 4) {
                return new bxvd(f150361c);
            }
            if (i2 == 5) {
                return f150361c;
            }
            bxxk bxxk = f150362e;
            if (bxxk == null) {
                synchronized (bttm.class) {
                    bxxk = f150362e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150361c);
                        f150362e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
