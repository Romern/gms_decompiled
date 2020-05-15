package p000;

import android.os.IInterface;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* renamed from: scq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface scq extends IInterface {
    vzr getGoogleCertificates();

    vzr getGoogleReleaseCertificates();

    boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, vzr vzr);

    boolean isGoogleReleaseSigned(String str, vzr vzr);

    boolean isGoogleSigned(String str, vzr vzr);
}
