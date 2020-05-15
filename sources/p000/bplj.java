package p000;

/* renamed from: bplj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bplj f138100c;

    /* renamed from: d */
    private static volatile bxxk f138101d;

    /* renamed from: a */
    public int f138102a;

    /* renamed from: b */
    public bpll f138103b;

    static {
        bplj bplj = new bplj();
        f138100c = bplj;
        GeneratedMessageLite.m124024a(bplj.class, bplj);
    }

    private bplj() {
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
            return GeneratedMessageLite.m124022a(f138100c, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u000f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bplj();
        } else {
            if (i2 == 4) {
                return new bxvd(f138100c);
            }
            if (i2 == 5) {
                return f138100c;
            }
            bxxk bxxk = f138101d;
            if (bxxk == null) {
                synchronized (bplj.class) {
                    bxxk = f138101d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138100c);
                        f138101d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
