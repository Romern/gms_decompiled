package p000;

import android.os.Bundle;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: wcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wcq {

    /* renamed from: a */
    private static final Logger f50500a = new Logger("EasySignIn", "InputsParser");

    /* renamed from: b */
    private static final byte[] f50501b = Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEsD/ced85z69jJOBsEsK5Ac12Uz2sTFPFfCVMKUH9YuRuE2p/JEyOm+/7f02oQVq2DoZJYeNyNtJrtoP46uuoxw==", 2);

    /* renamed from: a */
    static bycs m41765a(Bundle bundle) {
        bxvd da = bycs.f165680s.mo74144da();
        try {
            byte[] decode = Base64.decode(bundle.getString("inputs", ""), 2);
            da.mo73633b(decode);
            byte[] decode2 = Base64.decode(bundle.getString("sig", ""), 2);
            int i = ((bycs) da.f164949b).f165690i;
            if (i < 0 || i > 4) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bycs bycs = (bycs) da.f164949b;
                bycs.f165682a &= -65;
                bycs.f165690i = 1;
            }
            String string = bundle.getString("com.android.browser.application_id", ((bycs) da.f164949b).f165689h);
            if (!string.equals(((bycs) da.f164949b).f165689h) || (!m41766a(decode, decode2, cdrw.f181623a.mo6606a().mo78232c()) && !m41766a(decode, decode2, cdrw.f181623a.mo6606a().mo78233d()))) {
                bxvd da2 = bycs.f165680s.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bycs bycs2 = (bycs) da2.f164949b;
                int i2 = bycs2.f165682a | 1;
                bycs2.f165682a = i2;
                bycs2.f165684c = false;
                String str = ((bycs) da.f164949b).f165688g;
                str.getClass();
                int i3 = i2 | 16;
                bycs2.f165682a = i3;
                bycs2.f165688g = str;
                string.getClass();
                bycs2.f165682a = i3 | 32;
                bycs2.f165689h = string;
                return (bycs) da2.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bycs bycs3 = (bycs) da.f164949b;
            bycs3.f165682a |= 1;
            bycs3.f165684c = true;
            return (bycs) da.mo74062i();
        } catch (bxwf | IllegalArgumentException e) {
            return bycs.f165680s;
        }
    }

    /* renamed from: a */
    private static boolean m41766a(byte[] bArr, byte[] bArr2, byct byct) {
        byte[] k = byct.f165703a.getKey();
        return m41767a(k, byct.f165704b.getKey(), f50501b) && m41767a(bArr, bArr2, k);
    }

    /* renamed from: a */
    private static boolean m41767a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3.length == 0) {
            return false;
        }
        try {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr3));
                try {
                    Signature instance = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance.initVerify(generatePublic);
                        try {
                            instance.update(bArr);
                            return instance.verify(bArr2);
                        } catch (SignatureException e) {
                            f50500a.mo25420f("Failed to check ECDSA signature", new Object[0]);
                            return false;
                        }
                    } catch (InvalidKeyException e2) {
                        f50500a.mo25420f("Failed to initialize ECDSA signature verification", new Object[0]);
                        return false;
                    }
                } catch (NoSuchAlgorithmException e3) {
                    f50500a.mo25420f("SHA256withECDSA is not supported", new Object[0]);
                    return false;
                }
            } catch (InvalidKeySpecException e4) {
                f50500a.mo25420f("Invalid public key spec", new Object[0]);
                return false;
            }
        } catch (NoSuchAlgorithmException e5) {
            f50500a.mo25420f("Eliptic curve keys are not supported", new Object[0]);
            return false;
        }
    }
}
