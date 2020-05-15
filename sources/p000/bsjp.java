package p000;

/* renamed from: bsjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsjp f144831b;

    /* renamed from: c */
    private static volatile bxxk f144832c;

    /* renamed from: a */
    public String f144833a = "";

    static {
        bsjp bsjp = new bsjp();
        f144831b = bsjp;
        GeneratedMessageLite.m124024a(bsjp.class, bsjp);
    }

    private bsjp() {
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
            return GeneratedMessageLite.m124022a(f144831b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f144831b);
            }
            if (i2 == 5) {
                return f144831b;
            }
            bxxk bxxk = f144832c;
            if (bxxk == null) {
                synchronized (bsjp.class) {
                    bxxk = f144832c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144831b);
                        f144832c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
