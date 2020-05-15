package p000;

import com.google.android.gms.drive.networkcontrol.BatteryStateChangeReceiver;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfd {

    /* renamed from: a */
    protected final ConnectivityChangeReceiver f49160a;

    /* renamed from: b */
    public final ves f49161b;

    /* renamed from: c */
    public final BatteryStateChangeReceiver f49162c;

    /* renamed from: d */
    public final uce f49163d;

    /* renamed from: e */
    public final vff f49164e;

    /* renamed from: a */
    public final veq mo28379a(boolean z, uey uey) {
        veq veq = new veq(this.f49161b);
        veq.mo28372a(new ver(this, veq, z, uey));
        ves ves = this.f49161b;
        vem vem = veq.f49138g;
        synchronized (((vev) ves).f49148c) {
            if (!((vev) ves).f49150e.add(vem)) {
                vev.f49146a.mo25377c("NetworkStoreImpl", "Duplicate listener.");
            }
        }
        vem.mo28355a();
        this.f49162c.mo18281a(veq.f49136e);
        if (z) {
            vff vff = this.f49164e;
            vel vel = veq.f49137f;
            vfg vfg = (vfg) vff;
            Set set = vfg.f49168b;
            sdo.m34959a(vel);
            if (set.add(vel)) {
                vel.mo28354a(vfg.m40284a(vfg.mo28384a()));
            } else {
                vfg.f49167a.mo25377c("PreferencesImpl", "Attempt to add duplicate sync preferences listener.");
            }
        } else {
            uce uce = this.f49163d;
            vel vel2 = veq.f49137f;
            synchronized (((ucf) uce).f47236c) {
                Set set2 = (Set) ((ucf) uce).f47236c.get(uey);
                if (set2 == null) {
                    set2 = new HashSet();
                }
                set2.add(vel2);
                vel2.mo28354a(((ucf) uce).mo27232a(uey));
                ((ucf) uce).f47236c.put(uey, set2);
            }
        }
        return veq;
    }

    public vfd(ConnectivityChangeReceiver connectivityChangeReceiver, ves ves, BatteryStateChangeReceiver batteryStateChangeReceiver, uce uce, vff vff) {
        sdo.m34959a(connectivityChangeReceiver);
        this.f49160a = connectivityChangeReceiver;
        sdo.m34959a(ves);
        this.f49161b = ves;
        sdo.m34959a(batteryStateChangeReceiver);
        this.f49162c = batteryStateChangeReceiver;
        sdo.m34959a(uce);
        this.f49163d = uce;
        sdo.m34959a(vff);
        this.f49164e = vff;
    }

    /* renamed from: a */
    public final vfb mo28380a() {
        vfi vfi = new vfi();
        vfh vfh = vfi.f49171a;
        this.f49160a.mo18281a(vfh);
        vfi.mo28372a(new vfc(this, vfh));
        return vfi;
    }
}
