package p000;

/* renamed from: caql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caql {

    /* renamed from: a */
    public static final byte[] f175565a = {111};

    /* renamed from: b */
    public static final byte[] f175566b = {-91};

    /* renamed from: c */
    public static final byte[] f175567c = {80};

    /* renamed from: a */
    public static byte[] m126973a(byte[] bArr) {
        catj a;
        catj a2;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        catj a3 = catj.m127172a(bArr2);
        if (a3 == null || (a = catj.m127172a(a3.mo74844b(f175565a))) == null || (a2 = catj.m127172a(a.mo74844b(f175566b))) == null) {
            return null;
        }
        return a2.mo74844b(f175567c);
    }
}
