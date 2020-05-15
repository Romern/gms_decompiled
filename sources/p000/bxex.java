package p000;

/* renamed from: bxex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxex extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxex f163147g;

    /* renamed from: h */
    private static volatile bxxk f163148h;

    /* renamed from: a */
    public int f163149a;

    /* renamed from: b */
    public int f163150b;

    /* renamed from: c */
    public String f163151c = "";

    /* renamed from: d */
    public long f163152d;

    /* renamed from: e */
    public long f163153e;

    /* renamed from: f */
    public boolean f163154f;

    static {
        bxex bxex = new bxex();
        f163147g = bxex;
        GeneratedMessageLite.m124024a(bxex.class, bxex);
    }

    private bxex() {
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
            return GeneratedMessageLite.m124022a(f163147g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", bxew.m122644b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bxex();
        } else {
            if (i2 == 4) {
                return new bxvd(f163147g);
            }
            if (i2 == 5) {
                return f163147g;
            }
            bxxk bxxk = f163148h;
            if (bxxk == null) {
                synchronized (bxex.class) {
                    bxxk = f163148h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163147g);
                        f163148h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
