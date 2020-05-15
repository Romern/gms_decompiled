package p000;

/* renamed from: zzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzu extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final zzu f56335j;

    /* renamed from: k */
    private static volatile bxxk f56336k;

    /* renamed from: a */
    public int f56337a;

    /* renamed from: b */
    public String f56338b = "";

    /* renamed from: c */
    public bxwc f56339c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f56340d = bxvm.f164965b;

    /* renamed from: e */
    public ByteString f56341e = ByteString.f164797b;

    /* renamed from: f */
    public boolean f56342f;

    /* renamed from: g */
    public boolean f56343g;

    /* renamed from: h */
    public boolean f56344h;

    /* renamed from: i */
    public int f56345i;

    static {
        zzu zzu = new zzu();
        f56335j = zzu;
        GeneratedMessageLite.m124024a(zzu.class, zzu);
    }

    private zzu() {
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
            return GeneratedMessageLite.m124022a(f56335j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0002\u0000\u0001ဈ\u0000\u0003\u001a\u0004\u0016\u0005ည\u0001\u0006ဇ\u0002\bဇ\u0003\tဇ\u0004\fဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", zzs.f56334a});
        } else if (i2 == 3) {
            return new zzu();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f56335j;
            }
            bxxk bxxk = f56336k;
            if (bxxk == null) {
                synchronized (zzu.class) {
                    bxxk = f56336k;
                    if (bxxk == null) {
                        bxxk = new bxve(f56335j);
                        f56336k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
