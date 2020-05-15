package p000;

/* renamed from: bosx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosx extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bosx f134741g;

    /* renamed from: h */
    private static volatile bxxk f134742h;

    /* renamed from: a */
    public int f134743a;

    /* renamed from: b */
    public int f134744b;

    /* renamed from: c */
    public boolean f134745c;

    /* renamed from: d */
    public int f134746d;

    /* renamed from: e */
    public boolean f134747e;

    /* renamed from: f */
    public boolean f134748f;

    static {
        bosx bosx = new bosx();
        f134741g = bosx;
        bxvk.m124024a(bosx.class, bosx);
    }

    private bosx() {
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
            return bxvk.m124022a(f134741g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bosx();
        } else {
            if (i2 == 4) {
                return new bxvd(f134741g);
            }
            if (i2 == 5) {
                return f134741g;
            }
            bxxk bxxk = f134742h;
            if (bxxk == null) {
                synchronized (bosx.class) {
                    bxxk = f134742h;
                    if (bxxk == null) {
                        bxxk = new bxve(f134741g);
                        f134742h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
