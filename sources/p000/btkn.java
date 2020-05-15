package p000;

/* renamed from: btkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btkn f149277e;

    /* renamed from: f */
    private static volatile bxxk f149278f;

    /* renamed from: a */
    public int f149279a = 0;

    /* renamed from: b */
    public Object f149280b;

    /* renamed from: c */
    public btiy f149281c;

    /* renamed from: d */
    public String f149282d = "";

    static {
        btkn btkn = new btkn();
        f149277e = btkn;
        GeneratedMessageLite.m124024a(btkn.class, btkn);
    }

    private btkn() {
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
            return GeneratedMessageLite.m124022a(f149277e, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002=\u0000\u0003Ȼ\u0000\u0004Ȉ", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new btkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f149277e);
            }
            if (i2 == 5) {
                return f149277e;
            }
            bxxk bxxk = f149278f;
            if (bxxk == null) {
                synchronized (btkn.class) {
                    bxxk = f149278f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149277e);
                        f149278f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
