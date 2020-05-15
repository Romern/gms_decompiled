package p000;

import android.app.PendingIntent;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.util.Map;

/* renamed from: bgca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgca {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f116015a;

    /* renamed from: b */
    final /* synthetic */ GoogleLocationChimeraService f116016b;

    public bgca(GoogleLocationChimeraService googleLocationChimeraService, PendingIntent pendingIntent) {
        this.f116016b = googleLocationChimeraService;
        this.f116015a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo62633a(boolean z, Map map, Map map2) {
        int i;
        if (!z) {
            i = 3;
        } else {
            i = 1;
        }
        int size = map.size();
        int size2 = map2.size();
        StringBuilder sb = new StringBuilder(77);
        sb.append("OK Response, CacheResults size ");
        sb.append(size);
        sb.append(", cellCacheResults size ");
        sb.append(size2);
        sb.toString();
        GoogleLocationChimeraService.m117270a(this.f116016b.getApplicationContext(), this.f116015a, i, map, map2);
    }
}
