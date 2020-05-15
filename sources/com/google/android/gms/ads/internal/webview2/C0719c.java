package com.google.android.gms.ads.internal.webview2;

import android.content.Context;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.common.C0356b;
import com.google.android.gms.ads.internal.mraid.C0514c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.C0690af;
import com.google.android.gms.ads.internal.webview.C0691ag;
import com.google.android.gms.ads.internal.webview.C0698h;
import com.google.android.gms.ads.internal.webview.C0709s;

/* renamed from: com.google.android.gms.ads.internal.webview2.c */
public final /* synthetic */ class C0719c implements bmzi {

    /* renamed from: a */
    private final Context f9099a;

    /* renamed from: b */
    private final C0691ag f9100b;

    /* renamed from: c */
    private final String f9101c;

    /* renamed from: d */
    private final VersionInfoParcel f9102d;

    /* renamed from: e */
    private final C0327b f9103e;

    public C0719c(Context context, C0691ag agVar, String str, VersionInfoParcel versionInfoParcel, C0327b bVar) {
        this.f9099a = context;
        this.f9100b = agVar;
        this.f9101c = str;
        this.f9102d = versionInfoParcel;
        this.f9103e = bVar;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Context context = this.f9099a;
        C0691ag agVar = this.f9100b;
        String str = this.f9101c;
        VersionInfoParcel versionInfoParcel = this.f9102d;
        C0327b bVar = this.f9103e;
        C0718b bVar2 = new C0718b();
        C0721e eVar = new C0721e(new C0690af(context), bVar2, agVar, str, versionInfoParcel, bVar);
        C0709s sVar = new C0709s(eVar);
        eVar.setWebChromeClient(new C0698h(sVar));
        new C0514c(sVar, sVar.mo6919d(), new C0356b(sVar.getContext()));
        bVar2.f9094a = sVar;
        bVar2.f9097d = false;
        bVar2.f9095b.f8493c = sVar;
        return sVar;
    }
}
