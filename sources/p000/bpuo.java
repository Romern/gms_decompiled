package p000;

/* renamed from: bpuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpuo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpuo f139269c;

    /* renamed from: d */
    private static volatile bxxk f139270d;

    /* renamed from: a */
    public bxwc f139271a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f139272b = bxxn.f165040b;

    static {
        bpuo bpuo = new bpuo();
        f139269c = bpuo;
        GeneratedMessageLite.m124024a(bpuo.class, bpuo);
    }

    private bpuo() {
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
            return GeneratedMessageLite.m124022a(f139269c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpuo();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f139269c;
            }
            bxxk bxxk = f139270d;
            if (bxxk == null) {
                synchronized (bpuo.class) {
                    bxxk = f139270d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139269c);
                        f139270d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
