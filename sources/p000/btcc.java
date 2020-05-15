package p000;

/* renamed from: btcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btcc f148250d;

    /* renamed from: e */
    private static volatile bxxk f148251e;

    /* renamed from: a */
    public bxwc f148252a = bxxn.f165040b;

    /* renamed from: b */
    public btdi f148253b;

    /* renamed from: c */
    public btea f148254c;

    static {
        btcc btcc = new btcc();
        f148250d = btcc;
        bxvk.m124024a(btcc.class, btcc);
    }

    private btcc() {
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
            return bxvk.m124022a(f148250d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"a", bzks.class, "b", "c"});
        } else if (i2 == 3) {
            return new btcc();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148250d;
            }
            bxxk bxxk = f148251e;
            if (bxxk == null) {
                synchronized (btcc.class) {
                    bxxk = f148251e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148250d);
                        f148251e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
