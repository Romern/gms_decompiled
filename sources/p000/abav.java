package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: abav */
public final /* synthetic */ class abav implements Observer {

    /* renamed from: a */
    private final HelpChimeraActivity f56964a;

    /* renamed from: b */
    private final aarn f56965b;

    public abav(HelpChimeraActivity helpChimeraActivity, aarn aarn) {
        this.f56964a = helpChimeraActivity;
        this.f56965b = aarn;
    }

    public final void update(Observable observable, Object obj) {
        this.f56965b.mo31653a(this.f56964a.f78967n);
    }
}
