package p000;

/* renamed from: zxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxp {
    /* renamed from: a */
    public static String m46640a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static zxf m46641a(zxf zxf) {
        if (!zxf.f56087b.isEmpty()) {
            return zxf;
        }
        bxvd da = zxf.f56084e.mo74144da();
        String concat = String.valueOf(m46640a(zxf.f56089d.mo73780k())).concat(".ttf");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zxf zxf2 = (zxf) da.f164949b;
        concat.getClass();
        int i = zxf2.f56086a | 1;
        zxf2.f56086a = i;
        zxf2.f56087b = concat;
        bxtx bxtx = zxf.f56089d;
        bxtx.getClass();
        int i2 = i | 4;
        zxf2.f56086a = i2;
        zxf2.f56089d = bxtx;
        long j = zxf.f56088c;
        zxf2.f56086a = i2 | 2;
        zxf2.f56088c = j;
        return (zxf) da.mo74062i();
    }
}
