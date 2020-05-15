package p000;

import android.content.SharedPreferences;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

/* renamed from: agrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrt extends soa {
    public agrt() {
        super(9);
    }

    public final void run() {
        try {
            SharedPreferences.Editor edit = new rtj(rpr.m34216b(), "mdp-svc-data", true, false).edit();
            edit.putBoolean("retry-active", false);
            edit.putInt("retry-count", -1);
            edit.apply();
        } catch (rti e) {
            bnsl bnsl = (bnsl) ChimeraPeriodicUpdaterService.f80303a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("SharedPreferences failed to reset retry status.");
        }
    }
}
