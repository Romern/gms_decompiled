package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tco */
public final /* synthetic */ class tco implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45648a;

    /* renamed from: b */
    private final tcy f45649b;

    public tco(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45648a = constellationDebugChimeraActivity;
        this.f45649b = tcy;
    }

    public void onClick(View view) {
        new soa(9, new tcm(this.f45648a, this.f45649b)).start();
    }
}
