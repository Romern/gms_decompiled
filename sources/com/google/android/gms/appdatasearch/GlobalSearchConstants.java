package com.google.android.gms.appdatasearch;

import android.content.Intent;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlobalSearchConstants {
    public static GlobalSearchApplication getGlobalSearchApplicationFromIntent(Intent intent) {
        if ("com.google.android.gms.icing.GlobalSearchAppRegistered3".equals(intent.getAction()) || "com.google.android.gms.icing.GlobalSearchAppRegistered2".equals(intent.getAction())) {
            byte[] byteArray = intent.getExtras().getByteArray("App");
            if (byteArray != null) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    return (GlobalSearchApplication) GlobalSearchApplication.CREATOR.createFromParcel(obtain);
                } finally {
                    obtain.recycle();
                }
            } else {
                throw new IllegalArgumentException("Invalid intent");
            }
        } else {
            throw new IllegalArgumentException("Not an GLOBAL_SEARCH_APP_REGISTERED_N_INTENT_ACTION intent");
        }
    }
}
