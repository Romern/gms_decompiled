package p000;

/* renamed from: bxhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxhk f163412d;

    /* renamed from: e */
    private static volatile bxxk f163413e;

    /* renamed from: a */
    public int f163414a;

    /* renamed from: b */
    public int f163415b;

    /* renamed from: c */
    public bxwc f163416c = bxxn.f165040b;

    static {
        bxhk bxhk = new bxhk();
        f163412d = bxhk;
        bxvk.m124024a(bxhk.class, bxhk);
    }

    private bxhk() {
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
            return bxvk.m124022a(f163412d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", bxco.m122578b(), "c", bxhj.class});
        } else if (i2 == 3) {
            return new bxhk();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163412d;
            }
            bxxk bxxk = f163413e;
            if (bxxk == null) {
                synchronized (bxhk.class) {
                    bxxk = f163413e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163412d);
                        f163413e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
