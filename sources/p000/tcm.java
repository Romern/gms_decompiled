package p000;

import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tcm */
final /* synthetic */ class tcm implements Runnable {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45644a;

    /* renamed from: b */
    private final tcy f45645b;

    public tcm(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45644a = constellationDebugChimeraActivity;
        this.f45645b = tcy;
    }

    public final void run() {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45644a;
        tcy tcy = this.f45645b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        constellationDebugChimeraActivity.f30582d.mo26401a(randomUUID, 3);
        szq.m36667a(constellationDebugChimeraActivity).mo26283a();
        szq.m36667a(constellationDebugChimeraActivity).mo26288b();
    }
}
