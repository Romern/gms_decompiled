package p000;

import android.hardware.location.ContextHubClient;

/* renamed from: bflr */
final /* synthetic */ class bflr implements Runnable {

    /* renamed from: a */
    private final bflv f114367a;

    public bflr(bflv bflv) {
        this.f114367a = bflv;
    }

    public final void run() {
        bflv bflv = this.f114367a;
        ContextHubClient contextHubClient = bflv.f114377e;
        if (contextHubClient != null) {
            contextHubClient.close();
            bflv.f114377e = null;
        }
        bflv.f114375c = false;
    }
}
