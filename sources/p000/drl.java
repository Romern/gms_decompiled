package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: drl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContextData f13880a;

    /* renamed from: b */
    final /* synthetic */ drm f13881b;

    public drl(drm drm, ContextData contextData) {
        this.f13881b = drm;
        this.f13880a = contextData;
    }

    public final void run() {
        this.f13881b.mo9500b(this.f13880a);
    }
}
