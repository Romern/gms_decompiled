package p000;

/* renamed from: bvtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvtz f157640b;

    /* renamed from: c */
    private static volatile bxxk f157641c;

    /* renamed from: a */
    public bxwc f157642a = bxxn.f165040b;

    static {
        bvtz bvtz = new bvtz();
        f157640b = bvtz;
        bxvk.m124024a(bvtz.class, bvtz);
    }

    private bvtz() {
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
            return bxvk.m124022a(f157640b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bvtz();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f157640b;
            }
            bxxk bxxk = f157641c;
            if (bxxk == null) {
                synchronized (bvtz.class) {
                    bxxk = f157641c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157640b);
                        f157641c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
