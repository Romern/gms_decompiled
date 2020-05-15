package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OptinBroadcastOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        long longExtra = intent.getLongExtra("SOURCE_SERIAL_ID", -1);
        if (longExtra != -1) {
            boolean booleanExtra = intent.getBooleanExtra("OPT_VALUE", false);
            avvn a = avvn.m79436a();
            synchronized (a.f93986a) {
                SharedPreferences b = a.mo51647b();
                rzz.m34727a(b, "Unexpected null from getPrefs.");
                SharedPreferences.Editor edit = b.edit();
                edit.putBoolean(avvn.m79437a(longExtra), booleanExtra);
                edit.apply();
            }
            a.mo51644a(this);
            if (chdz.m148557d() && (intExtra = intent.getIntExtra("SOURCE_USER", 0)) != 0) {
                Intent className = new Intent("com.google.android.gms.usagereporting.update_secret_number.ACTION").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
                className.putExtra("OPT_VALUE", a.mo51648c());
                Parcel obtain = Parcel.obtain();
                obtain.writeInt(intExtra);
                obtain.setDataPosition(0);
                sendBroadcastAsUser(className, UserHandle.readFromParcel(obtain));
            }
        }
    }
}
