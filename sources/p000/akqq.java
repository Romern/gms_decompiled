package p000;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: akqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrj f72463a;

    public akqq(akrj akrj) {
        this.f72463a = akrj;
    }

    public final void run() {
        if (!this.f72463a.mo39724a(4)) {
            Log.w("SimpleCameraManager", "Unexpected camera state. Will not start preview.");
            return;
        }
        bmza b = bmza.m108659b(bmvy.f131119a);
        akrj akrj = this.f72463a;
        akrj.f72497m.setPreviewCallbackWithBuffer(new akrh(akrj));
        this.f72463a.f72497m.startPreview();
        new Object[1][0] = Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS));
        this.f72463a.mo39728c(4);
    }
}
