package p000;

/* renamed from: bzcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcl extends bxvg implements bxvh {

    /* renamed from: k */
    public static final bzcl f169356k;

    /* renamed from: n */
    private static volatile bxxk f169357n;

    /* renamed from: a */
    public int f169358a;

    /* renamed from: b */
    public byyu f169359b;

    /* renamed from: c */
    public byyu f169360c;

    /* renamed from: d */
    public long f169361d;

    /* renamed from: e */
    public String f169362e = "";

    /* renamed from: f */
    public byyv f169363f;

    /* renamed from: g */
    public String f169364g;

    /* renamed from: h */
    public String f169365h;

    /* renamed from: i */
    public byyu f169366i;

    /* renamed from: j */
    public String f169367j;

    /* renamed from: l */
    private byte f169368l = 2;

    static {
        bzcl bzcl = new bzcl();
        f169356k = bzcl;
        bxvk.m124024a(bzcl.class, bzcl);
    }

    private bzcl() {
        bxxn bxxn = bxxn.f165040b;
        this.f169364g = "";
        this.f169365h = "";
        this.f169367j = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169368l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169368l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169356k, "\u0001\t\u0000\u0001\u0004\u0010\t\u0000\u0000\u0004\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ဂ\u0002\u0007ဈ\u0003\nᐉ\u0004\u000bဈ\u0005\fဈ\u0006\u000fᐉ\t\u0010ဈ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bzcl();
        } else {
            if (i2 == 4) {
                return new bxvf(f169356k);
            }
            if (i2 == 5) {
                return f169356k;
            }
            bxxk bxxk = f169357n;
            if (bxxk == null) {
                synchronized (bzcl.class) {
                    bxxk = f169357n;
                    if (bxxk == null) {
                        bxxk = new bxve(f169356k);
                        f169357n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
