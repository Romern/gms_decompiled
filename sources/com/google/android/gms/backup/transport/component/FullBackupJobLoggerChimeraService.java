package com.google.android.gms.backup.transport.component;

import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FullBackupJobLoggerChimeraService extends aeah {

    /* renamed from: a */
    private nai f29225a = new nai(this);

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!ccnf.m130735d()) {
            return 2;
        }
        int i = Build.VERSION.SDK_INT;
        if (new lvp(this).mo19644b()) {
            qwo a = new qws(this.f29225a.f35132a, "ANDROID_BACKUP", null).mo24335a(mqk.f34276G.mo73642k());
            a.mo24328b(27);
            a.mo24327b();
        }
        return 0;
    }
}
