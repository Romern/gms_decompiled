package p000;

/* renamed from: boot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boot extends bxvk implements bxxd {

    /* renamed from: A */
    private static volatile bxxk f133996A;

    /* renamed from: z */
    public static final boot f133997z;

    /* renamed from: a */
    public int f133998a;

    /* renamed from: b */
    public String f133999b = "";

    /* renamed from: c */
    public String f134000c = "";

    /* renamed from: d */
    public bood f134001d;

    /* renamed from: e */
    public String f134002e = "";

    /* renamed from: f */
    public long f134003f;

    /* renamed from: g */
    public booo f134004g;

    /* renamed from: h */
    public bxwc f134005h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f134006i = bxxn.f165040b;

    /* renamed from: j */
    public bopa f134007j;

    /* renamed from: k */
    public bopb f134008k;

    /* renamed from: l */
    public booz f134009l;

    /* renamed from: m */
    public boou f134010m;

    /* renamed from: n */
    public boos f134011n;

    /* renamed from: o */
    public bopi f134012o;

    /* renamed from: p */
    public boon f134013p;

    /* renamed from: q */
    public bopo f134014q;

    /* renamed from: r */
    public long f134015r;

    /* renamed from: s */
    public booc f134016s;

    /* renamed from: t */
    public bonz f134017t;

    /* renamed from: u */
    public booq f134018u;

    /* renamed from: v */
    public bopk f134019v;

    /* renamed from: w */
    public booe f134020w;

    /* renamed from: x */
    public bopj f134021x;

    /* renamed from: y */
    public boph f134022y;

    static {
        boot boot = new boot();
        f133997z = boot;
        bxvk.m124024a(boot.class, boot);
    }

    private boot() {
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
            return bxvk.m124022a(f133997z, "\u0000\u0019\u0000\u0000\u0001\u0019\u0019\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\t\u0005Ȉ\u0006\u0002\u0007\t\b\u001b\t\u001b\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\u0002\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", boop.class, "i", bopp.class, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        } else if (i2 == 3) {
            return new boot();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133997z;
            }
            bxxk bxxk = f133996A;
            if (bxxk == null) {
                synchronized (boot.class) {
                    bxxk = f133996A;
                    if (bxxk == null) {
                        bxxk = new bxve(f133997z);
                        f133996A = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
