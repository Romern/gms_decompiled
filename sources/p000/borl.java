package p000;

/* renamed from: borl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borl extends bxvk implements bxxd {

    /* renamed from: h */
    public static final borl f134427h;

    /* renamed from: i */
    private static volatile bxxk f134428i;

    /* renamed from: a */
    public int f134429a;

    /* renamed from: b */
    public int f134430b;

    /* renamed from: c */
    public int f134431c;

    /* renamed from: d */
    public int f134432d;

    /* renamed from: e */
    public boolean f134433e;

    /* renamed from: f */
    public int f134434f;

    /* renamed from: g */
    public int f134435g;

    static {
        borl borl = new borl();
        f134427h = borl;
        bxvk.m124024a(borl.class, borl);
    }

    private borl() {
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
            return bxvk.m124022a(f134427h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new borl();
        } else {
            if (i2 == 4) {
                return new bxvd(f134427h);
            }
            if (i2 == 5) {
                return f134427h;
            }
            bxxk bxxk = f134428i;
            if (bxxk == null) {
                synchronized (borl.class) {
                    bxxk = f134428i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134427h);
                        f134428i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
