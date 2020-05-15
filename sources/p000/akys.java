package p000;

import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;

/* renamed from: akys */
public final /* synthetic */ class akys implements aubw {

    /* renamed from: a */
    private final OctarineWebviewChimeraActivity f73138a;

    /* renamed from: b */
    private final Runnable f73139b;

    public akys(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity, Runnable runnable) {
        this.f73138a = octarineWebviewChimeraActivity;
        this.f73139b = runnable;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this.f73138a;
        Runnable runnable = this.f73139b;
        Void voidR = (Void) obj;
        octarineWebviewChimeraActivity.mo44772i();
        if (runnable != null && cfri.m142691b()) {
            runnable.run();
        }
    }
}
