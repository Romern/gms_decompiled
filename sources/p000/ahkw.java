package p000;

import android.os.Build;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ahkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkw {

    /* renamed from: a */
    public final KeyStore f67410a = m56074b();

    /* renamed from: b */
    private static KeyStore m56074b() {
        if (!cfnv.m140801y()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            return instance;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahkw", "b", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load AndroidKeyStore on device.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Certificate mo36748a(String str) {
        KeyStore keyStore = this.f67410a;
        if (keyStore != null) {
            return keyStore.getCertificate(str);
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot get certificate.");
    }

    /* renamed from: a */
    public final void mo36749a() {
        KeyStore keyStore = this.f67410a;
        if (keyStore != null) {
            try {
                ArrayList list = Collections.list(keyStore.aliases());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) list.get(i);
                    if (str.startsWith("nearby.connections")) {
                        try {
                            this.f67410a.deleteEntry(str);
                        } catch (KeyStoreException e) {
                        }
                    }
                }
            } catch (IllegalStateException | KeyStoreException e2) {
            }
        }
    }
}
