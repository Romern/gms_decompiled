package p000;

import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;

/* renamed from: abhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abhj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity f57480a;

    public abhj(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.f57480a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    public final void run() {
        this.f57480a.setResult(2);
    }
}
