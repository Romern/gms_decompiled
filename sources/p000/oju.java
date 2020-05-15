package p000;

import android.content.Context;
import java.security.Provider;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Iterator;
import java.util.Set;

/* renamed from: oju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oju {

    /* renamed from: a */
    private static final bnsn f37806a = odk.m28481a("CAR.GAL.SECURITY");

    /* renamed from: b */
    private static oju f37807b;

    /* renamed from: c */
    private Boolean f37808c;

    private oju() {
    }

    /* renamed from: a */
    public static synchronized oju m28959a() {
        oju oju;
        synchronized (oju.class) {
            if (f37807b == null) {
                f37807b = new oju();
            }
            oju = f37807b;
        }
        return oju;
    }

    /* renamed from: b */
    private final void m28961b(Context context) {
        try {
            aptm.m70976a(context);
        } catch (rfw e) {
        } catch (rfv e2) {
            bnsi b = f37806a.mo68387b();
            b.mo68437a(e2);
            b.mo68432a("oju", "b", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("GMS not available!");
        }
    }

    /* renamed from: b */
    public final synchronized Boolean mo22227b() {
        return this.f37808c;
    }

    /* renamed from: a */
    static final boolean m28960a(Set set) {
        for (Provider provider : Security.getProviders()) {
            provider.toString();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase("AES/CBC/PKCS5Padding")) {
                try {
                    CertificateFactory.getInstance("X.509");
                    return true;
                } catch (CertificateException e) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo22226a(Context context) {
        if (this.f37808c == null) {
            try {
                aptm.m70976a(context);
            } catch (rfw e) {
            } catch (rfv e2) {
                bnsi b = f37806a.mo68387b();
                b.mo68437a(e2);
                b.mo68432a("oju", "b", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("GMS not available!");
            }
            this.f37808c = Boolean.valueOf(m28960a(Security.getAlgorithms("Cipher")));
        }
        return this.f37808c.booleanValue();
    }
}
