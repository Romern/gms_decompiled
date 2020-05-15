package com.google.android.gms.autofill.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RemoteIntentOperation extends IntentOperation {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public final void onHandleIntent(Intent intent) {
        Parcelable parcelable;
        SharedPreferences d = krc.m18382a(getBaseContext()).mo14829d();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!(!cciw.f179109a.mo6606a().mo76086s() || (parcelable = extras.getParcelable("change")) == null || parcelable.getClass().getClassLoader() == Change.class.getClassLoader())) {
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(extras);
                obtain.setDataPosition(0);
                extras = obtain.readBundle(Change.class.getClassLoader());
                obtain.recycle();
            }
            String string = extras.getString("method");
            Change change = (Change) extras.getParcelable("change");
            if (d instanceof lht) {
                lht lht = (lht) d;
                if ("request_sync".equals(string)) {
                    lht.mo15120a();
                } else if ("request_change".equals(string) && change != null) {
                    lht.mo15122b(change);
                }
            } else if (d instanceof lhu) {
                lhu lhu = (lhu) d;
                if ("sync".equals(string) && change != null) {
                    lhu.mo15123c(change);
                }
            }
        }
    }
}
