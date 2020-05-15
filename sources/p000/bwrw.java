package p000;

/* renamed from: bwrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwrw f160811b;

    /* renamed from: c */
    private static volatile bxxk f160812c;

    /* renamed from: a */
    public bxwc f160813a = bxxn.f165040b;

    static {
        bwrw bwrw = new bwrw();
        f160811b = bwrw;
        GeneratedMessageLite.m124024a(bwrw.class, bwrw);
    }

    private bwrw() {
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
            return GeneratedMessageLite.m124022a(f160811b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwrv.class});
        } else if (i2 == 3) {
            return new bwrw();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f160811b;
            }
            bxxk bxxk = f160812c;
            if (bxxk == null) {
                synchronized (bwrw.class) {
                    bxxk = f160812c;
                    if (bxxk == null) {
                        bxxk = new bxve(f160811b);
                        f160812c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
