package p000;

/* renamed from: bvor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvor extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bvor f157199l;

    /* renamed from: m */
    private static volatile bxxk f157200m;

    /* renamed from: a */
    public int f157201a;

    /* renamed from: b */
    public bvov f157202b;

    /* renamed from: c */
    public long f157203c;

    /* renamed from: d */
    public String f157204d = "";

    /* renamed from: e */
    public bzrv f157205e;

    /* renamed from: f */
    public long f157206f;

    /* renamed from: g */
    public float f157207g;

    /* renamed from: h */
    public int f157208h;

    /* renamed from: i */
    public bxtx f157209i = bxtx.f164797b;

    /* renamed from: j */
    public String f157210j = "";

    /* renamed from: k */
    public bxwc f157211k = bxxn.f165040b;

    static {
        bvor bvor = new bvor();
        f157199l = bvor;
        bxvk.m124024a(bvor.class, bvor);
    }

    private bvor() {
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
            return bxvk.m124022a(f157199l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005စ\u0004\u0006ခ\u0005\u0007င\u0006\bည\u0007\tဈ\b\n\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bvor();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157199l;
            }
            bxxk bxxk = f157200m;
            if (bxxk == null) {
                synchronized (bvor.class) {
                    bxxk = f157200m;
                    if (bxxk == null) {
                        bxxk = new bxve(f157199l);
                        f157200m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
