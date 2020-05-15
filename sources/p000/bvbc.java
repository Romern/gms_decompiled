package p000;

/* renamed from: bvbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbc extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bvbc f155522h;

    /* renamed from: j */
    private static volatile bxxk f155523j;

    /* renamed from: a */
    public int f155524a;

    /* renamed from: b */
    public int f155525b;

    /* renamed from: c */
    public buzl f155526c;

    /* renamed from: d */
    public bvam f155527d;

    /* renamed from: e */
    public buyr f155528e;

    /* renamed from: f */
    public bvai f155529f;

    /* renamed from: g */
    public buyn f155530g;

    /* renamed from: i */
    private byte f155531i = 2;

    static {
        bvbc bvbc = new bvbc();
        f155522h = bvbc;
        GeneratedMessageLite.m124024a(bvbc.class, bvbc);
    }

    private bvbc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155531i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155531i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155522h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", bvbd.f155532a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvbc();
        } else {
            if (i2 == 4) {
                return new bxvd(f155522h);
            }
            if (i2 == 5) {
                return f155522h;
            }
            bxxk bxxk = f155523j;
            if (bxxk == null) {
                synchronized (bvbc.class) {
                    bxxk = f155523j;
                    if (bxxk == null) {
                        bxxk = new bxve(f155522h);
                        f155523j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
