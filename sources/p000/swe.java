package p000;

import com.google.android.gms.config.ConfigChimeraService;

/* renamed from: swe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConfigChimeraService f45258a;

    public swe(ConfigChimeraService configChimeraService) {
        this.f45258a = configChimeraService;
    }

    public final void run() {
        this.f45258a.mo17950a();
        synchronized (this.f45258a.f30440j) {
            ConfigChimeraService configChimeraService = this.f45258a;
            configChimeraService.f30439i = false;
            configChimeraService.f30440j.notifyAll();
        }
    }
}
