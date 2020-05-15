package p000;

/* renamed from: atzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final atzs f91294d;

    /* renamed from: e */
    private static volatile bxxk f91295e;

    /* renamed from: a */
    public int f91296a;

    /* renamed from: b */
    public atyp f91297b;

    /* renamed from: c */
    public String f91298c = "";

    static {
        atzs atzs = new atzs();
        f91294d = atzs;
        GeneratedMessageLite.m124024a(atzs.class, atzs);
    }

    private atzs() {
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
            return GeneratedMessageLite.m124022a(f91294d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new atzs();
        } else {
            if (i2 == 4) {
                return new bxvd(f91294d);
            }
            if (i2 == 5) {
                return f91294d;
            }
            bxxk bxxk = f91295e;
            if (bxxk == null) {
                synchronized (atzs.class) {
                    bxxk = f91295e;
                    if (bxxk == null) {
                        bxxk = new bxve(f91294d);
                        f91295e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
