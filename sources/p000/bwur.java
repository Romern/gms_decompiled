package p000;

/* renamed from: bwur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwur extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwur f161058e;

    /* renamed from: g */
    private static volatile bxxk f161059g;

    /* renamed from: a */
    public int f161060a = 0;

    /* renamed from: b */
    public Object f161061b;

    /* renamed from: c */
    public String f161062c = "";

    /* renamed from: d */
    public int f161063d;

    /* renamed from: f */
    private int f161064f;

    static {
        bwur bwur = new bwur();
        f161058e = bwur;
        GeneratedMessageLite.m124024a(bwur.class, bwur);
    }

    private bwur() {
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
            return GeneratedMessageLite.m124022a(f161058e, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001့\u0000\u0002့\u0000\u0003ျ\u0000\u0004ဿ\u0000\u0005ဈ\u0006\u0006င\u0007\u0007ြ\u0000\bဵ\u0000", new Object[]{"b", "a", "f", bwun.f161052a, "c", "d", bwuq.class});
        } else if (i2 == 3) {
            return new bwur();
        } else {
            if (i2 == 4) {
                return new bxvd(f161058e);
            }
            if (i2 == 5) {
                return f161058e;
            }
            bxxk bxxk = f161059g;
            if (bxxk == null) {
                synchronized (bwur.class) {
                    bxxk = f161059g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161058e);
                        f161059g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
