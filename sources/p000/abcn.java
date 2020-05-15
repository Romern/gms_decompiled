package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abcn */
final /* synthetic */ class abcn implements Runnable {

    /* renamed from: a */
    private final HelpChimeraActivity f57037a;

    public abcn(HelpChimeraActivity helpChimeraActivity) {
        this.f57037a = helpChimeraActivity;
    }

    public final void run() {
        this.f57037a.onBackPressed();
    }
}
