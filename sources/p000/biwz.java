package p000;

/* renamed from: biwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final biwz f122147d;

    /* renamed from: e */
    private static volatile bxxk f122148e;

    /* renamed from: a */
    public int f122149a;

    /* renamed from: b */
    public int f122150b = 1;

    /* renamed from: c */
    public String f122151c = "";

    static {
        biwz biwz = new biwz();
        f122147d = biwz;
        GeneratedMessageLite.m124024a(biwz.class, biwz);
    }

    private biwz() {
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
            return GeneratedMessageLite.m124022a(f122147d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", biwx.f122146a, "c"});
        } else if (i2 == 3) {
            return new biwz();
        } else {
            if (i2 == 4) {
                return new bxvd(f122147d);
            }
            if (i2 == 5) {
                return f122147d;
            }
            bxxk bxxk = f122148e;
            if (bxxk == null) {
                synchronized (biwz.class) {
                    bxxk = f122148e;
                    if (bxxk == null) {
                        bxxk = new bxve(f122147d);
                        f122148e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
