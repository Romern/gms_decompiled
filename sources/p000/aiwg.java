package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: aiwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwg {
    /* renamed from: a */
    public static byte m58065a() {
        return (byte) ((int) (cfop.f185115a.mo6606a().mo82208L() & 255));
    }

    /* renamed from: a */
    public static byte[] m58066a(byte[] bArr) {
        int length = bArr.length;
        if (length > 1) {
            byte a = m58065a();
            if (bArr[0] == a) {
                int i = length - 1;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 1, bArr2, 0, i);
                return bArr2;
            }
            String format = String.format("%s Audio token does not match prefix: %s, %s", "AudioBytesUtil: ", srv.m36163c(bArr), String.valueOf((int) a));
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aiwg", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s", format);
            throw new UnsupportedEncodingException(format);
        }
        String format2 = String.format("%s Audio token is too short for decoding.", "AudioBytesUtil: ");
        bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
        bnsl2.mo68432a("aiwg", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("%s", format2);
        throw new UnsupportedEncodingException(format2);
    }
}
