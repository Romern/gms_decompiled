package p000;

/* renamed from: bxja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxja extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxja f163596d;

    /* renamed from: e */
    private static volatile bxxk f163597e;

    /* renamed from: a */
    public int f163598a;

    /* renamed from: b */
    public bxjc f163599b;

    /* renamed from: c */
    public bxix f163600c;

    static {
        bxja bxja = new bxja();
        f163596d = bxja;
        bxvk.m124024a(bxja.class, bxja);
    }

    private bxja() {
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
            return bxvk.m124022a(f163596d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxja();
        } else {
            if (i2 == 4) {
                return new bxvd(f163596d);
            }
            if (i2 == 5) {
                return f163596d;
            }
            bxxk bxxk = f163597e;
            if (bxxk == null) {
                synchronized (bxja.class) {
                    bxxk = f163597e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163596d);
                        f163597e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
