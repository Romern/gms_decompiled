package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.ads.internal.webview.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0684a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f9031a;

    public C0684a(JsResult jsResult) {
        this.f9031a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f9031a.cancel();
    }
}
