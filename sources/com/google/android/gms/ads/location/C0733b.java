package com.google.android.gms.ads.location;

import android.content.pm.ApplicationInfo;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.location.b */
final /* synthetic */ class C0733b implements aubg {

    /* renamed from: a */
    private final C0737f f9144a;

    /* renamed from: b */
    private final ApplicationInfo f9145b;

    public C0733b(C0737f fVar, ApplicationInfo applicationInfo) {
        this.f9144a = fVar;
        this.f9145b = applicationInfo;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        C0737f fVar = this.f9144a;
        ApplicationInfo applicationInfo = this.f9145b;
        if (aucb.mo50384b() && aucb.mo50386d() != null) {
            return aucu.m76778a((Location) aucb.mo50386d());
        }
        aucf aucf = new aucf();
        rjx rjx = fVar.f9149a;
        LocationRequest a = LocationRequest.m66854a();
        a.mo43553c(102);
        boolean z = true;
        a.mo43551b(1);
        a.mo43549a(10000L);
        long longValue = ((Long) C0371o.f8226ad.mo6604a()).longValue();
        if (longValue != -1) {
            a.mo43554c(longValue);
        }
        LocationRequestInternal a2 = LocationRequestInternal.m66889a("Ads", a);
        if (applicationInfo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ClientIdentity(applicationInfo.uid, applicationInfo.packageName));
            a2.mo43613a(arrayList);
        }
        if (!fVar.mo7033a("android.permission.ACCESS_COARSE_LOCATION") || fVar.mo7033a("android.permission.ACCESS_FINE_LOCATION")) {
            z = false;
        }
        a2.f79424f = z;
        return rjx.mo24685a(a2, new C0735d(aucf), Looper.getMainLooper()).mo50382b(new C0736e(aucf));
    }
}
