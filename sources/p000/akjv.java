package p000;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjv implements akjr {

    /* renamed from: a */
    private final Context f72118a;

    public akjv(Context context) {
        this.f72118a = context;
    }

    /* renamed from: b */
    private final String m59901b() {
        rjx a = gss.m13836a(this.f72118a, new gst().mo12176a());
        roz b = rpa.m34196b();
        b.f43472a = new iby();
        try {
            return (String) aucu.m76783a(a.mo24701a(b.mo24977a()), 500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aknf.m60075a("ProxyApiError");
            eoa.m10825a("NetRec", e, "Error getting spatula header", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39506a() {
    }

    /* renamed from: a */
    public final void mo39507a(Map map) {
        if (!map.containsKey("X-Goog-Spatula")) {
            String b = m59901b();
            if (b != null) {
                map.put("X-Goog-Spatula", b);
                return;
            }
            return;
        }
        eoa.m10828c("NetRec", "Existing Spatula header found", new Object[0]);
    }
}
