package p000;

/* renamed from: caim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caim extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final caim f174735k;

    /* renamed from: m */
    private static volatile bxxk f174736m;

    /* renamed from: a */
    public int f174737a;

    /* renamed from: b */
    public caik f174738b;

    /* renamed from: c */
    public ByteString f174739c = ByteString.f164797b;

    /* renamed from: d */
    public bxvt f174740d = bxvm.f164965b;

    /* renamed from: e */
    public bxwc f174741e = bxxn.f165040b;

    /* renamed from: f */
    public bxvt f174742f = bxvm.f164965b;

    /* renamed from: g */
    public bxwc f174743g = bxxn.f165040b;

    /* renamed from: h */
    public boolean f174744h;

    /* renamed from: i */
    public bxwc f174745i = bxxn.f165040b;

    /* renamed from: j */
    public bxvt f174746j = bxvm.f164965b;

    /* renamed from: l */
    private byte f174747l = 2;

    static {
        caim caim = new caim();
        f174735k = caim;
        GeneratedMessageLite.m124024a(caim.class, caim);
    }

    private caim() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174747l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174747l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f174735k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0006\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0003\u0016\u0004\u001a\u0005\u0016\u0006\u001c\u0007ဇ\u0002\b\u001a\t\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new caim();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f174735k;
            }
            bxxk bxxk = f174736m;
            if (bxxk == null) {
                synchronized (caim.class) {
                    bxxk = f174736m;
                    if (bxxk == null) {
                        bxxk = new bxve(f174735k);
                        f174736m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
