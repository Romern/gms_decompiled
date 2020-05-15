package p000;

/* renamed from: bwsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwsq f160904c;

    /* renamed from: d */
    public static final bxvj f160905d;

    /* renamed from: f */
    private static volatile bxxk f160906f;

    /* renamed from: a */
    public bwwb f160907a;

    /* renamed from: b */
    public String f160908b = "";

    /* renamed from: e */
    private int f160909e;

    static {
        bwsq bwsq = new bwsq();
        f160904c = bwsq;
        bxvk.m124024a(bwsq.class, bwsq);
        bwny bwny = bwny.f160414k;
        bwsq bwsq2 = f160904c;
        f160905d = bxvk.m124006a(bwny, bwsq2, bwsq2, 286058389, bxzf.MESSAGE);
    }

    private bwsq() {
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
            return bxvk.m124022a(f160904c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new bwsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160904c);
            }
            if (i2 == 5) {
                return f160904c;
            }
            bxxk bxxk = f160906f;
            if (bxxk == null) {
                synchronized (bwsq.class) {
                    bxxk = f160906f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160904c);
                        f160906f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
