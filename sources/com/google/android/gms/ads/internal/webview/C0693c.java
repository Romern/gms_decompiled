package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.ads.internal.webview.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0693c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f9038a;

    public C0693c(JsResult jsResult) {
        this.f9038a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9038a.confirm();
    }
}
