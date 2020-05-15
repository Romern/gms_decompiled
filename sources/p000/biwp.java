package p000;

/* renamed from: biwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biwp f122115c;

    /* renamed from: d */
    private static volatile bxxk f122116d;

    /* renamed from: a */
    public int f122117a;

    /* renamed from: b */
    public int f122118b = 1;

    static {
        biwp biwp = new biwp();
        f122115c = biwp;
        GeneratedMessageLite.m124024a(biwp.class, biwp);
    }

    private biwp() {
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
            return GeneratedMessageLite.m124022a(f122115c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", biwq.f122119a});
        } else if (i2 == 3) {
            return new biwp();
        } else {
            if (i2 == 4) {
                return new bxvd(f122115c);
            }
            if (i2 == 5) {
                return f122115c;
            }
            bxxk bxxk = f122116d;
            if (bxxk == null) {
                synchronized (biwp.class) {
                    bxxk = f122116d;
                    if (bxxk == null) {
                        bxxk = new bxve(f122115c);
                        f122116d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
