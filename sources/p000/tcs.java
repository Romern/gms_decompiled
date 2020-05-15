package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tcs */
public final /* synthetic */ class tcs implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45655a;

    /* renamed from: b */
    private final sxs f45656b;

    public tcs(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, sxs sxs) {
        this.f45655a = constellationDebugChimeraActivity;
        this.f45656b = sxs;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45655a;
        sxs sxs = this.f45656b;
        constellationDebugChimeraActivity.mo17988a(false);
        Bundle bundle = new Bundle();
        bundle.putString("policy_id", "hint");
        aucb a = sxs.mo26222a(bundle);
        a.mo50373a(new tca(constellationDebugChimeraActivity));
        a.mo50372a(new tcb(constellationDebugChimeraActivity));
    }
}
