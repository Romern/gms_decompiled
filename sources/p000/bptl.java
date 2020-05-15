package p000;

/* renamed from: bptl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bptl f139138d;

    /* renamed from: e */
    private static volatile bxxk f139139e;

    /* renamed from: a */
    public int f139140a;

    /* renamed from: b */
    public int f139141b;

    /* renamed from: c */
    public int f139142c;

    static {
        bptl bptl = new bptl();
        f139138d = bptl;
        GeneratedMessageLite.m124024a(bptl.class, bptl);
    }

    private bptl() {
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
            return GeneratedMessageLite.m124022a(f139138d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bpfc.f137374a});
        } else if (i2 == 3) {
            return new bptl();
        } else {
            if (i2 == 4) {
                return new bxvd(f139138d);
            }
            if (i2 == 5) {
                return f139138d;
            }
            bxxk bxxk = f139139e;
            if (bxxk == null) {
                synchronized (bptl.class) {
                    bxxk = f139139e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139138d);
                        f139139e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
