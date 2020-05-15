package com.google.android.gms.ads.internal.csi;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0395h;
import com.google.android.gms.ads.internal.request.service.C0563m;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.ads.internal.csi.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0376a {

    /* renamed from: a */
    public final String f8274a = ((String) C0395h.f8334a.mo6621a());

    /* renamed from: b */
    public final Map f8275b;

    /* renamed from: c */
    public final Context f8276c;

    /* renamed from: d */
    public final String f8277d;

    public C0376a(Context context, String str) {
        String str2;
        this.f8276c = context;
        this.f8277d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8275b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f8275b.put("v", "3");
        this.f8275b.put("os", Build.VERSION.RELEASE);
        this.f8275b.put("api_v", Build.VERSION.SDK);
        this.f8275b.put("device", C0387d.m5363a().mo6845a());
        this.f8275b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map map = this.f8275b;
        C0387d.m5363a();
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
        } catch (ClassNotFoundException e) {
            str2 = "1";
        } catch (Throwable th) {
            C0633h.m5669b("Error loading class.", th);
            C0387d.m5366d().mo6783a(th, "AdUtil.isLiteSdk");
        }
        str2 = "0";
        map.put("is_lite_sdk", str2);
        Future a = C0387d.m5369g().mo6747a(this.f8276c);
        try {
            this.f8275b.put("network_coarse", Integer.toString(((C0563m) a.get()).f8838o));
            this.f8275b.put("network_fine", Integer.toString(((C0563m) a.get()).f8839p));
        } catch (Exception e2) {
            C0387d.m5366d().mo6783a(e2, "CsiConfiguration.CsiConfiguration");
        }
    }
}
