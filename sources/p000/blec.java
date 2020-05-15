package p000;

/* renamed from: blec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blec extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blec f126173b;

    /* renamed from: c */
    private static volatile bxxk f126174c;

    /* renamed from: a */
    public bxwc f126175a = bxxn.f165040b;

    static {
        blec blec = new blec();
        f126173b = blec;
        GeneratedMessageLite.m124024a(blec.class, blec);
    }

    private blec() {
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
            return GeneratedMessageLite.m124022a(f126173b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", blfd.class});
        } else if (i2 == 3) {
            return new blec();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f126173b;
            }
            bxxk bxxk = f126174c;
            if (bxxk == null) {
                synchronized (blec.class) {
                    bxxk = f126174c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126173b);
                        f126174c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
