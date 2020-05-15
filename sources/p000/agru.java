package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: agru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agru extends soa {

    /* renamed from: a */
    private final LinkedBlockingQueue f66328a;

    /* renamed from: b */
    private final rtj f66329b = new rtj(rpr.m34216b(), "mdp-stats-data", false, false);

    public agru(LinkedBlockingQueue linkedBlockingQueue) {
        super(10);
        this.f66328a = linkedBlockingQueue;
    }

    public final void run() {
        while (true) {
            try {
                Pair pair = (Pair) this.f66328a.take();
                if (pair != null) {
                    long j = this.f66329b.getLong((String) pair.first, 0);
                    SharedPreferences.Editor edit = this.f66329b.edit();
                    edit.putLong((String) pair.first, j + ((Long) pair.second).longValue());
                    edit.apply();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ChimeraPeriodicUpdaterService.f80303a.mo26019b(agyt.m55307c()).mo68405a("Interrupted, exiting");
                return;
            } catch (rti e2) {
                bnsl bnsl = (bnsl) ChimeraPeriodicUpdaterService.f80303a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68405a("SharedPreferences failed to apply StatsUpdater changes.");
                return;
            }
        }
    }
}
