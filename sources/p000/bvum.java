package p000;

/* renamed from: bvum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvum extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvum f157714c;

    /* renamed from: d */
    private static volatile bxxk f157715d;

    /* renamed from: a */
    public bxwc f157716a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157717b = bxxn.f165040b;

    static {
        bvum bvum = new bvum();
        f157714c = bvum;
        bxvk.m124024a(bvum.class, bvum);
    }

    private bvum() {
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
            return bxvk.m124022a(f157714c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bvus.class, "b", bvur.class});
        } else if (i2 == 3) {
            return new bvum();
        } else {
            if (i2 == 4) {
                return new bxvd(f157714c);
            }
            if (i2 == 5) {
                return f157714c;
            }
            bxxk bxxk = f157715d;
            if (bxxk == null) {
                synchronized (bvum.class) {
                    bxxk = f157715d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157714c);
                        f157715d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
