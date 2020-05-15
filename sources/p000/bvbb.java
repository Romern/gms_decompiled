package p000;

/* renamed from: bvbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbb extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvbb f155510j;

    /* renamed from: l */
    private static volatile bxxk f155511l;

    /* renamed from: a */
    public int f155512a;

    /* renamed from: b */
    public int f155513b;

    /* renamed from: c */
    public buzk f155514c;

    /* renamed from: d */
    public bval f155515d;

    /* renamed from: e */
    public buyq f155516e;

    /* renamed from: f */
    public bvad f155517f;

    /* renamed from: g */
    public bvbf f155518g;

    /* renamed from: h */
    public bvan f155519h;

    /* renamed from: i */
    public buym f155520i;

    /* renamed from: k */
    private byte f155521k = 2;

    static {
        bvbb bvbb = new bvbb();
        f155510j = bvbb;
        GeneratedMessageLite.m124024a(bvbb.class, bvbb);
    }

    private bvbb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155521k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155521k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155510j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\bဉ\u0007", new Object[]{"a", "b", bvbd.f155532a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bvbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f155510j);
            }
            if (i2 == 5) {
                return f155510j;
            }
            bxxk bxxk = f155511l;
            if (bxxk == null) {
                synchronized (bvbb.class) {
                    bxxk = f155511l;
                    if (bxxk == null) {
                        bxxk = new bxve(f155510j);
                        f155511l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
