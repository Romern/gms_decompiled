package p000;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bfby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfby implements bfbu {

    /* renamed from: a */
    private final String f113356a;

    public bfby(String str) {
        this.f113356a = str;
    }

    /* renamed from: a */
    private static byte[] m96324a(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        String str2;
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(i, new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr2, 1324, 128)).getEncoded(), "AES"), ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Object[] objArr = new Object[1];
            if (i != 1) {
                str2 = "decrypt";
            } else {
                str2 = "encrypt";
            }
            objArr[0] = str2;
            throw new IOException(String.format("Failed to %s data", objArr), e);
        }
    }

    /* renamed from: b */
    public final byte[] mo61372b(byte[] bArr) {
        bfbr bfbr = (bfbr) bxvk.m124016a(bfbr.f113335d, bArr, bxus.m123743b());
        if (!cesw.f183411a.mo6606a().blueskyTileCacheFixB149114011() || (!bfbr.f113337a.mo73779j() && !bfbr.f113338b.mo73779j() && !bfbr.f113339c.mo73779j())) {
            return m96324a(2, bfbr.f113337a.mo73780k(), this.f113356a, bfbr.f113339c.mo73780k(), bfbr.f113338b.mo73780k());
        }
        throw new IOException("Invalid cached tile");
    }

    /* renamed from: a */
    public final byte[] mo61371a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        byte[] bArr3 = new byte[16];
        new SecureRandom().nextBytes(bArr3);
        new SecureRandom().nextBytes(bArr2);
        bxvd da = bfbr.f113335d.mo74144da();
        bxtx a = bxtx.m123261a(m96324a(1, bArr, this.f113356a, bArr2, bArr3));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bfbr) da.f164949b).f113337a = a;
        bxtx a2 = bxtx.m123261a(bArr3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bfbr) da.f164949b).f113338b = a2;
        bxtx a3 = bxtx.m123261a(bArr2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a3.getClass();
        ((bfbr) da.f164949b).f113339c = a3;
        return ((bfbr) da.mo74062i()).mo73642k();
    }
}
