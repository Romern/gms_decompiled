package p000;

/* renamed from: byxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byxm f168760c;

    /* renamed from: d */
    private static volatile bxxk f168761d;

    /* renamed from: a */
    public int f168762a;

    /* renamed from: b */
    public String f168763b = "";

    static {
        byxm byxm = new byxm();
        f168760c = byxm;
        GeneratedMessageLite.m124024a(byxm.class, byxm);
    }

    private byxm() {
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
            return GeneratedMessageLite.m124022a(f168760c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f168760c);
            }
            if (i2 == 5) {
                return f168760c;
            }
            bxxk bxxk = f168761d;
            if (bxxk == null) {
                synchronized (byxm.class) {
                    bxxk = f168761d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168760c);
                        f168761d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
