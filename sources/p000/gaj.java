package p000;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: gaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gaj implements qkb {

    /* renamed from: a */
    private final gai f17788a;

    public gaj(gai gai) {
        this.f17788a = gai;
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11594a(qkg qkg) {
        AppStateIntentChimeraService appStateIntentChimeraService = (AppStateIntentChimeraService) qkg;
        if (fzw.f17751b == null) {
            fzw.f17751b = new fzw();
        }
        fzw fzw = fzw.f17751b;
        try {
            SystemClock.elapsedRealtime();
            this.f17788a.mo11592a(appStateIntentChimeraService, fzw);
            SystemClock.elapsedRealtime();
        } catch (gid e) {
            Log.e("AppStateIntentService", "Auth error executing an operation: ", e);
        } catch (Throwable th) {
            fzw.mo11570a();
            throw th;
        }
        fzw.mo11570a();
    }
}
