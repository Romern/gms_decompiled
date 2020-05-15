package com.google.android.gms.constellation.p038ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.constellation.ui.SettingsIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsIntentOperation extends qld {

    /* renamed from: a */
    private static final sek f30574a = tea.m36798a("settings_operation");

    /* renamed from: a */
    public final List mo6342a() {
        String str;
        Context applicationContext = getBaseContext().getApplicationContext();
        ArrayList arrayList = new ArrayList();
        if (cdfz.m133089c()) {
            Intent intent = new Intent();
            if (cdfz.f180729a.mo6606a().mo77472i()) {
                int i = Build.VERSION.SDK_INT;
                str = "com.google.android.gms.constellation.ui.ConstellationWebSettingsActivity";
            } else {
                str = "com.google.android.gms.constellation.ui.ConstellationSettingsActivity";
            }
            arrayList.add(new GoogleSettingsItem(intent.setClassName(applicationContext, str), 5, (int) C0126R.string.c11n_device_consent_activity_label, 16));
        }
        if (cdfz.m133088b()) {
            f30574a.mo25409a("Displaying settings", new Object[0]);
            arrayList.add(new GoogleSettingsItem(new Intent().setClassName(applicationContext, "com.google.android.gms.constellation.ui.ConstellationDebugActivity"), 2, (int) C0126R.string.c11n_debug_activity_title, 15));
        }
        if (cdfz.f180729a.mo6606a().mo77469f() && cdfq.m133006f()) {
            szq a = szq.m36667a(applicationContext);
            cbnw cbnw = cbnw.RCS;
            if (szq.f45523a.containsKey(cbnw) && cbpm.m128077b((int) a.f45525b.getLong((String) szq.f45523a.get(cbnw), 0)) == 3) {
                f30574a.mo25409a("Displaying chat features", new Object[0]);
                arrayList.add(new GoogleSettingsItem(new Intent().setClassName(applicationContext, "com.google.android.gms.constellation.ui.ConstellationChatFeaturesActivity"), 5, (int) C0126R.string.c11n_chat_features_activity_label, 66));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
