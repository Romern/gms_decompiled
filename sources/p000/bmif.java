package p000;

/* renamed from: bmif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmif extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bmif f129564j;

    /* renamed from: k */
    private static volatile bxxk f129565k;

    /* renamed from: a */
    public int f129566a;

    /* renamed from: b */
    public String f129567b = "";

    /* renamed from: c */
    public bxtx f129568c = bxtx.f164797b;

    /* renamed from: d */
    public int f129569d;

    /* renamed from: e */
    public int f129570e;

    /* renamed from: f */
    public String f129571f = "";

    /* renamed from: g */
    public bmbs f129572g;

    /* renamed from: h */
    public String f129573h = "";

    /* renamed from: i */
    public String f129574i = "";

    static {
        bmif bmif = new bmif();
        f129564j = bmif;
        bxvk.m124024a(bmif.class, bmif);
    }

    private bmif() {
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
            return bxvk.m124022a(f129564j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003ဈ\u0004\u0005ဉ\u0005\u0006ဈ\u0007\u0007ဈ\u0006\bဈ\u0000\tည\u0001", new Object[]{"a", "d", "e", "f", "g", "i", "h", "b", "c"});
        } else if (i2 == 3) {
            return new bmif();
        } else {
            if (i2 == 4) {
                return new bxvd(f129564j);
            }
            if (i2 == 5) {
                return f129564j;
            }
            bxxk bxxk = f129565k;
            if (bxxk == null) {
                synchronized (bmif.class) {
                    bxxk = f129565k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129564j);
                        f129565k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
