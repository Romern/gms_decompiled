package p000;

import android.net.SSLCertificateSocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: rqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rqu {

    /* renamed from: a */
    public static final sek f43532a = new sek("Auth", "ReflectiveChannelBinder");

    /* renamed from: b */
    public final SSLSocketFactory f43533b;

    public rqu(SSLSocketFactory sSLSocketFactory) {
        sdo.m34959a(sSLSocketFactory);
        this.f43533b = sSLSocketFactory;
        if (sSLSocketFactory instanceof SSLCertificateSocketFactory) {
            f43532a.mo25412b("Using android.net.SSLCertificateSocketFactory", new Object[0]);
        }
        if (this.f43533b instanceof apto) {
            f43532a.mo25412b("Using conscrypt SSLCertificateSocketFactory", new Object[0]);
        }
    }
}
