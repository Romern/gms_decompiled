package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComponentEnabler extends qlf {

    /* renamed from: a */
    private final bnic f29220a = bnic.m109493a(new nas(), new nar(), new naq(), new nap(), new nao());

    static {
        new lvn("ComponentEnabler");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        mbz mbz = new mbz(this);
        bnrd a = this.f29220a.iterator();
        while (a.hasNext()) {
            ((nan) a.next()).mo20412a(this, mbz);
        }
        aeat a2 = aeat.m51532a(this);
        int i3 = Build.VERSION.SDK_INT;
        if (ccnf.m130735d()) {
            aebl aebl = new aebl();
            aebl.mo34027b(1);
            aebl.f63099k = "full_backup_job_logger";
            aebl.f63097i = "com.google.android.gms.backup.component.FullBackupJobLoggerService";
            aebl.f63070a = TimeUnit.HOURS.toSeconds(ccnf.f179489a.mo6606a().mo76440l());
            aebl.mo34026a(true);
            aebl.mo34024a(1, 1);
            aebl.mo34023a(1);
            a2.mo33984a(aebl.mo33974b());
        }
        GmsBackupSchedulerChimeraService.m22012a(this);
        MmsBackupSchedulerChimeraService.m22015a(this);
    }
}
