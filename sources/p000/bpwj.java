package p000;

/* renamed from: bpwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bpwj f139502i;

    /* renamed from: k */
    private static volatile bxxk f139503k;

    /* renamed from: a */
    public int f139504a;

    /* renamed from: b */
    public bptw f139505b;

    /* renamed from: c */
    public String f139506c = "";

    /* renamed from: d */
    public int f139507d;

    /* renamed from: e */
    public String f139508e = "";

    /* renamed from: f */
    public String f139509f = "";

    /* renamed from: g */
    public String f139510g = "";

    /* renamed from: h */
    public bpwm f139511h;

    /* renamed from: j */
    private byte f139512j = 2;

    static {
        bpwj bpwj = new bpwj();
        f139502i = bpwj;
        bxvk.m124024a(bpwj.class, bpwj);
    }

    private bpwj() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139512j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139512j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139502i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0006\bᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139502i);
            }
            if (i2 == 5) {
                return f139502i;
            }
            bxxk bxxk = f139503k;
            if (bxxk == null) {
                synchronized (bpwj.class) {
                    bxxk = f139503k;
                    if (bxxk == null) {
                        bxxk = new bxve(f139502i);
                        f139503k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
