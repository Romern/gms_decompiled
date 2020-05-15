package p000;

/* renamed from: btez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btez extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btez f148595g;

    /* renamed from: h */
    private static volatile bxxk f148596h;

    /* renamed from: a */
    public String f148597a = "";

    /* renamed from: b */
    public long f148598b;

    /* renamed from: c */
    public bxwc f148599c = bxxn.f165040b;

    /* renamed from: d */
    public String f148600d = "";

    /* renamed from: e */
    public long f148601e;

    /* renamed from: f */
    public btfc f148602f;

    static {
        btez btez = new btez();
        f148595g = btez;
        bxvk.m124024a(btez.class, btez);
    }

    private btez() {
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
            return bxvk.m124022a(f148595g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004\u0002\u0006\u0002\u0007\t", new Object[]{"a", "c", btfq.class, "d", "e", "b", "f"});
        } else if (i2 == 3) {
            return new btez();
        } else {
            if (i2 == 4) {
                return new bxvd(f148595g);
            }
            if (i2 == 5) {
                return f148595g;
            }
            bxxk bxxk = f148596h;
            if (bxxk == null) {
                synchronized (btez.class) {
                    bxxk = f148596h;
                    if (bxxk == null) {
                        bxxk = new bxve(f148595g);
                        f148596h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
