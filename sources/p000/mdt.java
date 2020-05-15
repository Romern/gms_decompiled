package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdt */
public final /* synthetic */ class mdt implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33494a;

    public mdt(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33494a = d2dSourceChimeraActivity;
    }

    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33494a;
        lvn lvn = D2dSourceChimeraActivity.f29016a;
        if (d2dSourceChimeraActivity.mo17225b() || mna.m25357a(d2dSourceChimeraActivity)) {
            d2dSourceChimeraActivity.mo17231h();
        } else {
            d2dSourceChimeraActivity.mo17222a("lockscreen_fragment");
        }
    }
}
