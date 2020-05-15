package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.ads.internal.webview.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0696f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f9041a;

    /* renamed from: b */
    final /* synthetic */ EditText f9042b;

    public C0696f(JsPromptResult jsPromptResult, EditText editText) {
        this.f9041a = jsPromptResult;
        this.f9042b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9041a.confirm(this.f9042b.getText().toString());
    }
}
