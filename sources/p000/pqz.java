package p000;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: pqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqz {

    /* renamed from: a */
    public final CertificateFactory f40087a;

    private pqz() {
        try {
            this.f40087a = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static final PKIXCertPathValidatorResult m31042a(CertPath certPath, long j, Set set) {
        try {
            CertPathValidator instance = CertPathValidator.getInstance("PKIX");
            PKIXParameters pKIXParameters = new PKIXParameters(set);
            pKIXParameters.setDate(new Date(j));
            pKIXParameters.setRevocationEnabled(false);
            return (PKIXCertPathValidatorResult) instance.validate(certPath, pKIXParameters);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static final MessageDigest m31045b() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public static final Signature m31046c() {
        try {
            return Signature.getInstance("SHA256WithRSA");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    private static X509Certificate m31043a(Certificate certificate) {
        if (certificate != null) {
            return (X509Certificate) certificate;
        }
        throw new CertificateException("Certificate can not be null.");
    }

    /* renamed from: a */
    public static pqz m31044a() {
        return new pqz();
    }

    /* renamed from: a */
    public final X509Certificate mo23569a(byte[] bArr) {
        return m31043a(this.f40087a.generateCertificate(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: a */
    public final Set mo23570a(List list) {
        try {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(new TrustAnchor(m31043a(this.f40087a.generateCertificate(new ByteArrayInputStream(((String) it.next()).getBytes("UTF-8")))), null));
            }
            return hashSet;
        } catch (UnsupportedEncodingException | CertificateException e) {
            throw new AssertionError("Failed to build a trust store.");
        }
    }
}
