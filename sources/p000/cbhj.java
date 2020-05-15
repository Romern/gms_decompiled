package p000;

/* renamed from: cbhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbhj f177133d;

    /* renamed from: e */
    private static volatile bxxk f177134e;

    /* renamed from: a */
    public int f177135a;

    /* renamed from: b */
    public String f177136b = "";

    /* renamed from: c */
    public int f177137c;

    static {
        cbhj cbhj = new cbhj();
        f177133d = cbhj;
        bxvk.m124024a(cbhj.class, cbhj);
    }

    private cbhj() {
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
            return bxvk.m124022a(f177133d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f177133d);
            }
            if (i2 == 5) {
                return f177133d;
            }
            bxxk bxxk = f177134e;
            if (bxxk == null) {
                synchronized (cbhj.class) {
                    bxxk = f177134e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177133d);
                        f177134e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
