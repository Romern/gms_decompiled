package p000;

import com.google.android.gms.update.ChimeraUpdateFromSdCardService;

/* renamed from: avjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardService f93285a;

    public avjx(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        this.f93285a = chimeraUpdateFromSdCardService;
    }

    public final void run() {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.f93285a;
        int i = chimeraUpdateFromSdCardService.f109441a.f109453b;
        int i2 = chimeraUpdateFromSdCardService.f109442b;
        if (this.f93285a.f109442b == 4 || this.f93285a.f109442b == 1040) {
            if (i == 0) {
                this.f93285a.f109442b = 4;
            } else if (i == 2 || i == 1) {
                this.f93285a.f109442b = 1040;
            }
        }
        if (i2 != this.f93285a.f109442b) {
            this.f93285a.mo59655a();
        }
    }
}
