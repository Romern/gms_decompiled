package p000;

/* renamed from: bopk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bopk f134134f;

    /* renamed from: g */
    private static volatile bxxk f134135g;

    /* renamed from: a */
    public String f134136a = "";

    /* renamed from: b */
    public boolean f134137b;

    /* renamed from: c */
    public long f134138c;

    /* renamed from: d */
    public int f134139d;

    /* renamed from: e */
    public bxyk f134140e;

    static {
        bopk bopk = new bopk();
        f134134f = bopk;
        GeneratedMessageLite.m124024a(bopk.class, bopk);
    }

    private bopk() {
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
            return GeneratedMessageLite.m124022a(f134134f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0002\u0004\f\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bopk();
        } else {
            if (i2 == 4) {
                return new bxvd(f134134f);
            }
            if (i2 == 5) {
                return f134134f;
            }
            bxxk bxxk = f134135g;
            if (bxxk == null) {
                synchronized (bopk.class) {
                    bxxk = f134135g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134134f);
                        f134135g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
