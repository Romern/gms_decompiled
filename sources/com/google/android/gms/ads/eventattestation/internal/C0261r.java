package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import com.google.android.gms.ads.eventattestation.C0241a;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.r */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0261r extends rjx implements C0241a {

    /* renamed from: a */
    public static final /* synthetic */ int f7965a = 0;

    /* renamed from: b */
    private static final rjo f7966b = new rjo("AdvertisingId.API", f7968d, f7967c);

    /* renamed from: c */
    private static final rje f7967c = new rje();

    /* renamed from: d */
    private static final rjl f7968d = new C0260q();

    public C0261r(Context context) {
        super(context, f7966b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo6448a(String str, String str2) {
        AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = new AdRequestAttestationTokenRequestParcel(str, null, str2);
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{wei.f50587a};
        b.f43472a = new C0258o(adRequestAttestationTokenRequestParcel);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo6449a() {
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{wei.f50587a};
        b.f43472a = C0259p.f7964a;
        mo24701a(b.mo24977a());
    }
}
