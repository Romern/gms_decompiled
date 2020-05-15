package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: abam */
public final /* synthetic */ class abam implements Observer {

    /* renamed from: a */
    private final Runnable f56946a;

    public abam(Runnable runnable) {
        this.f56946a = runnable;
    }

    public final void update(Observable observable, Object obj) {
        Runnable runnable = this.f56946a;
        String str = HelpChimeraActivity.f78944b;
        runnable.run();
    }
}
