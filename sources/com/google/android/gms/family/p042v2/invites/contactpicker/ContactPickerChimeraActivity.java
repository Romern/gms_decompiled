package com.google.android.gms.family.p042v2.invites.contactpicker;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.family.v2.invites.contactpicker.ContactPickerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactPickerChimeraActivity extends deu implements wnh {
    /* renamed from: a */
    public final void mo18493a(List list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedContacts", new ArrayList(list));
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.fm_activity_contact_picker);
        wgp.m41932a(this, getIntent(), spn.m35852a((Activity) this));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        wnj wnj = new wnj();
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("contactPickerOptionsData", (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions"));
        wnj.setArguments(bundle2);
        beginTransaction.add((int) C0126R.C0129id.fm_contact_picker_fragment_container, wnj).commit();
    }
}
