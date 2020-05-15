package p000;

/* renamed from: cioz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cioz f191167c;

    /* renamed from: d */
    private static volatile bxxk f191168d;

    /* renamed from: a */
    public int f191169a;

    /* renamed from: b */
    public bxwc f191170b = bxxn.f165040b;

    static {
        cioz cioz = new cioz();
        f191167c = cioz;
        bxvk.m124024a(cioz.class, cioz);
    }

    private cioz() {
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
            return bxvk.m124022a(f191167c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"a", "b", cipa.class});
        } else if (i2 == 3) {
            return new cioz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f191167c;
            }
            bxxk bxxk = f191168d;
            if (bxxk == null) {
                synchronized (cioz.class) {
                    bxxk = f191168d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191167c);
                        f191168d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
