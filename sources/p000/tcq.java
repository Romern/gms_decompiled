package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tcq */
public final /* synthetic */ class tcq implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45652a;

    /* renamed from: b */
    private final tcy f45653b;

    public tcq(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45652a = constellationDebugChimeraActivity;
        this.f45653b = tcy;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45652a;
        tcy tcy = this.f45653b;
        constellationDebugChimeraActivity.mo17988a(false);
        new soa(9, new tce(constellationDebugChimeraActivity, tcy)).start();
    }
}
