package com.google.android.gms.growth.p048ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.growth.p048ui.webview.GrowthWebViewChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: com.google.android.gms.growth.ui.GrowthDebugChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrowthDebugChimeraActivity extends qkh {

    /* renamed from: b */
    public static final String f79028b = abkv.m47828a(GrowthDebugChimeraActivity.class);

    /* renamed from: c */
    public suo f79029c;

    /* renamed from: com.google.android.gms.growth.ui.GrowthDebugChimeraActivity$GrowthDebugOperation */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GrowthDebugOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, GrowthDebugChimeraActivity.f79028b), 2, (int) C0126R.string.growth_debug_settings_title, 30);
            googleSettingsItem.f29962h = true;
            googleSettingsItem.f29961g = false;
            return googleSettingsItem;
        }
    }

    /* renamed from: a */
    public final void mo43378a(String str, String str2) {
        startActivity(new Intent().setClassName("com.google.android.gms", abkv.m47828a(GrowthWebViewChimeraActivity.class)).putExtra("url", str).putExtra("account", str2).setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT));
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sun sun = new sun(mo8628aW());
        sun.mo26112a(C0126R.string.growth_debug_settings_title);
        this.f79029c = sun.mo26111a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        svf e = sug.mo26098e(C0126R.string.growth_debug_for_selected_account);
        svk svk = new svk(this);
        svk.mo26084a((int) C0126R.string.growth_debug_open_google_guide);
        svk.mo26106c(C0126R.string.growth_debug_open_google_guide);
        svk.mo26086b(0);
        svk.mo26102a(new abjz(this));
        svk svk2 = new svk(this);
        svk2.mo26084a((int) C0126R.string.growth_debug_open_debug_page);
        svk2.mo26106c(C0126R.string.growth_debug_open_debug_page);
        svk2.mo26086b(1);
        svk2.mo26102a(new abka(this));
        e.mo26149a((sui) svk);
        e.mo26149a((sui) svk2);
    }
}
