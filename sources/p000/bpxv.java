package p000;

/* renamed from: bpxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpxv f139787g;

    /* renamed from: h */
    private static volatile bxxk f139788h;

    /* renamed from: a */
    public int f139789a;

    /* renamed from: b */
    public bxwc f139790b = bxxn.f165040b;

    /* renamed from: c */
    public bxvw f139791c = bxwq.f165002b;

    /* renamed from: d */
    public bxvw f139792d = bxwq.f165002b;

    /* renamed from: e */
    public long f139793e;

    /* renamed from: f */
    public long f139794f;

    static {
        bpxv bpxv = new bpxv();
        f139787g = bpxv;
        GeneratedMessageLite.m124024a(bpxv.class, bpxv);
    }

    private bpxv() {
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
            return GeneratedMessageLite.m124022a(f139787g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001", new Object[]{"a", "b", bpwz.class, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpxv();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139787g;
            }
            bxxk bxxk = f139788h;
            if (bxxk == null) {
                synchronized (bpxv.class) {
                    bxxk = f139788h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139787g);
                        f139788h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
