package com.google.android.gms.romanesco.restoresettings;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsRestoreSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!cgkf.f187143a.mo6606a().mo83981p()) {
            return null;
        }
        sre.m36087g(this);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity"), 7, (int) C0126R.string.romanesco_contacts_restore_title, 17);
        googleSettingsItem.f29960f = false;
        return googleSettingsItem;
    }
}
