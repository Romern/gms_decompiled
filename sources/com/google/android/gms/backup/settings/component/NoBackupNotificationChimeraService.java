package com.google.android.gms.backup.settings.component;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NoBackupNotificationChimeraService extends aeah {

    /* renamed from: a */
    public static final lvn f29076a = new lvn("NoBackupNotification");

    /* renamed from: b */
    private static final long f29077b = TimeUnit.MINUTES.toSeconds((long) ((int) ccli.f179330a.mo6606a().mo76284q()));

    /* renamed from: a */
    private static long m21919a(int i) {
        String[] split = ccli.f179330a.mo6606a().mo76293z().split(";");
        f29076a.mo25409a("Current back off values: %s", Arrays.toString(split));
        return Long.valueOf(split[Math.min(i, split.length - 1)]).longValue();
    }

    /* renamed from: b */
    public static boolean m21922b(Context context) {
        if (ccli.f179330a.mo6606a().mo76288u()) {
            int i = Build.VERSION.SDK_INT;
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.NoBackupNotificationService");
            if (context.getPackageManager().resolveService(intent, 0) == null || new lsp(context).mo19591a() == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static synchronized int m21923c(Context context) {
        int i;
        synchronized (NoBackupNotificationChimeraService.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            i = sharedPreferences.getInt("times_shown", 0) + 1;
            if (!sharedPreferences.edit().putInt("times_shown", i).commit()) {
                f29076a.mo25416d("Failed to write notification preferences", new Object[0]);
            }
            f29076a.mo25409a("Times showed notification: %d", Integer.valueOf(i));
        }
        return i;
    }

    /* renamed from: d */
    private static synchronized void m21924d(Context context) {
        synchronized (NoBackupNotificationChimeraService.class) {
            f29076a.mo25409a("Resetting the number of times shown.", new Object[0]);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            if (sharedPreferences.getInt("times_shown", 0) != 0 && !sharedPreferences.edit().putInt("times_shown", 0).commit()) {
                f29076a.mo25416d("Failed to erase notification preferences", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m21920a(Context context) {
        if (!m21922b(context)) {
            f29076a.mo25409a("Disabled, not rescheduling", new Object[0]);
            return;
        }
        sex.m35104a(context).mo25444a("com.google.android.backup.notification.no_backup.tag", 3);
        m21924d(context);
        m21921a(context, 0, true);
    }

    /* renamed from: a */
    public static void m21921a(Context context, int i, boolean z) {
        long a = m21919a(i);
        long seconds = TimeUnit.MINUTES.toSeconds(a);
        long seconds2 = TimeUnit.MINUTES.toSeconds(a);
        long j = f29077b;
        aeat a2 = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63099k = "no_backup_notification_service";
        aebi.f63102n = true;
        aebi.mo34029b(z);
        aebi.f63097i = "com.google.android.gms.backup.component.NoBackupNotificationService";
        aebi.mo34004a(seconds, seconds2 + j);
        a2.mo33984a(aebi.mo33974b());
        f29076a.mo25409a("Scheduled task to run in %d seconds, overriding: %b", Long.valueOf(seconds), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!m21922b(this)) {
            f29076a.mo25409a("Disabled, not running and not rescheduling", new Object[0]);
            return 2;
        } else if (new lvp(this).mo19644b()) {
            sex a = sex.m35104a(this);
            Notification.Builder contentText = mbv.m24812a(this).setSmallIcon(qkj.m32287a(this, !ccli.m130404d() ? C0126R.C0127drawable.quantum_ic_backup_googblue_48 : C0126R.C0127drawable.quantum_gm_ic_backup_googblue_24)).setColor(getColor(C0126R.color.quantum_googblue600)).setContentIntent(PendingIntent.getActivity(this, 0, mcc.m24851a(), 134217728)).setAutoCancel(true).setContentTitle(getString(C0126R.string.no_backup_notification_title)).setContentText(getString(C0126R.string.no_backup_notification_text));
            mbv.m24814a(this, contentText);
            a.mo25445a("com.google.android.backup.notification.no_backup.tag", 3, contentText.build());
            int c = m21923c(this);
            f29076a.mo25414c("Showing notification, times: %d", Integer.valueOf(c));
            m21921a(this, c, true);
            mup mup = new mup(new qws(this, "ANDROID_BACKUP", null));
            long a2 = m21919a(c);
            bxvd a3 = lyu.m24685a();
            bxvd da = msh.f34538d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            msh msh = (msh) da.f164949b;
            int i = msh.f34540a | 1;
            msh.f34540a = i;
            msh.f34541b = c;
            msh.f34540a = i | 2;
            msh.f34542c = a2;
            if (a3.f164950c) {
                a3.mo74035c();
                a3.f164950c = false;
            }
            mqk mqk = (mqk) a3.f164949b;
            msh msh2 = (msh) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            msh2.getClass();
            mqk.f34309z = msh2;
            mqk.f34285b |= 1;
            mqk mqk3 = (mqk) a3.mo74062i();
            mqj mqj = mqj.NO_BACKUP_NOTIFICATION;
            if (ccli.f179330a.mo6606a().mo76273f()) {
                mup.f34779a.mo25409a("Logging to Clearcut eventCode: %s, event: %s", mqj, mqk3);
                qwo a4 = mup.f34780b.mo24335a(mqk3.mo73642k());
                a4.mo24328b(mqj.f34275R);
                a4.mo24327b();
            } else {
                mup.f34779a.mo25409a("Logging is disabled.", new Object[0]);
            }
            return 0;
        } else {
            f29076a.mo25409a("Backup is disabled, rescheduling.", new Object[0]);
            m21920a(this);
            return 0;
        }
    }
}
