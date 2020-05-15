package p000;

/* renamed from: cbpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpa extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbpa f177883d;

    /* renamed from: e */
    private static volatile bxxk f177884e;

    /* renamed from: a */
    public bxyk f177885a;

    /* renamed from: b */
    public int f177886b;

    /* renamed from: c */
    public int f177887c;

    static {
        cbpa cbpa = new cbpa();
        f177883d = cbpa;
        bxvk.m124024a(cbpa.class, cbpa);
    }

    private cbpa() {
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
            return bxvk.m124022a(f177883d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbpa();
        } else {
            if (i2 == 4) {
                return new bxvd(f177883d);
            }
            if (i2 == 5) {
                return f177883d;
            }
            bxxk bxxk = f177884e;
            if (bxxk == null) {
                synchronized (cbpa.class) {
                    bxxk = f177884e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177883d);
                        f177884e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
