package com.google.android.gms.backup.base;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAccountNotifierIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final lvn f28996a = new lvn("BackupAccountNotifier");

    /* renamed from: b */
    private lvp f28997b;

    /* renamed from: c */
    private sex f28998c;

    /* renamed from: d */
    private SharedPreferences f28999d;

    /* renamed from: a */
    private final void m21859a() {
        this.f28998c.mo25444a("com.google.android.backup.notification.account.tag", 1);
        if (!this.f28999d.edit().putBoolean("notified", false).commit()) {
            f28996a.mo25414c("Fail to write notification cancellation preference.", new Object[0]);
        }
    }

    public final void onCreate() {
        this.f28997b = new lvp(this);
        this.f28998c = sex.m35104a(this);
        this.f28999d = getSharedPreferences("com.google.android.gms.backup.BackupAccountNotifierService", 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int i = Build.VERSION.SDK_INT;
            boolean booleanExtra = intent.getBooleanExtra("notify", true);
            f28996a.mo25409a("Handling new intent. Show notification: %s", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                if (!Process.myUserHandle().isOwner()) {
                    f28996a.mo25416d("Only owner can see backup notifications", new Object[0]);
                } else if (this.f28997b.mo19644b()) {
                    boolean a = cckn.f179242a.mo6606a().mo76186a();
                    f28996a.mo25409a("Notification is allowed: %s", Boolean.valueOf(a));
                    if (a) {
                        boolean c = cckn.f179242a.mo6606a().mo76188c();
                        lvn lvn = f28996a;
                        boolean z = this.f28999d.getBoolean("notified", false);
                        StringBuilder sb = new StringBuilder(24);
                        sb.append("Shared pref value: ");
                        sb.append(z);
                        lvn.mo25409a(sb.toString(), new Object[0]);
                        if (!this.f28999d.getBoolean("notified", false) || c) {
                            f28996a.mo25414c("Showing notification.", new Object[0]);
                            Intent intent2 = new Intent();
                            intent2.setClassName(this, "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                            if (getPackageManager().resolveActivity(intent2, 0) == null) {
                                intent2.setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
                            }
                            intent2.putExtra("turnOff", true);
                            intent2.putExtra("showDone", true);
                            PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, 134217728);
                            Notification.Builder ongoing = new Notification.Builder(this).setPriority(1).setSmallIcon(17301642).setWhen(System.currentTimeMillis()).setContentTitle(getString(C0126R.string.notification_content_title_set_backup_account)).setContentText(getString(C0126R.string.notification_content_text_set_backup_account)).setContentIntent(activity).setOngoing(cckn.f179242a.mo6606a().mo76187b());
                            mbv.m24814a(this, ongoing);
                            this.f28998c.mo25445a("com.google.android.backup.notification.account.tag", 1, ongoing.build());
                            if (!this.f28999d.edit().putBoolean("notified", true).commit()) {
                                f28996a.mo25416d("Failed to write notification preference", new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                m21859a();
                return;
            }
            m21859a();
        }
    }
}
