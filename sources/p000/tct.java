package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tct */
public final /* synthetic */ class tct implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45657a;

    /* renamed from: b */
    private final sxs f45658b;

    public tct(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, sxs sxs) {
        this.f45657a = constellationDebugChimeraActivity;
        this.f45658b = sxs;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45657a;
        sxs sxs = this.f45658b;
        constellationDebugChimeraActivity.mo17988a(false);
        Bundle bundle = new Bundle();
        bundle.putString("policy_id", "test_app_mt");
        bundle.putString("package_name", "com.google.android.gms");
        roz b = rpa.m34196b();
        b.f43472a = new sxr(bundle);
        b.f43473b = new Feature[]{sxu.f45399b};
        aucb a = sxs.mo24701a(b.mo24977a());
        a.mo50373a(new tby(constellationDebugChimeraActivity));
        a.mo50372a(new tbz(constellationDebugChimeraActivity));
    }
}
