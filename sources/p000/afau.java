package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import java.util.List;
import java.util.TimerTask;

/* renamed from: afau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afau extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ afav f64103a;

    public afau(afav afav) {
        this.f64103a = afav;
    }

    public final void run() {
        TetherListenerChimeraService.f79824e.mo25418e("Tether provisioning has timed out.", new Object[0]);
        afcg.m52833a().mo34739a(4);
        bxvd da = afbe.f64117f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbe afbe = (afbe) da.f164949b;
        afbe.f64120b = 3;
        afbe.f64119a |= 1;
        afbe afbe2 = (afbe) da.mo74062i();
        List list = this.f64103a.f64104a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.f64103a.mo34720a((RemoteDevice) list.get(i), afbe2)) {
                afba afba = this.f64103a.f64107d;
                int a = afbd.m52807a(afbe2.f64120b);
                if (a == 0) {
                    a = 1;
                }
                afba.mo34722a(a - 1);
            }
        }
        this.f64103a.f64104a.clear();
        this.f64103a.f64105b = null;
    }
}
