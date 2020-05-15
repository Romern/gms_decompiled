package p000;

/* renamed from: bmik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmik extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bmik f129577j;

    /* renamed from: k */
    private static volatile bxxk f129578k;

    /* renamed from: a */
    public int f129579a;

    /* renamed from: b */
    public int f129580b;

    /* renamed from: c */
    public int f129581c;

    /* renamed from: d */
    public String f129582d = "";

    /* renamed from: e */
    public int f129583e;

    /* renamed from: f */
    public int f129584f;

    /* renamed from: g */
    public String f129585g = "";

    /* renamed from: h */
    public int f129586h;

    /* renamed from: i */
    public String f129587i = "";

    static {
        bmik bmik = new bmik();
        f129577j = bmik;
        bxvk.m124024a(bmik.class, bmik);
    }

    private bmik() {
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
            return bxvk.m124022a(f129577j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0002\u0002င\u0003\u0003င\u0004\u0004င\u0006\u0006ဈ\u0005\u0007ဌ\u0000\bဈ\u0007\tဌ\u0001", new Object[]{"a", "d", "e", "f", "h", "g", "b", bmii.f129576a, "i", "c", bmig.f129575a});
        } else if (i2 == 3) {
            return new bmik();
        } else {
            if (i2 == 4) {
                return new bxvd(f129577j);
            }
            if (i2 == 5) {
                return f129577j;
            }
            bxxk bxxk = f129578k;
            if (bxxk == null) {
                synchronized (bmik.class) {
                    bxxk = f129578k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129577j);
                        f129578k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
