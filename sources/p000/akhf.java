package p000;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/* renamed from: akhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhf {

    /* renamed from: a */
    public final KeyStore f71982a = m59681a();

    /* renamed from: a */
    private static KeyStore m59681a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            return instance;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to load AndroidKeyStore on device.");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo39444b(String str) {
        KeyStore keyStore = this.f71982a;
        if (keyStore != null) {
            keyStore.deleteEntry(str);
            return;
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot delete entry.");
    }

    /* renamed from: a */
    public final Certificate mo39443a(String str) {
        KeyStore keyStore = this.f71982a;
        if (keyStore != null) {
            return keyStore.getCertificate(str);
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot get certificate.");
    }
}
