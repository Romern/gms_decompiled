package p000;

/* renamed from: btfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final btfj f148684h;

    /* renamed from: i */
    private static volatile bxxk f148685i;

    /* renamed from: a */
    public String f148686a = "";

    /* renamed from: b */
    public int f148687b;

    /* renamed from: c */
    public String f148688c = "";

    /* renamed from: d */
    public int f148689d;

    /* renamed from: e */
    public String f148690e = "";

    /* renamed from: f */
    public boolean f148691f;

    /* renamed from: g */
    public boolean f148692g;

    static {
        btfj btfj = new btfj();
        f148684h = btfj;
        bxvk.m124024a(btfj.class, btfj);
    }

    private btfj() {
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
            return bxvk.m124022a(f148684h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btfj();
        } else {
            if (i2 == 4) {
                return new bxvd(f148684h);
            }
            if (i2 == 5) {
                return f148684h;
            }
            bxxk bxxk = f148685i;
            if (bxxk == null) {
                synchronized (btfj.class) {
                    bxxk = f148685i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148684h);
                        f148685i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
