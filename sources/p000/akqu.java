package p000;

import android.hardware.Camera;

/* renamed from: akqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrj f72468a;

    /* renamed from: b */
    final /* synthetic */ akqv f72469b;

    public akqu(akrj akrj, akqv akqv) {
        this.f72468a = akrj;
        this.f72469b = akqv;
    }

    public final void run() {
        String str;
        akrj akrj = this.f72468a;
        int i = akrj.f72502r;
        if (i != 0 && i != 3) {
            Camera camera = akrj.f72497m;
            akqv akqv = this.f72469b;
            Camera.Parameters parameters = camera.getParameters();
            if (!akqv.f72470a) {
                str = "off";
            } else {
                str = "torch";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }
}
