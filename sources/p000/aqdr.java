package p000;

import android.content.ComponentName;
import com.google.android.gms.security.snet.SnetChimeraService;
import com.google.android.gms.security.snet.SnetLaunchChimeraIntentService;
import com.google.android.gms.security.snet.SnetLaunchInProcessChimeraIntentService;
import com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService;

/* renamed from: aqdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SnetChimeraService f85785a;

    public aqdr(SnetChimeraService snetChimeraService) {
        this.f85785a = snetChimeraService;
    }

    public final void run() {
        ComponentName componentName;
        try {
            this.f85785a.mo58940a();
            if (this.f85785a.f107563c.mo47201a() || cgkt.m145938j()) {
                apyq apyq = apyq.f85174b;
                this.f85785a.mo58943b();
                if (cgkt.m145944p()) {
                    SnetChimeraService snetChimeraService = this.f85785a;
                    componentName = SnetLaunchInProcessChimeraIntentService.m92435a(snetChimeraService, snetChimeraService.f107564d, snetChimeraService.f107566f, snetChimeraService.f107568h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR", apyq, snetChimeraService.f107569i);
                } else {
                    SnetChimeraService snetChimeraService2 = this.f85785a;
                    componentName = SnetLaunchChimeraIntentService.m92432a(snetChimeraService2, null, null, 0, snetChimeraService2.f107564d, snetChimeraService2.f107566f, snetChimeraService2.f107568h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR", null, apyq, bnon.f131923a, this.f85785a.f107569i);
                }
                if (componentName != null) {
                    SnetChimeraService snetChimeraService3 = this.f85785a;
                    SnetWatchdogChimeraIntentService.m92440a(snetChimeraService3, snetChimeraService3.f107564d, snetChimeraService3.f107566f, snetChimeraService3.f107568h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
                }
                this.f85785a.mo58942a(false);
                return;
            }
            this.f85785a.mo58942a(false);
        } catch (Throwable th) {
            this.f85785a.mo58942a(false);
            throw th;
        }
    }
}
