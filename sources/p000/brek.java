package p000;

/* renamed from: brek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brek extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brek f142665e;

    /* renamed from: g */
    private static volatile bxxk f142666g;

    /* renamed from: a */
    public int f142667a;

    /* renamed from: b */
    public brak f142668b;

    /* renamed from: c */
    public String f142669c = "";

    /* renamed from: d */
    public brdk f142670d;

    /* renamed from: f */
    private byte f142671f = 2;

    static {
        brek brek = new brek();
        f142665e = brek;
        bxvk.m124024a(brek.class, brek);
    }

    private brek() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142671f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142671f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142665e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brek();
        } else {
            if (i2 == 4) {
                return new bxvd(f142665e);
            }
            if (i2 == 5) {
                return f142665e;
            }
            bxxk bxxk = f142666g;
            if (bxxk == null) {
                synchronized (brek.class) {
                    bxxk = f142666g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142665e);
                        f142666g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
