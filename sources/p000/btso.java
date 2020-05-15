package p000;

/* renamed from: btso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btso extends bxvk implements bxxd {

    /* renamed from: h */
    public static final btso f150239h;

    /* renamed from: i */
    private static volatile bxxk f150240i;

    /* renamed from: a */
    public int f150241a;

    /* renamed from: b */
    public btsi f150242b;

    /* renamed from: c */
    public btrw f150243c;

    /* renamed from: d */
    public bxvt f150244d = bxvm.f164965b;

    /* renamed from: e */
    public int f150245e;

    /* renamed from: f */
    public btsg f150246f;

    /* renamed from: g */
    public btrt f150247g;

    static {
        btso btso = new btso();
        f150239h = btso;
        bxvk.m124024a(btso.class, btso);
    }

    private btso() {
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
            return bxvk.m124022a(f150239h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဌ\u0002\u0005ဉ\u0003\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d", btrr.m117076b(), "e", btsn.f150238a, "f", "g"});
        } else if (i2 == 3) {
            return new btso();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f150239h;
            }
            bxxk bxxk = f150240i;
            if (bxxk == null) {
                synchronized (btso.class) {
                    bxxk = f150240i;
                    if (bxxk == null) {
                        bxxk = new bxve(f150239h);
                        f150240i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
