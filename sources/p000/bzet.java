package p000;

/* renamed from: bzet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzet extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzet f169719f;

    /* renamed from: g */
    public static final bxvj f169720g;

    /* renamed from: h */
    private static volatile bxxk f169721h;

    /* renamed from: a */
    public int f169722a;

    /* renamed from: b */
    public bzgd f169723b;

    /* renamed from: c */
    public bzft f169724c;

    /* renamed from: d */
    public bzfh f169725d;

    /* renamed from: e */
    public long f169726e;

    static {
        bzet bzet = new bzet();
        f169719f = bzet;
        GeneratedMessageLite.m124024a(bzet.class, bzet);
        blcd blcd = blcd.f125907a;
        bzet bzet2 = f169719f;
        f169720g = GeneratedMessageLite.m124006a(blcd, bzet2, bzet2, 84453462, bxzf.MESSAGE);
    }

    private bzet() {
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
            return GeneratedMessageLite.m124022a(f169719f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzet();
        } else {
            if (i2 == 4) {
                return new bxvd(f169719f);
            }
            if (i2 == 5) {
                return f169719f;
            }
            bxxk bxxk = f169721h;
            if (bxxk == null) {
                synchronized (bzet.class) {
                    bxxk = f169721h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169719f);
                        f169721h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
