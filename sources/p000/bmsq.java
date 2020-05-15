package p000;

/* renamed from: bmsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmsq f130734e;

    /* renamed from: f */
    private static volatile bxxk f130735f;

    /* renamed from: a */
    public int f130736a = 0;

    /* renamed from: b */
    public Object f130737b;

    /* renamed from: c */
    public String f130738c = "";

    /* renamed from: d */
    public bmtd f130739d;

    static {
        bmsq bmsq = new bmsq();
        f130734e = bmsq;
        GeneratedMessageLite.m124024a(bmsq.class, bmsq);
    }

    private bmsq() {
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
            return GeneratedMessageLite.m124022a(f130734e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005\t", new Object[]{"b", "a", bmta.class, bmts.class, bmtb.class, "c", "d"});
        } else if (i2 == 3) {
            return new bmsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130734e);
            }
            if (i2 == 5) {
                return f130734e;
            }
            bxxk bxxk = f130735f;
            if (bxxk == null) {
                synchronized (bmsq.class) {
                    bxxk = f130735f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130734e);
                        f130735f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
