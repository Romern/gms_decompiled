package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.ads.internal.webview.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0694d implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f9039a;

    public C0694d(JsPromptResult jsPromptResult) {
        this.f9039a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f9039a.cancel();
    }
}
