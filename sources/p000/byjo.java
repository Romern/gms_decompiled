package p000;

/* renamed from: byjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byjo f166679b;

    /* renamed from: c */
    private static volatile bxxk f166680c;

    /* renamed from: a */
    public bxwc f166681a = bxxn.f165040b;

    static {
        byjo byjo = new byjo();
        f166679b = byjo;
        GeneratedMessageLite.m124024a(byjo.class, byjo);
    }

    private byjo() {
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
            return GeneratedMessageLite.m124022a(f166679b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byhc.class});
        } else if (i2 == 3) {
            return new byjo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166679b;
            }
            bxxk bxxk = f166680c;
            if (bxxk == null) {
                synchronized (byjo.class) {
                    bxxk = f166680c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166679b);
                        f166680c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
