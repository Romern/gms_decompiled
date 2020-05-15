package p000;

/* renamed from: bvpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvpc f157262f;

    /* renamed from: h */
    private static volatile bxxk f157263h;

    /* renamed from: a */
    public bxvs f157264a = bxuz.f164939b;

    /* renamed from: b */
    public bxvs f157265b = bxuz.f164939b;

    /* renamed from: c */
    public int f157266c;

    /* renamed from: d */
    public boolean f157267d;

    /* renamed from: e */
    public int f157268e;

    /* renamed from: g */
    private int f157269g;

    static {
        bvpc bvpc = new bvpc();
        f157262f = bvpc;
        bxvk.m124024a(bvpc.class, bvpc);
    }

    private bvpc() {
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
            return bxvk.m124022a(f157262f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003င\u0000\u0004ဇ\u0001\u0005င\u0002", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bvpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f157262f);
            }
            if (i2 == 5) {
                return f157262f;
            }
            bxxk bxxk = f157263h;
            if (bxxk == null) {
                synchronized (bvpc.class) {
                    bxxk = f157263h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157262f);
                        f157263h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
