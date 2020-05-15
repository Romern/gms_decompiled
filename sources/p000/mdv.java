package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdv */
public final /* synthetic */ class mdv implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33496a;

    public mdv(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33496a = d2dSourceChimeraActivity;
    }

    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33496a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        if (d2dSourceChimeraActivity.mo17225b()) {
            d2dSourceChimeraActivity.mo17222a("connecting_fragment");
        } else {
            d2dSourceChimeraActivity.mo17222a("connected_fragment");
        }
    }
}
