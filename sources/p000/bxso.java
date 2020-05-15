package p000;

/* renamed from: bxso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxso extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxso f164714b;

    /* renamed from: c */
    private static volatile bxxk f164715c;

    /* renamed from: a */
    public bxwc f164716a = bxxn.f165040b;

    static {
        bxso bxso = new bxso();
        f164714b = bxso;
        GeneratedMessageLite.m124024a(bxso.class, bxso);
    }

    private bxso() {
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
            return GeneratedMessageLite.m124022a(f164714b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxso();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f164714b;
            }
            bxxk bxxk = f164715c;
            if (bxxk == null) {
                synchronized (bxso.class) {
                    bxxk = f164715c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164714b);
                        f164715c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
