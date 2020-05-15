package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import com.google.android.location.internal.ScanningUpgradeNotification$1;

/* renamed from: bgbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbd {

    /* renamed from: a */
    public final Context f115971a;

    /* renamed from: b */
    private BroadcastReceiver f115972b;

    public bgbd(Context context) {
        this.f115971a = context;
    }

    /* renamed from: a */
    private final Intent m98495a(boolean z) {
        Intent intent = new Intent("com.google.android.location.internal.SCANNING_NOTIFICATION");
        intent.setPackage(this.f115971a.getPackageName());
        intent.putExtra("launch_settings", z);
        return intent;
    }

    /* renamed from: a */
    public final void mo62592a() {
        SharedPreferences sharedPreferences = this.f115971a.getSharedPreferences("platformVersionName", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("platformVersionO").apply();
        }
    }

    /* renamed from: a */
    public final void mo62593a(int i) {
        int i2;
        if (i != 0) {
            ScanningUpgradeNotification$1 scanningUpgradeNotification$1 = new ScanningUpgradeNotification$1(this, "location");
            this.f115972b = scanningUpgradeNotification$1;
            this.f115971a.registerReceiver(scanningUpgradeNotification$1, new IntentFilter("com.google.android.location.internal.SCANNING_NOTIFICATION"));
            NotificationChannel notificationChannel = new NotificationChannel("location-settings-updates", this.f115971a.getText(C0126R.string.notification_channel_name_settings_updates), 3);
            notificationChannel.setImportance(4);
            sex a = sex.m35104a(this.f115971a);
            a.mo25442a(notificationChannel);
            try {
                i2 = qkj.m32287a(this.f115971a, C0126R.C0127drawable.common_settings_icon);
            } catch (Resources.NotFoundException e) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = qkj.m32287a(this.f115971a, C0126R.C0127drawable.common_ic_googleplayservices);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f115971a, 0, m98495a(true), 134217728);
            a.mo25445a("ZF1IDNpHEemzb8+5izDfJQ", 0, new Notification.Builder(this.f115971a, "location-settings-updates").setContentTitle(this.f115971a.getString(C0126R.string.scanning_upgrade_to_p_notification_title)).setStyle(new Notification.BigTextStyle().bigText(this.f115971a.getString(i))).setSmallIcon(i2).setContentIntent(broadcast).setDeleteIntent(PendingIntent.getBroadcast(this.f115971a, 1, m98495a(false), 134217728)).setAutoCancel(true).setLocalOnly(true).build());
            return;
        }
        mo62592a();
    }
}
