package com.google.android.gms.wallet.redirect;

import android.content.Intent;
import android.net.Uri;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FinishAndroidAppRedirectChimeraActivity extends bjxp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo59963a(Uri uri) {
        Intent a = StartAndroidAppRedirectActivity.m118364a(this, uri);
        a.setClassName(this, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        return a;
    }
}
