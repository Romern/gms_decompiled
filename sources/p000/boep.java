package p000;

/* renamed from: boep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boep extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final boep f132813j;

    /* renamed from: k */
    private static volatile bxxk f132814k;

    /* renamed from: a */
    public int f132815a;

    /* renamed from: b */
    public int f132816b;

    /* renamed from: c */
    public int f132817c;

    /* renamed from: d */
    public int f132818d;

    /* renamed from: e */
    public int f132819e;

    /* renamed from: f */
    public boolean f132820f;

    /* renamed from: g */
    public int f132821g;

    /* renamed from: h */
    public int f132822h;

    /* renamed from: i */
    public int f132823i;

    static {
        boep boep = new boep();
        f132813j = boep;
        GeneratedMessageLite.m124024a(boep.class, boep);
    }

    private boep() {
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
            return GeneratedMessageLite.m124022a(f132813j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဌ\u0004\u0006ဇ\u0005\u0007င\u0006\bဌ\u0007\tဌ\b", new Object[]{"a", "b", boek.f132808a, "c", boem.f132810a, "d", boel.f132809a, "e", boej.f132807a, "f", "g", "h", boen.f132811a, "i", boeo.f132812a});
        } else if (i2 == 3) {
            return new boep();
        } else {
            if (i2 == 4) {
                return new bxvd(f132813j);
            }
            if (i2 == 5) {
                return f132813j;
            }
            bxxk bxxk = f132814k;
            if (bxxk == null) {
                synchronized (boep.class) {
                    bxxk = f132814k;
                    if (bxxk == null) {
                        bxxk = new bxve(f132813j);
                        f132814k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
