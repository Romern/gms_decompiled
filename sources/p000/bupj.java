package p000;

/* renamed from: bupj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bupj f154644b;

    /* renamed from: c */
    private static volatile bxxk f154645c;

    /* renamed from: a */
    public String f154646a = "";

    static {
        bupj bupj = new bupj();
        f154644b = bupj;
        GeneratedMessageLite.m124024a(bupj.class, bupj);
    }

    private bupj() {
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
            return GeneratedMessageLite.m124022a(f154644b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bupj();
        } else {
            if (i2 == 4) {
                return new bxvd(f154644b);
            }
            if (i2 == 5) {
                return f154644b;
            }
            bxxk bxxk = f154645c;
            if (bxxk == null) {
                synchronized (bupj.class) {
                    bxxk = f154645c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154644b);
                        f154645c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
