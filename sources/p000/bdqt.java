package p000;

/* renamed from: bdqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqt extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bdqt f106281k;

    /* renamed from: m */
    private static volatile bxxk f106282m;

    /* renamed from: a */
    public int f106283a;

    /* renamed from: b */
    public cimv f106284b;

    /* renamed from: c */
    public long f106285c;

    /* renamed from: d */
    public long f106286d;

    /* renamed from: e */
    public long f106287e;

    /* renamed from: f */
    public long f106288f;

    /* renamed from: g */
    public int f106289g;

    /* renamed from: h */
    public String f106290h = "";

    /* renamed from: i */
    public boolean f106291i;

    /* renamed from: j */
    public cimz f106292j;

    /* renamed from: l */
    private byte f106293l = 2;

    static {
        bdqt bdqt = new bdqt();
        f106281k = bdqt;
        bxvk.m124024a(bdqt.class, bdqt);
    }

    private bdqt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f106293l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f106293l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f106281k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\bဇ\u0007\tᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bdqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f106281k);
            }
            if (i2 == 5) {
                return f106281k;
            }
            bxxk bxxk = f106282m;
            if (bxxk == null) {
                synchronized (bdqt.class) {
                    bxxk = f106282m;
                    if (bxxk == null) {
                        bxxk = new bxve(f106281k);
                        f106282m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
