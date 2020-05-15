package com.google.android.gms.smart_profile;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsPickerChimeraActivity extends deu {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID");
        String stringExtra3 = intent.getStringExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID");
        int intExtra = intent.getIntExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 0);
        setContentView((int) C0126R.C0128layout.profile_contacts_picker_activity);
        C1341rz aW = mo8628aW();
        aW.mo15858c(true);
        aW.mo15855c((int) C0126R.string.profile_contacts_picker_title);
        aW.mo15877p();
        Integer a = tey.m36890a(intent);
        if (a.equals(0)) {
            Resources resources = getResources();
            aW.mo15851b(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{resources.getColor(C0126R.color.profile_header_gradient_start_color), resources.getColor(C0126R.color.profile_header_gradient_end_color)}));
        } else {
            aW.mo15851b(new ColorDrawable(a.intValue()));
        }
        if (bundle == null) {
            aqqg aqqg = new aqqg();
            Bundle bundle2 = new Bundle();
            bundle2.putString("viewerAccountName", stringExtra);
            bundle2.putString("viewerPageId", stringExtra2);
            bundle2.putString("qualifiedId", stringExtra3);
            bundle2.putInt("applicationId", intExtra);
            aqqg.setArguments(bundle2);
            getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.fragment_container, aqqg, "ContactsPickerFragment").commit();
        }
    }
}
