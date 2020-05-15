package com.google.android.gms.people.sync.coreui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsSyncCoreSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!cfus.m143108f()) {
            return null;
        }
        if (cfut.f185746a.mo6606a().mo82749a()) {
            sre.m36088h(this);
            sre.m36087g(this);
            sre.m36089i(this);
        }
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        if (cfut.m143113b()) {
            int i = Build.VERSION.SDK_INT;
            className.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.settings").build());
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 4, (int) C0126R.string.people_contacts_sync_core_activity_title, 18);
        googleSettingsItem.f29960f = cfus.f185744a.mo6606a().mo82763c();
        return googleSettingsItem;
    }
}
