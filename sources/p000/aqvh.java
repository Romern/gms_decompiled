package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: aqvh */
final /* synthetic */ class aqvh implements View.OnClickListener {

    /* renamed from: a */
    private final aqvk f86908a;

    /* renamed from: b */
    private final Intent f86909b;

    public aqvh(aqvk aqvk, Intent intent) {
        this.f86908a = aqvk;
        this.f86909b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        aqvk aqvk = this.f86908a;
        if (this.f86909b.resolveActivity(aqvk.f86916a.getPackageManager()) != null) {
            aqvk.f86917b.mo26568a(tio.EMAIL_BUTTON, tio.SMART_PROFILE_HEADER);
            if (aqvk.f86920e.size() == 1) {
                aqvk.f86916a.startActivity(aqqk.m71972a(((Bundle) aqvk.f86920e.get(0)).getString("extraValue"), aqvk.f86918c));
                return;
            }
            if (cgnz.m146325b()) {
                dialogFragment = thg.m36962a((int) C0126R.string.email_address_picker_title, 1, aqvk.f86918c, aqvk.f86920e);
            } else {
                dialogFragment = aqvd.m72153a(C0126R.string.email_address_picker_title, C0126R.C0129id.quick_actions_email, aqvk.f86918c, aqvk.f86920e);
            }
            dialogFragment.show(aqvk.f86916a.getSupportFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
