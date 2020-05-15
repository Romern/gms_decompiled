package p000;

/* renamed from: cbgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbgn f177050e;

    /* renamed from: f */
    private static volatile bxxk f177051f;

    /* renamed from: a */
    public int f177052a = 0;

    /* renamed from: b */
    public Object f177053b;

    /* renamed from: c */
    public String f177054c = "";

    /* renamed from: d */
    public cbhy f177055d;

    static {
        cbgn cbgn = new cbgn();
        f177050e = cbgn;
        bxvk.m124024a(cbgn.class, cbgn);
    }

    private cbgn() {
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
            return bxvk.m124022a(f177050e, "\u0000\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003\t\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "c", "d", cbgs.class, cbgm.class});
        } else if (i2 == 3) {
            return new cbgn();
        } else {
            if (i2 == 4) {
                return new bxvd(f177050e);
            }
            if (i2 == 5) {
                return f177050e;
            }
            bxxk bxxk = f177051f;
            if (bxxk == null) {
                synchronized (cbgn.class) {
                    bxxk = f177051f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177050e);
                        f177051f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
