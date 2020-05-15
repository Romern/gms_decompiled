package p000;

import android.util.Log;

/* renamed from: bhau */
public final /* synthetic */ class bhau implements aubq {

    /* renamed from: a */
    public static final aubq f118213a = new bhau();

    private bhau() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b() && Log.isLoggable("WifiScanningPrePConsent", 6)) {
            Log.e("WifiScanningPrePConsent", "Exception writing audit record", aucb.mo50387e());
        }
    }
}
