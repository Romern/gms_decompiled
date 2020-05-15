package p000;

/* renamed from: bwms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwms extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwms f160306e;

    /* renamed from: f */
    public static final bxvj f160307f;

    /* renamed from: h */
    private static volatile bxxk f160308h;

    /* renamed from: a */
    public int f160309a;

    /* renamed from: b */
    public bwxl f160310b;

    /* renamed from: c */
    public int f160311c;

    /* renamed from: d */
    public int f160312d;

    /* renamed from: g */
    private byte f160313g = 2;

    static {
        bwms bwms = new bwms();
        f160306e = bwms;
        bxvk.m124024a(bwms.class, bwms);
        bwxl bwxl = bwxl.f161383i;
        bwms bwms2 = f160306e;
        f160307f = bxvk.m124006a(bwxl, bwms2, bwms2, 260216775, bxzf.MESSAGE);
    }

    private bwms() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160313g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160313g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160306e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwms();
        } else {
            if (i2 == 4) {
                return new bxvd(f160306e);
            }
            if (i2 == 5) {
                return f160306e;
            }
            bxxk bxxk = f160308h;
            if (bxxk == null) {
                synchronized (bwms.class) {
                    bxxk = f160308h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160306e);
                        f160308h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
