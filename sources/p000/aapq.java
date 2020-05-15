package p000;

/* renamed from: aapq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final aapq f28824a;

    /* renamed from: b */
    private static volatile bxxk f28825b;

    static {
        aapq aapq = new aapq();
        f28824a = aapq;
        GeneratedMessageLite.m124024a(aapq.class, aapq);
    }

    private aapq() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f28824a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new aapq();
        }
        if (i2 == 4) {
            return new bxvd(f28824a);
        }
        if (i2 == 5) {
            return f28824a;
        }
        bxxk bxxk = f28825b;
        if (bxxk == null) {
            synchronized (aapq.class) {
                bxxk = f28825b;
                if (bxxk == null) {
                    bxxk = new bxve(f28824a);
                    f28825b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
