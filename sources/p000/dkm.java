package p000;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: dkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class dkm extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f13417a;

    public dkm(X509Certificate x509Certificate) {
        this.f13417a = x509Certificate;
    }

    public final void checkValidity() {
        this.f13417a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f13417a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f13417a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return this.f13417a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f13417a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f13417a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f13417a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f13417a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f13417a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f13417a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f13417a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f13417a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f13417a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f13417a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f13417a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f13417a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f13417a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f13417a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f13417a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() {
        return this.f13417a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f13417a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f13417a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f13417a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f13417a.verify(publicKey);
    }

    public final void checkValidity(Date date) {
        this.f13417a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f13417a.verify(publicKey, str);
    }
}
