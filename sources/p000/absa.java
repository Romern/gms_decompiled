package p000;

/* renamed from: absa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class absa implements absc {
    /* renamed from: a */
    public final String mo32333a(String str, String str2) {
        return absd.m48181d(str, str2, 64000);
    }

    /* renamed from: a */
    public final String mo32334a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    absd.m48175a(str, bArr);
                    return null;
                }
            } catch (IllegalArgumentException e) {
                return e.getMessage();
            }
        }
        throw new IllegalArgumentException(str.concat(" empty"));
    }
}
