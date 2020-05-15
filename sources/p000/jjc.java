package p000;

import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import java.lang.ref.WeakReference;

/* renamed from: jjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjc implements Runnable {

    /* renamed from: a */
    private final WeakReference f22605a;

    /* renamed from: b */
    private final String f22606b;

    public jjc(BleCentralChimeraService bleCentralChimeraService, String str) {
        this.f22605a = new WeakReference(bleCentralChimeraService);
        this.f22606b = str;
    }

    public final void run() {
        BleCentralChimeraService bleCentralChimeraService = (BleCentralChimeraService) this.f22605a.get();
        if (bleCentralChimeraService == null) {
            BleCentralChimeraService.f11094a.mo25418e("Service has been killed; cannot end active connection for device ID %s.", jkr.m16853a(this.f22606b));
        }
        bleCentralChimeraService.f11099f.remove(this.f22606b);
    }
}
