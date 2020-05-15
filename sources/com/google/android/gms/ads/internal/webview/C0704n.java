package com.google.android.gms.ads.internal.webview;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.ads.internal.webview.n */
public final /* synthetic */ class C0704n implements bmzi {

    /* renamed from: a */
    private final Context f9056a;

    /* renamed from: b */
    private final C0691ag f9057b;

    /* renamed from: c */
    private final String f9058c;

    /* renamed from: d */
    private final VersionInfoParcel f9059d;

    /* renamed from: e */
    private final C0327b f9060e;

    public C0704n(Context context, C0691ag agVar, String str, VersionInfoParcel versionInfoParcel, C0327b bVar) {
        this.f9056a = context;
        this.f9057b = agVar;
        this.f9058c = str;
        this.f9059d = versionInfoParcel;
        this.f9060e = bVar;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Context context = this.f9056a;
        C0691ag agVar = this.f9057b;
        String str = this.f9058c;
        VersionInfoParcel versionInfoParcel = this.f9059d;
        C0327b bVar = this.f9060e;
        int i = C0712v.f9068a;
        C0709s sVar = new C0709s(new C0712v(new C0690af(context), agVar, str, versionInfoParcel, bVar));
        sVar.setWebViewClient(C0387d.m5364b().mo6872a(sVar, bVar));
        sVar.setWebChromeClient(new C0698h(sVar));
        return sVar;
    }
}
