package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tcd */
public final /* synthetic */ class tcd implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45632a;

    /* renamed from: b */
    private final tcy f45633b;

    public tcd(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45632a = constellationDebugChimeraActivity;
        this.f45633b = tcy;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45632a;
        tcy tcy = this.f45633b;
        constellationDebugChimeraActivity.mo17988a(false);
        new soa(9, new tcn(constellationDebugChimeraActivity, tcy)).start();
    }
}
