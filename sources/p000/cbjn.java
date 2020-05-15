package p000;

/* renamed from: cbjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbjn f177345c;

    /* renamed from: d */
    private static volatile bxxk f177346d;

    /* renamed from: a */
    public cbjp f177347a;

    /* renamed from: b */
    public bxwc f177348b = bxxn.f165040b;

    static {
        cbjn cbjn = new cbjn();
        f177345c = cbjn;
        bxvk.m124024a(cbjn.class, cbjn);
    }

    private cbjn() {
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
            return bxvk.m124022a(f177345c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbjn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177345c;
            }
            bxxk bxxk = f177346d;
            if (bxxk == null) {
                synchronized (cbjn.class) {
                    bxxk = f177346d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177345c);
                        f177346d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
