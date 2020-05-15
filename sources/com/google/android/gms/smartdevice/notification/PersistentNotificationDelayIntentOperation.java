package com.google.android.gms.smartdevice.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PersistentNotificationDelayIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f108082a = ascp.m73787a("Notification", "PersistentNotificationDelayIntentOperation");

    /* renamed from: a */
    public static Intent m92792a(Context context, String str, int i, SerializableNotification serializableNotification) {
        sdo.m34977c(str);
        sdo.m34959a(serializableNotification);
        Intent putExtra = IntentOperation.getStartIntent(context, PersistentNotificationDelayIntentOperation.class, "com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION").putExtra("tag", str).putExtra("id", i);
        Parcel obtain = Parcel.obtain();
        serializableNotification.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        Intent putExtra2 = putExtra.putExtra("notification_bytes", obtain.marshall());
        putExtra2.setData(Uri.parse(putExtra2.toUri(1)));
        return putExtra2;
    }

    public final void onHandleIntent(Intent intent) {
        f108082a.mo25409a("onHandleIntent", new Object[0]);
        sek sek = f108082a;
        String valueOf = String.valueOf(intent.getAction());
        sek.mo25409a(valueOf.length() == 0 ? new String("Action: ") : "Action: ".concat(valueOf), new Object[0]);
        if ("com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("tag");
            int intExtra = intent.getIntExtra("id", 0);
            SerializableNotification a = SerializableNotification.m92795a(intent.getByteArrayExtra("notification_bytes"));
            sex a2 = sex.m35104a(this);
            f108082a.mo25409a("Showing notification (tag=%s, id=%s)", stringExtra, Integer.valueOf(intExtra));
            a2.mo25445a(stringExtra, intExtra, a.mo59139a(this));
        }
    }
}
