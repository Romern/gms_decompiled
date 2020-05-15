package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdu */
public final /* synthetic */ class mdu implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33495a;

    public mdu(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33495a = d2dSourceChimeraActivity;
    }

    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33495a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        if (d2dSourceChimeraActivity.mo17225b()) {
            d2dSourceChimeraActivity.mo17230g();
        } else {
            d2dSourceChimeraActivity.mo17222a("copy_confirmation_fragment");
        }
    }
}
