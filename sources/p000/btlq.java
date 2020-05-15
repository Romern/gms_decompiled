package p000;

/* renamed from: btlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btlq f149405b;

    /* renamed from: c */
    private static volatile bxxk f149406c;

    /* renamed from: a */
    public bxwc f149407a = bxxn.f165040b;

    static {
        btlq btlq = new btlq();
        f149405b = btlq;
        GeneratedMessageLite.m124024a(btlq.class, btlq);
    }

    private btlq() {
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
            return GeneratedMessageLite.m124022a(f149405b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btjx.class});
        } else if (i2 == 3) {
            return new btlq();
        } else {
            if (i2 == 4) {
                return new bxvd(f149405b);
            }
            if (i2 == 5) {
                return f149405b;
            }
            bxxk bxxk = f149406c;
            if (bxxk == null) {
                synchronized (btlq.class) {
                    bxxk = f149406c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149405b);
                        f149406c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
