package p000;

import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: qcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcc extends qdj {
    public qcc(X509Certificate x509Certificate) {
        super(x509Certificate);
    }

    public final void checkValidity() {
    }

    public final void checkValidity(Date date) {
    }

    public final Date getNotAfter() {
        return new Date(9223372036854775806L);
    }

    public final Date getNotBefore() {
        return new Date(1);
    }
}
