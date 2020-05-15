package p000;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: qdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class qdj extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f40983a;

    public qdj(X509Certificate x509Certificate) {
        this.f40983a = x509Certificate;
    }

    public void checkValidity() {
        this.f40983a.checkValidity();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        qdj qdj = (qdj) obj;
        X509Certificate x509Certificate = this.f40983a;
        if (x509Certificate == null) {
            if (qdj.f40983a != null) {
                return false;
            }
        } else if (!x509Certificate.equals(qdj.f40983a)) {
            return false;
        }
        return true;
    }

    public final int getBasicConstraints() {
        return this.f40983a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f40983a.getCriticalExtensionOIDs();
    }

    public final byte[] getEncoded() {
        return this.f40983a.getEncoded();
    }

    public final List getExtendedKeyUsage() {
        return this.f40983a.getExtendedKeyUsage();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f40983a.getExtensionValue(str);
    }

    public final Collection getIssuerAlternativeNames() {
        return this.f40983a.getIssuerAlternativeNames();
    }

    public final Principal getIssuerDN() {
        return this.f40983a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f40983a.getIssuerUniqueID();
    }

    public final X500Principal getIssuerX500Principal() {
        return this.f40983a.getIssuerX500Principal();
    }

    public final boolean[] getKeyUsage() {
        return this.f40983a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f40983a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f40983a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f40983a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f40983a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f40983a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f40983a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f40983a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f40983a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f40983a.getSignature();
    }

    public final Collection getSubjectAlternativeNames() {
        return this.f40983a.getSubjectAlternativeNames();
    }

    public final Principal getSubjectDN() {
        return this.f40983a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f40983a.getSubjectUniqueID();
    }

    public final X500Principal getSubjectX500Principal() {
        return this.f40983a.getSubjectX500Principal();
    }

    public final byte[] getTBSCertificate() {
        return this.f40983a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f40983a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f40983a.hasUnsupportedCriticalExtension();
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        X509Certificate x509Certificate = this.f40983a;
        return hashCode + (x509Certificate != null ? x509Certificate.hashCode() : 0);
    }

    public final String toString() {
        return this.f40983a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f40983a.verify(publicKey);
    }

    public void checkValidity(Date date) {
        this.f40983a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f40983a.verify(publicKey, str);
    }
}
