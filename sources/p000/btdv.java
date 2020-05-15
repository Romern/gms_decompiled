package p000;

/* renamed from: btdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btdv f148455g;

    /* renamed from: i */
    private static volatile bxxk f148456i;

    /* renamed from: a */
    public bxwc f148457a = bxxn.f165040b;

    /* renamed from: b */
    public String f148458b = "";

    /* renamed from: c */
    public String f148459c = "";

    /* renamed from: d */
    public int f148460d;

    /* renamed from: e */
    public int f148461e;

    /* renamed from: f */
    public btbt f148462f;

    /* renamed from: h */
    private byte f148463h = 2;

    static {
        btdv btdv = new btdv();
        f148455g = btdv;
        bxvk.m124024a(btdv.class, btdv);
    }

    private btdv() {
        bxvm bxvm = bxvm.f164965b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148463h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148463h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148455g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0001\u0001Л\u0002Ȉ\u0003Ȉ\u0004\u0004\u0006\u0004\u0007\t", new Object[]{"a", bler.class, "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f148455g);
            }
            if (i2 == 5) {
                return f148455g;
            }
            bxxk bxxk = f148456i;
            if (bxxk == null) {
                synchronized (btdv.class) {
                    bxxk = f148456i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148455g);
                        f148456i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
