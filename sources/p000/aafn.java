package p000;

/* renamed from: aafn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafn extends bxvk implements bxxd {

    /* renamed from: i */
    public static final aafn f28027i;

    /* renamed from: j */
    private static volatile bxxk f28028j;

    /* renamed from: a */
    public int f28029a;

    /* renamed from: b */
    public boolean f28030b;

    /* renamed from: c */
    public String f28031c = "";

    /* renamed from: d */
    public String f28032d = "";

    /* renamed from: e */
    public String f28033e = "";

    /* renamed from: f */
    public long f28034f;

    /* renamed from: g */
    public long f28035g;

    /* renamed from: h */
    public long f28036h;

    static {
        aafn aafn = new aafn();
        f28027i = aafn;
        bxvk.m124024a(aafn.class, aafn);
    }

    private aafn() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f28027i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\nဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new aafn();
        } else {
            if (i2 == 4) {
                return new bxvd(f28027i);
            }
            if (i2 == 5) {
                return f28027i;
            }
            bxxk bxxk = f28028j;
            if (bxxk == null) {
                synchronized (aafn.class) {
                    bxxk = f28028j;
                    if (bxxk == null) {
                        bxxk = new bxve(f28027i);
                        f28028j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
