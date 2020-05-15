package p000;

/* renamed from: bpbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpbw f135631c;

    /* renamed from: d */
    private static volatile bxxk f135632d;

    /* renamed from: a */
    public int f135633a;

    /* renamed from: b */
    public int f135634b;

    static {
        bpbw bpbw = new bpbw();
        f135631c = bpbw;
        bxvk.m124024a(bpbw.class, bpbw);
    }

    private bpbw() {
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
            return bxvk.m124022a(f135631c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpbv.f135630a});
        } else if (i2 == 3) {
            return new bpbw();
        } else {
            if (i2 == 4) {
                return new bxvd(f135631c);
            }
            if (i2 == 5) {
                return f135631c;
            }
            bxxk bxxk = f135632d;
            if (bxxk == null) {
                synchronized (bpbw.class) {
                    bxxk = f135632d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135631c);
                        f135632d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
