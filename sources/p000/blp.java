package p000;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: blp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class blp extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f5114a;

    public blp(X509Certificate x509Certificate) {
        this.f5114a = x509Certificate;
    }

    public final void checkValidity() {
        this.f5114a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f5114a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f5114a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return this.f5114a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f5114a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f5114a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f5114a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f5114a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f5114a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f5114a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f5114a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f5114a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f5114a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f5114a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f5114a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f5114a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f5114a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f5114a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f5114a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() {
        return this.f5114a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f5114a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f5114a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f5114a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f5114a.verify(publicKey);
    }

    public final void checkValidity(Date date) {
        this.f5114a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f5114a.verify(publicKey, str);
    }
}
