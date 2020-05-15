package p000;

/* renamed from: btbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btbh f148131c;

    /* renamed from: d */
    private static volatile bxxk f148132d;

    /* renamed from: a */
    public String f148133a = "";

    /* renamed from: b */
    public String f148134b = "";

    static {
        btbh btbh = new btbh();
        f148131c = btbh;
        bxvk.m124024a(btbh.class, btbh);
    }

    private btbh() {
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
            return bxvk.m124022a(f148131c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btbh();
        } else {
            if (i2 == 4) {
                return new bxvd(f148131c);
            }
            if (i2 == 5) {
                return f148131c;
            }
            bxxk bxxk = f148132d;
            if (bxxk == null) {
                synchronized (btbh.class) {
                    bxxk = f148132d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148131c);
                        f148132d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
