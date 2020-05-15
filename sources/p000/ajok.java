package p000;

import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajok */
public final /* synthetic */ class ajok implements Runnable {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71062a;

    public ajok(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71062a = receiveSurfaceChimeraActivity;
    }

    public final void run() {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71062a;
        receiveSurfaceChimeraActivity.invalidateOptionsMenu();
        receiveSurfaceChimeraActivity.f80937i.animate().alpha(1.0f).setDuration(250);
    }
}
