package p000;

/* renamed from: ajif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajif extends bxvk implements bxxd {

    /* renamed from: l */
    public static final ajif f70694l;

    /* renamed from: m */
    private static volatile bxxk f70695m;

    /* renamed from: a */
    public int f70696a;

    /* renamed from: b */
    public ajii f70697b;

    /* renamed from: c */
    public String f70698c = "";

    /* renamed from: d */
    public String f70699d = "";

    /* renamed from: e */
    public bxwc f70700e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f70701f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f70702g;

    /* renamed from: h */
    public boolean f70703h;

    /* renamed from: i */
    public boolean f70704i;

    /* renamed from: j */
    public long f70705j;

    /* renamed from: k */
    public boolean f70706k;

    static {
        ajif ajif = new ajif();
        f70694l = ajif;
        bxvk.m124024a(ajif.class, ajif);
    }

    private ajif() {
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
            return bxvk.m124022a(f70694l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဂ\u0006\nဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new ajif();
        } else {
            if (i2 == 4) {
                return new ajie();
            }
            if (i2 == 5) {
                return f70694l;
            }
            bxxk bxxk = f70695m;
            if (bxxk == null) {
                synchronized (ajif.class) {
                    bxxk = f70695m;
                    if (bxxk == null) {
                        bxxk = new bxve(f70694l);
                        f70695m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
