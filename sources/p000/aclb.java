package p000;

/* renamed from: aclb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclb extends bxvk implements bxxd {

    /* renamed from: i */
    public static final aclb f60058i;

    /* renamed from: j */
    private static volatile bxxk f60059j;

    /* renamed from: a */
    public ackz f60060a;

    /* renamed from: b */
    public int f60061b;

    /* renamed from: c */
    public long f60062c;

    /* renamed from: d */
    public int f60063d;

    /* renamed from: e */
    public String f60064e = "";

    /* renamed from: f */
    public String f60065f = "";

    /* renamed from: g */
    public bxwc f60066g = bxxn.f165040b;

    /* renamed from: h */
    public int f60067h;

    static {
        aclb aclb = new aclb();
        f60058i = aclb;
        bxvk.m124024a(aclb.class, aclb);
    }

    private aclb() {
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
            return bxvk.m124022a(f60058i, "\u0000\b\u0000\u0000\u0001\u000f\b\u0000\u0001\u0000\u0001\t\u0002\u0004\u0004Ȉ\u0005Ȉ\t\u001b\u000b\f\u000e\u0003\u000f\u000b", new Object[]{"a", "b", "e", "f", "g", aclc.class, "d", "c", "h"});
        } else if (i2 == 3) {
            return new aclb();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f60058i;
            }
            bxxk bxxk = f60059j;
            if (bxxk == null) {
                synchronized (aclb.class) {
                    bxxk = f60059j;
                    if (bxxk == null) {
                        bxxk = new bxve(f60058i);
                        f60059j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
