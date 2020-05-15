package p000;

/* renamed from: bpyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpyq f139912g;

    /* renamed from: h */
    private static volatile bxxk f139913h;

    /* renamed from: a */
    public int f139914a;

    /* renamed from: b */
    public String f139915b = "";

    /* renamed from: c */
    public bpwx f139916c;

    /* renamed from: d */
    public bpyp f139917d;

    /* renamed from: e */
    public bpyo f139918e;

    /* renamed from: f */
    public bpyn f139919f;

    static {
        bpyq bpyq = new bpyq();
        f139912g = bpyq;
        GeneratedMessageLite.m124024a(bpyq.class, bpyq);
    }

    private bpyq() {
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
            return GeneratedMessageLite.m124022a(f139912g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f139912g);
            }
            if (i2 == 5) {
                return f139912g;
            }
            bxxk bxxk = f139913h;
            if (bxxk == null) {
                synchronized (bpyq.class) {
                    bxxk = f139913h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139912g);
                        f139913h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
