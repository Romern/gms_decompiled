package p000;

/* renamed from: bsjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsjj f144799e;

    /* renamed from: f */
    private static volatile bxxk f144800f;

    /* renamed from: a */
    public float f144801a;

    /* renamed from: b */
    public float f144802b;

    /* renamed from: c */
    public bxwc f144803c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f144804d = bxxn.f165040b;

    static {
        bsjj bsjj = new bsjj();
        f144799e = bsjj;
        GeneratedMessageLite.m124024a(bsjj.class, bsjj);
    }

    private bsjj() {
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
            return GeneratedMessageLite.m124022a(f144799e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0001\u0002\u0001\u0003\u001b\u0004Ț", new Object[]{"a", "b", "c", bsji.class, "d"});
        } else if (i2 == 3) {
            return new bsjj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f144799e;
            }
            bxxk bxxk = f144800f;
            if (bxxk == null) {
                synchronized (bsjj.class) {
                    bxxk = f144800f;
                    if (bxxk == null) {
                        bxxk = new bxve(f144799e);
                        f144800f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
