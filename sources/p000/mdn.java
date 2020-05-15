package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdn */
public final /* synthetic */ class mdn implements Runnable {

    /* renamed from: a */
    private final boolean f33486a;

    /* renamed from: b */
    private final mga f33487b;

    public mdn(mga mga, boolean z) {
        this.f33487b = mga;
        this.f33486a = z;
    }

    public final void run() {
        mga mga = this.f33487b;
        boolean z = this.f33486a;
        D2dSourceChimeraActivity d2dSourceChimeraActivity = mga.f33612a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        if (!z) {
            d2dSourceChimeraActivity.mo17222a("waiting_fragment");
        } else {
            d2dSourceChimeraActivity.mo17222a("waiting_fragment");
        }
    }
}
