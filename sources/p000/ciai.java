package p000;

/* renamed from: ciai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciai implements chsf {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85644a(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String str = new String(bArr, chsg.f189090a);
        throw new NumberFormatException(str.length() == 0 ? new String("Malformed status code ") : "Malformed status code ".concat(str));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo85645a(Object obj) {
        Integer num = (Integer) obj;
        throw new UnsupportedOperationException();
    }
}
