package p000;

/* renamed from: bzyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzyg f171863f;

    /* renamed from: g */
    private static volatile bxxk f171864g;

    /* renamed from: a */
    public long f171865a;

    /* renamed from: b */
    public String f171866b = "";

    /* renamed from: c */
    public bxwc f171867c = bxxn.f165040b;

    /* renamed from: d */
    public int f171868d;

    /* renamed from: e */
    public bxwc f171869e = bxxn.f165040b;

    static {
        bzyg bzyg = new bzyg();
        f171863f = bzyg;
        GeneratedMessageLite.m124024a(bzyg.class, bzyg);
    }

    private bzyg() {
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
            return GeneratedMessageLite.m124022a(f171863f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0002\u0002Ȉ\u0003\u001b\u0004\u0004\u0005Ț", new Object[]{"a", "b", "c", bzyn.class, "d", "e"});
        } else if (i2 == 3) {
            return new bzyg();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f171863f;
            }
            bxxk bxxk = f171864g;
            if (bxxk == null) {
                synchronized (bzyg.class) {
                    bxxk = f171864g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171863f);
                        f171864g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
