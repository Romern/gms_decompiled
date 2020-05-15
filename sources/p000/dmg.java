package p000;

/* renamed from: dmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmg extends bxvk implements bxxd {

    /* renamed from: i */
    public static final dmg f13517i;

    /* renamed from: j */
    private static volatile bxxk f13518j;

    /* renamed from: a */
    public int f13519a;

    /* renamed from: b */
    public String f13520b = "";

    /* renamed from: c */
    public int f13521c;

    /* renamed from: d */
    public boolean f13522d;

    /* renamed from: e */
    public boolean f13523e;

    /* renamed from: f */
    public boolean f13524f;

    /* renamed from: g */
    public boolean f13525g;

    /* renamed from: h */
    public int f13526h;

    static {
        dmg dmg = new dmg();
        f13517i = dmg;
        bxvk.m124024a(dmg.class, dmg);
    }

    private dmg() {
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
            return bxvk.m124022a(f13517i, "\u0001\u0007\u0000\u0001\u0001\u001e\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u001eင\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new dmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f13517i);
            }
            if (i2 == 5) {
                return f13517i;
            }
            bxxk bxxk = f13518j;
            if (bxxk == null) {
                synchronized (dmg.class) {
                    bxxk = f13518j;
                    if (bxxk == null) {
                        bxxk = new bxve(f13517i);
                        f13518j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
