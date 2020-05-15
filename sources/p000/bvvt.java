package p000;

/* renamed from: bvvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvt extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvvt f157843j;

    /* renamed from: k */
    private static volatile bxxk f157844k;

    /* renamed from: a */
    public int f157845a;

    /* renamed from: b */
    public bxwc f157846b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f157847c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f157848d = bxxn.f165040b;

    /* renamed from: e */
    public bvxg f157849e;

    /* renamed from: f */
    public bxwc f157850f = bxxn.f165040b;

    /* renamed from: g */
    public bvwj f157851g;

    /* renamed from: h */
    public bvwj f157852h;

    /* renamed from: i */
    public bvwj f157853i;

    static {
        bvvt bvvt = new bvvt();
        f157843j = bvvt;
        GeneratedMessageLite.m124024a(bvvt.class, bvvt);
    }

    private bvvt() {
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
            return GeneratedMessageLite.m124022a(f157843j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\b\u001b\tဉ\u0003", new Object[]{"a", "b", bvwm.class, "c", bvvp.class, "d", bvwq.class, "e", "g", "h", "f", bvxr.class, "i"});
        } else if (i2 == 3) {
            return new bvvt();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157843j;
            }
            bxxk bxxk = f157844k;
            if (bxxk == null) {
                synchronized (bvvt.class) {
                    bxxk = f157844k;
                    if (bxxk == null) {
                        bxxk = new bxve(f157843j);
                        f157844k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
