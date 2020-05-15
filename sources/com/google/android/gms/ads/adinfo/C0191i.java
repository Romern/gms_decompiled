package com.google.android.gms.ads.adinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.eventattestation.C0243c;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.adinfo.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0191i implements C0593a {

    /* renamed from: a */
    public final Context f7836a;

    /* renamed from: b */
    public dbd f7837b = null;

    public C0191i(Context context) {
        this.f7836a = context;
        this.f7837b = new dbd(context);
    }

    /* renamed from: a */
    public final bqgg mo6380a(Context context) {
        return C0645d.f8973a.mo25819b(new C0184b(context));
    }

    /* renamed from: a */
    public final bqgg mo6381a(Context context, int i) {
        if ((!cbtk.m128383b() || !((Boolean) C0371o.f8219aF.mo6604a()).booleanValue()) && !cbtk.m128384c()) {
            return bqga.m112775a((Object) null);
        }
        aucb a = C0243c.m5113a(context).mo6448a("doubleclick.net", context.getPackageManager().getNameForUid(i));
        C0648g a2 = C0648g.m5689a();
        a.mo50378a(bqfb.INSTANCE, new C0186d(a2));
        return bqdx.m112673a(a2, C0185c.f7829a, C0645d.f8973a);
    }

    /* renamed from: a */
    public final bqgg mo6382a(String str, PackageInfo packageInfo) {
        return bqdx.m112674a(bqga.m112775a((Object) null), new C0183a(this, str, packageInfo), C0645d.f8973a);
    }
}
