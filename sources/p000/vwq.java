package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: vwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwq {

    /* renamed from: a */
    public static final int[] f50153a = {114, 80, 15, 96, 114, 20, 15, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 99, 100, 84, 36, 57, 101, 91, 69, 6, 73, 117, 72, 44, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 18, 84, 2, 90, 57, 36, 116, 36, 109, 100, 100, 93, 15, 107, ErrorInfo.TYPE_SDU_MEMORY_FULL, 53, 57, 95, 56, 95, 111, 72, 53, 92, 57, 36, 44};

    /* renamed from: b */
    public static final int[] f50154b = {116, 50, 27, 45, 48, 86};

    /* renamed from: c */
    public static final int[] f50155c = {30, 72, 53, 57, 94, 101, 99, 36, 97, 44};

    /* renamed from: d */
    public static final int[] f50156d = {53, 57, 101, 44, 91, 93, 88, 88, 93, 28, 76, 94, 36, 44, 15, 107, 111, 76, 69, 57};

    /* renamed from: e */
    static final byte[] f50157e = {-14, 118, 2, 40, -123, 1, -2, -29, 65, -126, -79, -95, 103, 11, -16, 74};

    /* renamed from: f */
    static final byte[] f50158f = {-107, 23, 42, 52, 9, 57, 24, 63, -40, -59, -13, -8, 79, 77, -82, 22};

    /* renamed from: h */
    private static final int[] f50159h = {91, 90, 80, 15, 20, 15, 84, 36, 113, 57, 69, 109, 110, 94, 6, 73, 72, 44, 109, 18, 93, 84, 50, 57, 69, 6, 94, 114, 89, 73, 57, 9, 88, 94, 98, 102, 15, 76, 30, 62, 114, 98, 41};

    /* renamed from: i */
    private static final int[] f50160i = {76, 93, 57, 58, 110, 44, 43, 18, 44, 57, 36};

    /* renamed from: g */
    final vws f50161g;

    public vwq(vws vws) {
        this.f50161g = vws;
    }

    /* renamed from: a */
    public static final byte[] m41498a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length);
            i2 += length;
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo28916a(int i) {
        try {
            Class<?> cls = Class.forName(this.f50161g.mo28917a(f50159h));
            Object newInstance = cls.newInstance();
            byte[] bArr = new byte[i];
            cls.getMethod(this.f50161g.mo28917a(f50160i), byte[].class).invoke(newInstance, bArr);
            return bArr;
        } catch (Exception e) {
            throw new vwr(e);
        }
    }
}
