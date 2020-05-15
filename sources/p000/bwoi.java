package p000;

/* renamed from: bwoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoi extends bxvg implements bxvh {

    /* renamed from: f */
    public static final bwoi f160451f;

    /* renamed from: h */
    private static volatile bxxk f160452h;

    /* renamed from: a */
    public int f160453a;

    /* renamed from: b */
    public bxvw f160454b = bxwq.f165002b;

    /* renamed from: c */
    public int f160455c;

    /* renamed from: d */
    public int f160456d;

    /* renamed from: e */
    public boolean f160457e;

    /* renamed from: g */
    private byte f160458g = 2;

    static {
        bwoi bwoi = new bwoi();
        f160451f = bwoi;
        bxvk.m124024a(bwoi.class, bwoi);
    }

    private bwoi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160458g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160458g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160451f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0014\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwoi();
        } else {
            if (i2 == 4) {
                return new bxvf(f160451f);
            }
            if (i2 == 5) {
                return f160451f;
            }
            bxxk bxxk = f160452h;
            if (bxxk == null) {
                synchronized (bwoi.class) {
                    bxxk = f160452h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160451f);
                        f160452h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
