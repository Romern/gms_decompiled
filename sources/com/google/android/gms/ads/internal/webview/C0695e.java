package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.ads.internal.webview.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0695e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f9040a;

    public C0695e(JsPromptResult jsPromptResult) {
        this.f9040a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9040a.cancel();
    }
}
