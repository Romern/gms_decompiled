package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: afat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afat {

    /* renamed from: a */
    private final WeakReference f64102a;

    public afat(afav afav) {
        this.f64102a = new WeakReference(afav);
    }

    /* renamed from: a */
    public final void mo34717a(afbe afbe) {
        if (this.f64102a.get() == null) {
            TetherListenerChimeraService.f79824e.mo25416d("Attempted to send response to client, but ConnectionHandler is null.", new Object[0]);
            return;
        }
        afav afav = (afav) this.f64102a.get();
        afav.mo34719a();
        afav.f64105b = null;
        List list = afav.f64104a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i);
            if (afav.mo34720a(remoteDevice, afbe)) {
                afba afba = afav.f64107d;
                int a = afbd.m52807a(afbe.f64120b);
                if (a == 0) {
                    a = 1;
                }
                afba.mo34722a(a - 1);
                int a2 = afbd.m52807a(afbe.f64120b);
                if (a2 != 0 && a2 == 2) {
                    aezy.m52769a(rpr.m34216b()).mo34702a(remoteDevice.f11138b);
                }
            }
        }
        afav.f64104a.clear();
        MetricTaskDurationTimerIntentOperation.m67151b(afav.f64108e.getApplicationContext(), "magictether_performance_connect_tethering_response_duration");
    }
}
