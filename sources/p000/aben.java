package p000;

/* renamed from: aben */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aben extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aben f57259b;

    /* renamed from: c */
    private static volatile bxxk f57260c;

    /* renamed from: a */
    public bxwc f57261a = bxxn.f165040b;

    static {
        aben aben = new aben();
        f57259b = aben;
        GeneratedMessageLite.m124024a(aben.class, aben);
    }

    private aben() {
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
            return GeneratedMessageLite.m124022a(f57259b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abes.class});
        } else if (i2 == 3) {
            return new aben();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57259b;
            }
            bxxk bxxk = f57260c;
            if (bxxk == null) {
                synchronized (aben.class) {
                    bxxk = f57260c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57259b);
                        f57260c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
