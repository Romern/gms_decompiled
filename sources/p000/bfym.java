package p000;

import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: bfym */
final /* synthetic */ class bfym implements Runnable {

    /* renamed from: a */
    private final bfyq f115699a;

    public bfym(bfyq bfyq) {
        this.f115699a = bfyq;
    }

    public final void run() {
        bfyq bfyq = this.f115699a;
        if (!bfyq.f115727v.isEmpty()) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                bfxc.m98134c("ChreGeofenceHardware", "Waiting for CHRE message timed out.");
            }
            bfyq.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        }
    }
}
