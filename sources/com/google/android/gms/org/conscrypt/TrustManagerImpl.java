package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.p058ct.CTLogStore;
import com.google.android.gms.org.conscrypt.p058ct.CTPolicy;
import com.google.android.gms.org.conscrypt.p058ct.CTVerifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TrustManagerImpl extends X509ExtendedTrustManager {
    private static final TrustAnchorComparator TRUST_ANCHOR_COMPARATOR = new TrustAnchorComparator();
    private static ConscryptHostnameVerifier defaultHostnameVerifier;
    private static final Logger logger = Logger.getLogger(TrustManagerImpl.class.getName());
    private final X509Certificate[] acceptedIssuers;
    private final CertBlacklist blacklist;
    private boolean ctEnabledOverride;
    private CTPolicy ctPolicy;
    private CTVerifier ctVerifier;
    private final Exception err;
    private final CertificateFactory factory;
    private ConscryptHostnameVerifier hostnameVerifier;
    private final TrustedCertificateIndex intermediateIndex;
    private CertPinManager pinManager;
    private final KeyStore rootKeyStore;
    private final TrustedCertificateIndex trustedCertificateIndex;
    private final ConscryptCertStore trustedCertificateStore;
    private final CertPathValidator validator;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ExtendedKeyUsagePKIXCertPathChecker extends PKIXCertPathChecker {
        private static final String EKU_OID = "2.5.29.37";
        private static final String EKU_anyExtendedKeyUsage = "2.5.29.37.0";
        private static final String EKU_clientAuth = "1.3.6.1.5.5.7.3.2";
        private static final String EKU_msSGC = "1.3.6.1.4.1.311.10.3.3";
        private static final String EKU_nsSGC = "2.16.840.1.113730.4.1";
        private static final String EKU_serverAuth = "1.3.6.1.5.5.7.3.1";
        private static final Set SUPPORTED_EXTENSIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(EKU_OID)));
        private final boolean clientAuth;
        private final X509Certificate leaf;

        private ExtendedKeyUsagePKIXCertPathChecker(boolean z, X509Certificate x509Certificate) {
            this.clientAuth = z;
            this.leaf = x509Certificate;
        }

        public void check(Certificate certificate, Collection collection) {
            X509Certificate x509Certificate = this.leaf;
            if (certificate == x509Certificate) {
                try {
                    List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                    if (extendedKeyUsage != null) {
                        for (String str : extendedKeyUsage) {
                            if (!str.equals(EKU_anyExtendedKeyUsage)) {
                                if (this.clientAuth) {
                                    if (str.equals(EKU_clientAuth)) {
                                    }
                                } else if (!str.equals(EKU_serverAuth) && !str.equals(EKU_nsSGC) && !str.equals(EKU_msSGC)) {
                                }
                            }
                            collection.remove(EKU_OID);
                            return;
                        }
                        throw new CertPathValidatorException("End-entity certificate does not have a valid extendedKeyUsage.");
                    }
                } catch (CertificateParsingException e) {
                    throw new CertPathValidatorException(e);
                }
            }
        }

        public Set getSupportedExtensions() {
            return SUPPORTED_EXTENSIONS;
        }

        public void init(boolean z) {
        }

        public boolean isForwardCheckingSupported() {
            return true;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum GlobalHostnameVerifierAdapter implements ConscryptHostnameVerifier {
        INSTANCE;

        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class TrustAnchorComparator implements Comparator {
        private static final CertificatePriorityComparator CERT_COMPARATOR = new CertificatePriorityComparator();

        private TrustAnchorComparator() {
        }

        public int compare(TrustAnchor trustAnchor, TrustAnchor trustAnchor2) {
            return CERT_COMPARATOR.compare(trustAnchor.getTrustedCert(), trustAnchor2.getTrustedCert());
        }
    }

    public TrustManagerImpl(KeyStore keyStore) {
        this(keyStore, null);
    }

    private static X509Certificate[] acceptedIssuers(KeyStore keyStore) {
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    arrayList.add(x509Certificate);
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (KeyStoreException e) {
            return new X509Certificate[0];
        }
    }

    private void checkBlacklist(X509Certificate x509Certificate) {
        CertBlacklist certBlacklist = this.blacklist;
        if (certBlacklist != null && certBlacklist.isPublicKeyBlackListed(x509Certificate.getPublicKey())) {
            String valueOf = String.valueOf(x509Certificate);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Certificate blacklisted by public key: ");
            sb.append(valueOf);
            throw new CertificateException(sb.toString());
        }
    }

    private void checkCT(String str, List list, byte[] bArr, byte[] bArr2) {
        if (!this.ctPolicy.doesResultConformToPolicy(this.ctVerifier.verifySignedCertificateTimestamps(list, bArr2, bArr), str, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]))) {
            throw new CertificateException("Certificate chain does not conform to required transparency policy.");
        }
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession, SSLParameters sSLParameters, boolean z) {
        String str2;
        byte[] bArr;
        byte[] bArr2;
        if (sSLSession != null) {
            str2 = sSLSession.getPeerHost();
            bArr2 = getOcspDataFromSession(sSLSession);
            bArr = getTlsSctDataFromSession(sSLSession);
        } else {
            bArr2 = null;
            bArr = null;
            str2 = null;
        }
        if (sSLSession == null || sSLParameters == null || !"HTTPS".equalsIgnoreCase(sSLParameters.getEndpointIdentificationAlgorithm()) || getHttpsVerifier().verify(str2, sSLSession)) {
            return checkTrusted(x509CertificateArr, bArr2, bArr, str, str2, z);
        }
        throw new CertificateException("No subjectAltNames on the certificate match");
    }

    private List checkTrustedRecursive(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, boolean z, ArrayList arrayList, ArrayList arrayList2, Set set) {
        X509Certificate x509Certificate;
        X509Certificate[] x509CertificateArr2 = x509CertificateArr;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Set set2 = set;
        if (arrayList2.isEmpty()) {
            x509Certificate = (X509Certificate) arrayList3.get(arrayList.size() - 1);
        } else {
            x509Certificate = ((TrustAnchor) arrayList4.get(arrayList2.size() - 1)).getTrustedCert();
        }
        checkBlacklist(x509Certificate);
        if (x509Certificate.getIssuerDN().equals(x509Certificate.getSubjectDN())) {
            return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
        }
        boolean z2 = false;
        CertificateException certificateException = null;
        for (TrustAnchor trustAnchor : sortPotentialAnchors(findAllTrustAnchorsByIssuerAndSignature(x509Certificate))) {
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            if (!set2.contains(trustedCert)) {
                set2.add(trustedCert);
                arrayList4.add(trustAnchor);
                try {
                    return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                } catch (CertificateException e) {
                    arrayList4.remove(arrayList2.size() - 1);
                    set2.remove(trustedCert);
                    certificateException = e;
                    z2 = true;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            for (int i = 1; i < x509CertificateArr2.length; i++) {
                X509Certificate x509Certificate2 = x509CertificateArr2[i];
                if (!set2.contains(x509Certificate2) && x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                    try {
                        x509Certificate2.checkValidity();
                        ChainStrengthAnalyzer.checkCert(x509Certificate2);
                        set2.add(x509Certificate2);
                        arrayList3.add(x509Certificate2);
                        try {
                            return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                        } catch (CertificateException e2) {
                            set2.remove(x509Certificate2);
                            arrayList3.remove(arrayList.size() - 1);
                            certificateException = e2;
                        }
                    } catch (CertificateException e3) {
                        String valueOf = String.valueOf(x509Certificate2.getSubjectX500Principal());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                        sb.append("Unacceptable certificate: ");
                        sb.append(valueOf);
                        certificateException = new CertificateException(sb.toString(), e3);
                    }
                }
            }
            for (TrustAnchor trustAnchor2 : sortPotentialAnchors(this.intermediateIndex.findAllByIssuerAndSignature(x509Certificate))) {
                X509Certificate trustedCert2 = trustAnchor2.getTrustedCert();
                if (!set2.contains(trustedCert2)) {
                    set2.add(trustedCert2);
                    arrayList3.add(trustedCert2);
                    try {
                        return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                    } catch (CertificateException e4) {
                        arrayList3.remove(arrayList.size() - 1);
                        set2.remove(trustedCert2);
                        certificateException = e4;
                    }
                }
            }
            if (certificateException == null) {
                throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, this.factory.generateCertPath(arrayList3), -1));
            }
            throw certificateException;
        } else if (!z2) {
            return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
        } else {
            throw certificateException;
        }
    }

    private Set findAllTrustAnchorsByIssuerAndSignature(X509Certificate x509Certificate) {
        ConscryptCertStore conscryptCertStore;
        Set findAllByIssuerAndSignature = this.trustedCertificateIndex.findAllByIssuerAndSignature(x509Certificate);
        if (findAllByIssuerAndSignature.isEmpty() && (conscryptCertStore = this.trustedCertificateStore) != null) {
            Set<X509Certificate> findAllIssuers = conscryptCertStore.findAllIssuers(x509Certificate);
            if (!findAllIssuers.isEmpty()) {
                findAllByIssuerAndSignature = new HashSet(findAllIssuers.size());
                for (X509Certificate x509Certificate2 : findAllIssuers) {
                    findAllByIssuerAndSignature.add(this.trustedCertificateIndex.index(x509Certificate2));
                }
            }
        }
        return findAllByIssuerAndSignature;
    }

    private TrustAnchor findTrustAnchorBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X509Certificate trustAnchor;
        TrustAnchor findBySubjectAndPublicKey = this.trustedCertificateIndex.findBySubjectAndPublicKey(x509Certificate);
        if (findBySubjectAndPublicKey != null) {
            return findBySubjectAndPublicKey;
        }
        ConscryptCertStore conscryptCertStore = this.trustedCertificateStore;
        if (conscryptCertStore == null || (trustAnchor = conscryptCertStore.getTrustAnchor(x509Certificate)) == null) {
            return null;
        }
        return new TrustAnchor(trustAnchor, null);
    }

    static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier;
        synchronized (TrustManagerImpl.class) {
            conscryptHostnameVerifier = defaultHostnameVerifier;
        }
        return conscryptHostnameVerifier;
    }

    private static SSLSession getHandshakeSessionOrThrow(SSLSocket sSLSocket) {
        SSLSession handshakeSession = sSLSocket.getHandshakeSession();
        if (handshakeSession != null) {
            return handshakeSession;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    private ConscryptHostnameVerifier getHttpsVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier = this.hostnameVerifier;
        if (conscryptHostnameVerifier != null) {
            return conscryptHostnameVerifier;
        }
        ConscryptHostnameVerifier defaultHostnameVerifier2 = getDefaultHostnameVerifier();
        return defaultHostnameVerifier2 == null ? GlobalHostnameVerifierAdapter.INSTANCE : defaultHostnameVerifier2;
    }

    private byte[] getOcspDataFromSession(SSLSession sSLSession) {
        List list;
        if (sSLSession instanceof ConscryptSession) {
            list = ((ConscryptSession) sSLSession).getStatusResponses();
        } else {
            try {
                Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getStatusResponses", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
                if (invoke instanceof List) {
                    list = (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException e) {
            } catch (IllegalArgumentException e2) {
                list = null;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (byte[]) list.get(0);
    }

    private byte[] getTlsSctDataFromSession(SSLSession sSLSession) {
        if (sSLSession instanceof ConscryptSession) {
            return ((ConscryptSession) sSLSession).getPeerSignedCertificateTimestamp();
        }
        try {
            Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getPeerSignedCertificateTimestamp", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
            if (invoke instanceof byte[]) {
                return (byte[]) invoke;
            }
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException e) {
            return null;
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (TrustManagerImpl.class) {
            defaultHostnameVerifier = conscryptHostnameVerifier;
        }
    }

    private void setOcspResponses(PKIXParameters pKIXParameters, X509Certificate x509Certificate, byte[] bArr) {
        PKIXRevocationChecker pKIXRevocationChecker;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(pKIXParameters.getCertPathCheckers());
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    pKIXRevocationChecker = null;
                    break;
                }
                PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) arrayList.get(i);
                i++;
                if (pKIXCertPathChecker instanceof PKIXRevocationChecker) {
                    pKIXRevocationChecker = (PKIXRevocationChecker) pKIXCertPathChecker;
                    break;
                }
            }
            if (pKIXRevocationChecker == null) {
                try {
                    pKIXRevocationChecker = (PKIXRevocationChecker) this.validator.getRevocationChecker();
                    arrayList.add(pKIXRevocationChecker);
                    pKIXRevocationChecker.setOptions(Collections.singleton(PKIXRevocationChecker.Option.ONLY_END_ENTITY));
                } catch (UnsupportedOperationException e) {
                    return;
                }
            }
            pKIXRevocationChecker.setOcspResponses(Collections.singletonMap(x509Certificate, bArr));
            pKIXParameters.setCertPathCheckers(arrayList);
        }
    }

    private static Collection sortPotentialAnchors(Set set) {
        if (set.size() <= 1) {
            return set;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList, TRUST_ANCHOR_COMPARATOR);
        return arrayList;
    }

    private static Set trustAnchors(X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        HashSet hashSet = new HashSet(length);
        for (X509Certificate x509Certificate : x509CertificateArr) {
            hashSet.add(new TrustAnchor(x509Certificate, null));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (com.google.android.gms.org.conscrypt.Platform.isCTVerificationRequired(r9) != false) goto L_0x005a;
     */
    private List verifyChain(List list, List list2, String str, boolean z, byte[] bArr, byte[] bArr2) {
        try {
            CertPath generateCertPath = this.factory.generateCertPath(list);
            if (!list2.isEmpty()) {
                ArrayList<X509Certificate> arrayList = new ArrayList();
                arrayList.addAll(list);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TrustAnchor) it.next()).getTrustedCert());
                }
                CertPinManager certPinManager = this.pinManager;
                if (certPinManager != null) {
                    certPinManager.checkChainPinning(str, arrayList);
                }
                for (X509Certificate x509Certificate : arrayList) {
                    checkBlacklist(x509Certificate);
                }
                if (!z) {
                    if (!this.ctEnabledOverride) {
                        if (str != null) {
                        }
                    }
                    checkCT(str, arrayList, bArr, bArr2);
                }
                if (list.isEmpty()) {
                    return arrayList;
                }
                ChainStrengthAnalyzer.check(list);
                HashSet hashSet = new HashSet();
                hashSet.add((TrustAnchor) list2.get(0));
                PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
                pKIXParameters.setRevocationEnabled(false);
                X509Certificate x509Certificate2 = (X509Certificate) list.get(0);
                setOcspResponses(pKIXParameters, x509Certificate2, bArr);
                pKIXParameters.addCertPathChecker(new ExtendedKeyUsagePKIXCertPathChecker(z, x509Certificate2));
                this.validator.validate(generateCertPath, pKIXParameters);
                for (int i = 1; i < list.size(); i++) {
                    this.intermediateIndex.index((X509Certificate) list.get(i));
                }
                return arrayList;
            }
            throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, generateCertPath, -1));
        } catch (InvalidAlgorithmParameterException e) {
            throw new CertificateException("Chain validation failed", e);
        } catch (CertPathValidatorException e2) {
            throw new CertificateException("Chain validation failed", e2);
        } catch (CertificateException e3) {
            Logger logger2 = logger;
            Level level = Level.FINE;
            String valueOf = String.valueOf(e3.getMessage());
            logger2.logp(level, "com.google.android.gms.org.conscrypt.TrustManagerImpl", "verifyChain", valueOf.length() == 0 ? new String("Rejected candidate cert chain due to error: ") : "Rejected candidate cert chain due to error: ".concat(valueOf));
            throw e3;
        }
    }

    public List checkClientTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, null, null, str, str2, true);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, null, null, str, str2, false);
    }

    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        return x509CertificateArr != null ? (X509Certificate[]) x509CertificateArr.clone() : acceptedIssuers(this.rootKeyStore);
    }

    public ConscryptHostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLParameters sSLParameters;
        SSLSession sSLSession;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        return checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, false);
    }

    public void handleTrustStorageUpdate() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        if (x509CertificateArr != null) {
            this.trustedCertificateIndex.reset(trustAnchors(x509CertificateArr));
        } else {
            this.trustedCertificateIndex.reset();
        }
    }

    public void setCTEnabledOverride(boolean z) {
        this.ctEnabledOverride = z;
    }

    public void setCTPolicy(CTPolicy cTPolicy) {
        this.ctPolicy = cTPolicy;
    }

    public void setCTVerifier(CTVerifier cTVerifier) {
        this.ctVerifier = cTVerifier;
    }

    public void setHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        this.hostnameVerifier = conscryptHostnameVerifier;
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager) {
        this(keyStore, certPinManager, null);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, null, null, true);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        return checkTrusted(x509CertificateArr, str, sSLSession, null, false);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore) {
        this(keyStore, certPinManager, conscryptCertStore, null);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLParameters sSLParameters;
        SSLSession sSLSession;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, true);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, null, null, false);
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            return checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), false);
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore, CertBlacklist certBlacklist) {
        this(keyStore, certPinManager, conscryptCertStore, certBlacklist, null, null, null);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        getTrustedChainForServer(x509CertificateArr, str, socket);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055  */
    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore, CertBlacklist certBlacklist, CTLogStore cTLogStore, CTVerifier cTVerifier, CTPolicy cTPolicy) {
        X509Certificate[] x509CertificateArr;
        Exception exc;
        TrustedCertificateIndex trustedCertificateIndex2;
        CertificateFactory certificateFactory;
        CertPathValidator certPathValidator;
        Exception e;
        try {
            certPathValidator = CertPathValidator.getInstance("PKIX");
            try {
                certificateFactory = CertificateFactory.getInstance("X509");
            } catch (Exception e2) {
                e = e2;
                x509CertificateArr = null;
                conscryptCertStore = null;
                certificateFactory = null;
                exc = e;
                trustedCertificateIndex2 = null;
                if (certBlacklist == null) {
                }
                if (cTLogStore == null) {
                }
                if (cTPolicy == null) {
                }
                this.pinManager = certPinManager;
                this.rootKeyStore = null;
                this.trustedCertificateStore = conscryptCertStore;
                this.validator = certPathValidator;
                this.factory = certificateFactory;
                this.trustedCertificateIndex = trustedCertificateIndex2;
                this.intermediateIndex = new TrustedCertificateIndex();
                this.acceptedIssuers = x509CertificateArr;
                this.err = exc;
                this.blacklist = certBlacklist;
                this.ctVerifier = new CTVerifier(cTLogStore);
                this.ctPolicy = cTPolicy;
            }
            try {
                if ("AndroidCAStore".equals(keyStore.getType())) {
                    int i = Platform.f81431a;
                }
                try {
                    x509CertificateArr = acceptedIssuers(keyStore);
                } catch (Exception e3) {
                    e = e3;
                    x509CertificateArr = null;
                    exc = e;
                    trustedCertificateIndex2 = null;
                    if (certBlacklist == null) {
                    }
                    if (cTLogStore == null) {
                    }
                    if (cTPolicy == null) {
                    }
                    this.pinManager = certPinManager;
                    this.rootKeyStore = null;
                    this.trustedCertificateStore = conscryptCertStore;
                    this.validator = certPathValidator;
                    this.factory = certificateFactory;
                    this.trustedCertificateIndex = trustedCertificateIndex2;
                    this.intermediateIndex = new TrustedCertificateIndex();
                    this.acceptedIssuers = x509CertificateArr;
                    this.err = exc;
                    this.blacklist = certBlacklist;
                    this.ctVerifier = new CTVerifier(cTLogStore);
                    this.ctPolicy = cTPolicy;
                }
                try {
                    trustedCertificateIndex2 = new TrustedCertificateIndex(trustAnchors(x509CertificateArr));
                    exc = null;
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    trustedCertificateIndex2 = null;
                    if (certBlacklist == null) {
                    }
                    if (cTLogStore == null) {
                    }
                    if (cTPolicy == null) {
                    }
                    this.pinManager = certPinManager;
                    this.rootKeyStore = null;
                    this.trustedCertificateStore = conscryptCertStore;
                    this.validator = certPathValidator;
                    this.factory = certificateFactory;
                    this.trustedCertificateIndex = trustedCertificateIndex2;
                    this.intermediateIndex = new TrustedCertificateIndex();
                    this.acceptedIssuers = x509CertificateArr;
                    this.err = exc;
                    this.blacklist = certBlacklist;
                    this.ctVerifier = new CTVerifier(cTLogStore);
                    this.ctPolicy = cTPolicy;
                }
            } catch (Exception e5) {
                e = e5;
                x509CertificateArr = null;
                conscryptCertStore = null;
                exc = e;
                trustedCertificateIndex2 = null;
                if (certBlacklist == null) {
                }
                if (cTLogStore == null) {
                }
                if (cTPolicy == null) {
                }
                this.pinManager = certPinManager;
                this.rootKeyStore = null;
                this.trustedCertificateStore = conscryptCertStore;
                this.validator = certPathValidator;
                this.factory = certificateFactory;
                this.trustedCertificateIndex = trustedCertificateIndex2;
                this.intermediateIndex = new TrustedCertificateIndex();
                this.acceptedIssuers = x509CertificateArr;
                this.err = exc;
                this.blacklist = certBlacklist;
                this.ctVerifier = new CTVerifier(cTLogStore);
                this.ctPolicy = cTPolicy;
            }
        } catch (Exception e6) {
            e = e6;
            x509CertificateArr = null;
            conscryptCertStore = null;
            certPathValidator = null;
            certificateFactory = null;
            exc = e;
            trustedCertificateIndex2 = null;
            if (certBlacklist == null) {
            }
            if (cTLogStore == null) {
            }
            if (cTPolicy == null) {
            }
            this.pinManager = certPinManager;
            this.rootKeyStore = null;
            this.trustedCertificateStore = conscryptCertStore;
            this.validator = certPathValidator;
            this.factory = certificateFactory;
            this.trustedCertificateIndex = trustedCertificateIndex2;
            this.intermediateIndex = new TrustedCertificateIndex();
            this.acceptedIssuers = x509CertificateArr;
            this.err = exc;
            this.blacklist = certBlacklist;
            this.ctVerifier = new CTVerifier(cTLogStore);
            this.ctPolicy = cTPolicy;
        }
        if (certBlacklist == null) {
            int i2 = Platform.f81431a;
            certBlacklist = null;
        }
        if (cTLogStore == null) {
            int i3 = Platform.f81431a;
            cTLogStore = null;
        }
        if (cTPolicy == null) {
            int i4 = Platform.f81431a;
            cTPolicy = null;
        }
        this.pinManager = certPinManager;
        this.rootKeyStore = null;
        this.trustedCertificateStore = conscryptCertStore;
        this.validator = certPathValidator;
        this.factory = certificateFactory;
        this.trustedCertificateIndex = trustedCertificateIndex2;
        this.intermediateIndex = new TrustedCertificateIndex();
        this.acceptedIssuers = x509CertificateArr;
        this.err = exc;
        this.blacklist = certBlacklist;
        this.ctVerifier = new CTVerifier(cTLogStore);
        this.ctPolicy = cTPolicy;
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, String str2, boolean z) {
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or zero-length parameter");
        }
        Exception exc = this.err;
        if (exc == null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            X509Certificate x509Certificate = x509CertificateArr[0];
            TrustAnchor findTrustAnchorBySubjectAndPublicKey = findTrustAnchorBySubjectAndPublicKey(x509Certificate);
            if (findTrustAnchorBySubjectAndPublicKey != null) {
                arrayList2.add(findTrustAnchorBySubjectAndPublicKey);
                hashSet.add(findTrustAnchorBySubjectAndPublicKey.getTrustedCert());
            } else {
                arrayList.add(x509Certificate);
            }
            hashSet.add(x509Certificate);
            return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str2, z, arrayList, arrayList2, hashSet);
        }
        throw new CertificateException(exc);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), true);
            return;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        getTrustedChainForServer(x509CertificateArr, str, sSLEngine);
    }
}
