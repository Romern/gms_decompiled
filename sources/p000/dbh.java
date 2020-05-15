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
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dbh {

    /* renamed from: a */
    private static Cipher f12731a = null;

    /* renamed from: b */
    private static final Object f12732b = new Object();

    /* renamed from: c */
    private static final Object f12733c = new Object();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(byte[], boolean):java.lang.String
     arg types: [byte[], int]
     candidates:
      dab.a(java.lang.String, boolean):byte[]
      dab.a(byte[], boolean):java.lang.String */
    /* renamed from: a */
    public static final String m8116a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f12732b) {
                    m8117a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = m8117a().doFinal(bArr2);
                    iv = m8117a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return dab.m8076a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new dbg(e);
            } catch (InvalidKeyException e2) {
                throw new dbg(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new dbg(e3);
            } catch (NoSuchPaddingException e4) {
                throw new dbg(e4);
            } catch (BadPaddingException e5) {
                throw new dbg(e5);
            }
        } else {
            throw new dbg();
        }
    }

    /* renamed from: a */
    private static final Cipher m8117a() {
        Cipher cipher;
        synchronized (f12733c) {
            if (f12731a == null) {
                f12731a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f12731a;
        }
        return cipher;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(java.lang.String, boolean):byte[]
     arg types: [java.lang.String, int]
     candidates:
      dab.a(byte[], boolean):java.lang.String
      dab.a(java.lang.String, boolean):byte[] */
    /* renamed from: a */
    public static final byte[] m8118a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = dab.m8077a(str, false);
                int length = a.length;
                if (length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f12732b) {
                        m8117a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m8117a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new dbg();
            } catch (NoSuchAlgorithmException e) {
                throw new dbg(e);
            } catch (InvalidKeyException e2) {
                throw new dbg(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new dbg(e3);
            } catch (NoSuchPaddingException e4) {
                throw new dbg(e4);
            } catch (BadPaddingException e5) {
                throw new dbg(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new dbg(e6);
            } catch (IllegalArgumentException e7) {
                throw new dbg(e7);
            }
        } else {
            throw new dbg();
        }
    }
}
