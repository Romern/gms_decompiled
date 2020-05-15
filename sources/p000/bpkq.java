package p000;

/* renamed from: bpkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpkq f138003c;

    /* renamed from: d */
    private static volatile bxxk f138004d;

    /* renamed from: a */
    public int f138005a;

    /* renamed from: b */
    public long f138006b;

    static {
        bpkq bpkq = new bpkq();
        f138003c = bpkq;
        GeneratedMessageLite.m124024a(bpkq.class, bpkq);
    }

    private bpkq() {
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
            return GeneratedMessageLite.m124022a(f138003c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f138003c);
            }
            if (i2 == 5) {
                return f138003c;
            }
            bxxk bxxk = f138004d;
            if (bxxk == null) {
                synchronized (bpkq.class) {
                    bxxk = f138004d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138003c);
                        f138004d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
