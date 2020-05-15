package p000;

import java.util.Locale;

/* renamed from: zzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzd {
    /* renamed from: a */
    public static zxf m46727a() {
        byte[] bArr;
        bxvd da = zxf.f56084e.mo74144da();
        String format = String.format(Locale.ENGLISH, "directory%03d.pb", Long.valueOf(ceal.m135825c()));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zxf zxf = (zxf) da.f164949b;
        format.getClass();
        zxf.f56086a |= 1;
        zxf.f56087b = format;
        long b = ceal.f182163a.mo6606a().mo78683b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zxf zxf2 = (zxf) da.f164949b;
        zxf2.f56086a |= 2;
        zxf2.f56088c = b;
        String b2 = ceal.m135824b();
        if (b2 == null) {
            bArr = new byte[0];
        } else {
            int length = b2.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr2[i] = (byte) ((Character.digit(b2.charAt(i2), 16) << 4) + Character.digit(b2.charAt(i2 + 1), 16));
            }
            bArr = bArr2;
        }
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zxf zxf3 = (zxf) da.f164949b;
        a.getClass();
        zxf3.f56086a |= 4;
        zxf3.f56089d = a;
        return (zxf) da.mo74062i();
    }
}
