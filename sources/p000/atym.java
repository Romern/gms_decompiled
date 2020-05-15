package p000;

/* renamed from: atym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atym extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final atym f91120j;

    /* renamed from: k */
    private static volatile bxxk f91121k;

    /* renamed from: a */
    public int f91122a;

    /* renamed from: b */
    public atyk f91123b;

    /* renamed from: c */
    public atyp f91124c;

    /* renamed from: d */
    public boolean f91125d;

    /* renamed from: e */
    public int f91126e;

    /* renamed from: f */
    public atzs f91127f;

    /* renamed from: g */
    public int f91128g;

    /* renamed from: h */
    public double f91129h;

    /* renamed from: i */
    public double f91130i;

    static {
        atym atym = new atym();
        f91120j = atym;
        GeneratedMessageLite.m124024a(atym.class, atym);
    }

    private atym() {
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
            return GeneratedMessageLite.m124022a(f91120j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\t\u0004\u0007\u0005\u0004\u0006\t\u0007\u0004\b\u0000\t\u0000", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new atym();
        } else {
            if (i2 == 4) {
                return new bxvd(f91120j);
            }
            if (i2 == 5) {
                return f91120j;
            }
            bxxk bxxk = f91121k;
            if (bxxk == null) {
                synchronized (atym.class) {
                    bxxk = f91121k;
                    if (bxxk == null) {
                        bxxk = new bxve(f91120j);
                        f91121k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
