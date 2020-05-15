package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class NativeSsl {
    private final SSLParametersImpl.AliasChooser aliasChooser;
    /* access modifiers changed from: private */
    public final NativeCrypto.SSLHandshakeCallbacks handshakeCallbacks;
    private X509Certificate[] localCertificates;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final SSLParametersImpl parameters;
    private final SSLParametersImpl.PSKCallbacks pskCallbacks;
    /* access modifiers changed from: private */
    public volatile long ssl;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class BioWrapper {
        private volatile long bio;

        private BioWrapper() {
            this.bio = NativeCrypto.SSL_BIO_new(NativeSsl.this.ssl, NativeSsl.this);
        }

        public void close() {
            long j = this.bio;
            this.bio = 0;
            NativeCrypto.BIO_free_all(j);
        }

        public int getPendingWrittenBytes() {
            if (this.bio != 0) {
                return NativeCrypto.SSL_pending_written_bytes_in_BIO(this.bio);
            }
            return 0;
        }

        public int readDirectByteBuffer(long j, int i) {
            return NativeCrypto.ENGINE_SSL_read_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j, i, NativeSsl.this.handshakeCallbacks);
        }

        public int writeDirectByteBuffer(long j, int i) {
            return NativeCrypto.ENGINE_SSL_write_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j, i, NativeSsl.this.handshakeCallbacks);
        }
    }

    private NativeSsl(long j, SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser2, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        this.ssl = j;
        this.parameters = sSLParametersImpl;
        this.handshakeCallbacks = sSLHandshakeCallbacks;
        this.aliasChooser = aliasChooser2;
        this.pskCallbacks = pSKCallbacks;
    }

    private void enablePSKKeyManagerIfRequested() {
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager != null) {
            String[] strArr = this.parameters.enabledCipherSuites;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                if (str == null || !str.contains("PSK")) {
                    i++;
                } else if (isClient()) {
                    NativeCrypto.set_SSL_psk_client_callback_enabled(this.ssl, this, true);
                    return;
                } else {
                    NativeCrypto.set_SSL_psk_server_callback_enabled(this.ssl, this, true);
                    NativeCrypto.SSL_use_psk_identity_hint(this.ssl, this, this.pskCallbacks.chooseServerPSKIdentityHint(pSKKeyManager));
                    return;
                }
            }
        }
    }

    private boolean isClient() {
        return this.parameters.getUseClientMode();
    }

    static NativeSsl newInstance(SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser2, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        AbstractSessionContext sessionContext = sSLParametersImpl.getSessionContext();
        return new NativeSsl(NativeCrypto.SSL_new(sessionContext.sslCtxNativePointer, sessionContext), sSLParametersImpl, sSLHandshakeCallbacks, aliasChooser2, pSKCallbacks);
    }

    private void setCertificateValidation() {
        if (!isClient()) {
            if (this.parameters.getNeedClientAuth()) {
                NativeCrypto.SSL_set_verify(this.ssl, this, 3);
            } else if (this.parameters.getWantClientAuth()) {
                NativeCrypto.SSL_set_verify(this.ssl, this, 1);
            } else {
                NativeCrypto.SSL_set_verify(this.ssl, this, 0);
                return;
            }
            X509Certificate[] acceptedIssuers = this.parameters.getX509TrustManager().getAcceptedIssuers();
            if (acceptedIssuers != null && acceptedIssuers.length != 0) {
                try {
                    NativeCrypto.SSL_set_client_CA_list(this.ssl, this, SSLUtils.encodeSubjectX509Principals(acceptedIssuers));
                } catch (CertificateEncodingException e) {
                    throw new SSLException("Problem encoding principals", e);
                }
            }
        }
    }

    private void setTlsChannelId(OpenSSLKey openSSLKey) {
        SSLParametersImpl sSLParametersImpl = this.parameters;
        if (!sSLParametersImpl.channelIdEnabled) {
            return;
        }
        if (!sSLParametersImpl.getUseClientMode()) {
            NativeCrypto.SSL_enable_tls_channel_id(this.ssl, this);
        } else if (openSSLKey != null) {
            NativeCrypto.SSL_set1_tls_channel_id(this.ssl, this, openSSLKey.getNativeRef());
        } else {
            throw new SSLHandshakeException("Invalid TLS channel ID key specified");
        }
    }

    public void chooseClientCertificate(byte[] bArr, int[] iArr, byte[][] bArr2) {
        X500Principal[] x500PrincipalArr;
        Set supportedClientKeyTypes = SSLUtils.getSupportedClientKeyTypes(bArr, iArr);
        String[] strArr = (String[]) supportedClientKeyTypes.toArray(new String[supportedClientKeyTypes.size()]);
        String str = null;
        if (bArr2 != null) {
            x500PrincipalArr = new X500Principal[bArr2.length];
            for (int i = 0; i < bArr2.length; i++) {
                x500PrincipalArr[i] = new X500Principal(bArr2[i]);
            }
        } else {
            x500PrincipalArr = null;
        }
        X509KeyManager x509KeyManager = this.parameters.getX509KeyManager();
        if (x509KeyManager != null) {
            str = this.aliasChooser.chooseClientAlias(x509KeyManager, x500PrincipalArr, strArr);
        }
        setCertificate(str);
    }

    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        byte[] bArr3;
        int length;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager == null) {
            return 0;
        }
        String chooseClientPSKIdentity = this.pskCallbacks.chooseClientPSKIdentity(pSKKeyManager, str);
        if (chooseClientPSKIdentity == null) {
            bArr3 = EmptyArray.BYTE;
            str2 = "";
        } else if (chooseClientPSKIdentity.isEmpty()) {
            str2 = chooseClientPSKIdentity;
            bArr3 = EmptyArray.BYTE;
        } else {
            try {
                str2 = chooseClientPSKIdentity;
                bArr3 = chooseClientPSKIdentity.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 encoding not supported", e);
            }
        }
        int length2 = bArr3.length;
        if (length2 + 1 > bArr.length) {
            return 0;
        }
        if (length2 > 0) {
            System.arraycopy(bArr3, 0, bArr, 0, length2);
        }
        bArr[length2] = 0;
        byte[] encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded();
        if (encoded == null || (length = encoded.length) > bArr2.length) {
            return 0;
        }
        System.arraycopy(encoded, 0, bArr2, 0, length);
        return length;
    }

    public void close() {
        this.lock.writeLock().lock();
        try {
            if (!isClosed()) {
                long j = this.ssl;
                this.ssl = 0;
                NativeCrypto.SSL_free(j, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public int doHandshake() {
        this.lock.readLock().lock();
        try {
            return NativeCrypto.ENGINE_SSL_do_handshake(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        if (str != null) {
            return NativeCrypto.SSL_export_keying_material(this.ssl, this, str.getBytes(Charset.forName("US-ASCII")), bArr, i);
        }
        throw new NullPointerException("Label is null");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void forceRead() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_force_read(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public byte[] getApplicationProtocol() {
        return NativeCrypto.getApplicationProtocol(this.ssl, this);
    }

    public String getCipherSuite() {
        return NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_get_current_cipher(this.ssl, this));
    }

    public int getError(int i) {
        return NativeCrypto.SSL_get_error(this.ssl, this, i);
    }

    public X509Certificate[] getLocalCertificates() {
        return this.localCertificates;
    }

    public int getMaxSealOverhead() {
        return NativeCrypto.SSL_max_seal_overhead(this.ssl, this);
    }

    public byte[] getPeerCertificateOcspData() {
        return NativeCrypto.SSL_get_ocsp_response(this.ssl, this);
    }

    public X509Certificate[] getPeerCertificates() {
        byte[][] SSL_get0_peer_certificates = NativeCrypto.SSL_get0_peer_certificates(this.ssl, this);
        if (SSL_get0_peer_certificates != null) {
            return SSLUtils.decodeX509CertificateChain(SSL_get0_peer_certificates);
        }
        return null;
    }

    public byte[] getPeerTlsSctData() {
        return NativeCrypto.SSL_get_signed_cert_timestamp_list(this.ssl, this);
    }

    /* JADX INFO: finally extract failed */
    public int getPendingReadableBytes() {
        this.lock.readLock().lock();
        try {
            if (isClosed()) {
                this.lock.readLock().unlock();
                return 0;
            }
            int SSL_pending_readable_bytes = NativeCrypto.SSL_pending_readable_bytes(this.ssl, this);
            this.lock.readLock().unlock();
            return SSL_pending_readable_bytes;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public String getRequestedServerName() {
        return NativeCrypto.SSL_get_servername(this.ssl, this);
    }

    public byte[] getSessionId() {
        return NativeCrypto.SSL_session_id(this.ssl, this);
    }

    public long getTime() {
        return NativeCrypto.SSL_get_time(this.ssl, this);
    }

    public long getTimeout() {
        return NativeCrypto.SSL_get_timeout(this.ssl, this);
    }

    public byte[] getTlsChannelId() {
        return NativeCrypto.SSL_get_tls_channel_id(this.ssl, this);
    }

    public byte[] getTlsUnique() {
        return NativeCrypto.SSL_get_tls_unique(this.ssl, this);
    }

    public String getVersion() {
        return NativeCrypto.SSL_get_version(this.ssl, this);
    }

    public void initialize(String str, OpenSSLKey openSSLKey) {
        if (!this.parameters.getEnableSessionCreation()) {
            NativeCrypto.SSL_set_session_creation_enabled(this.ssl, this, false);
        }
        NativeCrypto.SSL_accept_renegotiations(this.ssl, this);
        if (isClient()) {
            NativeCrypto.SSL_set_connect_state(this.ssl, this);
            NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            if (this.parameters.isCTVerificationEnabled(str)) {
                NativeCrypto.SSL_enable_signed_cert_timestamps(this.ssl, this);
            }
        } else {
            NativeCrypto.SSL_set_accept_state(this.ssl, this);
            if (this.parameters.getOCSPResponse() != null) {
                NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            }
        }
        if (this.parameters.getEnabledProtocols().length != 0 || !this.parameters.isEnabledProtocolsFiltered) {
            NativeCrypto.setEnabledProtocols(this.ssl, this, this.parameters.enabledProtocols);
            long j = this.ssl;
            SSLParametersImpl sSLParametersImpl = this.parameters;
            NativeCrypto.setEnabledCipherSuites(j, this, sSLParametersImpl.enabledCipherSuites, sSLParametersImpl.enabledProtocols);
            if (this.parameters.applicationProtocols.length > 0) {
                NativeCrypto.setApplicationProtocols(this.ssl, this, isClient(), this.parameters.applicationProtocols);
            }
            if (!isClient() && this.parameters.applicationProtocolSelector != null) {
                NativeCrypto.setApplicationProtocolSelector(this.ssl, this, this.parameters.applicationProtocolSelector);
            }
            if (!isClient()) {
                HashSet<String> hashSet = new HashSet();
                for (long j2 : NativeCrypto.SSL_get_ciphers(this.ssl, this)) {
                    String serverX509KeyType = SSLUtils.getServerX509KeyType(j2);
                    if (serverX509KeyType != null) {
                        hashSet.add(serverX509KeyType);
                    }
                }
                X509KeyManager x509KeyManager = this.parameters.getX509KeyManager();
                if (x509KeyManager != null) {
                    for (String str2 : hashSet) {
                        try {
                            setCertificate(this.aliasChooser.chooseServerAlias(x509KeyManager, str2));
                        } catch (CertificateEncodingException e) {
                            throw new IOException(e);
                        }
                    }
                }
                NativeCrypto.SSL_set_options(this.ssl, this, 4194304);
                if (this.parameters.sctExtension != null) {
                    NativeCrypto.SSL_set_signed_cert_timestamp_list(this.ssl, this, this.parameters.sctExtension);
                }
                if (this.parameters.ocspResponse != null) {
                    NativeCrypto.SSL_set_ocsp_response(this.ssl, this, this.parameters.ocspResponse);
                }
            }
            enablePSKKeyManagerIfRequested();
            if (this.parameters.useSessionTickets) {
                NativeCrypto.SSL_clear_options(this.ssl, this, 16384);
            } else {
                NativeCrypto.SSL_set_options(this.ssl, this, 16384 | NativeCrypto.SSL_get_options(this.ssl, this));
            }
            if (this.parameters.getUseSni() && AddressUtils.isValidSniHostname(str)) {
                NativeCrypto.SSL_set_tlsext_host_name(this.ssl, this, str);
            }
            NativeCrypto.SSL_set_mode(this.ssl, this, 256);
            setCertificateValidation();
            setTlsChannelId(openSSLKey);
            return;
        }
        throw new SSLHandshakeException("No enabled protocols; SSLv3 is no longer supported and was filtered from the list");
    }

    public void interrupt() {
        NativeCrypto.SSL_interrupt(this.ssl, this);
    }

    public boolean isClosed() {
        return this.ssl == 0;
    }

    public BioWrapper newBio() {
        try {
            return new BioWrapper();
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    public void offerToResumeSession(long j) {
        NativeCrypto.SSL_set_session(this.ssl, this, j);
    }

    public int read(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) {
        this.lock.readLock().lock();
        try {
            if (!isClosed() && fileDescriptor != null && fileDescriptor.valid()) {
                return NativeCrypto.SSL_read(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i, i2, i3);
            }
            throw new SocketException("Socket is closed");
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public int readDirectByteBuffer(long j, int i) {
        this.lock.readLock().lock();
        try {
            return NativeCrypto.ENGINE_SSL_read_direct(this.ssl, this, j, i, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        byte[] encoded;
        int length;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager == null || (encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded()) == null || (length = encoded.length) > bArr.length) {
            return 0;
        }
        System.arraycopy(encoded, 0, bArr, 0, length);
        return length;
    }

    public void setCertificate(String str) {
        X509KeyManager x509KeyManager;
        PrivateKey privateKey;
        PublicKey publicKey;
        if (str != null && (x509KeyManager = this.parameters.getX509KeyManager()) != null && (privateKey = x509KeyManager.getPrivateKey(str)) != null) {
            X509Certificate[] certificateChain = x509KeyManager.getCertificateChain(str);
            this.localCertificates = certificateChain;
            if (certificateChain != null) {
                int length = certificateChain.length;
                if (length > 0) {
                    publicKey = certificateChain[0].getPublicKey();
                } else {
                    publicKey = null;
                }
                byte[][] bArr = new byte[length][];
                for (int i = 0; i < length; i++) {
                    bArr[i] = this.localCertificates[i].getEncoded();
                }
                try {
                    NativeCrypto.setLocalCertsAndPrivateKey(this.ssl, this, bArr, OpenSSLKey.fromPrivateKeyForTLSStackOnly(privateKey, publicKey).getNativeRef());
                } catch (InvalidKeyException e) {
                    throw new SSLException(e);
                }
            }
        }
    }

    public void setTimeout(long j) {
        NativeCrypto.SSL_set_timeout(this.ssl, this, j);
    }

    public void shutdown() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_shutdown(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean wasShutdownReceived() {
        boolean z;
        this.lock.readLock().lock();
        try {
            if ((NativeCrypto.SSL_get_shutdown(this.ssl, this) & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean wasShutdownSent() {
        this.lock.readLock().lock();
        try {
            int SSL_get_shutdown = NativeCrypto.SSL_get_shutdown(this.ssl, this);
            this.lock.readLock().unlock();
            return (SSL_get_shutdown & 1) != 0;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public void write(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) {
        this.lock.readLock().lock();
        try {
            if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket is closed");
            }
            NativeCrypto.SSL_write(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i, i2, i3);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public int writeDirectByteBuffer(long j, int i) {
        this.lock.readLock().lock();
        try {
            return NativeCrypto.ENGINE_SSL_write_direct(this.ssl, this, j, i, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void doHandshake(FileDescriptor fileDescriptor, int i) {
        this.lock.readLock().lock();
        try {
            if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket is closed");
            }
            NativeCrypto.SSL_do_handshake(this.ssl, this, fileDescriptor, this.handshakeCallbacks, i);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void shutdown(FileDescriptor fileDescriptor) {
        NativeCrypto.SSL_shutdown(this.ssl, this, fileDescriptor, this.handshakeCallbacks);
    }
}
