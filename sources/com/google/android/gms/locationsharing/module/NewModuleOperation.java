package com.google.android.gms.locationsharing.module;

import android.content.ComponentName;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NewModuleOperation extends qlf {
    /* renamed from: a */
    private final void m67026a(String str, String str2) {
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(str2);
        jdVar.mo13594b(str);
        C1102je jeVar = new C1102je(this);
        jeVar.mo13630b((int) C0126R.C0127drawable.quantum_ic_person_pin_white_24);
        jeVar.mo13640e(str);
        jeVar.mo13632b(str2);
        jeVar.mo13626a(jdVar);
        jeVar.f22258j = -1;
        jeVar.f22268t = true;
        jeVar.mo13627a(true);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingSettingsActivity");
        C1129ke a = C1129ke.m17707a(this);
        a.mo14421a(new ComponentName(this, "com.google.android.gms.locationsharing.activity.LocationSharingSettingsActivity"));
        a.mo14422a(className);
        jeVar.f22254f = a.mo14423b();
        sex.m35104a(this).mo25441a(0, jeVar.mo13629b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sre.m36087g(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        if (!cfaz.f183554a.mo6606a().mo80791n()) {
            return;
        }
        if (intent.hasExtra(IntentOperation.EXTRA_PREVIOUS_VERSION)) {
            m67026a("Location Sharing Modulefood Updated", "We've updated LS Modulefood, send bugs to location-sharing-eng@");
        } else {
            m67026a("Welcome to Location Sharing Modulefood!", "You joined gmscore-locationsharing@ and are in our modulefood, thanks!");
        }
    }
}
