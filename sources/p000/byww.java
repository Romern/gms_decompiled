package p000;

/* renamed from: byww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byww extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byww f168675d;

    /* renamed from: e */
    private static volatile bxxk f168676e;

    /* renamed from: a */
    public int f168677a;

    /* renamed from: b */
    public int f168678b;

    /* renamed from: c */
    public bxwc f168679c = bxxn.f165040b;

    static {
        byww byww = new byww();
        f168675d = byww;
        bxvk.m124024a(byww.class, byww);
    }

    private byww() {
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
            return bxvk.m124022a(f168675d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"a", "b", "c", byxa.class});
        } else if (i2 == 3) {
            return new byww();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168675d;
            }
            bxxk bxxk = f168676e;
            if (bxxk == null) {
                synchronized (byww.class) {
                    bxxk = f168676e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168675d);
                        f168676e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
