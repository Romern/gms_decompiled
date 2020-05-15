package p000;

import android.content.Intent;
import com.google.android.location.reporting.service.DispatchingChimeraService;

/* renamed from: bgxb */
public final /* synthetic */ class bgxb implements Runnable {

    /* renamed from: a */
    private final DispatchingChimeraService f117884a;

    /* renamed from: b */
    private final int f117885b;

    /* renamed from: c */
    private final Intent f117886c;

    public bgxb(DispatchingChimeraService dispatchingChimeraService, int i, Intent intent) {
        this.f117884a = dispatchingChimeraService;
        this.f117885b = i;
        this.f117886c = intent;
    }

    public final void run() {
        DispatchingChimeraService dispatchingChimeraService = this.f117884a;
        int i = this.f117885b;
        Intent intent = this.f117886c;
        bgxx bgxx = dispatchingChimeraService.f150876b;
        if (bgxx == null) {
            dispatchingChimeraService.stopSelf(i);
        } else {
            bgxx.mo63334a(intent, i);
        }
    }
}
