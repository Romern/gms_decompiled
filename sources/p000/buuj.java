package p000;

/* renamed from: buuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buuj f154946d;

    /* renamed from: e */
    private static volatile bxxk f154947e;

    /* renamed from: a */
    public int f154948a;

    /* renamed from: b */
    public int f154949b;

    /* renamed from: c */
    public buux f154950c;

    static {
        buuj buuj = new buuj();
        f154946d = buuj;
        GeneratedMessageLite.m124024a(buuj.class, buuj);
    }

    private buuj() {
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
            return GeneratedMessageLite.m124022a(f154946d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", buuh.f154945a, "c"});
        } else if (i2 == 3) {
            return new buuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f154946d);
            }
            if (i2 == 5) {
                return f154946d;
            }
            bxxk bxxk = f154947e;
            if (bxxk == null) {
                synchronized (buuj.class) {
                    bxxk = f154947e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154946d);
                        f154947e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
