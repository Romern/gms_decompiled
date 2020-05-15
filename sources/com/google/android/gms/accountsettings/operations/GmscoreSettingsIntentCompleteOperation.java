package com.google.android.gms.accountsettings.operations;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmscoreSettingsIntentCompleteOperation extends qld {
    public final void onHandleIntent(Intent intent) {
        IBinder a;
        vzr vzr;
        int i;
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("Bundle must not be null.");
            } else if (!qld.m32334a(intent, "GmscoreSettingsProvider") && (a = C1004fv.m12454a(extras, "settingsListKey")) != null && a.pingBinder()) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof vzr) {
                    vzr = (vzr) queryLocalInterface;
                } else {
                    vzr = new vzp(a);
                }
                List list = (List) vzs.m41641a(vzr);
                esx a2 = esx.m11109a();
                esv esv = new esv();
                esv.f15651b.clear();
                esv.f15650a.clear();
                esv.mo10495a(C0126R.string.common_google_settings_account, 1);
                esv.mo10495a(C0126R.string.common_google_settings_services, 0);
                esv.mo10495a(C0126R.string.common_google_settings_developer, 3);
                esv.mo10496a(C0126R.string.common_google_settings_account_services, 4, 0);
                esv.mo10496a(C0126R.string.common_google_settings_device_connections, 6, 0);
                esv.mo10496a(C0126R.string.common_google_settings_data_and_messaging, 5, 0);
                esv.mo10496a(C0126R.string.common_google_settings_set_up_and_restore, 7, 0);
                esv.mo10496a(C0126R.string.common_google_settings_autofill, 8, 0);
                if (soz.m35800c(rpr.m34216b()) || cdlk.m133967b()) {
                    esv.mo10496a(C0126R.string.common_google_settings_internal, 2, 3);
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < list.size()) {
                    Parcel parcel = (Parcel) list.get(i);
                    parcel.setDataPosition(0);
                    GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel);
                    int i2 = googleSettingsItem.f29969o;
                    if (!(i2 == 0 || i2 == 1 || !adyl.m51425a(googleSettingsItem, rpr.m34216b(), false))) {
                        esv.f15651b.put(Integer.valueOf(googleSettingsItem.f29969o), googleSettingsItem);
                        if (esv.f15650a.containsKey(Integer.valueOf(googleSettingsItem.f29957c))) {
                            ((ess) esv.f15650a.get(Integer.valueOf(googleSettingsItem.f29957c))).f15640b.add(new est(googleSettingsItem));
                        }
                    }
                    i++;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ess ess : esv.f15650a.values()) {
                    int i3 = ess.f15639a;
                    if (i3 != -1 && esv.f15650a.containsKey(Integer.valueOf(i3))) {
                        ((ess) esv.f15650a.get(Integer.valueOf(ess.f15639a))).f15640b.add(new est(ess.mo10491a()));
                    }
                }
                for (Map.Entry entry : esv.f15650a.entrySet()) {
                    linkedHashMap.put((Integer) entry.getKey(), ((ess) entry.getValue()).mo10491a());
                }
                a2.f15655a = new esw(bnhe.m109413a(esv.f15651b), bnhe.m109413a(linkedHashMap));
                a2.f15656b.countDown();
            }
        }
    }
}
