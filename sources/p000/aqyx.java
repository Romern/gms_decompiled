package p000;

import android.os.Looper;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;

/* renamed from: aqyx */
public final /* synthetic */ class aqyx implements Runnable {

    /* renamed from: a */
    private final CleanSharedSecretChimeraService f87131a;

    public aqyx(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.f87131a = cleanSharedSecretChimeraService;
    }

    public final void run() {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.f87131a;
        if (CleanSharedSecretChimeraService.m92621b()) {
            new arly(cleanSharedSecretChimeraService, new adzt(Looper.getMainLooper())).mo48622b().mo50373a(new aqyy(cleanSharedSecretChimeraService));
        }
        new aqzy(cleanSharedSecretChimeraService).mo48314a().mo50373a(new aqyz(cleanSharedSecretChimeraService));
        if (new arqc(cleanSharedSecretChimeraService).mo48327a() != null) {
            CleanSharedSecretChimeraService.m92620b(cleanSharedSecretChimeraService);
        }
    }
}
