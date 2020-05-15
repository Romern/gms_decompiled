package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService;

/* renamed from: aspk */
public final /* synthetic */ class aspk implements Runnable {

    /* renamed from: a */
    private final TapAndPayGcmTaskChimeraService f89358a;

    public aspk(TapAndPayGcmTaskChimeraService tapAndPayGcmTaskChimeraService) {
        this.f89358a = tapAndPayGcmTaskChimeraService;
    }

    public final void run() {
        TapAndPayGcmTaskChimeraService tapAndPayGcmTaskChimeraService = this.f89358a;
        Context applicationContext = tapAndPayGcmTaskChimeraService.getApplicationContext();
        if (asjw.m74259d(applicationContext)) {
            TapAndPayGcmTaskChimeraService.m93028a(applicationContext, tapAndPayGcmTaskChimeraService.f108500c);
        }
    }
}
