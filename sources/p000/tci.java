package p000;

import android.os.Handler;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.UUID;

/* renamed from: tci */
final /* synthetic */ class tci implements Runnable {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45639a;

    /* renamed from: b */
    private final tcy f45640b;

    public tci(ConstellationDebugChimeraActivity constellationDebugChimeraActivity, tcy tcy) {
        this.f45639a = constellationDebugChimeraActivity;
        this.f45640b = tcy;
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
        Runnable tck;
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45639a;
        tcy tcy = this.f45640b;
        UUID randomUUID = UUID.randomUUID();
        tcy.f45663a = randomUUID;
        try {
            constellationDebugChimeraActivity.mo17992e().mo26257a(constellationDebugChimeraActivity.mo17987a(randomUUID.toString()), true, true);
            handler = constellationDebugChimeraActivity.f30581c;
            tck = new tcj(constellationDebugChimeraActivity);
        } catch (tdw e) {
            ConstellationDebugChimeraActivity.f30575b.mo25417e("Couldn't set consent", e, new Object[0]);
            handler = constellationDebugChimeraActivity.f30581c;
            tck = new tck(constellationDebugChimeraActivity);
        } catch (Throwable th) {
            constellationDebugChimeraActivity.f30581c.post(new tcl(constellationDebugChimeraActivity));
            throw th;
        }
        handler.post(tck);
    }
}
