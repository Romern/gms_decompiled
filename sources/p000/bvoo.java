package p000;

/* renamed from: bvoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvoo f157062e;

    /* renamed from: g */
    private static volatile bxxk f157063g;

    /* renamed from: a */
    public int f157064a;

    /* renamed from: b */
    public int f157065b;

    /* renamed from: c */
    public String f157066c = "";

    /* renamed from: d */
    public String f157067d = "";

    /* renamed from: f */
    private int f157068f;

    static {
        bvoo bvoo = new bvoo();
        f157062e = bvoo;
        GeneratedMessageLite.m124024a(bvoo.class, bvoo);
    }

    private bvoo() {
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
            return GeneratedMessageLite.m124022a(f157062e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f157062e);
            }
            if (i2 == 5) {
                return f157062e;
            }
            bxxk bxxk = f157063g;
            if (bxxk == null) {
                synchronized (bvoo.class) {
                    bxxk = f157063g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157062e);
                        f157063g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
