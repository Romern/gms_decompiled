package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: pvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pvv {

    /* renamed from: a */
    public static final qav f40405a = new qav("DeviceControllerManager");

    /* renamed from: b */
    public final Context f40406b;

    /* renamed from: c */
    public final qam f40407c;

    /* renamed from: d */
    public final Map f40408d;

    /* renamed from: e */
    public final Set f40409e;

    /* renamed from: f */
    public final pmx f40410f;

    /* renamed from: g */
    public final piy f40411g;

    /* renamed from: h */
    public final Handler f40412h = new adzt(Looper.getMainLooper());

    public pvv(Context context, pmx pmx, qam qam, piy piy) {
        this.f40406b = context;
        this.f40407c = qam;
        this.f40408d = new HashMap();
        this.f40409e = new HashSet();
        this.f40410f = pmx;
        this.f40411g = piy;
    }

    /* renamed from: a */
    public final pvt mo23749a(String str) {
        return (pvt) this.f40408d.get(str);
    }

    /* renamed from: a */
    public final void mo23750a(pvq pvq, boolean z) {
        CastDevice castDevice = pvq.f40381p;
        f40405a.mo23857a("releaseDeviceControllerFor CastDeviceController for %s. explicitDisconnect:%b", castDevice, Boolean.valueOf(z));
        String a = castDevice.mo17494a();
        pvt pvt = (pvt) this.f40408d.get(a);
        if (pvt != null) {
            pvt.f40398b.remove(pvq);
            if (pvt.mo23748b()) {
                f40405a.mo23856a("disposing CastDeviceController for %s", castDevice);
                pvt.f40399c.mo23207a(z);
                this.f40408d.remove(a);
                this.f40407c.mo23843b();
                pvt.f40399c.mo23262p();
                for (pvu pvu : this.f40409e) {
                    pvu.mo17604b(a);
                }
                this.f40410f.mo23454a(a, 0);
                return;
            }
            for (pvq pvq2 : Collections.unmodifiableList(pvt.f40398b)) {
                f40405a.mo23856a("Still connected to by CastRouteController %s", pvq2.mo23745h());
            }
        }
    }
}
