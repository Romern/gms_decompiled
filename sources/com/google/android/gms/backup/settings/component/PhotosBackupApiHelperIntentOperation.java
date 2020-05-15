package com.google.android.gms.backup.settings.component;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhotosBackupApiHelperIntentOperation extends lvz {

    /* renamed from: a */
    private mvh f29079a;

    /* renamed from: a */
    public final void mo17242a(Intent intent) {
        this.f29079a = new mvh(this);
        if (intent.getBooleanExtra("is_enable_photos_backup", false)) {
            this.f29079a.mo20270a(new mve(intent.getStringExtra("account"))).booleanValue();
        } else {
            this.f29079a.mo20270a(mvf.f34800a).booleanValue();
        }
    }
}
