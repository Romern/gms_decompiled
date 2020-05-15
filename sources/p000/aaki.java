package p000;

import android.content.Intent;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: aaki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaki implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f28358a;

    /* renamed from: b */
    final /* synthetic */ GcmChimeraService f28359b;

    public aaki(GcmChimeraService gcmChimeraService, Intent intent) {
        this.f28359b = gcmChimeraService;
        this.f28358a = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if ((p000.cecz.m136059g() & 1) != 0) goto L_0x005d;
     */
    public final void run() {
        String str;
        GcmChimeraService gcmChimeraService = this.f28359b;
        Intent intent = this.f28358a;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("com.google.android.gcm.intent.USER_UNLOCKED".equals(str)) {
            aytw.m84814b();
            if (aakb.m21382b()) {
                if (gcmChimeraService.f32793e.mo17093a()) {
                    gcmChimeraService.f32793e.mo17088a(30);
                }
                aakb a = aakb.m21381a();
                if (aakb.m21382b()) {
                    a.f28345f.mo16917c();
                }
            }
        }
        synchronized (gcmChimeraService) {
            if (!aytw.m84813a(gcmChimeraService)) {
                if ((cecz.m136059g() & 2) == 0) {
                    aamd aamd = gcmChimeraService.f32796h;
                    if (aamd != null) {
                        aamd.mo17009b();
                        gcmChimeraService.f32796h = null;
                    }
                }
            }
            if (gcmChimeraService.f32796h == null) {
                gcmChimeraService.f32796h = new aamd(gcmChimeraService);
            }
            gcmChimeraService.f32796h.mo17008a();
        }
        if (intent != null) {
            gcmChimeraService.f32792d.mo17125c();
        } else {
            gcmChimeraService.f32792d.mo17123b();
        }
    }
}
