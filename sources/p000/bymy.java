package p000;

/* renamed from: bymy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymy extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bymy f167088g;

    /* renamed from: h */
    private static volatile bxxk f167089h;

    /* renamed from: a */
    public String f167090a = "";

    /* renamed from: b */
    public String f167091b = "";

    /* renamed from: c */
    public long f167092c;

    /* renamed from: d */
    public String f167093d = "";

    /* renamed from: e */
    public bxww f167094e = bxww.f165013b;

    /* renamed from: f */
    public String f167095f = "";

    static {
        bymy bymy = new bymy();
        f167088g = bymy;
        bxvk.m124024a(bymy.class, bymy);
    }

    private bymy() {
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
            return bxvk.m124022a(f167088g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u00052\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", bymx.f167087a, "f"});
        } else if (i2 == 3) {
            return new bymy();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f167088g;
            }
            bxxk bxxk = f167089h;
            if (bxxk == null) {
                synchronized (bymy.class) {
                    bxxk = f167089h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167088g);
                        f167089h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
