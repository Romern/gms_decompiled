package p000;

/* renamed from: cbht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbht extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cbht f177177g;

    /* renamed from: h */
    private static volatile bxxk f177178h;

    /* renamed from: a */
    public int f177179a;

    /* renamed from: b */
    public boolean f177180b;

    /* renamed from: c */
    public boolean f177181c;

    /* renamed from: d */
    public bxwc f177182d = bxxn.f165040b;

    /* renamed from: e */
    public String f177183e = "";

    /* renamed from: f */
    public String f177184f = "";

    static {
        cbht cbht = new cbht();
        f177177g = cbht;
        bxvk.m124024a(cbht.class, cbht);
    }

    private cbht() {
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
            return bxvk.m124022a(f177177g, "\u0000\u0006\u0000\u0000\u0001\f\u0006\u0000\u0001\u0000\u0001\f\u0002\u0007\tȈ\n\u0007\u000b\u001b\fȈ", new Object[]{"a", "b", "e", "c", "d", cbhz.class, "f"});
        } else if (i2 == 3) {
            return new cbht();
        } else {
            if (i2 == 4) {
                return new bxvd(f177177g);
            }
            if (i2 == 5) {
                return f177177g;
            }
            bxxk bxxk = f177178h;
            if (bxxk == null) {
                synchronized (cbht.class) {
                    bxxk = f177178h;
                    if (bxxk == null) {
                        bxxk = new bxve(f177177g);
                        f177178h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
