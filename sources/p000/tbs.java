package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tbs */
public final /* synthetic */ class tbs implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45620a;

    /* renamed from: b */
    private final tcy f45621b;

    public tbs(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45620a = constellationDebugChimeraActivity;
        this.f45621b = tcy;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45620a;
        tcy tcy = this.f45621b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        constellationDebugChimeraActivity.f30582d.mo26401a(randomUUID, 3);
        constellationDebugChimeraActivity.mo17988a(false);
        sxt.m36563a();
        sxt.m36564a(constellationDebugChimeraActivity.getApplicationContext(), randomUUID, 6, Bundle.EMPTY, constellationDebugChimeraActivity.f30584f, constellationDebugChimeraActivity.f30583e, tcy);
    }
}
