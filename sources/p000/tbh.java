package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tbh */
public final /* synthetic */ class tbh implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45608a;

    /* renamed from: b */
    private final tcy f45609b;

    public tbh(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45608a = constellationDebugChimeraActivity;
        this.f45609b = tcy;
    }

    public void onClick(View view) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45608a;
        tcy tcy = this.f45609b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        constellationDebugChimeraActivity.f30582d.mo26401a(randomUUID, 3);
        constellationDebugChimeraActivity.mo17988a(false);
        sxt.m36563a();
        sxt.m36566a(constellationDebugChimeraActivity.getApplicationContext(), randomUUID, 6, tcy);
    }
}
