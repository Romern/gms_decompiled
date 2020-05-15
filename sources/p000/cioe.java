package p000;

/* renamed from: cioe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioe extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cioe f191045g;

    /* renamed from: h */
    private static volatile bxxk f191046h;

    /* renamed from: a */
    public int f191047a;

    /* renamed from: b */
    public String f191048b = "";

    /* renamed from: c */
    public String f191049c = "";

    /* renamed from: d */
    public int f191050d;

    /* renamed from: e */
    public long f191051e;

    /* renamed from: f */
    public String f191052f = "";

    static {
        cioe cioe = new cioe();
        f191045g = cioe;
        bxvk.m124024a(cioe.class, cioe);
    }

    private cioe() {
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
            return bxvk.m124022a(f191045g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", ciod.f191044a, "e", "f"});
        } else if (i2 == 3) {
            return new cioe();
        } else {
            if (i2 == 4) {
                return new bxvd(f191045g);
            }
            if (i2 == 5) {
                return f191045g;
            }
            bxxk bxxk = f191046h;
            if (bxxk == null) {
                synchronized (cioe.class) {
                    bxxk = f191046h;
                    if (bxxk == null) {
                        bxxk = new bxve(f191045g);
                        f191046h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
