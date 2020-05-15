package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: mbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbv {
    /* renamed from: a */
    public static Notification.Builder m24812a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new Notification.Builder(context, "com.google.android.gms.backup.notification.channel.id");
    }

    /* renamed from: a */
    private static String m24813a(boolean z) {
        return !z ? "com.google.android.gms.backup.notification.channel.id" : "com.google.android.gms.backup.g1.notification.channel.id";
    }

    /* renamed from: b */
    public static Notification.Builder m24816b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new Notification.Builder(context, "com.google.android.gms.backup.g1.notification.channel.id");
    }

    /* renamed from: b */
    public static void m24817b(Context context, Notification.Builder builder) {
        m24815a(context, builder, true);
    }

    /* renamed from: a */
    public static void m24814a(Context context, Notification.Builder builder) {
        m24815a(context, builder, false);
    }

    /* renamed from: a */
    private static void m24815a(Context context, Notification.Builder builder, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        int i3 = C0126R.string.notification_channel_title_backup;
        if (!z) {
            i = C0126R.string.notification_channel_title_backup;
        } else {
            i = C0126R.string.g1_product_name;
        }
        bundle.putString("android.substName", context.getString(i));
        builder.addExtras(bundle);
        int i4 = Build.VERSION.SDK_INT;
        sex a = sex.m35104a(context);
        String a2 = m24813a(z);
        if (z) {
            i3 = C0126R.string.g1_notification_channel_name;
        }
        a.mo25442a(new NotificationChannel(a2, context.getString(i3), 2));
        builder.setChannelId(m24813a(z));
    }
}
