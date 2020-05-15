package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdr */
public final /* synthetic */ class mdr implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33491a;

    public mdr(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33491a = d2dSourceChimeraActivity;
    }

    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33491a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        if (d2dSourceChimeraActivity.mo17226c()) {
            d2dSourceChimeraActivity.mo17222a("connected_fragment");
        }
    }
}
