package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: akqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akqw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrj f72471a;

    public akqw(akrj akrj) {
        this.f72471a = akrj;
    }

    public final void run() {
        this.f72471a.mo39726b(5);
        bmza b = bmza.m108659b(bmvy.f131119a);
        this.f72471a.f72497m.cancelAutoFocus();
        this.f72471a.f72497m.setPreviewCallbackWithBuffer(null);
        akrj akrj = this.f72471a;
        akrj.f72497m.takePicture(null, null, null, new akrg(akrj));
        new Object[1][0] = Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS));
        this.f72471a.mo39728c(5);
    }
}
