package p000;

import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: abgg */
public final /* synthetic */ class abgg implements Observer {

    /* renamed from: a */
    private final GoogleHelpChimeraService f57402a;

    /* renamed from: b */
    private final aarn f57403b;

    public abgg(GoogleHelpChimeraService googleHelpChimeraService, aarn aarn) {
        this.f57402a = googleHelpChimeraService;
        this.f57403b = aarn;
    }

    public final void update(Observable observable, Object obj) {
        this.f57403b.mo31653a(this.f57402a.f79002j);
    }
}
