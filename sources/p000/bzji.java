package p000;

/* renamed from: bzji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzji extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzji f170289c;

    /* renamed from: d */
    private static volatile bxxk f170290d;

    /* renamed from: a */
    public int f170291a;

    /* renamed from: b */
    public int f170292b;

    static {
        bzji bzji = new bzji();
        f170289c = bzji;
        GeneratedMessageLite.m124024a(bzji.class, bzji);
    }

    private bzji() {
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
            return GeneratedMessageLite.m124022a(f170289c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzji();
        } else {
            if (i2 == 4) {
                return new bxvd(f170289c);
            }
            if (i2 == 5) {
                return f170289c;
            }
            bxxk bxxk = f170290d;
            if (bxxk == null) {
                synchronized (bzji.class) {
                    bxxk = f170290d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170289c);
                        f170290d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
