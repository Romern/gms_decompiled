package com.google.android.gms.org.conscrypt;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLRSAKeyPairGenerator extends KeyPairGeneratorSpi {
    private int modulusBits = 2048;
    private byte[] publicExponent = {1, 0, 1};

    public KeyPair generateKeyPair() {
        OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.RSA_generate_key_ex(this.modulusBits, this.publicExponent));
        return new KeyPair(new OpenSSLRSAPublicKey(openSSLKey), OpenSSLRSAPrivateKey.getInstance(openSSLKey));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.modulusBits = i;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
            BigInteger publicExponent2 = rSAKeyGenParameterSpec.getPublicExponent();
            if (publicExponent2 != null) {
                this.publicExponent = publicExponent2.toByteArray();
            }
            this.modulusBits = rSAKeyGenParameterSpec.getKeysize();
            return;
        }
        throw new InvalidAlgorithmParameterException("Only RSAKeyGenParameterSpec supported");
    }
}
