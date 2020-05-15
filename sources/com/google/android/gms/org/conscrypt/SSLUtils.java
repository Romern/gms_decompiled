package com.google.android.gms.org.conscrypt;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("com.google.android.gms.org.conscrypt.useEngineSocketByDefault", "false"));
    private static final Charset US_ASCII = Charset.forName("US-ASCII");

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);
        
        final int value;

        private SessionType(int i) {
            this.value = i;
        }

        static boolean isSupportedType(int i) {
            return i == OPEN_SSL.value || i == OPEN_SSL_WITH_OCSP.value || i == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    static int calculateOutNetBufSize(int i) {
        return Math.min(16709, Math.min((int) MAX_ENCRYPTION_OVERHEAD_DIFF, i) + MAX_ENCRYPTION_OVERHEAD_LENGTH);
    }

    static String[] concat(String[]... strArr) {
        int i = 0;
        for (String[] strArr2 : strArr) {
            i += strArr2.length;
        }
        String[] strArr3 = new String[i];
        int i2 = 0;
        for (String[] strArr4 : strArr) {
            int length = strArr4.length;
            System.arraycopy(strArr4, 0, strArr3, i2, length);
            i2 += length;
        }
        return strArr3;
    }

    static String[] decodeProtocols(byte[] bArr) {
        int length;
        byte b;
        String str;
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr.length;
            if (i2 < length) {
                b = bArr[i2];
                if (b >= 0 && b <= length - i2) {
                    i3++;
                    i2 += b + 1;
                }
            } else {
                String[] strArr = new String[i3];
                int i4 = 0;
                while (i < bArr.length) {
                    byte b2 = bArr[i];
                    int i5 = i4 + 1;
                    strArr[i4] = b2 > 0 ? new String(bArr, i + 1, b2, US_ASCII) : "";
                    i += b2 + 1;
                    i4 = i5;
                }
                return strArr;
            }
        }
        if (length >= 50) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(length);
            sb.append(" byte array");
            str = sb.toString();
        } else {
            str = Arrays.toString(bArr);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 67);
        sb2.append("Protocol has invalid length (");
        sb2.append((int) b);
        sb2.append(" at position ");
        sb2.append(i2);
        sb2.append("): ");
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) {
        if (certificateFactory != null) {
            return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        }
        return OpenSSLX509Certificate.fromX509Der(bArr);
    }

    static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i = 0; i < length; i++) {
            x509CertificateArr[i] = decodeX509Certificate(certificateFactory, bArr[i]);
        }
        return x509CertificateArr;
    }

    static byte[] encodeProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols array must be non-null");
        } else if (strArr.length == 0) {
            return EmptyArray.BYTE;
        } else {
            int i = 0;
            int i2 = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                if (str != null) {
                    int length = str.length();
                    if (length == 0 || length > MAX_PROTOCOL_LENGTH) {
                        StringBuilder sb = new StringBuilder(53);
                        sb.append("protocol[");
                        sb.append(i);
                        sb.append("] has invalid length: ");
                        sb.append(length);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i2 += length + 1;
                    i++;
                } else {
                    StringBuilder sb2 = new StringBuilder(29);
                    sb2.append("protocol[");
                    sb2.append(i);
                    sb2.append("] is null");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            byte[] bArr = new byte[i2];
            int i3 = 0;
            for (String str2 : strArr) {
                int length2 = str2.length();
                bArr[i3] = (byte) length2;
                i3++;
                int i4 = 0;
                while (i4 < length2) {
                    char charAt = str2.charAt(i4);
                    if (charAt <= 127) {
                        bArr[i3] = (byte) charAt;
                        i4++;
                        i3++;
                    } else {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 49);
                        sb3.append("Protocol contains invalid character: ");
                        sb3.append(charAt);
                        sb3.append("(protocol=");
                        sb3.append(str2);
                        sb3.append(")");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            return bArr;
        }
    }

    static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) {
        byte[][] bArr = new byte[x509CertificateArr.length][];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            bArr[i] = x509CertificateArr[i].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            return null;
        }
    }

    static String getClientKeyType(byte b) {
        if (b == 1) {
            return KEY_TYPE_RSA;
        }
        if (b != 64) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    static String getClientKeyTypeFromSignatureAlg(int i) {
        int SSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i);
        if (SSL_get_signature_algorithm_key_type == 6) {
            return KEY_TYPE_RSA;
        }
        if (SSL_get_signature_algorithm_key_type != 408) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int unsignedShort;
        int position = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(position))) {
            case 20:
            case 21:
            case 22:
            case 23:
                if (unsignedByte(byteBuffer.get(position + 1)) != 3 || (unsignedShort = unsignedShort(byteBuffer.getShort(position + 3)) + 5) <= 5) {
                    return -1;
                }
                return unsignedShort;
            default:
                return -1;
        }
    }

    static String getServerX509KeyType(long j) {
        String SSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j);
        if (SSL_CIPHER_get_kx_name.equals(KEY_TYPE_RSA) || SSL_CIPHER_get_kx_name.equals("DHE_RSA") || SSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return KEY_TYPE_RSA;
        }
        if (SSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return KEY_TYPE_EC;
        }
        return null;
    }

    static Set getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        int length = bArr.length;
        HashSet hashSet = new HashSet(length);
        for (byte b : bArr) {
            String clientKeyType = getClientKeyType(b);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        int length2 = iArr.length;
        LinkedHashSet linkedHashSet = new LinkedHashSet(length2);
        for (int i : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length <= 0 ? hashSet : linkedHashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i = 0; i < x509CertificateArr.length; i++) {
                x509CertificateArr2[i] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(sSLPeerUnverifiedException);
            throw sSLPeerUnverifiedException;
        } catch (javax.security.cert.CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException2 = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException2.initCause(sSLPeerUnverifiedException2);
            throw sSLPeerUnverifiedException2;
        }
    }

    static byte[] toProtocolBytes(String str) {
        if (str != null) {
            return str.getBytes(US_ASCII);
        }
        return null;
    }

    static String toProtocolString(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, US_ASCII);
        }
        return null;
    }

    static SSLException toSSLException(Throwable th) {
        if (th instanceof SSLException) {
            return (SSLException) th;
        }
        return new SSLException(th);
    }

    static SSLHandshakeException toSSLHandshakeException(Throwable th) {
        if (th instanceof SSLHandshakeException) {
            return (SSLHandshakeException) th;
        }
        return (SSLHandshakeException) new SSLHandshakeException(th.getMessage()).initCause(th);
    }

    private static short unsignedByte(byte b) {
        return (short) (b & 255);
    }

    private static int unsignedShort(short s) {
        return (char) s;
    }

    /* JADX INFO: finally extract failed */
    static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i) {
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            int i2 = i + 1;
            ByteBuffer byteBuffer2 = byteBufferArr[i];
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > allocate.remaining()) {
                byteBuffer2.limit(allocate.remaining() + position);
            }
            try {
                allocate.put(byteBuffer2);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                if (allocate.hasRemaining()) {
                    i = i2;
                } else {
                    allocate.flip();
                    return getEncryptedPacketLength(allocate);
                }
            } catch (Throwable th) {
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        }
    }
}
