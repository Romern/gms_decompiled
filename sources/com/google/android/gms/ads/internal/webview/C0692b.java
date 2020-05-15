package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.ads.internal.webview.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0692b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f9037a;

    public C0692b(JsResult jsResult) {
        this.f9037a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9037a.cancel();
    }
}
