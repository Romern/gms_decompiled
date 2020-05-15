package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BasicGoogleSettingsChimeraActivity extends fpy {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class GoogleSettingsIntentCompleteOperation extends fpx {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo7152a(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("id", i);
        intent.putExtra("title", str);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.app.settings.SettingsSubPageActivity");
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        setTitle(getString(C0126R.string.common_google));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final svf mo7153a(CharSequence charSequence, int i) {
        return new svf(charSequence, i);
    }
}
