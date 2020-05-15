package p000;

/* renamed from: bvnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvnq f156961b;

    /* renamed from: c */
    private static volatile bxxk f156962c;

    /* renamed from: a */
    public bxwc f156963a = bxxn.f165040b;

    static {
        bvnq bvnq = new bvnq();
        f156961b = bvnq;
        GeneratedMessageLite.m124024a(bvnq.class, bvnq);
    }

    private bvnq() {
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
            return GeneratedMessageLite.m124022a(f156961b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvoe.class});
        } else if (i2 == 3) {
            return new bvnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f156961b);
            }
            if (i2 == 5) {
                return f156961b;
            }
            bxxk bxxk = f156962c;
            if (bxxk == null) {
                synchronized (bvnq.class) {
                    bxxk = f156962c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156961b);
                        f156962c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
