package com.google.android.gms.ads.location;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.location.C0509a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0648g;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: com.google.android.gms.ads.location.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0737f implements C0509a {

    /* renamed from: a */
    public final rjx f9149a;

    /* renamed from: b */
    private final Context f9150b;

    /* renamed from: c */
    private sfr f9151c;

    public C0737f(Context context) {
        this.f9150b = context;
        this.f9149a = aeie.m51878c(context);
    }

    /* renamed from: a */
    public final bqgg mo6698a(ApplicationInfo applicationInfo) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = applicationInfo.packageName;
        clientContext.f30212b = applicationInfo.uid;
        this.f9151c = sfr.m35174a(this.f9150b, clientContext);
        if (mo7033a("android.permission.ACCESS_FINE_LOCATION") || (((Boolean) C0371o.f8224ab.mo6604a()).booleanValue() && mo7033a("android.permission.ACCESS_COARSE_LOCATION"))) {
            aucb b = this.f9149a.mo24758m().mo50382b(new C0732a(this)).mo50382b(new C0733b(this, applicationInfo));
            C0648g a = C0648g.m5689a();
            b.mo50371a(new C0734c(a));
            return a;
        }
        C0633h.m5672d("App does not have the required permissions to get location");
        return bqga.m112775a((Object) null);
    }

    /* renamed from: a */
    public final boolean mo7033a(String str) {
        sfr sfr = this.f9151c;
        return sfr != null && sfr.mo25481a(str) == 0;
    }
}
