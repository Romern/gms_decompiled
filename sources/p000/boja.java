package p000;

/* renamed from: boja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boja extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boja f133256d;

    /* renamed from: e */
    private static volatile bxxk f133257e;

    /* renamed from: a */
    public int f133258a;

    /* renamed from: b */
    public boolean f133259b;

    /* renamed from: c */
    public int f133260c;

    static {
        boja boja = new boja();
        f133256d = boja;
        GeneratedMessageLite.m124024a(boja.class, boja);
    }

    private boja() {
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
            return GeneratedMessageLite.m124022a(f133256d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boja();
        } else {
            if (i2 == 4) {
                return new bxvd(f133256d);
            }
            if (i2 == 5) {
                return f133256d;
            }
            bxxk bxxk = f133257e;
            if (bxxk == null) {
                synchronized (boja.class) {
                    bxxk = f133257e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133256d);
                        f133257e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
