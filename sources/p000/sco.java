package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* renamed from: sco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sco extends dcj implements scq {
    public sco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final vzr getGoogleCertificates() {
        throw null;
    }

    public final vzr getGoogleReleaseCertificates() {
        throw null;
    }

    public final boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, googleCertificatesQuery);
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(5, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    public final boolean isGoogleReleaseSigned(String str, vzr vzr) {
        throw null;
    }

    public final boolean isGoogleSigned(String str, vzr vzr) {
        throw null;
    }
}
