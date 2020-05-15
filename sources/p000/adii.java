package p000;

/* renamed from: adii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adii extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final adii f61801b;

    /* renamed from: c */
    private static volatile bxxk f61802c;

    /* renamed from: a */
    public bxwc f61803a = bxxn.f165040b;

    static {
        adii adii = new adii();
        f61801b = adii;
        GeneratedMessageLite.m124024a(adii.class, adii);
    }

    private adii() {
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
            return GeneratedMessageLite.m124022a(f61801b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
        } else if (i2 == 3) {
            return new adii();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61801b;
            }
            bxxk bxxk = f61802c;
            if (bxxk == null) {
                synchronized (adii.class) {
                    bxxk = f61802c;
                    if (bxxk == null) {
                        bxxk = new bxve(f61801b);
                        f61802c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
