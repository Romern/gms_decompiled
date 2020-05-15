package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: akqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrd f72465a;

    /* renamed from: b */
    final /* synthetic */ akrj f72466b;

    public akqs(akrj akrj, akrd akrd) {
        this.f72466b = akrj;
        this.f72465a = akrd;
    }

    public final void run() {
        akrj akrj = this.f72466b;
        if (akrj.f72502r != 0 && !akrj.mo39724a(0)) {
            this.f72466b.mo39726b(5);
            bmza b = bmza.m108659b(bmvy.f131119a);
            this.f72466b.f72497m.cancelAutoFocus();
            this.f72466b.f72497m.setPreviewCallbackWithBuffer(null);
            this.f72466b.f72497m.stopPreview();
            new Object[1][0] = Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS));
            this.f72466b.mo39728c(5);
            if (this.f72465a != null) {
                this.f72466b.f72489e.post(new akqr(this));
            }
        }
    }
}
