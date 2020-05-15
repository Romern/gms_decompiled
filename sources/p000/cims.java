package p000;

/* renamed from: cims */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cims extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cims f190776e;

    /* renamed from: f */
    private static volatile bxxk f190777f;

    /* renamed from: a */
    public int f190778a;

    /* renamed from: b */
    public int f190779b;

    /* renamed from: c */
    public int f190780c;

    /* renamed from: d */
    public cimn f190781d;

    static {
        cims cims = new cims();
        f190776e = cims;
        GeneratedMessageLite.m124024a(cims.class, cims);
    }

    private cims() {
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
            return GeneratedMessageLite.m124022a(f190776e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cims();
        } else {
            if (i2 == 4) {
                return new bxvd(f190776e);
            }
            if (i2 == 5) {
                return f190776e;
            }
            bxxk bxxk = f190777f;
            if (bxxk == null) {
                synchronized (cims.class) {
                    bxxk = f190777f;
                    if (bxxk == null) {
                        bxxk = new bxve(f190776e);
                        f190777f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
