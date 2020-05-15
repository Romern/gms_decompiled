package p000;

import android.os.Handler;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tce */
final /* synthetic */ class tce implements Runnable {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45634a;

    /* renamed from: b */
    private final tcy f45635b;

    public tce(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45634a = constellationDebugChimeraActivity;
        this.f45635b = tcy;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sza.a(tdx, boolean, boolean):void
     arg types: [tdx, int, int]
     candidates:
      sza.a(tdx, cbqy, cboe):cbqy
      sza.a(tdx, java.util.List, cbnw):boolean
      sza.a(tdx, boolean, boolean):void */
    public final void run() {
        Handler handler;
        Runnable tcg;
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45634a;
        tcy tcy = this.f45635b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        try {
            constellationDebugChimeraActivity.mo17992e().mo26257a(constellationDebugChimeraActivity.mo17987a(randomUUID.toString()), false, true);
            handler = constellationDebugChimeraActivity.f30581c;
            tcg = new tcf(constellationDebugChimeraActivity);
        } catch (tdw e) {
            ConstellationDebugChimeraActivity.f30575b.mo25417e("Couldn't revoke consent", e, new Object[0]);
            handler = constellationDebugChimeraActivity.f30581c;
            tcg = new tcg(constellationDebugChimeraActivity);
        } catch (Throwable th) {
            constellationDebugChimeraActivity.f30581c.post(new tch(constellationDebugChimeraActivity));
            throw th;
        }
        handler.post(tcg);
    }
}
