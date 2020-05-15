package p000;

/* renamed from: bpjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpjq f137903c;

    /* renamed from: d */
    private static volatile bxxk f137904d;

    /* renamed from: a */
    public int f137905a;

    /* renamed from: b */
    public boolean f137906b;

    static {
        bpjq bpjq = new bpjq();
        f137903c = bpjq;
        GeneratedMessageLite.m124024a(bpjq.class, bpjq);
    }

    private bpjq() {
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
            return GeneratedMessageLite.m124022a(f137903c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f137903c);
            }
            if (i2 == 5) {
                return f137903c;
            }
            bxxk bxxk = f137904d;
            if (bxxk == null) {
                synchronized (bpjq.class) {
                    bxxk = f137904d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137903c);
                        f137904d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
