package p000;

/* renamed from: ciox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciox extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ciox f191160b;

    /* renamed from: c */
    private static volatile bxxk f191161c;

    /* renamed from: a */
    public int f191162a;

    static {
        ciox ciox = new ciox();
        f191160b = ciox;
        bxvk.m124024a(ciox.class, ciox);
    }

    private ciox() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f191160b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new ciox();
        } else {
            if (i2 == 4) {
                return new bxvd(f191160b);
            }
            if (i2 == 5) {
                return f191160b;
            }
            bxxk bxxk = f191161c;
            if (bxxk == null) {
                synchronized (ciox.class) {
                    bxxk = f191161c;
                    if (bxxk == null) {
                        bxxk = new bxve(f191160b);
                        f191161c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
