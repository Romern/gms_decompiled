package p000;

/* renamed from: btoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btoq f149787g;

    /* renamed from: h */
    private static volatile bxxk f149788h;

    /* renamed from: a */
    public String f149789a = "";

    /* renamed from: b */
    public btop f149790b;

    /* renamed from: c */
    public long f149791c;

    /* renamed from: d */
    public bton f149792d;

    /* renamed from: e */
    public btoo f149793e;

    /* renamed from: f */
    public bxwc f149794f = bxxn.f165040b;

    static {
        btoq btoq = new btoq();
        f149787g = btoq;
        bxvk.m124024a(btoq.class, btoq);
    }

    private btoq() {
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
            return bxvk.m124022a(f149787g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\t\u0005\t\u0006\u001c", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btoq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149787g;
            }
            bxxk bxxk = f149788h;
            if (bxxk == null) {
                synchronized (btoq.class) {
                    bxxk = f149788h;
                    if (bxxk == null) {
                        bxxk = new bxve(f149787g);
                        f149788h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
