package p000;

/* renamed from: bpwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpwo f139538d;

    /* renamed from: e */
    private static volatile bxxk f139539e;

    /* renamed from: a */
    public int f139540a;

    /* renamed from: b */
    public String f139541b = "";

    /* renamed from: c */
    public int f139542c;

    static {
        bpwo bpwo = new bpwo();
        f139538d = bpwo;
        GeneratedMessageLite.m124024a(bpwo.class, bpwo);
    }

    private bpwo() {
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
            return GeneratedMessageLite.m124022a(f139538d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpwo();
        } else {
            if (i2 == 4) {
                return new bxvd(f139538d);
            }
            if (i2 == 5) {
                return f139538d;
            }
            bxxk bxxk = f139539e;
            if (bxxk == null) {
                synchronized (bpwo.class) {
                    bxxk = f139539e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139538d);
                        f139539e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
