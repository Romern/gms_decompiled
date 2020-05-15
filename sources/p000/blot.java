package p000;

/* renamed from: blot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blot extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final blot f127133j;

    /* renamed from: l */
    private static volatile bxxk f127134l;

    /* renamed from: a */
    public int f127135a;

    /* renamed from: b */
    public int f127136b;

    /* renamed from: c */
    public int f127137c = 1;

    /* renamed from: d */
    public blol f127138d;

    /* renamed from: e */
    public blok f127139e;

    /* renamed from: f */
    public blod f127140f;

    /* renamed from: g */
    public bloq f127141g;

    /* renamed from: h */
    public bloj f127142h;

    /* renamed from: i */
    public blos f127143i;

    /* renamed from: k */
    private byte f127144k = 2;

    static {
        blot blot = new blot();
        f127133j = blot;
        GeneratedMessageLite.m124024a(blot.class, blot);
    }

    private blot() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127144k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127144k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127133j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", bloe.f127076a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new blot();
        } else {
            if (i2 == 4) {
                return new bxvd(f127133j);
            }
            if (i2 == 5) {
                return f127133j;
            }
            bxxk bxxk = f127134l;
            if (bxxk == null) {
                synchronized (blot.class) {
                    bxxk = f127134l;
                    if (bxxk == null) {
                        bxxk = new bxve(f127133j);
                        f127134l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
