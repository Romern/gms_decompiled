package p000;

import android.app.ActivityOptions;
import android.util.Pair;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajov */
public final /* synthetic */ class ajov implements ajhd {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71075a;

    public ajov(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71075a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo38630a() {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71075a;
        receiveSurfaceChimeraActivity.startActivityForResult(SetupChimeraActivity.m67552a(receiveSurfaceChimeraActivity), 1000, ActivityOptions.makeSceneTransitionAnimation(receiveSurfaceChimeraActivity.getContainerActivity(), new Pair(receiveSurfaceChimeraActivity.f70617e, "card")).toBundle());
    }
}
