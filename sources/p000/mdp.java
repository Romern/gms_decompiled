package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdp */
public final /* synthetic */ class mdp implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33489a;

    public mdp(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33489a = d2dSourceChimeraActivity;
    }

    public final void run() {
        this.f33489a.finishAndRemoveTask();
    }
}
