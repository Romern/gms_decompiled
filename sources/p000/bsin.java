package p000;

/* renamed from: bsin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsin extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsin f144735b;

    /* renamed from: c */
    private static volatile bxxk f144736c;

    /* renamed from: a */
    public bxwc f144737a = bxxn.f165040b;

    static {
        bsin bsin = new bsin();
        f144735b = bsin;
        GeneratedMessageLite.m124024a(bsin.class, bsin);
    }

    private bsin() {
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
            return GeneratedMessageLite.m124022a(f144735b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsia.class});
        } else if (i2 == 3) {
            return new bsin();
        } else {
            if (i2 == 4) {
                return new bxvd(f144735b);
            }
            if (i2 == 5) {
                return f144735b;
            }
            bxxk bxxk = f144736c;
            if (bxxk == null) {
                synchronized (bsin.class) {
                    bxxk = f144736c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144735b);
                        f144736c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
