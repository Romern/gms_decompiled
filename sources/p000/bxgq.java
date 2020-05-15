package p000;

/* renamed from: bxgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxgq f163284d;

    /* renamed from: e */
    private static volatile bxxk f163285e;

    /* renamed from: a */
    public int f163286a;

    /* renamed from: b */
    public bxge f163287b;

    /* renamed from: c */
    public int f163288c;

    static {
        bxgq bxgq = new bxgq();
        f163284d = bxgq;
        GeneratedMessageLite.m124024a(bxgq.class, bxgq);
    }

    private bxgq() {
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
            return GeneratedMessageLite.m124022a(f163284d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f163284d);
            }
            if (i2 == 5) {
                return f163284d;
            }
            bxxk bxxk = f163285e;
            if (bxxk == null) {
                synchronized (bxgq.class) {
                    bxxk = f163285e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163284d);
                        f163285e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
