package p000;

/* renamed from: abso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abso extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abso f58123b;

    /* renamed from: c */
    private static volatile bxxk f58124c;

    /* renamed from: a */
    public bxwc f58125a = bxxn.f165040b;

    static {
        abso abso = new abso();
        f58123b = abso;
        GeneratedMessageLite.m124024a(abso.class, abso);
    }

    private abso() {
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
            return GeneratedMessageLite.m124022a(f58123b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", absn.class});
        } else if (i2 == 3) {
            return new abso();
        } else {
            if (i2 == 4) {
                return new bxvd(f58123b);
            }
            if (i2 == 5) {
                return f58123b;
            }
            bxxk bxxk = f58124c;
            if (bxxk == null) {
                synchronized (abso.class) {
                    bxxk = f58124c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58123b);
                        f58124c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
