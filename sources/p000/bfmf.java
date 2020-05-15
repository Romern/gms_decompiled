package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bfmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmf {

    /* renamed from: a */
    private final SecretKeySpec f114391a;

    /* renamed from: b */
    private final Mac f114392b;

    /* renamed from: c */
    private final Cipher f114393c;

    private bfmf(byte[] bArr, byte[] bArr2, bhdb bhdb) {
        Cipher cipher;
        this.f114391a = new SecretKeySpec(bArr, "AES");
        if (bhdb == null) {
            bhcz.m100663a();
        }
        this.f114392b = m97227a(bArr2);
        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (GeneralSecurityException e) {
            cipher = null;
        }
        this.f114393c = cipher;
    }

    /* renamed from: a */
    public static bfmf m97226a(byte[] bArr, bhdb bhdb) {
        if (bArr != null && bArr.length == 32) {
            return new bfmf(Arrays.copyOf(bArr, 16), Arrays.copyOfRange(bArr, 16, 32), bhdb);
        }
        throw new IllegalArgumentException("Cipher & Signing Key must be 32 bytes.");
    }

    /* renamed from: a */
    private static Mac m97227a(byte[] bArr) {
        int i = 0;
        while (i < 2) {
            try {
                Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(new SecretKeySpec(bArr, "HmacSHA1"));
                return instance;
            } catch (NoSuchAlgorithmException e) {
                i++;
            } catch (InvalidKeyException e2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final byte[] m97228a(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            if (i <= 0) {
                break;
            }
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            } catch (IOException e) {
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private final byte[] m97229a(byte[] bArr, IvParameterSpec ivParameterSpec, int i) {
        Cipher cipher = this.f114393c;
        if (cipher != null) {
            try {
                cipher.init(i, this.f114391a, ivParameterSpec);
                return this.f114393c.doFinal(bArr);
            } catch (GeneralSecurityException e) {
                throw new IOException("Failed to encrypt or decrypt.");
            }
        } else {
            throw new IOException("Unable to create cipher.");
        }
    }

    /* renamed from: a */
    public final synchronized bfme mo61917a(DataInputStream dataInputStream) {
        IvParameterSpec ivParameterSpec;
        byte[] a;
        int length;
        int i;
        if (this.f114392b != null) {
            int readInt = dataInputStream.readInt();
            if (readInt > 2097152 || readInt < 0) {
                throw new IOException(String.format("Invalid data length or too long: %d bytes.", Integer.valueOf(readInt)));
            }
            byte[] a2 = m97228a(dataInputStream, 20);
            if (a2 == null || a2.length != 20) {
                throw new IOException("Unable to read HMAC.");
            }
            byte[] a3 = m97228a(dataInputStream, 16);
            if (a3 == null || a3.length != 16) {
                throw new IOException("Unable to read IV.");
            }
            ivParameterSpec = new IvParameterSpec(a3);
            a = m97228a(dataInputStream, readInt);
            if (a == null || (length = a.length) != readInt) {
                throw new IOException("Unable to read ciphertext.");
            }
            i = length + 40;
            if (Arrays.equals(this.f114392b.doFinal(a), a2)) {
            } else {
                throw new IOException("HMAC does not match.");
            }
        } else {
            throw new IOException("Unable to create HMAC generator.");
        }
        return new bfme(i, m97229a(a, ivParameterSpec, 2));
    }

    /* renamed from: a */
    public final synchronized void mo61918a(DataOutputStream dataOutputStream, byte[] bArr) {
        if (this.f114392b == null) {
            throw new IOException("Unable to create HMAC, data can not be signed.");
        } else if (bArr == null || bArr.length > 2097152) {
            throw new IOException("Invalid data: data is empty or too long.");
        } else {
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            byte[] a = m97229a(bArr, ivParameterSpec, 1);
            byte[] doFinal = this.f114392b.doFinal(a);
            dataOutputStream.writeInt(a.length);
            dataOutputStream.write(doFinal);
            dataOutputStream.write(ivParameterSpec.getIV());
            dataOutputStream.write(a);
        }
    }
}
