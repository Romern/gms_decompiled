package p000;

import android.os.Bundle;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tcn */
final /* synthetic */ class tcn implements Runnable {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45646a;

    /* renamed from: b */
    private final tcy f45647b;

    public tcn(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45646a = constellationDebugChimeraActivity;
        this.f45647b = tcy;
    }

    public final void run() {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45646a;
        tcy tcy = this.f45647b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        constellationDebugChimeraActivity.f30582d.mo26401a(randomUUID, 3);
        szq.m36667a(constellationDebugChimeraActivity).mo26283a();
        szq.m36667a(constellationDebugChimeraActivity).mo26288b();
        sxt.m36563a();
        sxt.m36564a(constellationDebugChimeraActivity.getApplicationContext(), randomUUID, 6, Bundle.EMPTY, constellationDebugChimeraActivity.f30584f, constellationDebugChimeraActivity.f30583e, tcy);
    }
}
