package p000;

/* renamed from: bsmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsmb f144993b;

    /* renamed from: c */
    private static volatile bxxk f144994c;

    /* renamed from: a */
    public bxwc f144995a = bxxn.f165040b;

    static {
        bsmb bsmb = new bsmb();
        f144993b = bsmb;
        GeneratedMessageLite.m124024a(bsmb.class, bsmb);
    }

    private bsmb() {
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
            return GeneratedMessageLite.m124022a(f144993b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsmf.class});
        } else if (i2 == 3) {
            return new bsmb();
        } else {
            if (i2 == 4) {
                return new bxvd(f144993b);
            }
            if (i2 == 5) {
                return f144993b;
            }
            bxxk bxxk = f144994c;
            if (bxxk == null) {
                synchronized (bsmb.class) {
                    bxxk = f144994c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144993b);
                        f144994c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
