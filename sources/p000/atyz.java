package p000;

import com.google.android.gms.tapandpay.wear.WearProxyCompanionChimeraActivity;

/* renamed from: atyz */
public final /* synthetic */ class atyz implements Runnable {

    /* renamed from: a */
    private final WearProxyCompanionChimeraActivity f91187a;

    public atyz(WearProxyCompanionChimeraActivity wearProxyCompanionChimeraActivity) {
        this.f91187a = wearProxyCompanionChimeraActivity;
    }

    public final void run() {
        WearProxyCompanionChimeraActivity wearProxyCompanionChimeraActivity = this.f91187a;
        if (!wearProxyCompanionChimeraActivity.isFinishing() && !wearProxyCompanionChimeraActivity.isDestroyed()) {
            wearProxyCompanionChimeraActivity.finish();
        }
    }
}
