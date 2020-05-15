package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: arhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhn {

    /* renamed from: a */
    private static final asco f87731a = ascp.m73787a("AesGcmConnectionAuthenticator");

    /* renamed from: b */
    private final int f87732b;

    /* renamed from: c */
    private final String f87733c;

    /* renamed from: d */
    private final SecretKey f87734d;

    private arhn(int i, String str, byte[] bArr) {
        boolean z = true;
        i = i != 1 ? 2 : i;
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid role: ");
        sb.append(i);
        sdo.m34975b(true, sb.toString());
        if (i == 2) {
            sdo.m34975b(bArr == null ? false : z, "Key should not be null if role is ROLE_SOURCE");
        }
        this.f87732b = i;
        this.f87733c = str;
        if (bArr != null) {
            this.f87734d = new SecretKeySpec(bArr, 0, bArr.length, "AES");
        } else {
            this.f87734d = m72768b();
        }
    }

    /* renamed from: a */
    public static arhn m72767a(int i, String str, byte[] bArr) {
        boolean z;
        if (bArr != null) {
            if (bArr.length == 32) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
        }
        try {
            Cipher.getInstance("AES/GCM/NoPadding");
            try {
                return new arhn(i, str, bArr);
            } catch (NoSuchAlgorithmException e) {
                f87731a.mo25417e("AES key generator not supported", e, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            f87731a.mo25417e("AES/GCM/NoPadding not supported", e2, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static SecretKey m72768b() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        return instance.generateKey();
    }

    /* renamed from: a */
    public final void mo48550a(byte[] bArr) {
        try {
            arhx arhx = (arhx) bxvk.m124016a(arhx.f87755d, bArr, bxus.m123744c());
            int a = arhw.m72779a(arhx.f87758b);
            if (a == 0 || a != 2) {
                f87731a.mo25418e("Expecting V1 frame", new Object[0]);
                throw new GeneralSecurityException("Expecting V1 frame");
            } else if ((arhx.f87757a & 2) != 0) {
                arhz arhz = arhx.f87759c;
                if (arhz == null) {
                    arhz = arhz.f87765d;
                }
                IvParameterSpec ivParameterSpec = new IvParameterSpec(arhz.f87768b.mo73780k());
                try {
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, this.f87734d, ivParameterSpec);
                    arhz arhz2 = arhx.f87759c;
                    if (arhz2 == null) {
                        arhz2 = arhz.f87765d;
                    }
                    byte[] doFinal = instance.doFinal(arhz2.f87769c.mo73780k());
                    try {
                        arhy arhy = (arhy) bxvk.m124016a(arhy.f87760d, doFinal, bxus.m123744c());
                        if (this.f87732b == arhy.f87763b) {
                            throw new GeneralSecurityException("Unexpected role in payload");
                        } else if (!this.f87733c.equals(arhy.f87764c)) {
                            throw new GeneralSecurityException("Authentication string mismatch");
                        }
                    } catch (bxwf e) {
                        f87731a.mo25417e("Invalid AuthenticationPayload proto", e, new Object[0]);
                        throw new GeneralSecurityException("Failed to deserialize AuthenticationPayload", e);
                    }
                } catch (GeneralSecurityException e2) {
                    f87731a.mo25417e("Decryption error", e2, new Object[0]);
                    throw e2;
                }
            } else {
                f87731a.mo25418e("Message missing V1 frame", new Object[0]);
                throw new GeneralSecurityException("Message missing V1 frame");
            }
        } catch (bxwf e3) {
            f87731a.mo25417e("Failed to deserialize AesGcmAuthenticationMessage", e3, new Object[0]);
            throw new GeneralSecurityException("Failed to deserialize AesGcmAuthenticationMessage", e3);
        }
    }

    /* renamed from: a */
    public final byte[] mo48551a() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f87734d, ivParameterSpec);
            bxvd da = arhy.f87760d.mo74144da();
            int i = this.f87732b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            arhy arhy = (arhy) da.f164949b;
            int i2 = arhy.f87762a | 1;
            arhy.f87762a = i2;
            arhy.f87763b = i;
            String str = this.f87733c;
            str.getClass();
            arhy.f87762a = i2 | 2;
            arhy.f87764c = str;
            byte[] doFinal = instance.doFinal(((arhy) da.mo74062i()).mo73642k());
            bxvd da2 = arhx.f87755d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            arhx arhx = (arhx) da2.f164949b;
            arhx.f87758b = 1;
            arhx.f87757a |= 1;
            bxvd da3 = arhz.f87765d.mo74144da();
            bxtx a = bxtx.m123261a(bArr);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            arhz arhz = (arhz) da3.f164949b;
            a.getClass();
            arhz.f87767a = 1 | arhz.f87767a;
            arhz.f87768b = a;
            bxtx a2 = bxtx.m123261a(doFinal);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            arhz arhz2 = (arhz) da3.f164949b;
            a2.getClass();
            arhz2.f87767a |= 2;
            arhz2.f87769c = a2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            arhx arhx2 = (arhx) da2.f164949b;
            arhz arhz3 = (arhz) da3.mo74062i();
            arhz3.getClass();
            arhx2.f87759c = arhz3;
            arhx2.f87757a |= 2;
            return ((arhx) da2.mo74062i()).mo73642k();
        } catch (GeneralSecurityException e) {
            f87731a.mo25417e("Encryption error", e, new Object[0]);
            throw e;
        }
    }
}
