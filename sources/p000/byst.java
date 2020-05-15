package p000;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byst {

    /* renamed from: a */
    private static final byte[] f167612a = m125287b("SecureMessage");

    /* renamed from: a */
    static String m125272a(bysr bysr) {
        int i = bysr.f167604d;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("ENC:");
            sb.append(i);
            return sb.toString();
        }
        throw null;
    }

    /* renamed from: b */
    public static byte[] m125287b(String str) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(m125280a(str));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No security provider initialized yet?", e);
        }
    }

    /* renamed from: c */
    private static byte[] m125289c(byte[] bArr, byte[] bArr2) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            byte[] bArr3 = new byte[32];
            instance.reset();
            instance.update(bArr2);
            System.arraycopy(instance.doFinal(new byte[]{1}), 0, bArr3, 0, 32);
            return m125286a(bArr3, 32);
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static String m125273a(byss byss) {
        int i = byss.f167611f;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("SIG:");
            sb.append(i);
            return sb.toString();
        }
        throw null;
    }

    /* renamed from: a */
    private static SecretKey m125274a(Key key) {
        if (key instanceof SecretKey) {
            return (SecretKey) key;
        }
        throw new InvalidKeyException("Expected a SecretKey");
    }

    /* renamed from: b */
    static byte[] m125288b(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return new byte[0];
        }
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[(length + length2)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    /* renamed from: a */
    static SecretKey m125275a(SecretKey secretKey, String str) {
        return new SecretKeySpec(m125284a(secretKey, f167612a, m125280a(str)), "AES");
    }

    /* renamed from: a */
    static boolean m125276a(Key key, byss byss, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw null;
        } else if (bArr2 == null) {
            throw null;
        } else if (!byss.f167610e) {
            Mac instance = Mac.getInstance(byss.f167609d);
            instance.init(m125275a(m125274a(key), m125273a(byss)));
            return m125277a(bArr, instance.doFinal(bArr2));
        } else if (key instanceof PublicKey) {
            Signature instance2 = Signature.getInstance(byss.f167609d);
            instance2.initVerify((PublicKey) key);
            instance2.update(f167612a);
            instance2.update(bArr2);
            return instance2.verify(bArr);
        } else {
            throw new InvalidKeyException("Expected a PublicKey");
        }
    }

    /* renamed from: a */
    static boolean m125277a(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length == bArr2.length) {
            byte b = 0;
            for (int i = 0; i < bArr2.length; i++) {
                b = (byte) (b | (bArr[i] ^ bArr2[i]));
            }
            if (b == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static byte[] m125278a(bysr bysr, SecureRandom secureRandom) {
        try {
            byte[] bArr = new byte[Cipher.getInstance(bysr.f167603c).getBlockSize()];
            secureRandom.nextBytes(bArr);
            return bArr;
        } catch (NoSuchPaddingException e) {
            throw new NoSuchAlgorithmException(e);
        }
    }

    /* renamed from: a */
    static byte[] m125279a(byss byss, Key key, SecureRandom secureRandom, byte[] bArr) {
        if (bArr == null) {
            throw null;
        } else if (!byss.f167610e) {
            Mac instance = Mac.getInstance(byss.f167609d);
            instance.init(m125275a(m125274a(key), m125273a(byss)));
            return instance.doFinal(bArr);
        } else if (key instanceof PrivateKey) {
            Signature instance2 = Signature.getInstance(byss.f167609d);
            instance2.initSign((PrivateKey) key, secureRandom);
            try {
                instance2.update(f167612a);
                instance2.update(bArr);
                return instance2.sign();
            } catch (SignatureException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new InvalidKeyException("Expected a PrivateKey");
        }
    }

    /* renamed from: a */
    public static byte[] m125280a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static byte[] m125281a(Key key, bysr bysr, SecureRandom secureRandom, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            throw null;
        } else if (bysr != bysr.NONE) {
            try {
                Cipher instance = Cipher.getInstance(bysr.f167603c);
                instance.init(1, m125275a(m125274a(key), m125272a(bysr)), new IvParameterSpec(bArr), secureRandom);
                return instance.doFinal(bArr2);
            } catch (InvalidAlgorithmParameterException e) {
                throw new AssertionError(e);
            } catch (IllegalBlockSizeException e2) {
                throw new AssertionError(e2);
            } catch (BadPaddingException e3) {
                throw new AssertionError(e3);
            } catch (NoSuchPaddingException e4) {
                throw new NoSuchAlgorithmException(e4);
            }
        } else {
            throw new NoSuchAlgorithmException("Cannot use NONE type here");
        }
    }

    /* renamed from: a */
    static byte[] m125282a(Key key, bysr bysr, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw null;
        } else if (bArr2 == null) {
            throw null;
        } else if (bysr != bysr.NONE) {
            try {
                Cipher instance = Cipher.getInstance(bysr.f167603c);
                instance.init(2, m125275a(m125274a(key), m125272a(bysr)), new IvParameterSpec(bArr));
                return instance.doFinal(bArr2);
            } catch (NoSuchPaddingException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new NoSuchAlgorithmException("Cannot use NONE type here");
        }
    }

    /* renamed from: a */
    private static byte[] m125283a(SecretKey secretKey, byte[] bArr) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            byte[] encoded = secretKey.getEncoded();
            if (encoded != null) {
                return instance.doFinal(encoded);
            }
            throw new InvalidKeyException("Cannot get encoded form of SecretKey");
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m125284a(SecretKey secretKey, byte[] bArr, byte[] bArr2) {
        if (secretKey == null) {
            throw null;
        } else if (bArr == null) {
            throw null;
        } else if (bArr2 != null) {
            return m125289c(m125283a(secretKey, bArr), bArr2);
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    static byte[] m125285a(byte[] bArr) {
        byte[] bArr2 = new byte[20];
        System.arraycopy(MessageDigest.getInstance("SHA-256").digest(bArr), 0, bArr2, 0, 20);
        return bArr2;
    }

    /* renamed from: a */
    static byte[] m125286a(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        throw null;
    }
}
