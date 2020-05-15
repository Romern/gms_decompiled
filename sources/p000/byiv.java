package p000;

/* renamed from: byiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byiv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byiv f166609h;

    /* renamed from: i */
    private static volatile bxxk f166610i;

    /* renamed from: a */
    public int f166611a;

    /* renamed from: b */
    public int f166612b = 0;

    /* renamed from: c */
    public Object f166613c;

    /* renamed from: d */
    public String f166614d = "";

    /* renamed from: e */
    public String f166615e = "";

    /* renamed from: f */
    public bxtx f166616f = bxtx.f164797b;

    /* renamed from: g */
    public bxwc f166617g = bxxn.f165040b;

    static {
        byiv byiv = new byiv();
        f166609h = byiv;
        bxvk.m124024a(byiv.class, byiv);
    }

    private byiv() {
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
            return bxvk.m124022a(f166609h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ွ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006\u001b", new Object[]{"c", "b", "a", "d", "e", "f", "g", byiu.class});
        } else if (i2 == 3) {
            return new byiv();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166609h;
            }
            bxxk bxxk = f166610i;
            if (bxxk == null) {
                synchronized (byiv.class) {
                    bxxk = f166610i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166609h);
                        f166610i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
