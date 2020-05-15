package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: mea */
public final /* synthetic */ class mea implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraService f33501a;

    public mea(D2dSourceChimeraService d2dSourceChimeraService) {
        this.f33501a = d2dSourceChimeraService;
    }

    public final void run() {
        D2dSourceChimeraService d2dSourceChimeraService = this.f33501a;
        d2dSourceChimeraService.f29029c.mo19988e();
        d2dSourceChimeraService.f29029c = null;
    }
}
