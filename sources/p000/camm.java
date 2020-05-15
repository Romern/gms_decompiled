package p000;

/* renamed from: camm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final camm f175301e;

    /* renamed from: f */
    private static volatile bxxk f175302f;

    /* renamed from: a */
    public int f175303a = 0;

    /* renamed from: b */
    public Object f175304b;

    /* renamed from: c */
    public String f175305c = "";

    /* renamed from: d */
    public String f175306d = "";

    static {
        camm camm = new camm();
        f175301e = camm;
        bxvk.m124024a(camm.class, camm);
    }

    private camm() {
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
            return bxvk.m124022a(f175301e, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006:\u0000\u0007Ȼ\u0000", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new camm();
        } else {
            if (i2 == 4) {
                return new bxvd(f175301e);
            }
            if (i2 == 5) {
                return f175301e;
            }
            bxxk bxxk = f175302f;
            if (bxxk == null) {
                synchronized (camm.class) {
                    bxxk = f175302f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175301e);
                        f175302f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
