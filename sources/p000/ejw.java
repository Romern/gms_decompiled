package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ejw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejw implements cayy {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        throw null;
    }

    /* renamed from: b */
    public static final ekh m10556b() {
        eme b = emf.m10660b();
        ekd ekd = new ekd();
        eie eie = eie.DEFAULT;
        eke d = ekf.m10572d();
        d.mo10232a(30000);
        d.mo10234b();
        ekd.mo10230a(eie, d.mo10231a());
        eie eie2 = eie.HIGHEST;
        eke d2 = ekf.m10572d();
        d2.mo10232a(1000);
        d2.mo10234b();
        ekd.mo10230a(eie2, d2.mo10231a());
        eie eie3 = eie.VERY_LOW;
        eke d3 = ekf.m10572d();
        d3.mo10232a(86400000);
        d3.mo10234b();
        d3.mo10233a(Collections.unmodifiableSet(new HashSet(Arrays.asList(ekg.NETWORK_UNMETERED, ekg.DEVICE_IDLE))));
        ekd.mo10230a(eie3, d3.mo10231a());
        ekd.f15174a = b;
        if (ekd.f15174a == null) {
            throw new NullPointerException("missing required property: clock");
        } else if (ekd.f15175b.keySet().size() >= eie.values().length) {
            Map map = ekd.f15175b;
            ekd.f15175b = new HashMap();
            ejz ejz = new ejz(ekd.f15174a, map);
            cazf.m127593a(ejz, "Cannot return null from a non-@Nullable @Provides method");
            return ejz;
        } else {
            throw new IllegalStateException("Not all priorities have been configured");
        }
    }
}
