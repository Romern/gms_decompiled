package p000;

/* renamed from: bptq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bptq f139159e;

    /* renamed from: f */
    private static volatile bxxk f139160f;

    /* renamed from: a */
    public int f139161a;

    /* renamed from: b */
    public int f139162b;

    /* renamed from: c */
    public int f139163c;

    /* renamed from: d */
    public bpsv f139164d;

    static {
        bptq bptq = new bptq();
        f139159e = bptq;
        bxvk.m124024a(bptq.class, bptq);
    }

    private bptq() {
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
            return bxvk.m124022a(f139159e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bpfk.m111872b(), "c", "d"});
        } else if (i2 == 3) {
            return new bptq();
        } else {
            if (i2 == 4) {
                return new bxvd(f139159e);
            }
            if (i2 == 5) {
                return f139159e;
            }
            bxxk bxxk = f139160f;
            if (bxxk == null) {
                synchronized (bptq.class) {
                    bxxk = f139160f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139159e);
                        f139160f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
