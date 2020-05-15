package p000;

/* renamed from: bsoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsoa extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bsoa f146351k;

    /* renamed from: l */
    private static volatile bxxk f146352l;

    /* renamed from: a */
    public int f146353a;

    /* renamed from: b */
    public boolean f146354b;

    /* renamed from: c */
    public String f146355c = "";

    /* renamed from: d */
    public String f146356d = "";

    /* renamed from: e */
    public int f146357e;

    /* renamed from: f */
    public int f146358f;

    /* renamed from: g */
    public int f146359g;

    /* renamed from: h */
    public bsny f146360h;

    /* renamed from: i */
    public int f146361i;

    /* renamed from: j */
    public String f146362j = "";

    static {
        bsoa bsoa = new bsoa();
        f146351k = bsoa;
        GeneratedMessageLite.m124024a(bsoa.class, bsoa);
    }

    private bsoa() {
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
            return GeneratedMessageLite.m124022a(f146351k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0007ဌ\u0006\bဉ\u0007\nဌ\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", "e", bsob.f146363a, "f", bsod.f146364a, "g", bsnz.f146350a, "h", "i", bsnv.f146341a, "j"});
        } else if (i2 == 3) {
            return new bsoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f146351k);
            }
            if (i2 == 5) {
                return f146351k;
            }
            bxxk bxxk = f146352l;
            if (bxxk == null) {
                synchronized (bsoa.class) {
                    bxxk = f146352l;
                    if (bxxk == null) {
                        bxxk = new bxve(f146351k);
                        f146352l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
