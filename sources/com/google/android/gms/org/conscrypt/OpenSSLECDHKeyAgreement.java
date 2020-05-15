package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLECDHKeyAgreement extends KeyAgreementSpi {
    private int mExpectedResultLength;
    private OpenSSLKey mOpenSslPrivateKey;
    private byte[] mResult;

    private void checkCompleted() {
        if (this.mResult == null) {
            throw new IllegalStateException("Key agreement not completed");
        }
    }

    public Key engineDoPhase(Key key, boolean z) {
        if (this.mOpenSslPrivateKey == null) {
            throw new IllegalStateException("Not initialized");
        } else if (!z) {
            throw new IllegalStateException("ECDH only has one phase");
        } else if (key == null) {
            throw new InvalidKeyException("key == null");
        } else if (key instanceof PublicKey) {
            OpenSSLKey fromPublicKey = OpenSSLKey.fromPublicKey((PublicKey) key);
            byte[] bArr = new byte[this.mExpectedResultLength];
            int ECDH_compute_key = NativeCrypto.ECDH_compute_key(bArr, 0, fromPublicKey.getNativeRef(), this.mOpenSslPrivateKey.getNativeRef());
            if (ECDH_compute_key != -1) {
                int i = this.mExpectedResultLength;
                if (ECDH_compute_key != i) {
                    if (ECDH_compute_key < i) {
                        byte[] bArr2 = this.mResult;
                        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                        bArr = new byte[ECDH_compute_key];
                    } else {
                        StringBuilder sb = new StringBuilder(89);
                        sb.append("Engine produced a longer than expected result. Expected: ");
                        sb.append(i);
                        sb.append(", actual: ");
                        sb.append(ECDH_compute_key);
                        throw new RuntimeException(sb.toString());
                    }
                }
                this.mResult = bArr;
                return null;
            }
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Engine returned -1");
            throw new RuntimeException(sb2.toString());
        } else {
            String valueOf = String.valueOf(key.getClass());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb3.append("Not a public key: ");
            sb3.append(valueOf);
            throw new InvalidKeyException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int engineGenerateSecret(byte[] bArr, int i) {
        checkCompleted();
        int length = bArr.length - i;
        byte[] bArr2 = this.mResult;
        int length2 = bArr2.length;
        if (length2 <= length) {
            System.arraycopy(bArr2, 0, bArr, i, length2);
            return this.mResult.length;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Needed: ");
        sb.append(length2);
        sb.append(", available: ");
        sb.append(length);
        throw new ShortBufferException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        } else if (key instanceof PrivateKey) {
            OpenSSLKey fromPrivateKey = OpenSSLKey.fromPrivateKey((PrivateKey) key);
            this.mExpectedResultLength = (NativeCrypto.EC_GROUP_get_degree(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(fromPrivateKey.getNativeRef()))) + 7) / 8;
            this.mOpenSslPrivateKey = fromPrivateKey;
        } else {
            String valueOf = String.valueOf(key.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Not a private key: ");
            sb.append(valueOf);
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public SecretKey engineGenerateSecret(String str) {
        checkCompleted();
        return new SecretKeySpec(engineGenerateSecret(), str);
    }

    /* access modifiers changed from: protected */
    public byte[] engineGenerateSecret() {
        checkCompleted();
        return this.mResult;
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null) {
            engineInit(key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
