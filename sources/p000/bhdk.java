package p000;

import com.google.android.gms.location.LocationResult;
import com.google.android.location.wearable.WearableLocationChimeraService;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bhdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdk extends aehy {

    /* renamed from: a */
    public final String f118324a;

    /* renamed from: b */
    final /* synthetic */ WearableLocationChimeraService f118325b;

    /* renamed from: c */
    private final aesj f118326c;

    public bhdk(WearableLocationChimeraService wearableLocationChimeraService, String str) {
        this.f118325b = wearableLocationChimeraService;
        this.f118324a = str;
        rjx rjx = wearableLocationChimeraService.f150978l;
        if (rjx != null) {
            this.f118326c = new aesj(rjx, this, wearableLocationChimeraService.f150974h);
        } else {
            this.f118326c = new aesj(wearableLocationChimeraService.mo70964c(), this, wearableLocationChimeraService.f150974h);
        }
    }

    /* renamed from: a */
    public final void mo63565a() {
        mo63566a(Collections.emptyList(), false);
    }

    /* renamed from: b */
    public final Collection mo63567b() {
        return this.f118326c.f63727a;
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        synchronized (this.f118325b.f150973a) {
            if (!cevw.m138328m()) {
                WearableLocationChimeraService wearableLocationChimeraService = this.f118325b;
                bhdh bhdh = wearableLocationChimeraService.f150975i;
                axsg.m83138a(wearableLocationChimeraService.mo70965d(), this.f118324a, "com/google/android/location/fused/wearable/LOCATIONS", bhdc.m100665a(locationResult.f79358b).mo53333a());
            } else {
                WearableLocationChimeraService wearableLocationChimeraService2 = this.f118325b;
                bhdj bhdj = wearableLocationChimeraService2.f150977k;
                wearableLocationChimeraService2.f150979m.mo24694a(this.f118324a, "com/google/android/location/fused/wearable/LOCATIONS", bhdc.m100665a(locationResult.f79358b).mo53333a());
            }
        }
    }

    /* renamed from: a */
    public final void mo63566a(Collection collection, boolean z) {
        this.f118326c.mo34511a(collection, z);
        WearableLocationChimeraService wearableLocationChimeraService = this.f118325b;
        if (wearableLocationChimeraService.f150978l == null) {
            int i = 0;
            while (true) {
                C1245ok okVar = wearableLocationChimeraService.f150976j;
                if (i >= okVar.f26809h) {
                    wearableLocationChimeraService.mo70964c().mo34507b();
                    return;
                } else if (((bhdk) okVar.mo15621c(i)).mo63567b().isEmpty()) {
                    i++;
                } else {
                    wearableLocationChimeraService.mo70964c().mo34501a();
                    return;
                }
            }
        }
    }
}
