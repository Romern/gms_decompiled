package p000;

/* renamed from: btep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btep extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btep f148540i;

    /* renamed from: j */
    private static volatile bxxk f148541j;

    /* renamed from: a */
    public int f148542a;

    /* renamed from: b */
    public String f148543b = "";

    /* renamed from: c */
    public bteo f148544c;

    /* renamed from: d */
    public bteh f148545d;

    /* renamed from: e */
    public btea f148546e;

    /* renamed from: f */
    public btdy f148547f;

    /* renamed from: g */
    public btcu f148548g;

    /* renamed from: h */
    public String f148549h = "";

    static {
        btep btep = new btep();
        f148540i = btep;
        GeneratedMessageLite.m124024a(btep.class, btep);
    }

    private btep() {
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
            return GeneratedMessageLite.m124022a(f148540i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\t\u0004\t\u0005\t\u0006\t\b\t\tȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btep();
        } else {
            if (i2 == 4) {
                return new bxvd(f148540i);
            }
            if (i2 == 5) {
                return f148540i;
            }
            bxxk bxxk = f148541j;
            if (bxxk == null) {
                synchronized (btep.class) {
                    bxxk = f148541j;
                    if (bxxk == null) {
                        bxxk = new bxve(f148540i);
                        f148541j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
