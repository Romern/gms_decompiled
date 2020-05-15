package p000;

import com.google.android.gms.growth.p048ui.webview.GrowthWebViewChimeraActivity;

/* renamed from: abkp */
public final /* synthetic */ class abkp implements Runnable {

    /* renamed from: a */
    private final GrowthWebViewChimeraActivity f57631a;

    public abkp(GrowthWebViewChimeraActivity growthWebViewChimeraActivity) {
        this.f57631a = growthWebViewChimeraActivity;
    }

    public final void run() {
        GrowthWebViewChimeraActivity growthWebViewChimeraActivity = this.f57631a;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        growthWebViewChimeraActivity.runOnUiThread(new abkq(growthWebViewChimeraActivity));
    }
}
