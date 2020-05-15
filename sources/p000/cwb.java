package p000;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwb {
    /* renamed from: a */
    public static byte[] m7741a(byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("DESede/ECB/NoPadding");
        instance.init(1, new SecretKeySpec(bArr, "DESede"));
        return instance.doFinal(bArr2);
    }
}
