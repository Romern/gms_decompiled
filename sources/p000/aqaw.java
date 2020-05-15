package p000;

/* renamed from: aqaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqaw extends bxvk implements bxxd {

    /* renamed from: l */
    public static final aqaw f85497l;

    /* renamed from: m */
    private static volatile bxxk f85498m;

    /* renamed from: a */
    public int f85499a;

    /* renamed from: b */
    public int f85500b;

    /* renamed from: c */
    public long f85501c;

    /* renamed from: d */
    public String f85502d = "";

    /* renamed from: e */
    public boolean f85503e;

    /* renamed from: f */
    public String f85504f = "";

    /* renamed from: g */
    public bxwc f85505g = bxxn.f165040b;

    /* renamed from: h */
    public String f85506h;

    /* renamed from: i */
    public boolean f85507i;

    /* renamed from: j */
    public String f85508j;

    /* renamed from: k */
    public aqba f85509k;

    static {
        aqaw aqaw = new aqaw();
        f85497l = aqaw;
        bxvk.m124024a(aqaw.class, aqaw);
    }

    private aqaw() {
        bxtx bxtx = bxtx.f164797b;
        this.f85506h = "";
        this.f85508j = "";
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
            return bxvk.m124022a(f85497l, "\u0001\t\u0000\u0002\u0001,\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a\u000fဈ\u0001\u0010ဇ\u0002\u0018ဈ\u0005\u001fဈ \"ဈ\u0003%ဇ\b,ဉ\"", new Object[]{"a", "b", "c", "g", "d", "e", "h", "j", "f", "i", "k"});
        } else if (i2 == 3) {
            return new aqaw();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f85497l;
            }
            bxxk bxxk = f85498m;
            if (bxxk == null) {
                synchronized (aqaw.class) {
                    bxxk = f85498m;
                    if (bxxk == null) {
                        bxxk = new bxve(f85497l);
                        f85498m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
