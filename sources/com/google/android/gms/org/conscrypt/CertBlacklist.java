package com.google.android.gms.org.conscrypt;

import java.math.BigInteger;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface CertBlacklist {
    boolean isPublicKeyBlackListed(PublicKey publicKey);

    boolean isSerialNumberBlackListed(BigInteger bigInteger);
}
