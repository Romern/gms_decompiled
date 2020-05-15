package p000;

/* renamed from: bvqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvqk f157377c;

    /* renamed from: d */
    private static volatile bxxk f157378d;

    /* renamed from: a */
    public int f157379a;

    /* renamed from: b */
    public boolean f157380b;

    static {
        bvqk bvqk = new bvqk();
        f157377c = bvqk;
        GeneratedMessageLite.m124024a(bvqk.class, bvqk);
    }

    private bvqk() {
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
            return GeneratedMessageLite.m124022a(f157377c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f157377c);
            }
            if (i2 == 5) {
                return f157377c;
            }
            bxxk bxxk = f157378d;
            if (bxxk == null) {
                synchronized (bvqk.class) {
                    bxxk = f157378d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157377c);
                        f157378d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
