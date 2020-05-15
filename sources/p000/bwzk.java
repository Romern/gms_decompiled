package p000;

/* renamed from: bwzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwzk f161614d;

    /* renamed from: e */
    public static final bxvj f161615e;

    /* renamed from: g */
    private static volatile bxxk f161616g;

    /* renamed from: a */
    public int f161617a = 0;

    /* renamed from: b */
    public Object f161618b;

    /* renamed from: c */
    public int f161619c;

    /* renamed from: f */
    private int f161620f;

    static {
        bwzk bwzk = new bwzk();
        f161614d = bwzk;
        GeneratedMessageLite.m124024a(bwzk.class, bwzk);
        bwoi bwoi = bwoi.f160451f;
        bwzk bwzk2 = f161614d;
        f161615e = GeneratedMessageLite.m124006a(bwoi, bwzk2, bwzk2, 232901549, bxzf.MESSAGE);
    }

    private bwzk() {
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
            return GeneratedMessageLite.m124022a(f161614d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", "f", "c", bwzi.f161613a, bwzl.f161621a});
        } else if (i2 == 3) {
            return new bwzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f161614d);
            }
            if (i2 == 5) {
                return f161614d;
            }
            bxxk bxxk = f161616g;
            if (bxxk == null) {
                synchronized (bwzk.class) {
                    bxxk = f161616g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161614d);
                        f161616g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
