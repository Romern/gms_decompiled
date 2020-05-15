package p000;

import android.app.backup.BackupManagerMonitor;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: mfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mfs extends BackupManagerMonitor {

    /* renamed from: a */
    final /* synthetic */ mft f33601a;

    public mfs(mft mft) {
        this.f33601a = mft;
    }

    public final void onEvent(Bundle bundle) {
        met met = this.f33601a.f33597a;
        if (!cckw.f179263a.mo6606a().mo76251p()) {
            lys.f33210a.mo25409a("Backup manager monitor logs disabled, not logging", new Object[0]);
            return;
        }
        bxvd da = mtd.f34646j.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mtd mtd = (mtd) da.f164949b;
        mtd.f34648a |= 1;
        mtd.f34649b = elapsedRealtime;
        if (!bundle.containsKey("android.app.backup.extra.LOG_EVENT_ID") || !bundle.containsKey("android.app.backup.extra.LOG_EVENT_CATEGORY")) {
            lys.f33210a.mo25418e("Event id and category are not optional fields.", new Object[0]);
            return;
        }
        int i = bundle.getInt("android.app.backup.extra.LOG_EVENT_ID");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mtd mtd2 = (mtd) da.f164949b;
        mtd2.f34648a |= 2;
        mtd2.f34650c = i;
        int i2 = bundle.getInt("android.app.backup.extra.LOG_EVENT_CATEGORY");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mtd mtd3 = (mtd) da.f164949b;
        mtd3.f34648a |= 4;
        mtd3.f34651d = i2;
        if (bundle.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME")) {
            String string = bundle.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtd mtd4 = (mtd) da.f164949b;
            string.getClass();
            mtd4.f34648a |= 8;
            mtd4.f34652e = string;
        }
        if (bundle.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION")) {
            int i3 = bundle.getInt("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtd mtd5 = (mtd) da.f164949b;
            mtd5.f34648a |= 16;
            mtd5.f34653f = i3;
        }
        if (bundle.containsKey("android.app.backup.extra.LOG_CANCEL_ALL")) {
            boolean z = bundle.getBoolean("android.app.backup.extra.LOG_CANCEL_ALL");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtd mtd6 = (mtd) da.f164949b;
            mtd6.f34648a |= 32;
            mtd6.f34654g = z;
        }
        if (bundle.containsKey("android.app.backup.extra.LOG_ILLEGAL_KEY")) {
            lys.f33210a.mo25418e("BackupManagerMonitor.EXTRA_LOG_ILLEGAL_KEY: %s", bundle.getString("android.app.backup.extra.LOG_ILLEGAL_KEY"));
        }
        if (bundle.containsKey("android.app.backup.extra.LOG_PREFLIGHT_ERROR")) {
            long j = bundle.getLong("android.app.backup.extra.LOG_PREFLIGHT_ERROR");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtd mtd7 = (mtd) da.f164949b;
            mtd7.f34648a |= 64;
            mtd7.f34655h = j;
        }
        if (bundle.containsKey("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP")) {
            String string2 = bundle.getString("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP");
            String str = string2.split(":")[0];
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtd mtd8 = (mtd) da.f164949b;
            str.getClass();
            mtd8.f34648a |= 128;
            mtd8.f34656i = str;
            lys.f33210a.mo25418e("BackupManagerMonitor.EXTRA_LOG_EXCEPTION_FULL_BACKUP: %s", string2);
        }
        met.f33541j.add((mtd) da.mo74062i());
    }
}
