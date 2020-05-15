package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.p012js.function.C0474b;
import com.google.android.gms.ads.internal.p012js.function.C0481i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.ads.internal.request.service.v */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0572v {

    /* renamed from: a */
    public final C0474b f8860a;

    /* renamed from: b */
    public final C0474b f8861b;

    public C0572v(Context context) {
        this.f8860a = C0387d.m5370h().mo6671a(context, VersionInfoParcel.m5635a()).mo6672a("google.afma.request.getAdDictionary", C0481i.f8467b, C0481i.f8467b);
        this.f8861b = C0387d.m5370h().mo6671a(context, VersionInfoParcel.m5635a()).mo6672a("google.afma.sdkConstants.getSdkConstants", C0481i.f8467b, C0481i.f8467b);
    }
}
