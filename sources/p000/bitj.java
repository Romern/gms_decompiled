package p000;

/* renamed from: bitj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bitj f121654h;

    /* renamed from: j */
    private static volatile bxxk f121655j;

    /* renamed from: a */
    public int f121656a;

    /* renamed from: b */
    public int f121657b;

    /* renamed from: c */
    public int f121658c;

    /* renamed from: d */
    public String f121659d = "";

    /* renamed from: e */
    public String f121660e = "";

    /* renamed from: f */
    public String f121661f = "";

    /* renamed from: g */
    public bxtx f121662g = bxtx.f164797b;

    /* renamed from: i */
    private byte f121663i = 2;

    static {
        bitj bitj = new bitj();
        f121654h = bitj;
        bxvk.m124024a(bitj.class, bitj);
    }

    private bitj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121663i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121663i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121654h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔋ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005", new Object[]{"a", "b", bitl.m102819b(), "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bitj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121654h);
            }
            if (i2 == 5) {
                return f121654h;
            }
            bxxk bxxk = f121655j;
            if (bxxk == null) {
                synchronized (bitj.class) {
                    bxxk = f121655j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121654h);
                        f121655j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
