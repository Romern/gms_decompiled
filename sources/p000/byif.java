package p000;

/* renamed from: byif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byif extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byif f166558b;

    /* renamed from: c */
    private static volatile bxxk f166559c;

    /* renamed from: a */
    public bxwc f166560a = bxxn.f165040b;

    static {
        byif byif = new byif();
        f166558b = byif;
        GeneratedMessageLite.m124024a(byif.class, byif);
    }

    private byif() {
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
            return GeneratedMessageLite.m124022a(f166558b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byja.class});
        } else if (i2 == 3) {
            return new byif();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f166558b;
            }
            bxxk bxxk = f166559c;
            if (bxxk == null) {
                synchronized (byif.class) {
                    bxxk = f166559c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166558b);
                        f166559c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
