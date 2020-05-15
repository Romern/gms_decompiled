package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MigrateCleaner extends qlf {

    /* renamed from: a */
    private static final lvn f29039a = new lvn("MigrateCleaner");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        if (!ccop.f179637a.mo6606a().mo76548f() || mcl.m24877a()) {
            try {
                mgc a = mgc.m25049a(this);
                sdo.m34960a();
                if (a.f33613a.contains("migration_start_time_millis")) {
                    long currentTimeMillis = System.currentTimeMillis() - a.f33613a.getLong("migration_start_time_millis", 0);
                    if (currentTimeMillis >= 0 && currentTimeMillis < a.f33614b) {
                        f29039a.mo25416d("MigrateCleaner was run while migration was in progress, skipping.", new Object[0]);
                        return;
                    }
                }
                mce.m24860b(this);
                meu meu = new meu(this);
                meu.mo19899b();
                meu.mo19898a();
                int i3 = Build.VERSION.SDK_INT;
                try {
                    if ("com.google.android.gms/.backup.migrate.service.D2dTransport".equals(new lvp(this).mo19645c())) {
                        f29039a.mo25414c("D2D transport was selected, selecting cloud transport.", new Object[0]);
                        new lvp(this).mo19643b("com.google.android.gms/.backup.BackupTransportService");
                        return;
                    }
                } catch (SecurityException e) {
                    if (cckw.f179263a.mo6606a().mo76217G()) {
                        mno.m25371a(this).mo20185a(4);
                        if (C1133kh.m17835a(this, "android.permission.BACKUP") == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        f29039a.mo25417e("Unexpected SecurityException (hasPermission = %b)", e, Boolean.valueOf(z));
                    } else {
                        throw e;
                    }
                }
                f29039a.mo25412b("D2D transport was not selected, not selecting cloud transport.", new Object[0]);
            } catch (rti e2) {
                mno.m25371a(this).mo20185a(3);
                f29039a.mo25415d("Unable to check if migration in progress, skipping.", e2, new Object[0]);
            }
        } else {
            f29039a.mo25414c("Not running for non-user 0.", new Object[0]);
        }
    }
}
