package p000;

/* renamed from: bonu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bonu f133857c;

    /* renamed from: d */
    private static volatile bxxk f133858d;

    /* renamed from: a */
    public int f133859a;

    /* renamed from: b */
    public bxvt f133860b = bxvm.f164965b;

    static {
        bonu bonu = new bonu();
        f133857c = bonu;
        GeneratedMessageLite.m124024a(bonu.class, bonu);
    }

    private bonu() {
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
            return GeneratedMessageLite.m124022a(f133857c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bonu();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133857c;
            }
            bxxk bxxk = f133858d;
            if (bxxk == null) {
                synchronized (bonu.class) {
                    bxxk = f133858d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133857c);
                        f133858d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
