package p000;

import com.google.android.gms.auth.api.credentials.yolo.p023ui.AutoSignInWarmWelcomeChimeraService;

/* renamed from: hsq */
public final /* synthetic */ class hsq implements Runnable {

    /* renamed from: a */
    private final AutoSignInWarmWelcomeChimeraService f20377a;

    public hsq(AutoSignInWarmWelcomeChimeraService autoSignInWarmWelcomeChimeraService) {
        this.f20377a = autoSignInWarmWelcomeChimeraService;
    }

    public final void run() {
        suu suu = this.f20377a.f10148a;
        synchronized (suu) {
            suu.mo26137c();
        }
        suu.mo26138d();
    }
}
