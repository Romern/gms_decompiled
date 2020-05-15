package p000;

/* renamed from: btrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btrn f150118h;

    /* renamed from: i */
    private static volatile bxxk f150119i;

    /* renamed from: a */
    public String f150120a = "";

    /* renamed from: b */
    public int f150121b;

    /* renamed from: c */
    public bxwc f150122c = bxxn.f165040b;

    /* renamed from: d */
    public int f150123d;

    /* renamed from: e */
    public String f150124e = "";

    /* renamed from: f */
    public bxwc f150125f = bxxn.f165040b;

    /* renamed from: g */
    public int f150126g;

    static {
        btrn btrn = new btrn();
        f150118h = btrn;
        GeneratedMessageLite.m124024a(btrn.class, btrn);
    }

    private btrn() {
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
            return GeneratedMessageLite.m124022a(f150118h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0003Ț\u0004\u0004\u0006Ȉ\b\u001b\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f", btrm.class, "g"});
        } else if (i2 == 3) {
            return new btrn();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f150118h;
            }
            bxxk bxxk = f150119i;
            if (bxxk == null) {
                synchronized (btrn.class) {
                    bxxk = f150119i;
                    if (bxxk == null) {
                        bxxk = new bxve(f150118h);
                        f150119i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
