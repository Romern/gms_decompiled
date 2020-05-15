package p000;

/* renamed from: cbpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbpf f177910b;

    /* renamed from: c */
    private static volatile bxxk f177911c;

    /* renamed from: a */
    public int f177912a;

    static {
        cbpf cbpf = new cbpf();
        f177910b = cbpf;
        bxvk.m124024a(cbpf.class, cbpf);
    }

    private cbpf() {
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
            return bxvk.m124022a(f177910b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f177910b);
            }
            if (i2 == 5) {
                return f177910b;
            }
            bxxk bxxk = f177911c;
            if (bxxk == null) {
                synchronized (cbpf.class) {
                    bxxk = f177911c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177910b);
                        f177911c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
