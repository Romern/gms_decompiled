package com.google.android.location.quake.stages;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChangeListener$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgtd f150860a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsChangeListener$1(bgtd bgtd, String str) {
        super(str);
        this.f150860a = bgtd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i = bgtd.f117477b;
        intent.getAction();
        if (intent != null && intent.getAction() != null) {
            if (!intent.getAction().equals(bgtd.m99889g()) && !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !intent.getAction().equals("android.intent.action.AIRPLANE_MODE")) {
                if (intent.getAction().equals("com.google.android.gms.phenotype.COMMITTED")) {
                    if (!"com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                        return;
                    }
                } else if ((!cezu.m138502w() || !intent.getAction().equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) && (!cevi.m138298m() || !intent.getAction().equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED"))) {
                    return;
                }
            }
            this.f150860a.f117474g.mo63137a();
        }
    }
}
