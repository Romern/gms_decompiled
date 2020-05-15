package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdm */
public final /* synthetic */ class C1574mdm implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraActivity f33485a;

    public C1574mdm(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        this.f33485a = d2dSourceChimeraActivity;
    }

    public final void run() {
        this.f33485a.finishAndRemoveTask();
    }
}
