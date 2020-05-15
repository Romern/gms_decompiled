package p000;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPublicKeySpec;

/* renamed from: bysu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysu {

    /* renamed from: a */
    public static final BigInteger f167613a = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);

    /* renamed from: b */
    public static final BigInteger f167614b = f167617e;

    /* renamed from: c */
    private static final Boolean f167615c;

    /* renamed from: d */
    private static final BigInteger f167616d = new BigInteger("1");

    /* renamed from: e */
    private static final BigInteger f167617e = new BigInteger("2");

    /* renamed from: f */
    private static final ECParameterSpec f167618f;

    /* renamed from: g */
    private static final BigInteger f167619g;

    /* renamed from: h */
    private static final BigInteger f167620h;

    /* renamed from: i */
    private static final BigInteger f167621i;

    /* renamed from: a */
    public static bytb m125290a(PublicKey publicKey) {
        if (publicKey == null) {
            throw null;
        } else if (publicKey instanceof ECPublicKey) {
            bxvd da = bytb.f167639f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytb bytb = (bytb) da.f164949b;
            bytb.f167642b = 1;
            bytb.f167641a |= 1;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            bxvd da2 = bysy.f167632d.mo74144da();
            ByteString a = ByteString.m123261a(eCPublicKey.getW().getAffineX().toByteArray());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bysy bysy = (bysy) da2.f164949b;
            a.getClass();
            bysy.f167634a = 1 | bysy.f167634a;
            bysy.f167635b = a;
            ByteString a2 = ByteString.m123261a(eCPublicKey.getW().getAffineY().toByteArray());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bysy bysy2 = (bysy) da2.f164949b;
            a2.getClass();
            bysy2.f167634a |= 2;
            bysy2.f167636c = a2;
            bysy bysy3 = (bysy) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytb bytb2 = (bytb) da.f164949b;
            bysy3.getClass();
            bytb2.f167643c = bysy3;
            bytb2.f167641a |= 2;
            return (bytb) da.mo74062i();
        } else if (publicKey instanceof RSAPublicKey) {
            bxvd da3 = bytb.f167639f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bytb bytb3 = (bytb) da3.f164949b;
            bytb3.f167642b = 2;
            bytb3.f167641a |= 1;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            bxvd da4 = bytl.f167678d.mo74144da();
            ByteString a3 = ByteString.m123261a(rSAPublicKey.getModulus().toByteArray());
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bytl bytl = (bytl) da4.f164949b;
            a3.getClass();
            bytl.f167680a = 1 | bytl.f167680a;
            bytl.f167681b = a3;
            int intValue = rSAPublicKey.getPublicExponent().intValue();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bytl bytl2 = (bytl) da4.f164949b;
            bytl2.f167680a = 2 | bytl2.f167680a;
            bytl2.f167682c = intValue;
            bytl bytl3 = (bytl) da4.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bytb bytb4 = (bytb) da3.f164949b;
            bytl3.getClass();
            bytb4.f167644d = bytl3;
            bytb4.f167641a |= 4;
            return (bytb) da3.mo74062i();
        } else if (publicKey instanceof DHPublicKey) {
            bxvd da5 = bytb.f167639f.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bytb bytb5 = (bytb) da5.f164949b;
            bytb5.f167642b = 3;
            bytb5.f167641a |= 1;
            bxvd da6 = bysx.f167627c.mo74144da();
            ByteString a4 = ByteString.m123261a(((DHPublicKey) publicKey).getY().toByteArray());
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bysx bysx = (bysx) da6.f164949b;
            a4.getClass();
            bysx.f167629a = 1 | bysx.f167629a;
            bysx.f167630b = a4;
            bysx bysx2 = (bysx) da6.mo74062i();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bytb bytb6 = (bytb) da5.f164949b;
            bysx2.getClass();
            bytb6.f167645e = bysx2;
            bytb6.f167641a |= 8;
            return (bytb) da5.mo74062i();
        } else {
            throw new IllegalArgumentException("Unsupported PublicKey type");
        }
    }

    /* renamed from: b */
    public static boolean m125298b() {
        return f167615c.booleanValue();
    }

    /* renamed from: c */
    private static KeyPairGenerator m125299c() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            try {
                instance.initialize(new ECGenParameterSpec("prime256v1"));
                return instance;
            } catch (InvalidAlgorithmParameterException e) {
                try {
                    instance.initialize(new ECGenParameterSpec("secp256r1"));
                    return instance;
                } catch (InvalidAlgorithmParameterException e2) {
                    throw new RuntimeException("Unable to find the NIST P-256 curve");
                }
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    static {
        boolean z;
        ECParameterSpec eCParameterSpec;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        try {
            m125299c();
            z = false;
        } catch (Exception e) {
            z = true;
        }
        f167615c = Boolean.valueOf(z);
        BigInteger bigInteger3 = null;
        if (!m125298b()) {
            eCParameterSpec = ((ECPublicKey) m125292a().getPublic()).getParams();
        } else {
            eCParameterSpec = null;
        }
        f167618f = eCParameterSpec;
        if (!m125298b()) {
            bigInteger = ((ECFieldFp) f167618f.getCurve().getField()).getP();
        } else {
            bigInteger = null;
        }
        f167619g = bigInteger;
        if (!m125298b()) {
            bigInteger2 = f167618f.getCurve().getA();
        } else {
            bigInteger2 = null;
        }
        f167620h = bigInteger2;
        if (!m125298b()) {
            bigInteger3 = f167618f.getCurve().getB();
        }
        f167621i = bigInteger3;
    }

    /* renamed from: a */
    private static BigInteger m125291a(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    /* renamed from: a */
    public static KeyPair m125292a() {
        return m125299c().generateKeyPair();
    }

    /* renamed from: a */
    public static PublicKey m125293a(bytb bytb) {
        int i = 1;
        if ((bytb.f167641a & 1) != 0) {
            int a = byth.m125323a(bytb.f167642b);
            if (a == 0) {
                a = 1;
            }
            if (a != 1) {
                if (a != 2) {
                    if ((bytb.f167641a & 8) != 0) {
                        bysx bysx = bytb.f167645e;
                        if (bysx == null) {
                            bysx = bysx.f167627c;
                        }
                        return m125296a(bysx);
                    }
                } else if ((bytb.f167641a & 4) != 0) {
                    bytl bytl = bytb.f167644d;
                    if (bytl == null) {
                        bytl = bytl.f167678d;
                    }
                    return m125295a(bytl);
                }
            } else if ((bytb.f167641a & 2) != 0) {
                bysy bysy = bytb.f167643c;
                if (bysy == null) {
                    bysy = bysy.f167632d;
                }
                return m125294a(bysy);
            }
            int a2 = byth.m125323a(bytb.f167642b);
            if (a2 != 0) {
                i = a2;
            }
            String valueOf = String.valueOf(Integer.toString(i));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("key object is missing for key type: ");
            sb.append(valueOf);
            throw new InvalidKeySpecException(sb.toString());
        }
        throw new InvalidKeySpecException("GenericPublicKey.type is a required field");
    }

    /* renamed from: a */
    public static ECPublicKey m125294a(bysy bysy) {
        int i = bysy.f167634a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            throw new InvalidKeySpecException("Key is missing a required coordinate");
        } else if (!m125298b()) {
            byte[] k = bysy.f167635b.getKey();
            byte[] k2 = bysy.f167636c.getKey();
            try {
                m125297a(k);
                m125297a(k2);
                BigInteger bigInteger = new BigInteger(k);
                BigInteger bigInteger2 = new BigInteger(k2);
                if (bigInteger.signum() == -1 || bigInteger2.signum() == -1) {
                    throw new InvalidKeySpecException("Point encoding must use only non-negative integers");
                }
                BigInteger bigInteger3 = f167619g;
                if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
                    throw new InvalidKeySpecException("Point lies outside of the expected field");
                } else if (m125291a(bigInteger2, bigInteger3).equals(m125291a(bigInteger, bigInteger3).add(f167620h).multiply(bigInteger).mod(bigInteger3).add(f167621i).mod(bigInteger3))) {
                    return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), f167618f));
                } else {
                    throw new InvalidKeySpecException("Point does not lie on the expected curve");
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new InvalidKeySpecException("Elliptic Curve keys not supported on this platform");
        }
    }

    /* renamed from: a */
    public static RSAPublicKey m125295a(bytl bytl) {
        if ((bytl.f167680a & 1) != 0) {
            byte[] k = bytl.f167681b.getKey();
            int length = k.length;
            if (length == 0 || length > 257) {
                throw new InvalidKeySpecException();
            }
            BigInteger bigInteger = new BigInteger(k);
            if (bigInteger.bitLength() == 2048) {
                try {
                    return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf((long) bytl.f167682c)));
                } catch (NoSuchAlgorithmException e) {
                    throw new AssertionError(e);
                }
            } else {
                throw new InvalidKeySpecException();
            }
        } else {
            throw new InvalidKeySpecException("required field is missing");
        }
    }

    /* renamed from: a */
    public static DHPublicKey m125296a(bysx bysx) {
        if ((bysx.f167629a & 1) != 0) {
            byte[] k = bysx.f167630b.getKey();
            int length = k.length;
            if (length == 0 || length > 257) {
                throw new InvalidKeySpecException();
            }
            try {
                BigInteger bigInteger = new BigInteger(k);
                if (bigInteger.compareTo(f167616d) <= 0 || bigInteger.compareTo(f167613a.subtract(f167616d)) >= 0) {
                    throw new InvalidKeySpecException();
                }
                try {
                    return (DHPublicKey) KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(bigInteger, f167613a, f167614b));
                } catch (NoSuchAlgorithmException e) {
                    throw new AssertionError(e);
                }
            } catch (NumberFormatException e2) {
                throw new InvalidKeySpecException();
            }
        } else {
            throw new InvalidKeySpecException("required field is missing");
        }
    }

    /* renamed from: a */
    private static void m125297a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || length > 33 || (length == 33 && bArr[0] != 0)) {
            throw new InvalidKeySpecException();
        }
    }
}
