package p000;

import android.location.GpsStatus;

/* renamed from: bhbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhbq implements GpsStatus.Listener {

    /* renamed from: a */
    final /* synthetic */ bhbr f118269a;

    public bhbq(bhbr bhbr) {
        this.f118269a = bhbr;
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            try {
                bhbr bhbr = this.f118269a;
                bhbr.f118274d = bhbr.f118271a.getGpsStatus(bhbr.f118274d);
            } catch (NullPointerException e) {
                this.f118269a.f118274d = null;
            }
            bhbr bhbr2 = this.f118269a;
            GpsStatus gpsStatus = bhbr2.f118274d;
            if (gpsStatus != null) {
                bhbr2.mo63530a(new bhbj(gpsStatus));
            }
        }
    }
}
