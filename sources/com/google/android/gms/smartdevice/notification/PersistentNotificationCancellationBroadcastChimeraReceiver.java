package com.google.android.gms.smartdevice.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentNotificationCancellationBroadcastChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final sek f108081b = ascp.m73787a("Notification", "PersistentNotificationCancellationBroadcastReceiver");

    /* renamed from: a */
    public static Intent m92791a(Context context, String str, int i) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.smartdevice.notification.PersistentNotificationCancellationBroadcastReceiver").setAction("com.google.android.gms.smartdevice.notification.CANCEL").putExtra("tag", str).putExtra("id", i);
        putExtra.setData(Uri.parse(putExtra.toUri(1)));
        sek sek = f108081b;
        String valueOf = String.valueOf(putExtra.getDataString());
        sek.mo25409a(valueOf.length() == 0 ? new String("Notification cancel Intent data: ") : "Notification cancel Intent data: ".concat(valueOf), new Object[0]);
        return putExtra;
    }

    public final void onReceive(Context context, Intent intent) {
        sek sek = f108081b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Received intent: ");
        sb.append(valueOf);
        sek.mo25412b(sb.toString(), new Object[0]);
        if (!"com.google.android.gms.smartdevice.notification.CANCEL".equals(intent.getAction())) {
            sek sek2 = f108081b;
            String valueOf2 = String.valueOf(intent.getAction());
            sek2.mo25416d(valueOf2.length() == 0 ? new String("Unrecognized Intent action: ") : "Unrecognized Intent action: ".concat(valueOf2), new Object[0]);
        } else if (intent.hasExtra("tag") || intent.hasExtra("id")) {
            sex a = sex.m35104a(context);
            if (a != null) {
                new arsd(a, new skc(context)).mo48788b(intent.getStringExtra("tag"), intent.getIntExtra("id", 0));
                return;
            }
            throw null;
        } else {
            f108081b.mo25416d("ACTION_CANCEL_NOTIFICATION intent found without tag or id.", new Object[0]);
        }
    }
}
