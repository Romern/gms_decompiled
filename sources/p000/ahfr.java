package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfr {

    /* renamed from: a */
    private static final Map f67121a = new HashMap();

    /* renamed from: b */
    private static final bnhe f67122b = bnhe.m109412a("NearbyConnections", sgj.NEARBY_CONNECTIONS, "NearbyMediums", sgj.NEARBY_CONNECTIONS, "NearbyMessages", sgj.NEARBY_MESSAGES, "NearbySetup", sgj.NEARBY_SETUP, "NearbySharing", sgj.NEARBY_SHARING);

    /* renamed from: c */
    private static final sgj f67123c = sgj.NEARBY;

    /* renamed from: a */
    public static synchronized srn m55664a(String str) {
        srn srn;
        synchronized (ahfr.class) {
            srn = (srn) f67121a.get(str);
            if (srn == null) {
                srn = srn.m36126a(str, (sgj) bmxu.m108565a((sgj) f67122b.get(str), f67123c));
                f67121a.put(str, srn);
            }
        }
        return srn;
    }
}
