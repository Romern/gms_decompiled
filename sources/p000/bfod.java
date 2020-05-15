package p000;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bfod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfod {

    /* renamed from: a */
    private final Random f114543a;

    /* renamed from: b */
    private final String f114544b;

    public bfod(Random random, String str) {
        this.f114543a = random;
        this.f114544b = str;
    }

    /* renamed from: a */
    private static Cipher m97403a(int i, String str, byte[] bArr, byte[] bArr2) {
        Cipher f = spn.m35886f("AES/CBC/PKCS5Padding");
        if (f != null) {
            f.init(i, new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr2, 2000, 128)).getEncoded(), "PBKDF2WithHmacSHA1"), new IvParameterSpec(bArr));
            return f;
        }
        throw new NoSuchAlgorithmException("No Such Algorithm");
    }

    /* renamed from: b */
    public final byte[] mo62032b(byte[] bArr) {
        try {
            buim buim = (buim) bxvk.m124016a(buim.f153954d, bArr, bxus.m123744c());
            return m97403a(2, this.f114544b, buim.f153956a.mo73780k(), buim.f153957b.mo73780k()).doFinal(buim.f153958c.mo73780k());
        } catch (bxwf | GeneralSecurityException e) {
            throw new bfof(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo62031a(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[8];
            this.f114543a.nextBytes(bArr2);
            this.f114543a.nextBytes(bArr3);
            Cipher a = m97403a(1, this.f114544b, bArr2, bArr3);
            bxvd da = buim.f153954d.mo74144da();
            bxtx a2 = bxtx.m123261a(bArr2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((buim) da.f164949b).f153956a = a2;
            bxtx a3 = bxtx.m123261a(bArr3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((buim) da.f164949b).f153957b = a3;
            bxtx a4 = bxtx.m123261a(a.doFinal(bArr));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((buim) da.f164949b).f153958c = a4;
            return ((buim) da.mo74062i()).mo73642k();
        } catch (GeneralSecurityException e) {
            throw new bfof(e);
        }
    }
}
