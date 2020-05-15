package p000;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: aqvi */
final /* synthetic */ class aqvi implements View.OnClickListener {

    /* renamed from: a */
    private final aqvk f86910a;

    /* renamed from: b */
    private final Intent f86911b;

    public aqvi(aqvk aqvk, Intent intent) {
        this.f86910a = aqvk;
        this.f86911b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        aqvk aqvk = this.f86910a;
        if (this.f86911b.resolveActivity(aqvk.f86916a.getPackageManager()) != null) {
            aqvk.f86917b.mo26568a(tio.CALENDAR_BUTTON, tio.SMART_PROFILE_HEADER);
            if (aqvk.f86920e.size() == 1) {
                aqvk.f86916a.startActivity(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", ((Bundle) aqvk.f86920e.get(0)).getString("extraValue")));
                return;
            }
            if (cgnz.m146325b()) {
                dialogFragment = thg.m36962a((int) C0126R.string.email_address_picker_title, 2, aqvk.f86918c, aqvk.f86920e);
            } else {
                dialogFragment = aqvd.m72153a(C0126R.string.email_address_picker_title, C0126R.C0129id.quick_actions_schedule, aqvk.f86918c, aqvk.f86920e);
            }
            dialogFragment.show(aqvk.f86916a.getSupportFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
