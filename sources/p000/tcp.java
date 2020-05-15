package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tcp */
public final /* synthetic */ class tcp implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45650a;

    /* renamed from: b */
    private final tcy f45651b;

    public tcp(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45650a = constellationDebugChimeraActivity;
        this.f45651b = tcy;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45650a;
        tcy tcy = this.f45651b;
        constellationDebugChimeraActivity.mo17988a(false);
        new soa(9, new tci(constellationDebugChimeraActivity, tcy)).start();
    }
}
