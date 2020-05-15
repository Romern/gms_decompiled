package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TrustedCertificateIndex {
    private final Map subjectToTrustAnchors = new HashMap();

    public TrustedCertificateIndex() {
    }

    private static TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate, Collection collection) {
        PublicKey publicKey;
        PublicKey publicKey2 = x509Certificate.getPublicKey();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            try {
                X509Certificate trustedCert = trustAnchor.getTrustedCert();
                if (trustedCert == null) {
                    publicKey = trustAnchor.getCAPublicKey();
                } else {
                    publicKey = trustedCert.getPublicKey();
                }
                if (!publicKey.equals(publicKey2)) {
                    if ("X.509".equals(publicKey.getFormat()) && "X.509".equals(publicKey2.getFormat())) {
                        byte[] encoded = publicKey.getEncoded();
                        byte[] encoded2 = publicKey2.getEncoded();
                        if (!(encoded2 == null || encoded == null || !Arrays.equals(encoded, encoded2))) {
                        }
                    }
                }
                return trustAnchor;
            } catch (Exception e) {
            }
        }
        return null;
    }

    private void index(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            index((TrustAnchor) it.next());
        }
    }

    public Set findAllByIssuerAndSignature(X509Certificate x509Certificate) {
        PublicKey publicKey;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = (List) this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list != null) {
                HashSet hashSet = new HashSet();
                for (TrustAnchor trustAnchor : list) {
                    try {
                        X509Certificate trustedCert = trustAnchor.getTrustedCert();
                        if (trustedCert == null) {
                            publicKey = trustAnchor.getCAPublicKey();
                        } else {
                            publicKey = trustedCert.getPublicKey();
                        }
                        if (publicKey != null) {
                            x509Certificate.verify(publicKey);
                            hashSet.add(trustAnchor);
                        }
                    } catch (Exception e) {
                    }
                }
                return hashSet;
            }
            Set emptySet = Collections.emptySet();
            return emptySet;
        }
    }

    public TrustAnchor findByIssuerAndSignature(X509Certificate x509Certificate) {
        PublicKey publicKey;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = (List) this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list == null) {
                return null;
            }
            for (TrustAnchor trustAnchor : list) {
                try {
                    X509Certificate trustedCert = trustAnchor.getTrustedCert();
                    if (trustedCert == null) {
                        publicKey = trustAnchor.getCAPublicKey();
                    } else {
                        publicKey = trustedCert.getPublicKey();
                    }
                    x509Certificate.verify(publicKey);
                    return trustAnchor;
                } catch (Exception e) {
                }
            }
            return null;
        }
    }

    public void reset() {
        synchronized (this.subjectToTrustAnchors) {
            this.subjectToTrustAnchors.clear();
        }
    }

    public TrustAnchor index(X509Certificate x509Certificate) {
        TrustAnchor trustAnchor = new TrustAnchor(x509Certificate, null);
        index(trustAnchor);
        return trustAnchor;
    }

    public void reset(Set set) {
        synchronized (this.subjectToTrustAnchors) {
            reset();
            index(set);
        }
    }

    public TrustedCertificateIndex(Set set) {
        index(set);
    }

    public void index(TrustAnchor trustAnchor) {
        X500Principal x500Principal;
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        if (trustedCert != null) {
            x500Principal = trustedCert.getSubjectX500Principal();
        } else {
            x500Principal = trustAnchor.getCA();
        }
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = (List) this.subjectToTrustAnchors.get(x500Principal);
            if (list == null) {
                list = new ArrayList(1);
                this.subjectToTrustAnchors.put(x500Principal, list);
            } else if (trustedCert != null) {
                for (TrustAnchor trustAnchor2 : list) {
                    if (trustedCert.equals(trustAnchor2.getTrustedCert())) {
                        return;
                    }
                }
            }
            list.add(trustAnchor);
        }
    }

    public TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List list = (List) this.subjectToTrustAnchors.get(subjectX500Principal);
            if (list == null) {
                return null;
            }
            TrustAnchor findBySubjectAndPublicKey = findBySubjectAndPublicKey(x509Certificate, list);
            return findBySubjectAndPublicKey;
        }
    }
}
