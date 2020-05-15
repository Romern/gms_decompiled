package p000;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: xjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjw {

    /* renamed from: a */
    private final byte[] f52476a;

    /* renamed from: b */
    private final byte[] f52477b;

    /* renamed from: c */
    private int f52478c = 0;

    /* renamed from: d */
    private int f52479d = 0;

    public xjw(byte[] bArr, byte[] bArr2) {
        this.f52476a = bArr;
        this.f52477b = bArr2;
    }

    /* renamed from: a */
    private final Cipher m43064a(int i) {
        byte[] bArr;
        int length = this.f52476a.length;
        if (length == 8) {
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(this.f52477b, "AES");
                    if (i != 1) {
                        int i2 = this.f52479d;
                        if (i2 <= 16777215) {
                            bArr = m43065a(i2, (byte) 0);
                            this.f52479d++;
                        } else {
                            throw new xju("Maximum receive counter value exceeded");
                        }
                    } else {
                        int i3 = this.f52478c;
                        if (i3 <= 16777215) {
                            bArr = m43065a(i3, (byte) 1);
                            this.f52478c++;
                        } else {
                            throw new xju("Maximum send counter value exceeded");
                        }
                    }
                    try {
                        instance.init(i, secretKeySpec, new GCMParameterSpec(128, bArr), new SecureRandom());
                        return instance;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new xju(e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new xju(e2);
                }
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
                throw new xju(e3);
            }
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid nonce length: ");
            sb.append(length);
            throw new xju(sb.toString());
        }
    }

    /* renamed from: b */
    public final byte[] mo29846b(byte[] bArr, byte b) {
        Cipher a = m43064a(2);
        try {
            a.updateAAD(new byte[]{b});
            return a.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new xju(e);
        }
    }

    /* renamed from: a */
    private final byte[] m43065a(int i, byte b) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.put(this.f52476a);
        allocate.put(b);
        allocate.put((byte) ((i >> 16) & 255));
        allocate.put((byte) ((i >> 8) & 255));
        allocate.put((byte) (i & 255));
        return allocate.array();
    }

    /* renamed from: a */
    public final byte[] mo29845a(byte[] bArr, byte b) {
        Cipher a = m43064a(1);
        try {
            a.updateAAD(new byte[]{b});
            return a.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new xju(e);
        }
    }
}
