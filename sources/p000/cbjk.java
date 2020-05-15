package p000;

/* renamed from: cbjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbjk f177337c;

    /* renamed from: d */
    private static volatile bxxk f177338d;

    /* renamed from: a */
    public cbmo f177339a;

    /* renamed from: b */
    public bxwc f177340b = bxxn.f165040b;

    static {
        cbjk cbjk = new cbjk();
        f177337c = cbjk;
        GeneratedMessageLite.m124024a(cbjk.class, cbjk);
    }

    private cbjk() {
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
            return GeneratedMessageLite.m124022a(f177337c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\t\u0004\u001b", new Object[]{"a", "b", cbmm.class});
        } else if (i2 == 3) {
            return new cbjk();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f177337c;
            }
            bxxk bxxk = f177338d;
            if (bxxk == null) {
                synchronized (cbjk.class) {
                    bxxk = f177338d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177337c);
                        f177338d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
