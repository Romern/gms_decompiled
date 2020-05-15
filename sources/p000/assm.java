package p000;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: assm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assm {

    /* renamed from: a */
    public static final byte[] f89604a = new byte[8];

    /* renamed from: a */
    public static byte[] m74692a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing SHA1 implementation.", e);
        }
    }

    /* renamed from: a */
    public static byte[] m74693a(byte[] bArr, bydf bydf) {
        try {
            KeyFactory instance = KeyFactory.getInstance("RSA");
            byde byde = bydf.f165779i;
            if (byde == null) {
                byde = byde.f165759i;
            }
            BigInteger bigInteger = new BigInteger(1, byde.f165762b.mo73780k());
            bmts bmts = bydf.f165772b;
            if (bmts == null) {
                bmts = bmts.f130908c;
            }
            bmtk bmtk = bmts.f130911b;
            if (bmtk == null) {
                bmtk = bmtk.f130852g;
            }
            bmtl bmtl = bmtk.f130858e;
            if (bmtl == null) {
                bmtl = bmtl.f130860e;
            }
            BigInteger bigInteger2 = new BigInteger(1, asti.m74762a(bmtl.f130863b));
            byde byde2 = bydf.f165779i;
            if (byde2 == null) {
                byde2 = byde.f165759i;
            }
            BigInteger bigInteger3 = new BigInteger(1, byde2.f165763c.mo73780k());
            byde byde3 = bydf.f165779i;
            if (byde3 == null) {
                byde3 = byde.f165759i;
            }
            BigInteger bigInteger4 = new BigInteger(1, byde3.f165764d.mo73780k());
            byde byde4 = bydf.f165779i;
            if (byde4 == null) {
                byde4 = byde.f165759i;
            }
            BigInteger bigInteger5 = new BigInteger(1, byde4.f165765e.mo73780k());
            byde byde5 = bydf.f165779i;
            if (byde5 == null) {
                byde5 = byde.f165759i;
            }
            BigInteger bigInteger6 = new BigInteger(1, byde5.f165766f.mo73780k());
            byde byde6 = bydf.f165779i;
            if (byde6 == null) {
                byde6 = byde.f165759i;
            }
            BigInteger bigInteger7 = new BigInteger(1, byde6.f165767g.mo73780k());
            byde byde7 = bydf.f165779i;
            if (byde7 == null) {
                byde7 = byde.f165759i;
            }
            Cipher instance2 = Cipher.getInstance("RSA/ECB/NOPADDING");
            instance2.init(1, (RSAPrivateCrtKey) instance.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, new BigInteger(1, byde7.f165768h.mo73780k()))));
            return instance2.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m74694a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(24);
        allocate.put(bArr2, 0, 8);
        allocate.put(bArr2, 0, 8);
        allocate.put(bArr2, 0, 8);
        ByteBuffer allocate2 = ByteBuffer.allocate(24);
        allocate2.put(bArr2, 8, 8);
        allocate2.put(bArr2, 8, 8);
        allocate2.put(bArr2, 8, 8);
        byte[] array = allocate.array();
        byte[] array2 = allocate2.array();
        int length = bArr.length;
        if ((length & 7) != 0) {
            length = bqbr.m112522a(length + 1, 8, RoundingMode.CEILING) * 8;
        }
        byte[] copyOf = Arrays.copyOf(bArr, length);
        int length2 = copyOf.length >> 3;
        SecretKeySpec secretKeySpec = new SecretKeySpec(array, "DESede");
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(array2, "DESede");
        Cipher instance = Cipher.getInstance("DESede/CBC/NoPadding");
        instance.init(1, secretKeySpec, new IvParameterSpec(f89604a));
        byte[] bArr3 = null;
        int i = 0;
        while (i < length2) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(copyOf, 8);
            }
            bArr3 = instance.doFinal(bArr3);
            i++;
            if (i < length2) {
                int i2 = i * 8;
                byte[] copyOfRange = Arrays.copyOfRange(copyOf, i2, i2 + 8);
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    bArr3[i3] = (byte) (bArr3[i3] ^ copyOfRange[i3]);
                }
            }
        }
        instance.init(2, secretKeySpec2, new IvParameterSpec(f89604a));
        byte[] doFinal = instance.doFinal(bArr3);
        instance.init(1, secretKeySpec, new IvParameterSpec(f89604a));
        return instance.doFinal(doFinal);
    }
}
