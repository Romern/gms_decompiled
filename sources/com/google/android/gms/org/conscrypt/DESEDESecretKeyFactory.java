package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DESEDESecretKeyFactory extends SecretKeyFactorySpi {
    /* access modifiers changed from: protected */
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("Null KeySpec");
        } else if (keySpec instanceof SecretKeySpec) {
            SecretKeySpec secretKeySpec = (SecretKeySpec) keySpec;
            try {
                if (DESedeKeySpec.isParityAdjusted(secretKeySpec.getEncoded(), 0)) {
                    return secretKeySpec;
                }
                throw new InvalidKeySpecException("SecretKeySpec is not a parity-adjusted DESEDE key");
            } catch (InvalidKeyException e) {
                throw new InvalidKeySpecException(e);
            }
        } else if (keySpec instanceof DESedeKeySpec) {
            return new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESEDE");
        } else {
            String valueOf = String.valueOf(keySpec.getClass().getName());
            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Unsupported KeySpec class: ") : "Unsupported KeySpec class: ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (secretKey == null) {
            throw new InvalidKeySpecException("Null SecretKey");
        } else if (cls == SecretKeySpec.class) {
            try {
                if (!DESedeKeySpec.isParityAdjusted(secretKey.getEncoded(), 0)) {
                    throw new InvalidKeySpecException("SecretKey is not a parity-adjusted DESEDE key");
                } else if (secretKey instanceof SecretKeySpec) {
                    return (KeySpec) secretKey;
                } else {
                    return new SecretKeySpec(secretKey.getEncoded(), "DESEDE");
                }
            } catch (InvalidKeyException e) {
                throw new InvalidKeySpecException(e);
            }
        } else if (cls == DESedeKeySpec.class) {
            try {
                return new DESedeKeySpec(secretKey.getEncoded());
            } catch (InvalidKeyException e2) {
                throw new InvalidKeySpecException(e2);
            }
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unsupported KeySpec class: ");
            sb.append(valueOf);
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            return new SecretKeySpec(secretKey.getEncoded(), secretKey.getAlgorithm());
        }
        throw new InvalidKeyException("Null SecretKey");
    }
}
