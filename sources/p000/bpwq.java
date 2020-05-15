package p000;

/* renamed from: bpwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpwq f139548c;

    /* renamed from: d */
    private static volatile bxxk f139549d;

    /* renamed from: a */
    public int f139550a;

    /* renamed from: b */
    public int f139551b;

    static {
        bpwq bpwq = new bpwq();
        f139548c = bpwq;
        GeneratedMessageLite.m124024a(bpwq.class, bpwq);
    }

    private bpwq() {
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
            return GeneratedMessageLite.m124022a(f139548c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpwq();
        } else {
            if (i2 == 4) {
                return new bxvd(f139548c);
            }
            if (i2 == 5) {
                return f139548c;
            }
            bxxk bxxk = f139549d;
            if (bxxk == null) {
                synchronized (bpwq.class) {
                    bxxk = f139549d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139548c);
                        f139549d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
