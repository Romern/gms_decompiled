package p000;

import com.google.android.gms.auth.folsom.service.GcmReceiverChimeraService;

/* renamed from: jbm */
public final /* synthetic */ class jbm implements Runnable {

    /* renamed from: a */
    private final GcmReceiverChimeraService f22117a;

    public jbm(GcmReceiverChimeraService gcmReceiverChimeraService) {
        this.f22117a = gcmReceiverChimeraService;
    }

    public final void run() {
        GcmReceiverChimeraService gcmReceiverChimeraService = this.f22117a;
        gcmReceiverChimeraService.f10924a.mo13536a(gcmReceiverChimeraService.getApplicationContext(), true, 7);
    }
}
