package p000;

/* renamed from: bmaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmaj extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bmaj f128452m;

    /* renamed from: n */
    private static volatile bxxk f128453n;

    /* renamed from: a */
    public int f128454a;

    /* renamed from: b */
    public int f128455b = 0;

    /* renamed from: c */
    public Object f128456c;

    /* renamed from: d */
    public ByteString f128457d = ByteString.f164797b;

    /* renamed from: e */
    public String f128458e = "";

    /* renamed from: f */
    public int f128459f;

    /* renamed from: g */
    public long f128460g;

    /* renamed from: h */
    public String f128461h = "";

    /* renamed from: i */
    public bwdj f128462i;

    /* renamed from: j */
    public boolean f128463j;

    /* renamed from: k */
    public bxwc f128464k = bxxn.f165040b;

    /* renamed from: l */
    public bmah f128465l;

    static {
        bmaj bmaj = new bmaj();
        f128452m = bmaj;
        GeneratedMessageLite.m124024a(bmaj.class, bmaj);
    }

    private bmaj() {
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
            return GeneratedMessageLite.m124022a(f128452m, "\u0001\n\u0001\u0001\u0002\u0015\n\u0000\u0001\u0000\u0002ည\u0000\u0007ဈ\u0002\bဌ\u0003\tဂ\u0004\nြ\u0000\u000bဈ\u0005\fဉ\u0006\rဇ\u0007\u0013\u001a\u0015ဉ\t", new Object[]{"c", "b", "a", "d", "e", "f", bmai.f128451a, "g", blxa.class, "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bmaj();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f128452m;
            }
            bxxk bxxk = f128453n;
            if (bxxk == null) {
                synchronized (bmaj.class) {
                    bxxk = f128453n;
                    if (bxxk == null) {
                        bxxk = new bxve(f128452m);
                        f128453n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
