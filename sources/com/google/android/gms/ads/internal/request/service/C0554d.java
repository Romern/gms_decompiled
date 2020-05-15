package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.request.service.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0554d implements Callable {

    /* renamed from: a */
    final /* synthetic */ C0552b f8728a;

    /* renamed from: b */
    final /* synthetic */ Context f8729b;

    /* renamed from: c */
    final /* synthetic */ AdRequestInfoParcel f8730c;

    /* renamed from: d */
    final /* synthetic */ Bundle f8731d;

    public C0554d(C0552b bVar, Context context, AdRequestInfoParcel adRequestInfoParcel, Bundle bundle) {
        this.f8728a = bVar;
        this.f8729b = context;
        this.f8730c = adRequestInfoParcel;
        this.f8731d = bundle;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        DocumentContents documentContents;
        C0560j jVar = this.f8728a.f8717a;
        Context context = this.f8729b;
        String str = this.f8730c.f8614g.packageName;
        Bundle bundle = this.f8731d;
        if (C0341h.m5274a().mo6806a()) {
            C0633h.m5672d("Cannot invoke App indexing API on UI thread. Skipping this signal.");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            C0633h.m5664a("Fail to get package name, skipping App index signal.");
            return null;
        } else {
            try {
                UsageInfo a = C0568r.m5570a(context, str);
                if (a == null || (documentContents = a.f9698e) == null) {
                    return null;
                }
                String a2 = documentContents.mo7168a();
                if (!TextUtils.isEmpty(a2)) {
                    bundle.putString("web_url", a2);
                }
                try {
                    DocumentSection a3 = documentContents.mo7167a("intent_data");
                    if (a3 == null || TextUtils.isEmpty(a3.f9543c)) {
                        return null;
                    }
                    bundle.putString("app_uri", fuc.m12407a(str, Uri.parse(a3.f9543c)).toString());
                    return null;
                } catch (IllegalArgumentException e) {
                    C0633h.m5672d("Failed to parse the third-party Android App URI.");
                    return null;
                }
            } catch (RuntimeException e2) {
                C0633h.m5672d("Fail to add App indexing to content info.");
                return null;
            }
        }
    }
}
