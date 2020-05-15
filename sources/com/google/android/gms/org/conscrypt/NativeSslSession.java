package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class NativeSslSession {
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(NativeSslSession.class.getName());

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
            this.context = abstractSessionContext;
            this.host = str;
            this.port = i;
            this.peerCertificates = x509CertificateArr;
            this.peerOcspStapledResponse = bArr;
            this.peerSignedCertificateTimestamp = bArr2;
            this.protocol = NativeCrypto.SSL_SESSION_get_version(ssl_session.address);
            this.cipherSuite = NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_SESSION_cipher(ssl_session.address));
            this.ref = ssl_session;
        }

        /* access modifiers changed from: private */
        public long getCreationTime() {
            return NativeCrypto.SSL_SESSION_get_time(this.ref.address);
        }

        public String getCipherSuite() {
            return this.cipherSuite;
        }

        public byte[] getId() {
            return NativeCrypto.SSL_SESSION_session_id(this.ref.address);
        }

        public String getPeerHost() {
            return this.host;
        }

        /* access modifiers changed from: package-private */
        public byte[] getPeerOcspStapledResponse() {
            return this.peerOcspStapledResponse;
        }

        public int getPeerPort() {
            return this.port;
        }

        /* access modifiers changed from: package-private */
        public byte[] getPeerSignedCertificateTimestamp() {
            return this.peerSignedCertificateTimestamp;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public boolean isSingleUse() {
            return NativeCrypto.SSL_SESSION_should_be_single_use(this.ref.address);
        }

        public boolean isValid() {
            return System.currentTimeMillis() - (Math.max(0, Math.min((long) this.context.getSessionTimeout(), NativeCrypto.SSL_SESSION_get_timeout(this.ref.address))) * 1000) < getCreationTime();
        }

        public void offerToResume(NativeSsl nativeSsl) {
            nativeSsl.offerToResumeSession(this.ref.address);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
         arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
         candidates:
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
        public byte[] toBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value);
                byte[] i2d_SSL_SESSION = NativeCrypto.i2d_SSL_SESSION(this.ref.address);
                dataOutputStream.writeInt(i2d_SSL_SESSION.length);
                dataOutputStream.write(i2d_SSL_SESSION);
                dataOutputStream.writeInt(this.peerCertificates.length);
                for (X509Certificate x509Certificate : this.peerCertificates) {
                    byte[] encoded = x509Certificate.getEncoded();
                    dataOutputStream.writeInt(encoded.length);
                    dataOutputStream.write(encoded);
                }
                if (this.peerOcspStapledResponse != null) {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.peerOcspStapledResponse.length);
                    dataOutputStream.write(this.peerOcspStapledResponse);
                } else {
                    dataOutputStream.writeInt(0);
                }
                byte[] bArr = this.peerSignedCertificateTimestamp;
                if (bArr != null) {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(this.peerSignedCertificateTimestamp);
                } else {
                    dataOutputStream.writeInt(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                NativeSslSession.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.NativeSslSession$Impl", "toBytes", "Failed to convert saved SSL Session: ", (Throwable) e);
                return null;
            } catch (CertificateEncodingException e2) {
                NativeSslSession.log(e2);
                return null;
            }
        }

        public SSLSession toSSLSession() {
            return new SSLSession() {
                /* class com.google.android.gms.org.conscrypt.NativeSslSession.Impl.C16441 */

                public int getApplicationBufferSize() {
                    throw new UnsupportedOperationException();
                }

                public String getCipherSuite() {
                    return Impl.this.getCipherSuite();
                }

                public long getCreationTime() {
                    return Impl.this.getCreationTime();
                }

                public byte[] getId() {
                    return Impl.this.getId();
                }

                public long getLastAccessedTime() {
                    throw new UnsupportedOperationException();
                }

                public Certificate[] getLocalCertificates() {
                    throw new UnsupportedOperationException();
                }

                public Principal getLocalPrincipal() {
                    throw new UnsupportedOperationException();
                }

                public int getPacketBufferSize() {
                    throw new UnsupportedOperationException();
                }

                public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
                    throw new UnsupportedOperationException();
                }

                public Certificate[] getPeerCertificates() {
                    throw new UnsupportedOperationException();
                }

                public String getPeerHost() {
                    return Impl.this.getPeerHost();
                }

                public int getPeerPort() {
                    return Impl.this.getPeerPort();
                }

                public Principal getPeerPrincipal() {
                    throw new UnsupportedOperationException();
                }

                public String getProtocol() {
                    return Impl.this.getProtocol();
                }

                public SSLSessionContext getSessionContext() {
                    throw new UnsupportedOperationException();
                }

                public Object getValue(String str) {
                    throw new UnsupportedOperationException();
                }

                public String[] getValueNames() {
                    throw new UnsupportedOperationException();
                }

                public void invalidate() {
                    throw new UnsupportedOperationException();
                }

                public boolean isValid() {
                    return Impl.this.isValid();
                }

                public void putValue(String str, Object obj) {
                    throw new UnsupportedOperationException();
                }

                public void removeValue(String str) {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Length is negative: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i > byteBuffer.remaining()) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Length of blob is longer than available: ");
            sb2.append(i);
            sb2.append(" > ");
            sb2.append(remaining);
            throw new IOException(sb2.toString());
        }
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
        List statusResponses = conscryptSession.getStatusResponses();
        if (statusResponses.size() > 0) {
            return (byte[]) statusResponses.get(0);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static void log(Throwable th) {
        logger.logp(Level.INFO, "com.google.android.gms.org.conscrypt.NativeSslSession", "log", "Error inflating SSL session: {0}", th.getMessage() == null ? th.getClass().getName() : th.getMessage());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9 A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    static NativeSslSession newInstance(AbstractSessionContext abstractSessionContext, byte[] bArr, String str, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        try {
            int i4 = wrap.getInt();
            if (SSLUtils.SessionType.isSupportedType(i4)) {
                int i5 = wrap.getInt();
                checkRemaining(wrap, i5);
                byte[] bArr4 = new byte[i5];
                wrap.get(bArr4);
                i2 = wrap.getInt();
                checkRemaining(wrap, i2);
                X509Certificate[] x509CertificateArr = new X509Certificate[i2];
                i3 = 0;
                while (i3 < i2) {
                    int i6 = wrap.getInt();
                    checkRemaining(wrap, i6);
                    byte[] bArr5 = new byte[i6];
                    wrap.get(bArr5);
                    x509CertificateArr[i3] = OpenSSLX509Certificate.fromX509Der(bArr5);
                    i3++;
                }
                if (i4 >= SSLUtils.SessionType.OPEN_SSL_WITH_OCSP.value) {
                    int i7 = wrap.getInt();
                    checkRemaining(wrap, i7);
                    if (i7 > 0) {
                        int i8 = wrap.getInt();
                        checkRemaining(wrap, i8);
                        byte[] bArr6 = new byte[i8];
                        wrap.get(bArr6);
                        for (int i9 = 1; i9 < i7; i9++) {
                            int i10 = wrap.getInt();
                            checkRemaining(wrap, i10);
                            wrap.position(wrap.position() + i10);
                        }
                        bArr2 = bArr6;
                        if (i4 == SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value) {
                            int i11 = wrap.getInt();
                            checkRemaining(wrap, i11);
                            if (i11 > 0) {
                                byte[] bArr7 = new byte[i11];
                                wrap.get(bArr7);
                                bArr3 = bArr7;
                                if (wrap.remaining() == 0) {
                                    return new Impl(abstractSessionContext, new NativeRef.SSL_SESSION(NativeCrypto.d2i_SSL_SESSION(bArr4)), str, i, x509CertificateArr, bArr2, bArr3);
                                }
                                log(new AssertionError("Read entire session, but data still remains; rejecting"));
                                return null;
                            }
                        }
                        bArr3 = null;
                        if (wrap.remaining() == 0) {
                        }
                    }
                }
                bArr2 = null;
                if (i4 == SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value) {
                }
                bArr3 = null;
                if (wrap.remaining() == 0) {
                }
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unexpected type ID: ");
                sb.append(i4);
                throw new IOException(sb.toString());
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("Can not read certificate ");
            sb2.append(i3);
            sb2.append("/");
            sb2.append(i2);
            throw new IOException(sb2.toString());
        } catch (IOException e2) {
            log(e2);
            return null;
        } catch (BufferUnderflowException e3) {
            log(e3);
            return null;
        }
    }

    public abstract String getCipherSuite();

    public abstract byte[] getId();

    public abstract String getPeerHost();

    /* access modifiers changed from: package-private */
    public abstract byte[] getPeerOcspStapledResponse();

    public abstract int getPeerPort();

    /* access modifiers changed from: package-private */
    public abstract byte[] getPeerSignedCertificateTimestamp();

    public abstract String getProtocol();

    public abstract boolean isSingleUse();

    public abstract boolean isValid();

    public abstract void offerToResume(NativeSsl nativeSsl);

    public abstract byte[] toBytes();

    public abstract SSLSession toSSLSession();

    static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) {
        AbstractSessionContext abstractSessionContext = (AbstractSessionContext) conscryptSession.getSessionContext();
        if (abstractSessionContext instanceof ClientSessionContext) {
            return new Impl(abstractSessionContext, ssl_session, conscryptSession.getPeerHost(), conscryptSession.getPeerPort(), conscryptSession.getPeerCertificates(), getOcspResponse(conscryptSession), conscryptSession.getPeerSignedCertificateTimestamp());
        }
        return new Impl(abstractSessionContext, ssl_session, null, -1, null, null, null);
    }
}
