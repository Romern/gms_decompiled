package com.google.android.gms.common.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebViewClient;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WhitelistWebViewChimeraActivity extends rid {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebViewClient mo17698a() {
        return new rif();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            str = data != null ? data.toString() : "";
        } else {
            str = null;
        }
        if (str != null && !rie.m33632a(str)) {
            setResult(0);
            finish();
        }
    }
}
