package com.google.android.gms.ads.signalsdk;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C0610ah;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.ads.signalsdk.f */
final /* synthetic */ class C0897f implements bqeh {

    /* renamed from: a */
    private final C0899h f9446a;

    /* renamed from: b */
    private final Bundle f9447b;

    /* renamed from: c */
    private final bqgg f9448c;

    /* renamed from: d */
    private final bqgg f9449d;

    /* renamed from: e */
    private final String f9450e;

    public C0897f(C0899h hVar, Bundle bundle, bqgg bqgg, bqgg bqgg2, String str) {
        this.f9446a = hVar;
        this.f9447b = bundle;
        this.f9448c = bqgg;
        this.f9449d = bqgg2;
        this.f9450e = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        C0899h hVar = this.f9446a;
        Bundle bundle = this.f9447b;
        bqgg bqgg = this.f9448c;
        bqgg bqgg2 = this.f9449d;
        String str = this.f9450e;
        List list = (List) obj;
        Uri.Builder buildUpon = Uri.parse(cbvg.f178334a.mo6606a().mo75420e()).buildUpon();
        buildUpon.appendQueryParameter("afma_version", hVar.f9453b.f8949a);
        Bundle bundle2 = bundle.getBundle("extra_params");
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                if (!C0899h.f9452a.contains(str2)) {
                    buildUpon.appendQueryParameter(str2, bundle2.getString(str2));
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", hVar.f9454c);
        hashMap.put("x-afma-drt-cookie", (String) bqgg.get());
        hashMap.put("x-afma-drt-v2-cookie", (String) bqgg2.get());
        hashMap.put("calling-package", str);
        return C0610ah.m5613a(buildUpon.toString(), hashMap);
    }
}
