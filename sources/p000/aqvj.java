package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: aqvj */
final /* synthetic */ class aqvj implements View.OnClickListener {

    /* renamed from: a */
    private final aqvk f86912a;

    /* renamed from: b */
    private final Intent f86913b;

    public aqvj(aqvk aqvk, Intent intent) {
        this.f86912a = aqvk;
        this.f86913b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        aqvk aqvk = this.f86912a;
        if (this.f86913b.resolveActivity(aqvk.f86916a.getPackageManager()) != null) {
            aqvk.f86917b.mo26568a(tio.CALL_BUTTON, tio.SMART_PROFILE_HEADER);
            if (aqvk.f86921f.size() == 1) {
                aqvk.f86916a.startActivity(aqqk.m71971a(((Bundle) aqvk.f86921f.get(0)).getString("extraValue")));
                return;
            }
            if (cgnz.m146325b()) {
                dialogFragment = thg.m36962a((int) C0126R.string.phone_number_picker_title, 0, aqvk.f86918c, aqvk.f86921f);
            } else {
                dialogFragment = aqvd.m72153a(C0126R.string.phone_number_picker_title, C0126R.C0129id.quick_actions_call, aqvk.f86918c, aqvk.f86921f);
            }
            dialogFragment.show(aqvk.f86916a.getSupportFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
