package p000;

/* renamed from: bznb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bznb f170693b;

    /* renamed from: c */
    private static volatile bxxk f170694c;

    /* renamed from: a */
    public bxwc f170695a = bxxn.f165040b;

    static {
        bznb bznb = new bznb();
        f170693b = bznb;
        GeneratedMessageLite.m124024a(bznb.class, bznb);
    }

    private bznb() {
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
            return GeneratedMessageLite.m124022a(f170693b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzly.class});
        } else if (i2 == 3) {
            return new bznb();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f170693b;
            }
            bxxk bxxk = f170694c;
            if (bxxk == null) {
                synchronized (bznb.class) {
                    bxxk = f170694c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170693b);
                        f170694c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
