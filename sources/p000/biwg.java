package p000;

/* renamed from: biwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwg extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final biwg f122091j;

    /* renamed from: k */
    private static volatile bxxk f122092k;

    /* renamed from: a */
    public int f122093a;

    /* renamed from: b */
    public int f122094b = 1;

    /* renamed from: c */
    public int f122095c = 1;

    /* renamed from: d */
    public int f122096d;

    /* renamed from: e */
    public int f122097e;

    /* renamed from: f */
    public int f122098f;

    /* renamed from: g */
    public int f122099g;

    /* renamed from: h */
    public int f122100h;

    /* renamed from: i */
    public int f122101i;

    static {
        biwg biwg = new biwg();
        f122091j = biwg;
        GeneratedMessageLite.m124024a(biwg.class, biwg);
    }

    private biwg() {
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
            return GeneratedMessageLite.m124022a(f122091j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\bဋ\u0007\tဋ\b", new Object[]{"a", "b", biwf.m102897b(), "c", biwn.f122114a, "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new biwg();
        } else {
            if (i2 == 4) {
                return new bxvd(f122091j);
            }
            if (i2 == 5) {
                return f122091j;
            }
            bxxk bxxk = f122092k;
            if (bxxk == null) {
                synchronized (biwg.class) {
                    bxxk = f122092k;
                    if (bxxk == null) {
                        bxxk = new bxve(f122091j);
                        f122092k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
