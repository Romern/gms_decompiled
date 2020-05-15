package p000;

import android.os.Build;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

/* renamed from: agsf */
public final /* synthetic */ class agsf implements Runnable {

    /* renamed from: a */
    private final agsl f66353a;

    public agsf(agsl agsl) {
        this.f66353a = agsl;
    }

    public final void run() {
        agsl agsl = this.f66353a;
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68425a("%s: moduleInitialized: workflow:%b. cellular monitor:%b", "BgTaskManager", Boolean.valueOf(cflr.m139935l()), Boolean.valueOf(cflr.m139929f()));
        int c = agrl.m54949c();
        if (cflr.m139935l()) {
            ChimeraPeriodicUpdaterService.m67292c(agsl.f66365c);
        }
        if (cflr.m139929f()) {
            int i = Build.VERSION.SDK_INT;
            agse.m55045a(agsl.f66365c);
        }
        agsl.mo36054a(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_MODULE_INITIALIZED, c);
        if (agsl.m55047c()) {
            agsl.mo36054a(bxzv.TASK_HTTP_CPID_FETCH, bxzu.EVENT_MODULE_INITIALIZED, c);
        } else {
            agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: moduleInitialized: no active SIM needs CPID", "BgTaskManager");
        }
    }
}
