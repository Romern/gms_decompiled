package p000;

/* renamed from: ammd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammd extends bxvk implements bxxd {

    /* renamed from: l */
    public static final ammd f75264l;

    /* renamed from: m */
    private static volatile bxxk f75265m;

    /* renamed from: a */
    public int f75266a;

    /* renamed from: b */
    public int f75267b;

    /* renamed from: c */
    public int f75268c;

    /* renamed from: d */
    public int f75269d;

    /* renamed from: e */
    public int f75270e;

    /* renamed from: f */
    public int f75271f;

    /* renamed from: g */
    public int f75272g;

    /* renamed from: h */
    public int f75273h;

    /* renamed from: i */
    public ammj f75274i;

    /* renamed from: j */
    public long f75275j;

    /* renamed from: k */
    public long f75276k;

    static {
        ammd ammd = new ammd();
        f75264l = ammd;
        bxvk.m124024a(ammd.class, ammd);
    }

    private ammd() {
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
            return bxvk.m124022a(f75264l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဉ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", ammc.f75263a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new ammd();
        } else {
            if (i2 == 4) {
                return new bxvd(f75264l);
            }
            if (i2 == 5) {
                return f75264l;
            }
            bxxk bxxk = f75265m;
            if (bxxk == null) {
                synchronized (ammd.class) {
                    bxxk = f75265m;
                    if (bxxk == null) {
                        bxxk = new bxve(f75264l);
                        f75265m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
