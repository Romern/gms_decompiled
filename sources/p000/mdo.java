package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdo */
public final /* synthetic */ class mdo implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33488a;

    public mdo(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33488a = d2dSourceChimeraActivity;
    }

    public final void run() {
        this.f33488a.finishAndRemoveTask();
    }
}
