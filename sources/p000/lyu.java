package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.os.UserHandle;

/* renamed from: lyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyu {

    /* renamed from: a */
    private static final lvn f33219a = new lvn("LoggingUtil");

    /* renamed from: a */
    public static bxvd m24685a() {
        bxvd da = mqk.f34276G.mo74144da();
        if (ccoa.m130958d()) {
            int myUserId = UserHandle.myUserId();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqk mqk = (mqk) da.f164949b;
            mqk.f34284a |= 2;
            mqk.f34287d = myUserId;
        }
        return da;
    }

    /* renamed from: a */
    public static msz m24686a(Bundle bundle) {
        if (bundle != null) {
            bxvd da = msz.f34606j.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            msz msz = (msz) da.f164949b;
            msz.f34608a |= 1;
            msz.f34609b = elapsedRealtime;
            if (!bundle.containsKey("android.app.backup.extra.LOG_EVENT_ID") || !bundle.containsKey("android.app.backup.extra.LOG_EVENT_CATEGORY")) {
                f33219a.mo25418e("Event id and category are not optional fields.", new Object[0]);
                return null;
            }
            int i = bundle.getInt("android.app.backup.extra.LOG_EVENT_ID");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            msz msz2 = (msz) da.f164949b;
            msz2.f34608a |= 2;
            msz2.f34610c = i;
            int i2 = bundle.getInt("android.app.backup.extra.LOG_EVENT_CATEGORY");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            msz msz3 = (msz) da.f164949b;
            msz3.f34608a |= 4;
            msz3.f34611d = i2;
            if (bundle.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME")) {
                String string = bundle.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                msz msz4 = (msz) da.f164949b;
                string.getClass();
                msz4.f34608a |= 8;
                msz4.f34612e = string;
            }
            if (bundle.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION")) {
                int i3 = bundle.getInt("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                msz msz5 = (msz) da.f164949b;
                msz5.f34608a |= 16;
                msz5.f34613f = i3;
            }
            if (bundle.containsKey("android.app.backup.extra.LOG_CANCEL_ALL")) {
                boolean z = bundle.getBoolean("android.app.backup.extra.LOG_CANCEL_ALL");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                msz msz6 = (msz) da.f164949b;
                msz6.f34608a |= 32;
                msz6.f34614g = z;
            }
            if (bundle.containsKey("android.app.backup.extra.LOG_ILLEGAL_KEY")) {
                f33219a.mo25409a("BackupManagerMonitor.EXTRA_LOG_ILLEGAL_KEY: %s", bundle.getString("android.app.backup.extra.LOG_ILLEGAL_KEY"));
            }
            if (bundle.containsKey("android.app.backup.extra.LOG_PREFLIGHT_ERROR")) {
                long j = bundle.getLong("android.app.backup.extra.LOG_PREFLIGHT_ERROR");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                msz msz7 = (msz) da.f164949b;
                msz7.f34608a |= 64;
                msz7.f34615h = j;
            }
            if (bundle.containsKey("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP")) {
                String string2 = bundle.getString("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP");
                String str = string2.split(":", -1)[0];
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                msz msz8 = (msz) da.f164949b;
                str.getClass();
                msz8.f34608a |= 128;
                msz8.f34616i = str;
                f33219a.logVerbose("BackupManagerMonitor.EXTRA_LOG_EXCEPTION_FULL_BACKUP: %s", string2);
            }
            return (msz) da.mo74062i();
        }
        f33219a.mo25418e("Backup manager monitor event bundle cannot be null", new Object[0]);
        return null;
    }
}
