package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbe {
    /* renamed from: a */
    public static byte[] m3886a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = new byte[8];
        byte[] copyOf = Arrays.copyOf(bArr2, 8);
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 8, 16);
        int length = bArr.length;
        int i = length >> 3;
        if ((length & 7) != 0) {
            i++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, i * 8);
        int length2 = copyOf2.length >> 3;
        byte[] bArr5 = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(copyOf, "DES");
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(copyOfRange, "DES");
            Cipher instance = Cipher.getInstance("DES/CBC/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr4));
            int i2 = 0;
            while (i2 < length2) {
                if (bArr5 == null) {
                    bArr3 = Arrays.copyOf(copyOf2, 8);
                } else {
                    bArr3 = bArr5;
                }
                bArr5 = instance.doFinal(bArr3);
                i2++;
                if (i2 < length2) {
                    int i3 = i2 * 8;
                    byte[] copyOfRange2 = Arrays.copyOfRange(copyOf2, i3, i3 + 8);
                    for (int i4 = 0; i4 < bArr5.length; i4++) {
                        bArr5[i4] = (byte) (bArr5[i4] ^ copyOfRange2[i4]);
                    }
                }
            }
            try {
                instance.init(2, secretKeySpec2, new IvParameterSpec(bArr4));
                byte[] doFinal = instance.doFinal(bArr5);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr4));
                return instance.doFinal(doFinal);
            } catch (NoSuchAlgorithmException e) {
                e = e;
                bqye.m113758a(e);
                return bArr5;
            } catch (InvalidKeyException e2) {
                e = e2;
                bqye.m113758a(e);
                return bArr5;
            } catch (InvalidAlgorithmParameterException e3) {
                e = e3;
                bqye.m113758a(e);
                return bArr5;
            } catch (NoSuchPaddingException e4) {
                e = e4;
                bqye.m113758a(e);
                return bArr5;
            } catch (BadPaddingException e5) {
                e = e5;
                bqye.m113758a(e);
                return bArr5;
            } catch (IllegalBlockSizeException e6) {
                e = e6;
                bqye.m113758a(e);
                return bArr5;
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e7) {
            e = e7;
            bqye.m113758a(e);
            return bArr5;
        }
    }
}
