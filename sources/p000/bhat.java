package p000;

import android.content.DialogInterface;
import com.google.android.location.settings.WifiScanningPrePConsentChimeraActivity;

/* renamed from: bhat */
public final /* synthetic */ class bhat implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final WifiScanningPrePConsentChimeraActivity f118212a;

    public bhat(WifiScanningPrePConsentChimeraActivity wifiScanningPrePConsentChimeraActivity) {
        this.f118212a = wifiScanningPrePConsentChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WifiScanningPrePConsentChimeraActivity wifiScanningPrePConsentChimeraActivity = this.f118212a;
        if (!wifiScanningPrePConsentChimeraActivity.isFinishing()) {
            wifiScanningPrePConsentChimeraActivity.finish();
        }
    }
}
